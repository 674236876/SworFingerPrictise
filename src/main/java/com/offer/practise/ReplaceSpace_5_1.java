package com.offer.practise;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/9/6 16:25
 */
public class ReplaceSpace_5_1 {

    /**
     * @param stringBuffer
     * @return java.lang.String
     * @author zhugp
     * @description 将字符串中的空格修改为%20
     * @date 2019/9/6 16:57
     **/
    public static String modefyStr(StringBuffer stringBuffer) throws IllegalArgumentException {
        if (stringBuffer == null) {
            throw new IllegalArgumentException("参数为空");
        }

        if (stringBuffer.length() == 0) {
            return "";
        }

        int spaceCount = 0;

        int lengthOrign = stringBuffer.length();
        int lastPointOrign = lengthOrign - 1;
        for (int i = 0; i < lengthOrign; i++) {
            if (stringBuffer.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int lengthNew = lengthOrign + spaceCount * 2;
        int lastPointNew = lengthNew - 1;
        stringBuffer.setLength(lengthNew);

        while (lastPointOrign != lastPointNew) {
            if (stringBuffer.charAt(lastPointOrign) == ' ') {
                stringBuffer.setCharAt(lastPointNew--, '0');
                stringBuffer.setCharAt(lastPointNew--, '2');
                stringBuffer.setCharAt(lastPointNew--, '%');
            } else {
                stringBuffer.setCharAt(lastPointNew--, stringBuffer.charAt(lastPointOrign));
            }
            lastPointOrign--;
        }

        return stringBuffer.toString();
    }
}
