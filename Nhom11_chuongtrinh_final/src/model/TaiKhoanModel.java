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
public class TaiKhoanModel {
    private ArrayList<TaiKhoan> dstk;

    public TaiKhoanModel(ArrayList<TaiKhoan> dstk) {
        this.dstk = dstk;
    }

    public TaiKhoanModel() {
        dstk=new ArrayList<>();
    }

    public ArrayList<TaiKhoan> getDstk() {
        return dstk;
    }

    public void setDstk(ArrayList<TaiKhoan> dstk) {
        this.dstk = dstk;
    }
    public int add(TaiKhoan tk){
        dstk.add(tk);
        return 1;
    }
    public void fakedata(){
        TaiKhoan tk1=new TaiKhoan("anhnp", "Anh123");
        TaiKhoan tk2=new TaiKhoan("giangpt", "Giang123");
        TaiKhoan tk3=new TaiKhoan("hongnt", "Hong123");
        TaiKhoan tk4=new TaiKhoan("lanbt", " Lan123");
        TaiKhoan tk5=new TaiKhoan("vandh", "Van123");
        dstk.add(tk1);
        dstk.add(tk2);
        dstk.add(tk3);
        dstk.add(tk4);
        dstk.add(tk5);
    }
    public int count(){
        
        return dstk.size();
    }
}
