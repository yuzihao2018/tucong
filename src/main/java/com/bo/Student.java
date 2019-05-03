package com.bo;

import java.io.Serializable;

/**
 * Created by John on 2019/1/8.
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -4877937893923128359L;

    private int id;

    private String name ;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
