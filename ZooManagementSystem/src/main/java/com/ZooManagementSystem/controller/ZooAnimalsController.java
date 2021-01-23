package com.ZooManagementSystem.controller;

import com.ZooManagementSystem.entity.ZooAnimalEntity;
import com.ZooManagementSystem.service.ZooAnimalService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/zoo/animals")
public class ZooAnimalsController {

    @Autowired
    ZooAnimalService zooAnimalService;

    /**
     * 获取动物信息
     * @return
     */
    @GetMapping
    public ResponseEntity<?> getAnimals(){
        List getAnimal = zooAnimalService.getAnimal();
        return new ResponseEntity<List>(getAnimal, HttpStatus.OK);
    }

    /**
     * 增加动物信息
     * @param zooAnimalEntity
     * @return
     */
    @PostMapping
    public ResponseEntity<?> addAnimal(@RequestBody ZooAnimalEntity zooAnimalEntity){
        ZooAnimalEntity zooAnimalInfo = null;
        try{
            /**
             * 动物名称不允许为空
             */
            String animalName = zooAnimalEntity.getAnimalName();

            if(StringUtils.isBlank(animalName) ){
                return new ResponseEntity("请检查动物名称是否输入", HttpStatus.OK);
            }

            zooAnimalService.addAnimal(zooAnimalEntity);

        }  catch (Exception e){

        }
        return new ResponseEntity(zooAnimalInfo,HttpStatus.OK);
    }

    /**
     * 更新动物信息
     * @param zooAnimalEntity
     * @return
     */
    @PutMapping
    public ResponseEntity<?> updateAnimalById(@RequestBody ZooAnimalEntity zooAnimalEntity){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * 删除动物信息
     * @param animalUID 动物UID
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAnimal(@PathVariable("id") UUID animalUID){
        zooAnimalService.deleteAnimal(animalUID);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
