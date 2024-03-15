/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThanhVien;
import model.ThanhVienModel;


public class QLTTthanhvienform extends javax.swing.JFrame {

    /**
     * Creates new form QLTTthanhvienform
     */
    private ThanhVienModel tvm;
    DefaultTableModel tb_model;
    ArrayList<ThanhVien> list;
    String msvtim;

    public QLTTthanhvienform() {
        initComponents();
        tvm = new ThanhVienModel();
        tvm.fakedata();
        list = tvm.getDstv();
        tvm.sap(list);
        
        
        tb_model = (DefaultTableModel) tb_danhsach.getModel();
        showds();
        msvtim = txt_msvcheck.getText();
        this.setTitle("Thông tin thành viên");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_danhsach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_msv = new javax.swing.JTextField();
        txt_diachi = new javax.swing.JTextField();
        txt_nganh = new javax.swing.JTextField();
        txt_khoa = new javax.swing.JTextField();
        txt_tensv = new javax.swing.JTextField();
        sex_nam = new javax.swing.JRadioButton();
        sex_nu = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btn_tim = new javax.swing.JButton();
        txt_msvcheck = new javax.swing.JTextField();
        btn_exit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_capnhat = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_dienthoai = new javax.swing.JTextField();
        JLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbb_chucvu = new javax.swing.JComboBox<>();
        btn_hoatdong = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_danhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Địa chỉ", "Điện thoại", "Email", "Giới tính", "Ngành học", "Khóa"
            }
        ));
        tb_danhsach.setRowHeight(40);
        jScrollPane1.setViewportView(tb_danhsach);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 780, 171));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã SV         :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 348, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên SV        :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Địa chỉ        :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính     :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 513, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngành học :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Khóa          :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Điện thoại  :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 80, -1));
        jPanel1.add(txt_msv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 235, 35));

        txt_diachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diachiActionPerformed(evt);
            }
        });
        jPanel1.add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 235, 35));
        jPanel1.add(txt_nganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 235, 35));
        jPanel1.add(txt_khoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, 235, 35));
        jPanel1.add(txt_tensv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 235, 35));

        buttonGroup1.add(sex_nam);
        sex_nam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sex_nam.setText("Nam");
        jPanel1.add(sex_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 511, 100, -1));

        buttonGroup1.add(sex_nu);
        sex_nu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sex_nu.setText("Nữ");
        jPanel1.add(sex_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 511, 100, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nhập mã sinh viên");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 128, 30));

        btn_tim.setBackground(new java.awt.Color(204, 204, 204));
        btn_tim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tim.setLabel("Tìm kiếm");
        btn_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tim, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        jPanel1.add(txt_msvcheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 77, 141, 30));

        btn_exit.setBackground(new java.awt.Color(255, 102, 102));
        btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 720, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 51));
        jLabel10.setText("Sổ tay cá nhân giáo viên");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("<<<<<<<<>>>>>>>>");

        btn_xoa.setBackground(new java.awt.Color(255, 255, 0));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_them.setBackground(new java.awt.Color(51, 255, 51));
        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_them.setText("Thêm mới");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_luu.setBackground(new java.awt.Color(204, 51, 255));
        btn_luu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_capnhat.setBackground(new java.awt.Color(204, 0, 0));
        btn_capnhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_capnhat.setText("Cập nhật");
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(116, 49, 58));
        jLabel11.setText("YOUR OPTIONS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_capnhat, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btn_luu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 147, -1));

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("✿✿✿✿");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 810, -1, -1));

        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("✿✿✿✿");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 810, 50, -1));
        jPanel1.add(txt_dienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 230, 30));

        JLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel9.setText("Email        :");
        jPanel1.add(JLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 70, -1));

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 592, 230, 30));

        jLabel18.setBackground(new java.awt.Color(255, 204, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(87, 44, 44));
        jLabel18.setText("ĐẠI HỌC CÔNG NGHIỆP HÀ NỘI  ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 800, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 3, 20)); // NOI18N
        jLabel14.setText("THÀNH CÔNG KHÔNG NẰM TRONG SUY NGHĨ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 830, 550, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Chức vụ   :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, -1, -1));

        cbb_chucvu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbb_chucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lớp trưởng", "Lớp phó", "Sinh Viên" }));
        jPanel1.add(cbb_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 732, 230, 40));

        btn_hoatdong.setBackground(new java.awt.Color(153, 255, 255));
        btn_hoatdong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hoatdong.setText("Quản lí hoạt động");
        btn_hoatdong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hoatdong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_hoatdong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hoatdongActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hoatdong, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        String src = evt.getActionCommand();
        btn_exit.setMnemonic(KeyEvent.VK_E);
        if (src.equals("Exit")) {
            int choice = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc muốn thoát không?", "Thông báo", WIDTH);
            if (choice == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "❤See You Soon❤️", "️", HEIGHT);
                this.dispose();
            }

        }

    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_hoatdongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hoatdongActionPerformed
        // TODO add your handling code here:
        QuanLyhoatdongform form2 = new QuanLyhoatdongform();
// Hiển thị Form2
       form2.setVisible(true);
    }//GEN-LAST:event_btn_hoatdongActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        txt_msv.setEnabled(true);
        txt_tensv.setEnabled(true);
        resetForm();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
        boolean ok = true;
        ThanhVien tv = this.add();
        if (tv != null) {
            for (ThanhVien thanhVien : list) {
                if (thanhVien.getMasv().equals(tv.getMasv())) {
                    JOptionPane.showMessageDialog(rootPane, "Mã sinh viên đã tồn tại", "Thông báo", HEIGHT);
                    ok = false;
                } else {
                    ok = true;
                }
            }

        } else {
            ok = false;
        }
        if (ok) {
            JOptionPane.showMessageDialog(rootPane, "Lưu thành công! Bạn có thể sửa thông tin!", "Thông báo", HEIGHT);
            list.add(tv);
            hienthitvmoi();

        } else {

            try {
                tvm.sua(tv);
                hienthidscapnhat(tv);
                if (tvm.sua(tv) > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Sửa thành công!", "Thông báo", HEIGHT);
                    resetForm();
                }
            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_btn_luuActionPerformed
    public int kiemtratontai(String msv) {
        msv = txt_msv.getText();
        for (ThanhVien thanhVien : list) {
            if (thanhVien.getMasv().equals(msv)) {
                return -1;
            }
        }
        return 1;
    }
    private void btn_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timActionPerformed
        // TODO add your handling code here:

        String msv = txt_msvcheck.getText();
        ThanhVien tv = tvm.timkiem(msv);
        if (tv != null) {
            ThongTinThanhVien ttf = new ThongTinThanhVien();
            ttf.hienthi(tv);
            ttf.setVisible(true);
            txt_msvcheck.setText("");
        } else {
            if (msv.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã sv", "Thông báo", HEIGHT);
                txt_msvcheck.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thành viên không tồn tại", "Thông báo", HEIGHT);
                txt_msvcheck.setText("");
            }

        }

    }//GEN-LAST:event_btn_timActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:

        String msv = txt_msv.getText();
        ThanhVien tv = tvm.timkiem(msv);
        if (kiemtratontai(msv) < 0) {
            tvm.xoa(msv);
            xoatvtrongds(tv);
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công!", "Thông báo", HEIGHT);
            resetForm();

        } else {
            if (msv.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập mã sv", "Thông báo", HEIGHT);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thành viên không tồn tại", "Thông báo", HEIGHT);
                resetForm();
            }
        }

    }//GEN-LAST:event_btn_xoaActionPerformed
    public void xoatvtrongds(ThanhVien tv) {
        int rowcount = tb_danhsach.getRowCount();
        int indexrow = -1;
        String msv = tv.getMasv();
        for (int i = 0; i < rowcount; i++) {
            //tim msv can xoa trong table
            String value = tb_model.getValueAt(i, 0).toString();
            if (value.equals(msv)) {
                indexrow = i;
                break;
            }
        }
        if (indexrow >= 0) {
            tb_model.removeRow(indexrow);

        }
    }
    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
        String msv = txt_msv.getText();
        ThanhVien tv = tvm.timkiem(msv);
        if (tv != null) {
            setTV(tv);

            this.txt_msv.setEnabled(false);
            this.txt_tensv.setEnabled(false);
        } else {
            if (msv.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn phải nhập mã sv", "Thông báo", HEIGHT);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Thành viên không tồn tại", "Thông báo", HEIGHT);
            }

        }

    }//GEN-LAST:event_btn_capnhatActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_diachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diachiActionPerformed
    public void setTV(ThanhVien tv) {

        this.txt_msv.setText(tv.getMasv());
        this.txt_diachi.setText(tv.getDiachi());
        this.txt_khoa.setText(tv.getKhoa());
        this.txt_nganh.setText(tv.getNganh());
        this.txt_dienthoai.setText(tv.getDienthoai());
        this.txt_email.setText(tv.getEmail());
        this.cbb_chucvu.setSelectedItem(tv.getChucvu());
        this.txt_tensv.setText(tv.getHoten());
        boolean gt = tv.isGtinh();
        if (gt) {
            sex_nam.setSelected(true);
        } else {
            sex_nu.setSelected(true);
        }

    }

    public ThanhVien add() {
        String msv = txt_msv.getText();
        String ten = txt_tensv.getText();
        String diachi = txt_diachi.getText();
        String khoa = txt_khoa.getText();
        String dienthoai = txt_dienthoai.getText();
        String email = txt_email.getText();
        String cvu = cbb_chucvu.getSelectedItem() + "";
        String nganh = txt_nganh.getText();
        boolean gt = true;
        if (sex_nam.isSelected()) {
            gt = true;
        } else if (sex_nu.isSelected()) {
            gt = false;
        }
        ThanhVien tv = new ThanhVien(msv, ten, diachi, dienthoai, email, nganh, khoa, cvu, gt);
        boolean ok = true;

        if (ten.equals("") || diachi.equals("") || khoa.equals("") || nganh.equals("") || dienthoai.equals("") || email.equals("") || cvu.equals("") || msv.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần điền đầy đủ thông tin", "Thông báo", HEIGHT);
            ok = false;
        } else {

            ok = true;
        }
        if (ok == true) {
            return tv;
        } else {
            return null;
        }
    }


    public void showds() {

        for (ThanhVien thanhVien : list) {
            tb_model.addRow(new Object[]{
                thanhVien.getMasv(),
                thanhVien.getHoten(),
                thanhVien.getDiachi(),
                thanhVien.getDienthoai(),
                thanhVien.getEmail(),
                (thanhVien.isGtinh() ? "Nam" : "Nữ"),
                thanhVien.getNganh(),
                thanhVien.getKhoa(),
                thanhVien.getChucvu(),});
        }
    }

    public void hienthidscapnhat(ThanhVien tv) {
        //số dòng trong bảng;
        int rowcount = tb_danhsach.getRowCount();
        String msv = tv.getMasv();
       
        int rowindex = -1;
        //tìm dòng chứa mã sinh viên cần sửa
        for (int i = 0; i < rowcount; i++) {
            String value = tb_model.getValueAt(i, 0).toString();
            if (value.equals(msv)) {
                rowindex = i;
                break;
            }
        }
        if (rowindex < 0) {
            //nếu trong bảng không có sv này cho phép thêm sv này
            tb_model.addRow(new Object[]{
                tv.getMasv(),
                tv.getHoten(),
                tv.getDiachi(),
                tv.getDienthoai(),
                tv.getEmail(),
                (tv.isGtinh() ? "Nam" : "Nữ"),
                tv.getNganh(),
                tv.getKhoa(),
                tv.getChucvu(),});
        } else {
            //Nếu có sv này thì sửa thông tin
            tb_model.setValueAt(tv.getMasv(), rowindex, 0);
            tb_model.setValueAt(tv.getHoten(), rowindex, 1);
            tb_model.setValueAt(tv.getDiachi(), rowindex, 2);
            tb_model.setValueAt(tv.isGtinh() ? "Nam" : "Nữ", rowindex, 3);
            tb_model.setValueAt(tv.getDienthoai(), rowindex, 4);
            tb_model.setValueAt(tv.getEmail(), rowindex, 5);
            tb_model.setValueAt(tv.getNganh(), rowindex, 6);
            tb_model.setValueAt(tv.getKhoa(), rowindex, 7);
            tb_model.setValueAt(tv.getChucvu(), rowindex, 8);
        }
    }

    public void hienthitvmoi() {
        tb_model.setRowCount(0);
        //tvm.add(tv);
        for (ThanhVien thanhVien : list) {
            tb_model.addRow(new Object[]{
                thanhVien.getMasv(),
                thanhVien.getHoten(),
                thanhVien.getDiachi(),
                (thanhVien.isGtinh() ? "Nam" : "Nữ"),
                thanhVien.getDienthoai(),
                thanhVien.getEmail(),
                thanhVien.getNganh(),
                thanhVien.getKhoa(),
                thanhVien.getChucvu(),});
        }
    }

    public void resetForm() {
        txt_diachi.setText("");
        txt_msv.setText("");
        txt_nganh.setText("");
        txt_tensv.setText("");
        txt_khoa.setText("");
        txt_dienthoai.setText("");
        txt_email.setText("");
        buttonGroup1.clearSelection();
        cbb_chucvu.setSelectedIndex(-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLTTthanhvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLTTthanhvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLTTthanhvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTTthanhvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTTthanhvienform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel9;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_hoatdong;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_tim;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_chucvu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton sex_nam;
    private javax.swing.JRadioButton sex_nu;
    private javax.swing.JTable tb_danhsach;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_dienthoai;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_khoa;
    private javax.swing.JTextField txt_msv;
    private javax.swing.JTextField txt_msvcheck;
    private javax.swing.JTextField txt_nganh;
    private javax.swing.JTextField txt_tensv;
    // End of variables declaration//GEN-END:variables

}
