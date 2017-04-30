package com.mudanza.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name= "provincias_etrs89_30n")
public class Provincias {
    @Id
    @Column(name= "gid")
    private int gid;
    @Column(name= "codigo")
    private String code;
    @Column(name= "texto")
    private String text;
    @Column(name= "texto_alt")
    private String textAlt;
    @Column(name= "cod_ccaa")
    private String codccaa;
    @Column(name= "ccaa")
    private String ccaa;
    @Column(name= "veg1")
    private BigDecimal veg1;
    @Column(name= "veg2")
    private BigDecimal veg2;
    @Column(name= "veg3")
    private BigDecimal veg3;

    public int getGid() {
        return gid;
    }
    public String getCode() {
        return code;
    }
    public String getText() {
        return text;
    }
    public String getTextAlt() {
        return textAlt;
    }
    public String getCodccaa() {
        return codccaa;
    }
    public String getCcaa() {
        return ccaa;
    }
    public BigDecimal getVeg1() {
        return veg1;
    }
    public BigDecimal getVeg2() {
        return veg2;
    }
    public BigDecimal getVeg3() {
        return veg3;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void setTextAlt(String textAlt) {
        this.textAlt = textAlt;
    }

    public void setCodccaa(String codccaa) {
        this.codccaa = codccaa;
    }
    public void setCcaa(String ccaa) {
        this.ccaa = ccaa;
    }
    public void setVeg1(BigDecimal veg1) {
        this.veg1 = veg1;
    }
    public void setVeg2(BigDecimal veg2) {
        this.veg2 = veg2;
    }
    public void setVeg3(BigDecimal veg3) {
        this.veg3 = veg3;
    }

    public Provincias() {}

    public Provincias(int gid, String code, String text, String textAlt, String codccaa, String ccaa, BigDecimal veg1, BigDecimal veg2, BigDecimal veg3) {
        this.gid = gid;
        this.code = code;
        this.text = text;
        this.textAlt = textAlt;
        this.codccaa = codccaa;
        this.ccaa = ccaa;
        this.veg1 = veg1;
        this.veg2 = veg2;
        this.veg3 = veg3;
    }
}
