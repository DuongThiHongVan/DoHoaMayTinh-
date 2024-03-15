/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RUN;

import java.util.ArrayList;
import javax.swing.UIManager;
import model.ThanhVien;
import model.ThanhVienModel;
import form.DangNhapform;


public class test {
    public static void main(String[] args) {
        try {
            
             new DangNhapform();
             ThanhVienModel tv = new ThanhVienModel();
            
             ArrayList<ThanhVien> dstv = tv.getDstv();
             tv.sap(dstv);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
