package com.ZooManagementSystem.service;

import com.ZooManagementSystem.entity.ZooAnimalEntity;

import java.util.List;
import java.util.UUID;

public interface ZooAnimalService {

    List getAnimal();

    void addAnimal(ZooAnimalEntity zooAnimalEntity);

    void updateAnimal(ZooAnimalEntity zooAnimalEntity);

    void deleteAnimal(UUID uid);


}
