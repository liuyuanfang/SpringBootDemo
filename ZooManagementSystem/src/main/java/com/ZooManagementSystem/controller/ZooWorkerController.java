package com.ZooManagementSystem.controller;


import com.ZooManagementSystem.entity.ZooWorkerEntity;
import com.ZooManagementSystem.service.ZooWorkerService;
import com.ZooManagementSystem.util.ZooWorkerException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/zoo/worker")
public class ZooWorkerController {

    @Autowired
    ZooWorkerService zooWorkerService;

    /**
     * 获得所有职工信息
     * @return List
     */
    @GetMapping
    public ResponseEntity<?> getAllWorker(){
        List getAllWorker = null;
        try{
            getAllWorker = zooWorkerService.getAllWorker();
        }  catch (Exception e){

        }
        return new ResponseEntity(getAllWorker ,HttpStatus.OK);
    }

    /**
     * 添加职工
     * @param zooWorkerEntity
     * @return
     */
    @PostMapping
    public ResponseEntity<?> addWorker(@RequestBody ZooWorkerEntity zooWorkerEntity){
        ZooWorkerEntity zooWorkerInfo = null;
        try{
            /**
             * 职工姓名、职工密码，职工工号不允许为空
             */
            String workerName = zooWorkerEntity.getWorkerName();
            String pwd = zooWorkerEntity.getPwd();
            if(StringUtils.isBlank(workerName) || StringUtils.isBlank(pwd)){
                return new ResponseEntity("请检查职工姓名、职工密码或职工工号是否输入", HttpStatus.OK);
            }

            /**
             * 职工的部门、职位不能为空
             */
            String workerDeparment = zooWorkerEntity.getWorkerDepartment();
            String workerPostion = zooWorkerEntity.getWorkerPosition();

            if(StringUtils.isBlank(workerDeparment) || StringUtils.isBlank(workerPostion)){
                return new ResponseEntity("请检查职工的部门或职工职位是否输入", HttpStatus.OK);
            }

            zooWorkerInfo = zooWorkerService.addWorker(zooWorkerEntity);
        }  catch (Exception e){

        }
        return new ResponseEntity(zooWorkerInfo,HttpStatus.OK);
    }

    /**
     * 修改职工信息
     * @param zooWorkerEntity
     * @return
     */
    @PutMapping
    public ResponseEntity<?> updateWorkerById(@RequestBody ZooWorkerEntity zooWorkerEntity){
        String pwd = zooWorkerEntity.getPwd();

        zooWorkerService.updateWorker();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * 删除职工信息
     * @param workerNumber 职工工号
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteWorker(@PathVariable("id") int workerNumber){
        zooWorkerService.deleteWorker(workerNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }





}
