/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author CherryCe
 */
public class GUI_dal_PhieuChi extends javax.swing.JDialog {

    /**
     * Creates new form GUI_dalThongTinPhong
     */
    public GUI_dal_PhieuChi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sdoChucNang = new HELPER.PanelShadow();
        lblThoat = new javax.swing.JLabel();
        lblThanhToan = new javax.swing.JLabel();
        lblXoa = new javax.swing.JLabel();
        sdoPhieuChi = new HELPER.PanelShadow();
        lblNgayTao = new javax.swing.JLabel();
        lblNguoiChi = new javax.swing.JLabel();
        lblGhiChu = new javax.swing.JLabel();
        lblMucChi = new javax.swing.JLabel();
        lblPhieuChi = new javax.swing.JLabel();
        lblSetSoPhieu = new javax.swing.JLabel();
        lblSoPhieu = new javax.swing.JLabel();
        lblPhuongThuc = new javax.swing.JLabel();
        lblSetNguoiChi = new javax.swing.JLabel();
        lblSetNgayTao = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        cboMucChi = new javax.swing.JComboBox<>();
        cboPhuongThuc = new javax.swing.JComboBox<>();
        spt_1 = new javax.swing.JSeparator();
        lblExit = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(380, 340));
        setUndecorated(true);

        sdoChucNang.setBackground(new java.awt.Color(255, 255, 255));
        sdoChucNang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(33, 150, 243)));
        sdoChucNang.setMinimumSize(new java.awt.Dimension(560, 280));
        sdoChucNang.setPreferredSize(new java.awt.Dimension(560, 280));
        sdoChucNang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblThoat.setBackground(new java.awt.Color(255, 255, 255));
        lblThoat.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThoat.setForeground(new java.awt.Color(33, 150, 243));
        lblThoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout (6).png"))); // NOI18N
        lblThoat.setText("Thoát");
        lblThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThoatMouseClicked(evt);
            }
        });
        sdoChucNang.add(lblThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 80, 40));

        lblThanhToan.setBackground(new java.awt.Color(255, 255, 255));
        lblThanhToan.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblThanhToan.setForeground(new java.awt.Color(33, 150, 243));
        lblThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cart (3).png"))); // NOI18N
        lblThanhToan.setText("Thanh Toán");
        sdoChucNang.add(lblThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 120, 40));

        lblXoa.setBackground(new java.awt.Color(255, 255, 255));
        lblXoa.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblXoa.setForeground(new java.awt.Color(33, 150, 243));
        lblXoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete.png"))); // NOI18N
        lblXoa.setText("Xóa");
        sdoChucNang.add(lblXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 70, 40));

        sdoPhieuChi.setBackground(new java.awt.Color(255, 255, 255));
        sdoPhieuChi.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(33, 150, 243)));
        sdoPhieuChi.setMinimumSize(new java.awt.Dimension(560, 280));
        sdoPhieuChi.setPreferredSize(new java.awt.Dimension(560, 280));
        sdoPhieuChi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNgayTao.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayTao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgayTao.setForeground(new java.awt.Color(153, 153, 153));
        lblNgayTao.setText("Ngày Tạo");
        sdoPhieuChi.add(lblNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 70, -1));

        lblNguoiChi.setBackground(new java.awt.Color(255, 255, 255));
        lblNguoiChi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNguoiChi.setForeground(new java.awt.Color(153, 153, 153));
        lblNguoiChi.setText("Người Chi");
        sdoPhieuChi.add(lblNguoiChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        lblGhiChu.setBackground(new java.awt.Color(255, 255, 255));
        lblGhiChu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGhiChu.setForeground(new java.awt.Color(153, 153, 153));
        lblGhiChu.setText("Ghi Chú");
        sdoPhieuChi.add(lblGhiChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 20));

        lblMucChi.setBackground(new java.awt.Color(255, 255, 255));
        lblMucChi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMucChi.setForeground(new java.awt.Color(153, 153, 153));
        lblMucChi.setText("Mục Chi");
        sdoPhieuChi.add(lblMucChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 20));

        lblPhieuChi.setBackground(new java.awt.Color(255, 255, 255));
        lblPhieuChi.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        lblPhieuChi.setForeground(new java.awt.Color(62, 73, 95));
        lblPhieuChi.setText("PHIẾU CHI");
        sdoPhieuChi.add(lblPhieuChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        lblSetSoPhieu.setBackground(new java.awt.Color(255, 255, 255));
        lblSetSoPhieu.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblSetSoPhieu.setForeground(new java.awt.Color(62, 73, 95));
        lblSetSoPhieu.setText("220922001");
        sdoPhieuChi.add(lblSetSoPhieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 80, 20));

        lblSoPhieu.setBackground(new java.awt.Color(255, 255, 255));
        lblSoPhieu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSoPhieu.setForeground(new java.awt.Color(153, 153, 153));
        lblSoPhieu.setText("Số Phiếu");
        sdoPhieuChi.add(lblSoPhieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        lblPhuongThuc.setBackground(new java.awt.Color(255, 255, 255));
        lblPhuongThuc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblPhuongThuc.setForeground(new java.awt.Color(153, 153, 153));
        lblPhuongThuc.setText("Phương Thức");
        sdoPhieuChi.add(lblPhuongThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 20));

        lblSetNguoiChi.setBackground(new java.awt.Color(255, 255, 255));
        lblSetNguoiChi.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblSetNguoiChi.setForeground(new java.awt.Color(62, 73, 95));
        lblSetNguoiChi.setText("CherryCe");
        sdoPhieuChi.add(lblSetNguoiChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));

        lblSetNgayTao.setBackground(new java.awt.Color(255, 255, 255));
        lblSetNgayTao.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblSetNgayTao.setForeground(new java.awt.Color(62, 73, 95));
        lblSetNgayTao.setText("22/09/22 22:03");
        sdoPhieuChi.add(lblSetNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, 20));

        lblTongTien.setBackground(new java.awt.Color(255, 255, 255));
        lblTongTien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(153, 153, 153));
        lblTongTien.setText("Tổng Tiền");
        sdoPhieuChi.add(lblTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 20));

        txtTongTien.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(62, 73, 95));
        txtTongTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });
        sdoPhieuChi.add(txtTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 70, 20));

        txtGhiChu.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtGhiChu.setForeground(new java.awt.Color(62, 73, 95));
        txtGhiChu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtGhiChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhiChuActionPerformed(evt);
            }
        });
        sdoPhieuChi.add(txtGhiChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 260, 20));

        cboMucChi.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cboMucChi.setForeground(new java.awt.Color(62, 73, 95));
        cboMucChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMucChi.setToolTipText("");
        cboMucChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sdoPhieuChi.add(cboMucChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 20));

        cboPhuongThuc.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cboPhuongThuc.setForeground(new java.awt.Color(62, 73, 95));
        cboPhuongThuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPhuongThuc.setToolTipText("");
        cboPhuongThuc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sdoPhieuChi.add(cboPhuongThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 90, 20));
        sdoPhieuChi.add(spt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 10));

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/close (1).png"))); // NOI18N
        sdoPhieuChi.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sdoPhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(sdoChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sdoPhieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sdoChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void txtGhiChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhiChuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhiChuActionPerformed

    private void lblThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThoatMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblThoatMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_dal_PhieuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_dal_PhieuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_dal_PhieuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_dal_PhieuChi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI_dal_PhieuChi dialog = new GUI_dal_PhieuChi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMucChi;
    private javax.swing.JComboBox<String> cboPhuongThuc;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblMucChi;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblNguoiChi;
    private javax.swing.JLabel lblPhieuChi;
    private javax.swing.JLabel lblPhuongThuc;
    private javax.swing.JLabel lblSetNgayTao;
    private javax.swing.JLabel lblSetNguoiChi;
    private javax.swing.JLabel lblSetSoPhieu;
    private javax.swing.JLabel lblSoPhieu;
    private javax.swing.JLabel lblThanhToan;
    private javax.swing.JLabel lblThoat;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JLabel lblXoa;
    private HELPER.PanelShadow sdoChucNang;
    private HELPER.PanelShadow sdoPhieuChi;
    private javax.swing.JSeparator spt_1;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}