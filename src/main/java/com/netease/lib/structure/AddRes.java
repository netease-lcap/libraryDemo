package com.netease.lib.structure;

import com.netease.lowcode.core.annotation.NaslStructure;

/**
 * 相加入参，声明为code-wave认识的结构体
 */
@NaslStructure
public class AddRes {
    /**
     * 返回参数
     */
    public Integer res;
    /**
     * 结果名称
     */
    public String resName;

    public Integer getRes() {
        return res;
    }

    public void setRes(Integer res) {
        this.res = res;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

}
