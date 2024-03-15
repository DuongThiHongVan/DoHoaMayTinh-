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
public class TaiKhoan {
    private String taikhoan,matkhau;
    private String cfmatkhau;

    public TaiKhoan() {
    }

    public TaiKhoan(String taikhoan, String matkhau, String cfmatkhau) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.cfmatkhau = cfmatkhau;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getCfmatkhau() {
        return cfmatkhau;
    }

    public void setCfmatkhau(String cfmatkhau) {
        this.cfmatkhau = cfmatkhau;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.taikhoan);
        return hash;
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
        final TaiKhoan other = (TaiKhoan) obj;
        return Objects.equals(this.taikhoan, other.taikhoan);
    }

    public TaiKhoan(String taikhoan, String matkhau) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }
    
}
