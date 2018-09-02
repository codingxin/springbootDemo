package com.zhang.springbootdemo;




import java.util.Date;

/**
 * @author created by Zhangdazhuang
 * @version v.0.1
 * @date 2018/9/1
 * @备注 测试
 **/
public class Demo {

    private int id;
    private String name;

    private Date createTime;
    /**
     * 不返回某个属性，设置deserialize 是否需要序列化
     */

    private String remarks;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Demo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Demo() {
    }

    public Demo(int id, String name, Date createTime) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
    }
}
