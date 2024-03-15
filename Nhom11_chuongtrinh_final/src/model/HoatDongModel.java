/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class HoatDongModel {
      private ArrayList<HoatDong> dshd;

    public HoatDongModel() {
        dshd=new ArrayList<>();
    }

    public HoatDongModel(ArrayList<HoatDong> dshd) {
        this.dshd = dshd;
    }

    public ArrayList<HoatDong> getDshd() {
        return dshd;
    }

    public void setDshd(ArrayList<HoatDong> dshd) {
        this.dshd = dshd;
    }
      public int add(HoatDong hd){
          dshd.add(hd);
          return 1;
      }
      public HoatDong findhd(String mhd){
          for (HoatDong hoatDong : dshd) {
              if(hoatDong.getMahd().equals(mhd)){
                  return hoatDong;
          }
             
      }
           return null;
      }
      public int xoa(String msv){
          HoatDong hd=findhd(msv);
          if(hd!=null){
              dshd.remove(hd);
          }
          return 1;
      }
      public int sua(HoatDong hd){
          for (HoatDong hoatDong : dshd) {
              if(hoatDong.equals(hd)){
                  hoatDong.setTenhd(hd.getTenhd());
                  hoatDong.setDiadiem(hd.getDiadiem());
                  hoatDong.setKinhphi(hd.getKinhphi());
                  hoatDong.setSoluong(hd.getSoluong());
              }
              break;
          }
          return 1;
      }
      public void fakedata(){
          HoatDong hd1=new HoatDong("HD01", "Chào tân sinh viên ", "C19-Cơ sở 3 HAUI", 5000000, 50);
          HoatDong hd2=new HoatDong("HD02", "Chúc mừng ngày phụ nữ VN ", "A1-Cơ sở 1 HAUI", 10000000, 70);
          HoatDong hd3=new HoatDong("HD03", "Sáng tạo nghệ thuật", "A1-Cơ sở 1 HAUI", 3000000, 100);
          HoatDong hd4=new HoatDong("HD04", "Kỷ niệm 9 năm thành lập clb", "A1-Cơ sở 1 HAUI", 30000000, 200);
          HoatDong hd5=new HoatDong("HD05", "Chúc mừng ngày nhà giáo VN", "A3-Cơ sở 1 HAUI", 20000000, 100);
          dshd.add(hd1);
          dshd.add(hd2);
          dshd.add(hd3);
          dshd.add(hd4);
          dshd.add(hd5);
      }

    public ThanhVien timkiem(String mhd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ThanhVien capnhat(String mhd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}