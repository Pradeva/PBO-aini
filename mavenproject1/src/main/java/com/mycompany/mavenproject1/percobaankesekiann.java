package com.mycompany.mavenproject1;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class percobaankesekiann extends javax.swing.JFrame {
    int pasteur, bubat, harga, beli, total, bayar, kembali;
    boolean value;
    /**
     * Creates new form percobaankesekiann
     */
    public percobaankesekiann() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jurusan = new javax.swing.JComboBox<>();
        rb_pasteur = new javax.swing.JRadioButton();
        rb_bubat = new javax.swing.JRadioButton();
        txt_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_input = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        txt_nomor = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_jumlah = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rb_iya = new javax.swing.JRadioButton();
        rb_tida = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PBB TRAVEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Travel"));

        jLabel2.setText("Jurusan");

        jLabel3.setText("Titik ");

        jLabel4.setText("Harga");

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Jakarta", "Bekasi", "Semarang" }));
        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_pasteur);
        rb_pasteur.setText("pasteur");
        rb_pasteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_pasteurActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_bubat);
        rb_bubat.setText("bubat");
        rb_bubat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_bubatActionPerformed(evt);
            }
        });

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_pasteur)
                                    .addComponent(rb_bubat)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txt_harga))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rb_pasteur))
                .addGap(2, 2, 2)
                .addComponent(rb_bubat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 150));

        jLabel5.setText("No Kursi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel6.setText("Nama");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel7.setText("Jumlah tiket");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel9.setText("Bayar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 20));

        jLabel10.setText("Kembali");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        btn_input.setText("INPUT Lagi");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        btn_keluar.setText("KELUAR");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        btn_cetak.setText("CETAK");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 320, 100));
        jPanel1.add(txt_nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 130, -1));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 130, -1));

        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });
        txt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahKeyReleased(evt);
            }
        });
        jPanel1.add(txt_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 130, -1));
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 130, -1));

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 130, -1));
        jPanel1.add(txt_kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 130, -1));

        jLabel11.setText("Apakah kamu sudah yakin ? ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        buttonGroup1.add(rb_iya);
        rb_iya.setText("iya");
        rb_iya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_iyaActionPerformed(evt);
            }
        });
        jPanel1.add(rb_iya, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        buttonGroup1.add(rb_tida);
        rb_tida.setText("tida");
        rb_tida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_tidaActionPerformed(evt);
            }
        });
        jPanel1.add(rb_tida, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_pasteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_pasteurActionPerformed
        // TODO add your handling code here: menampilkan harga setelah pilih titik keberangkatan
        if(rb_pasteur.isSelected()){
            txt_harga.setText(String.valueOf(pasteur));
        }
    }//GEN-LAST:event_rb_pasteurActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here: butun keluar
        int answer= JOptionPane.showConfirmDialog(null,"YAKIN KELUAR","Keluar",JOptionPane.OK_OPTION);
        if (answer==JOptionPane.OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
        // TODO add your handling code here:membuat kondisi menuntukan harga
        if(jurusan.getSelectedItem().equals("Pilih Jurusan")){
            buttonGroup2.clearSelection();
            txt_harga.setText("");
        }
        else if(jurusan.getSelectedItem().equals("Jakarta")){
            pasteur=125000;
            bubat=150000;
        }
        else if(jurusan.getSelectedItem().equals("Bekasi")){
            pasteur=95000;
            bubat=110000;
        }
        else if(jurusan.getSelectedItem().equals("Semarang")){
            pasteur=175000;
            bubat=200000;
        }
    }//GEN-LAST:event_jurusanActionPerformed

    private void rb_bubatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_bubatActionPerformed
        // TODO add your handling code here: menampilkan harga setelah pilih titik keberangkatan
        if(rb_bubat.isSelected()){
            txt_harga.setText(String.valueOf(bubat));
        }
    }//GEN-LAST:event_rb_bubatActionPerformed

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        // TODO add your handling code here: jumlah beli tiket
        beli=Integer.parseInt(txt_jumlah.getText());
        harga=Integer.parseInt(txt_harga.getText());
        total=bayar*harga;
        txt_total.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:uang bayar
        bayar=Integer.parseInt(txt_bayar.getText());
        kembali=Integer.parseInt(txt_total.getText());
        total=bayar-kembali;
        txt_kembalian.setText(String.valueOf(total));
        
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void txt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahKeyReleased
        // TODO add your handling code here:key realese jumlah tiket
        int a, b, c;
        a=Integer.valueOf(txt_harga.getText());
        b=Integer.valueOf(txt_jumlah.getText());
        c=a*b;
        txt_total.setText(""+c);
    }//GEN-LAST:event_txt_jumlahKeyReleased

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        // TODO add your handling code here:key realese uang bayar
         int a, b, c;
        a=Integer.valueOf(txt_bayar.getText());
        b=Integer.valueOf(txt_total.getText());
        c=a-b;
        txt_kembalian.setText(""+c);
    }//GEN-LAST:event_txt_bayarKeyReleased

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here: INPUT LAGI
        buttonGroup2.clearSelection();
        txt_harga.setText("");
        jurusan.setSelectedItem("Pilih Jurusan");
        txt_nomor.setText("");
        txt_nama.setText("");
        txt_total.setText("");
        txt_jumlah.setText("");
        txt_bayar.setText("");
        txt_kembalian.setText("");
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        // TODO add your handling code here:button cetak
//        btn_cetak.setText((String)jurusan.getSelectedItem());
        
        
        if (rb_iya.isSelected()){
            value = true;
        }
        
        if (rb_tida.isSelected()){
            value = false;
        }
        
        if (value){
            txt_area.setText(
                "Nomor Kursi        :"+txt_nomor.getText()+"\n"+
                "Nama Penumpang        :"+txt_nama.getText()+"\n"+
                "Jumlah Tiket        :"+txt_jumlah.getText()+"\n"+
                "Total        :"+txt_total.getText()+"\n"+
                "Bayar        :"+txt_bayar.getText()+"\n"+
                "kembalian        :"+txt_kembalian.getText()+"\n");
        }else{
            txt_area.setText("Jika belum yakin, lakukan perubahan!");
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void rb_iyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_iyaActionPerformed
        // TODO add your handling code here: Bolean iyaaa =
           
    }//GEN-LAST:event_rb_iyaActionPerformed

    private void rb_tidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_tidaActionPerformed
        // TODO add your handling code here: bolean tidaa
        
    }//GEN-LAST:event_rb_tidaActionPerformed

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
            java.util.logging.Logger.getLogger(percobaankesekiann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(percobaankesekiann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(percobaankesekiann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(percobaankesekiann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new percobaankesekiann().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JRadioButton rb_bubat;
    private javax.swing.JRadioButton rb_iya;
    private javax.swing.JRadioButton rb_pasteur;
    private javax.swing.JRadioButton rb_tida;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nomor;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
