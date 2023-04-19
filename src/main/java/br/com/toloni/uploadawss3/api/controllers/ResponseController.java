package br.com.toloni.uploadawss3.api.controllers;

public class ResponseController {

    private String status;
    private Object data;

    public ResponseController(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public ResponseController() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
