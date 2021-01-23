package com.ZooManagementSystem.service.impl;

import com.ZooManagementSystem.entity.ZooAnimalEntity;
import com.ZooManagementSystem.mapper.ZooAnimalMapper;
import com.ZooManagementSystem.service.ZooAnimalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class ZooAnimalServiceImpl implements ZooAnimalService {

    @Autowired
    ZooAnimalMapper zooAnimalMapper;

    @Override
    public List getAnimal() {
        return zooAnimalMapper.getAnimal();
    }

    @Override
    public void addAnimal(ZooAnimalEntity zooAnimalEntity) {
        zooAnimalMapper.addAnimal();
    }

    @Override
    public void updateAnimal(ZooAnimalEntity zooAnimalEntity) {
        zooAnimalMapper.updateAnimal();
    }

    @Override
    public void deleteAnimal(UUID uid) {
        zooAnimalMapper.deleteAnimal(uid);
    }
}
