package com.example.demo.commen;

public enum CAT_COLOUR_ENUM {
    白色(0),黄色(1);

    private int code;

    private CAT_COLOUR_ENUM(int code){
        this.code = code;
    }

    private static CAT_COLOUR_ENUM getByCode(int code){
        for (CAT_COLOUR_ENUM colour : CAT_COLOUR_ENUM.values()){
            if (colour.getCode() == code){
                return colour;
            }

        }
        return null;
    }

    public int getCode() {
        return code;
    }
}
