package com.ZooManagementSystem.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZooWorkerMapper {

    @Select("select * from t_zoo_worker_info")
    List getAllWorker();

//    @Insert("insert into t_zoo_worker_info(worker_name,worker_pwd,worker_num,worker_position,worker_join_zoo_time) " +
//            "values (#{worker_name},#{worker_pwd},#{worker_num},#{worker_position},#{worker_join_zoo_time})")
//    void addWorker();
//    void addWorker(@Param("worker_name") String username,
//                   @Param("worker_pwd") String pwd,
//                   @Param("worker_num") String worker_num,
//                   @Param("worker_position") String worker_position,
//                   @Param("worker_join_zoo_time") String worker_join_zoo_time);

//    void deleteWorker();
}
