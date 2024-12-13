package com.hyf.assistant.domain;

//import javax.validation.constraints.Max;
import java.io.Serializable;

public class A implements Serializable {

    private  String id;
    private  String aa;
//    @Max(value = Integer.MAX_VALUE )
    private  Integer a12;
    private  String bb;
    private  String cc;
    private  String dd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public Integer getA12() {
        return a12;
    }

    public void setA12(Integer a12) {
        this.a12 = a12;
    }
}
