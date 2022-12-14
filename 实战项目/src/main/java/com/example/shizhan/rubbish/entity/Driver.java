package com.example.shizhan.rubbish.entity;

import java.io.Serializable;

public class Driver implements Serializable {
    private Long id;
    private String name;
    private String phone;
    private String carNumber;
    private String address;
    private String password;
    private String username;
    private String updateTime;



    //出勤状态
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String uptadeTime) {
        this.updateTime = uptadeTime;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phont='" + phone + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
