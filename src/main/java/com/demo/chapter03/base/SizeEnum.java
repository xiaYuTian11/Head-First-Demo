package com.demo.chapter03.base;

/**
 * 容量
 *
 * @author TMW
 * @date 2020/8/4 15:28
 */
public enum SizeEnum {
    /**
     * 小杯
     */
    TALL(1, "小杯"),
    /**
     * 中杯
     */
    Grande(2, "中杯"),
    /**
     * 大杯
     */
    venti(3, "大杯");

    SizeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
