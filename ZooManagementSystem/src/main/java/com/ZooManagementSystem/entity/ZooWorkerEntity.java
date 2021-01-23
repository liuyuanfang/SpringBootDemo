package com.ZooManagementSystem.entity;

import java.util.Objects;

public class ZooWorkerEntity {

    /**
     * 职工工号
     */
    private String workerNumber;

    /**
     * 职工名称
     */
    private String workerName;

    /**
     * 职工账号密码
     */
    private String pwd;

    /**
     * 职工入职时间，格式 年月日
     */
    private String joinZooTime;

    /**
     * 职工在动物园的职位
     */
    private String workerPosition;

    /**
     * 职工所在部门
     */
    private String workerDepartment;

    public void setWorkerNumber(String workerNumber) {
        this.workerNumber = workerNumber;
    }

    public String getWorkerNumber() {
        return workerNumber;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerName() {
        return workerName;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setJoinZooTime(String joinZooTime) {
        this.joinZooTime = joinZooTime;
    }

    public String getJoinZooTime() {
        return joinZooTime;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerDepartment(String workerDepartment) {
        this.workerDepartment = workerDepartment;
    }

    public String getWorkerDepartment() {
        return workerDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooWorkerEntity that = (ZooWorkerEntity) o;
        return Objects.equals(workerNumber, that.workerNumber) && Objects.equals(workerName, that.workerName) && Objects.equals(pwd, that.pwd) && Objects.equals(joinZooTime, that.joinZooTime) && Objects.equals(workerPosition, that.workerPosition) && Objects.equals(workerDepartment, that.workerDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerNumber, workerName, pwd, joinZooTime, workerPosition, workerDepartment);
    }

    @Override
    public String toString() {
        return "ZooWorkerEntity{" +
                "workerNumber='" + workerNumber + '\'' +
                ", workerName='" + workerName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", joinZooTime='" + joinZooTime + '\'' +
                ", workerPosition='" + workerPosition + '\'' +
                ", workerDepartment='" + workerDepartment + '\'' +
                '}';
    }
}
