package com.netease.lib.structure;

import com.netease.lowcode.core.annotation.NaslStructure;

/**
 * 相加入参，声明为code-wave认识的结构体
 */
@NaslStructure
public class AddParam {
    /**
     * 参数a
     */
    public Integer a;
    /**
     * 参数b
     */
    public Integer b;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
