package com.itheima.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Item {
    private int id;
    private String name;
    private double price;
    private Date createtime;
    private String detail;

    public Item() {
    }

    public Item(int id, String name, double price, Date createtime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createtime = createtime;
        this.detail = detail;
    }
}
