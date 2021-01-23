package com.ZooManagementSystem.mapper;

import com.ZooManagementSystem.entity.ZooWorkerEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ZooWorkerMapper {
    
    List<ZooWorkerEntity> getAllWorker();


    @Insert("insert into t_zoo_worker_info(workerName,pwd,joinZooTime,workerDepartment,workerPosition) values(#{workerName},#{pwd},#{joinZooTime},#{workerDepartment},#{workerPosition})")
    ZooWorkerEntity addWorker(@Param("workerName") String workerName,
                   @Param("pwd") String pwd,
                   @Param("joinZooTime") String joinZooTime,
                   @Param("workerDepartment") String workerDepartment,
                   @Param("workerPosition") String workerPosition);


    @Delete("delete from t_zoo_worker_info where workerNumber=#{workerNumber}")
    void deleteWorker(@Param("workerNumber") int workerNumber);
}
