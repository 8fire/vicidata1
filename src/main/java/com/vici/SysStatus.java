package com.vici;

/**
 * 订单状态
 */
public enum SysStatus {
    DRAFT_ORDER("草稿", -1),
    AUDIT_ORDER("待审核",0),
    CHECKOK_ORDER("审核通过",1),
    CHECKREJECT_ORDER("驳回",-2),
    INVALID_FLAG("作废",2);
    // 成员变量
    private String name;
    private int index;
    // 构造方法
    private SysStatus(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // 普通方法s
    public static String getName(int index) {
        for (SysStatus c : SysStatus.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }
    // get set 方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
