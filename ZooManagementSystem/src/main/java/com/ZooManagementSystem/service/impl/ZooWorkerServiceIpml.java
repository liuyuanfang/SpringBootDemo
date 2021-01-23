package com.ZooManagementSystem.service.impl;

import com.ZooManagementSystem.entity.ZooWorkerEntity;
import com.ZooManagementSystem.mapper.ZooWorkerMapper;
import com.ZooManagementSystem.service.ZooWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooWorkerServiceIpml implements ZooWorkerService {

    @Autowired
    ZooWorkerMapper zooWorkerMapper;


    @Override
    public List getAllWorker() {
        List getAllWorker = null;

        try{
            getAllWorker = zooWorkerMapper.getAllWorker();
        } catch (Exception e){

        }

        return getAllWorker;
    }

    /**
     * 增加职工信息
     */
    @Override
    public void addWorker(ZooWorkerEntity zooWorkerEntity) {
        try{


            String workerName = zooWorkerEntity.getWorkerName();
            String pwd = zooWorkerEntity.getPwd();
            String workerNumber = zooWorkerEntity.getWorkerNumber();
//            zooWorkerMapper.addWorker();


        } catch (Exception e){

        }
    }

    @Override
    public void updateWorker() {

    }

    @Override
    public void deleteWorker() {

//        zooWorkerMapper.deleteWorker();

    }
}
