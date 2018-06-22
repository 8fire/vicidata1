package com.vici.response;

public enum ResponseCode {
    OK("200"), CREATED("201"), NO_CONTENT("204"), BAD_REQUEST("400"), NOT_FOUND("404"),TIME_OUT("405"), REPEAT_REQUEST("406"), SERVE_ERROR("500"), FOUND("302"), UNAUTHORIZED("401");
    private String value;
    ResponseCode(String code){
        this.value = code;
    }
    public String getValue(){
        return this.value;
    }
}
