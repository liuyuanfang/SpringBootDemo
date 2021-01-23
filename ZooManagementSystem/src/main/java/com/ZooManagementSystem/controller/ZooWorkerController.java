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



//   !kX;>PM,t3pD

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
            System.out.printf("开始输出......................");
            getAllWorker = zooWorkerService.getAllWorker();
            System.out.printf(String.valueOf(getAllWorker));
            System.out.printf("输出结束.....................");
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
        try{
            /**
             * 职工姓名、职工密码，职工工号不允许为空
             */
            String workerName = zooWorkerEntity.getWorkerName();
            String pwd = zooWorkerEntity.getPwd();
            String workerNumber = zooWorkerEntity.getWorkerNumber();
            if(StringUtils.isBlank(workerName) || StringUtils.isBlank(pwd) || StringUtils.isBlank(workerNumber)){
                return new ResponseEntity("请检查职工姓名、职工密码或职工工号是否输入", HttpStatus.OK);
            }

            /**
             * 职工的部门、职位不能为空
             */
            String workerDeparment = zooWorkerEntity.getWorkerDepartment();
            String workerPostion = zooWorkerEntity.getPosition();
            if(StringUtils.isBlank(workerDeparment) || StringUtils.isBlank(workerPostion)){
                return new ResponseEntity("请检查职工的部门或职工职位是否输入", HttpStatus.OK);
            }

            zooWorkerService.addWorker(zooWorkerEntity);
        }  catch (Exception e){

        }
        return new ResponseEntity( HttpStatus.OK);
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
     * @return
     */
    @DeleteMapping
    public ResponseEntity<?> deleteWorker(){
        zooWorkerService.deleteWorker();
        return new ResponseEntity<>(HttpStatus.OK);

    }





}
