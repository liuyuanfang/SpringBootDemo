package com.ZooManagementSystem.entity;

import java.util.UUID;

public class ZooAnimalEntity {

    /**
     * 动物UID
     */
    private UUID animalId;

    /**
     * 动物名称
     */
    private String animalName;

    /**
     * 动物类型，值为陆生生物，水生生物，两栖生物
     */
    private String animalType;

    /**
     * 动物所属科，比如老虎属于猫科
     */
    private String animalFamily;

    /**
     * 动物入园时间
     */
    private String animalComeZooTime;

    /**
     * 饲养员名称
     */
    private String breederName;

    /**
     * 饲养员工号
     */
    private String breederNumber;

    /**
     * 国家保护等级，比如熊猫属于一级保护动物
     */
    private String nationalProtectionLevel;

    public void setAnimalId(UUID animalId) {
        this.animalId = animalId;
    }

    public UUID getAnimalId() {
        return animalId;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalFamily(String animalFamily) {
        this.animalFamily = animalFamily;
    }

    public String getAnimalFamily() {
        return animalFamily;
    }

    public void setAnimalComeZooTime(String animalComeZooTime) {
        this.animalComeZooTime = animalComeZooTime;
    }

    public String getAnimalComeZooTime() {
        return animalComeZooTime;
    }

    public void setBreederName(String breederName) {
        this.breederName = breederName;
    }

    public String getBreederName() {
        return breederName;
    }

    public void setBreederNumber(String breederNumber) {
        this.breederNumber = breederNumber;
    }

    public String getBreederNumber() {
        return breederNumber;
    }

    public void setNationalProtectionLevel(String nationalProtectionLevel) {
        this.nationalProtectionLevel = nationalProtectionLevel;
    }

    public String getNationalProtectionLevel() {
        return nationalProtectionLevel;
    }
}
