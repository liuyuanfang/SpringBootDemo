package com.userSystemDemo.dto;


import java.util.Objects;

//定义接口请求体
public class UserDTO {

    private  String userName;

    private String pwd;


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(userName, userDTO.userName) && Objects.equals(pwd, userDTO.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, pwd);
    }
}
