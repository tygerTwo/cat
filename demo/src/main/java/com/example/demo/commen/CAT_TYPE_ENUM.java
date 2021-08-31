package com.example.demo.commen;

public enum CAT_TYPE_ENUM {
    英短(0),公主(1)
    ;

    private int code;
    private CAT_TYPE_ENUM(int code){
        this.code = code;
    }

    public static CAT_TYPE_ENUM getByCode(int code) {
        for (CAT_TYPE_ENUM cat : CAT_TYPE_ENUM.values()) {
            if (cat.getCode() == code) {
                return cat;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

}