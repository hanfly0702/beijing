package org.hyf.mybatis.myspringboot.domain;

import java.io.Serializable;

/**
 * @TableName product
 */
public class Product implements Serializable {
    /**
     *
     */
    private Integer pid;

    /**
     *
     */
    private String pname;

    /**
     *
     */
    private Double price;


    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public Integer getPid() {
        return pid;
    }

    /**
     *
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     *
     */
    public String getPname() {
        return pname;
    }

    /**
     *
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     *
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     */
    public void setPrice(Double price) {
        this.price = price;
    }


}