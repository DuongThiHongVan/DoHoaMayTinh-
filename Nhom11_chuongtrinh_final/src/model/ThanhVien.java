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
public class ThanhVien implements Comparable<ThanhVien>{
    private String masv;
    private String hoten,diachi,nganh,khoa,chucvu, dienthoai, email;
    private boolean gtinh;

    public ThanhVien(String masv, String hoten, String diachi, String dienthoai, String email, String nganh, String khoa, String chucvu, boolean gtinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.email = email;
        this.nganh = nganh;
        this.khoa = khoa;
        this.chucvu = chucvu;
        this.gtinh = gtinh;
    }

    public ThanhVien(String masv) {
        this.masv = masv;
    }

    public ThanhVien() {
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public boolean isGtinh() {
        return gtinh;
    }

    public void setGtinh(boolean gtinh) {
        this.gtinh = gtinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.masv);
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
        final ThanhVien other = (ThanhVien) obj;
        return Objects.equals(this.masv, other.masv);
    }


   public String getTen(){
         String s=this.getHoten().trim();
         if(s.indexOf(" ")>=0){
             int vt=s.lastIndexOf(" ");
             return s.substring(vt+1);
         }else return s;
     }
    @Override
    public int compareTo(ThanhVien o) {
        String tenthis=this.getTen();
        String teno=o.getTen();
        return tenthis.compareToIgnoreCase(teno);
    }
    
}
