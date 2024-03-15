/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class ThanhVienModel {

    private ArrayList<ThanhVien> dstv;

    public ThanhVienModel(ArrayList<ThanhVien> dstv) {
        this.dstv = dstv;
        
    }

    public ThanhVienModel() {
        this.dstv = new ArrayList<>();
        
      
    }

    public ArrayList<ThanhVien> getDstv() {
        
        return dstv;
    }

    public void setDstv(ArrayList<ThanhVien> dstv) {
        this.dstv = dstv;
    }

    public void add(ThanhVien tv) {
        this.dstv.add(tv);
    }

    public int count() {
        return dstv.size();
    }

    public ThanhVien timkiem(String masv) {
        
        
        for (ThanhVien thanhVien : dstv) {
            if (thanhVien.getMasv().equalsIgnoreCase(masv)) {
                return thanhVien;
            }
        }
        return null;
    }

    public int xoa(String masv) {
        ThanhVien tv = this.timkiem(masv);
        if (tv != null) {
            dstv.remove(tv);

        }
        return 1;
    }

    public int sua(ThanhVien tv) throws Exception{
       
       
        for (ThanhVien thanhVien : dstv) {
            if (thanhVien.getMasv().equals(tv.getMasv())) {         
                thanhVien.setDiachi(tv.getDiachi());
                thanhVien.setGtinh(tv.isGtinh());
                thanhVien.setDienthoai(tv.getDienthoai());
                thanhVien.setEmail(tv.getEmail());
                thanhVien.setChucvu(tv.getChucvu());
                thanhVien.setNganh(tv.getNganh());
                thanhVien.setKhoa(tv.getKhoa());            
                break;
            }        
        }
         return 1;
        
    }

    public void fakedata() {
       ThanhVien tv1 = new ThanhVien("2020600001", "Nguyễn Thị Phương Anh", "Thái Bình","012345678","npa2002@gmail.com","Hệ thống thông tin", "K15", "Sinh viên", false);
       ThanhVien tv2 = new ThanhVien("2020600002", "Nguyễn Thu Hồng", "Hưng Yên","012345678","nth2002@gmail.com","Hệ thống thông tin", "K15", "Sinh viên", false);
       ThanhVien tv3 = new ThanhVien("2020600003", "Phùng Thị Giang", "Vĩnh Phúc","012345678","ptg2002@gmail.com","Hệ thống thông tin", "K15", "Sinh viên", false);
       ThanhVien tv4 = new ThanhVien("2020600004", "Bùi Thị Lan", "Thái Bình","012345678","btl2002@gmail.com","Hệ thống thông tin", "K15", "Sinh viên", false);
       ThanhVien tv5 = new ThanhVien("2020600005", "Dương Hồng Vân", "Hà Nam","012345678","dhv2002@gmail.com","Hệ thống thông tin", "K15", "Sinh viên", false);
       
        dstv.add(tv1);
        dstv.add(tv2);
        dstv.add(tv3);
        dstv.add(tv4);
        dstv.add(tv5);
        
    }
    public void sap(ArrayList<ThanhVien> dstv){
        
         Collections.sort(dstv, new Comparator<ThanhVien>() {
             @Override
             public int compare(ThanhVien o1, ThanhVien o2) {
                 if(o1.compareTo(o2)>0){
                     return 1;
                 }else if(o1.compareTo(o2)<0){
                     return -1;
                 }
                 else{
                     return 0;
                 }
             }
         });
    }
}
