package com.ZooManagementSystem.service;

import com.ZooManagementSystem.entity.ZooWorkerEntity;

import java.util.List;

public interface ZooWorkerService {

    List  getAllWorker();

    void addWorker(ZooWorkerEntity zooWorkerEntity);

    void deleteWorker();

    void updateWorker();

}
