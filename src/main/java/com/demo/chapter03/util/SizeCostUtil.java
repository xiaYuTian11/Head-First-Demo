package com.demo.chapter03.util;

import com.demo.chapter03.base.SizeEnum;

/**
 * 按照杯量算钱
 *
 * @author TMW
 * @date 2020/8/4 15:32
 */
public class SizeCostUtil {

    public static double calculatePrice(SizeEnum sizeEnum) {
        switch (sizeEnum) {
            case TALL:
                return .10d;
            case Grande:
                return .15d;
            case venti:
                return .20d;
            default:
                return 0;
        }
    }

}
