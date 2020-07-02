package com.ychong.dao;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String account;
    private String password;
    private String ftpAccount;
    private String ftpPassword;
    private String ftpIp;
    private int ftpPort;

    @Override
    public String toString() {
        return "UserDto{" +
                "uId=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", ftpAccount='" + ftpAccount + '\'' +
                ", ftpPassword='" + ftpPassword + '\'' +
                ", ftpIp='" + ftpIp + '\'' +
                ", ftpPort=" + ftpPort +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFtpAccount() {
        return ftpAccount;
    }

    public void setFtpAccount(String ftpAccount) {
        this.ftpAccount = ftpAccount;
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword;
    }

    public String getFtpIp() {
        return ftpIp;
    }

    public void setFtpIp(String ftpIp) {
        this.ftpIp = ftpIp;
    }

    public int getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(int ftpPort) {
        this.ftpPort = ftpPort;
    }
}
