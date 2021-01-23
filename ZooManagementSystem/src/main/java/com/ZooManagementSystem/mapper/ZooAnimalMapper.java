package com.ZooManagementSystem.mapper;

import com.ZooManagementSystem.entity.ZooAnimalEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.UUID;

public interface ZooAnimalMapper {

    List<ZooAnimalEntity> getAnimal();

    void addAnimal();

    void updateAnimal();

    @Delete("delete from t_zoo_animal where uuid=#{uuid}")
    void deleteAnimal(@Param("uuid") UUID uuid) ;
}
