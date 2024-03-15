/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class HoatDong {
    private String mahd,tenhd,diadiem;
    private long  kinhphi;
    private int soluong;
    public HoatDong() {
    }

    public HoatDong(String mahd) {
        this.mahd = mahd;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getTenhd() {
        return tenhd;
    }

    public void setTenhd(String tenhd) {
        this.tenhd = tenhd;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public long getKinhphi() {
        return kinhphi;
    }

    public void setKinhphi(long kinhphi) {
        this.kinhphi = kinhphi;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.mahd);
        return hash;
    }

    public HoatDong(String mahd, String tenhd, String diadiem, long kinhphi, int soluong) {
        this.mahd = mahd;
        this.tenhd = tenhd;
        this.diadiem = diadiem;
        this.kinhphi = kinhphi;
        this.soluong = soluong;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoatDong other = (HoatDong) obj;
        return Objects.equals(this.mahd, other.mahd);
    }
    
}
