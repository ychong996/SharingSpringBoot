package com.ychong.dao;

import lombok.Data;

@Data
public final class CommonResult<T> {
    private boolean isSuccess;
    private String errorMsg = "";
    private T resultBody;
    public CommonResult(T resultBody){
        this.resultBody = resultBody;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getResultBody() {
        return resultBody;
    }

    public void setResultBody(T resultBody) {
        this.resultBody = resultBody;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "isSuccess=" + isSuccess +
                ", errorMsg='" + errorMsg + '\'' +
                ", resultBody=" + resultBody +
                '}';
    }
}
