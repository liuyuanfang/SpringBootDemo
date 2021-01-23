package com.ZooManagementSystem.service;

import com.ZooManagementSystem.entity.ZooWorkerEntity;

import java.util.List;

public interface ZooWorkerService {

    List  getAllWorker();

    ZooWorkerEntity addWorker(ZooWorkerEntity zooWorkerEntity);

    void deleteWorker(int workerNumber);

    void updateWorker();

}
