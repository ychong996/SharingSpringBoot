package com.ychong.dao;

import lombok.Data;

@Data
public class FileDto {
    private int id;
    private String name;
    private String localPath;
    private String remotePath;
    private String fileType;

    @Override
    public String toString() {
        return "FileDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localPath='" + localPath + '\'' +
                ", remotePath='" + remotePath + '\'' +
                ", fileType='" + fileType + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getRemotePath() {
        return remotePath;
    }

    public void setRemotePath(String remotePath) {
        this.remotePath = remotePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
