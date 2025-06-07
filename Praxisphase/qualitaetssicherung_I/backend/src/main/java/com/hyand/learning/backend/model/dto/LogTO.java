package com.hyand.learning.backend.model.dto;

public class LogTO {

    private int status;
    private String message;
    private String url;

    public LogTO() {
    }

    // Getter
    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }

    // Setter
    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // toString
    @Override
    public String toString() {
        return "LogTO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
