package Graphic;

import javax.swing.ImageIcon;
import Logic.BattleField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andres
 */
public class BattlefieldUI extends javax.swing.JFrame {

    /**
     * Creates new form BattlefieldUI
     */
    
    BattleField battlefield1=new BattleField();
    
    public BattlefieldUI() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Resources/Battle.png")).getImage());
        
        jButton1.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
               
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenuItem30 = new javax.swing.JMenuItem();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        jMenuItem31 = new javax.swing.JMenuItem();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();
        jMenuItem33 = new javax.swing.JMenuItem();
        jPopupMenu7 = new javax.swing.JPopupMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        jMenuItem34 = new javax.swing.JMenuItem();
        jPopupMenu9 = new javax.swing.JPopupMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenuItem27 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setBackground(java.awt.SystemColor.controlDkShadow);
        jLabel2.setOpaque(true);
        jLabel2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel2ComponentAdded(evt);
            }
        });

        jMenuItem1.setText("Enemy 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);
        jPopupMenu1.add(jSeparator1);

        jMenuItem2.setText("Enemy 2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);
        jPopupMenu1.add(jSeparator2);

        jMenuItem3.setText("Enemy 3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);
        jPopupMenu1.add(jSeparator19);

        jMenuItem28.setText("Enemy 4");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem28);

        jMenuItem7.setText("Enemy 1");
        jPopupMenu3.add(jMenuItem7);
        jPopupMenu3.add(jSeparator5);

        jMenuItem8.setText("Enemy 2");
        jPopupMenu3.add(jMenuItem8);
        jPopupMenu3.add(jSeparator6);

        jMenuItem9.setText("Enemy 3");
        jPopupMenu3.add(jMenuItem9);
        jPopupMenu3.add(jSeparator21);

        jMenuItem30.setText("Enemy 4");
        jPopupMenu3.add(jMenuItem30);

        jMenuItem10.setText("Enemy 1");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jPopupMenu4.add(jMenuItem10);
        jPopupMenu4.add(jSeparator7);

        jMenuItem11.setText("Enemy 2");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jPopupMenu4.add(jMenuItem11);
        jPopupMenu4.add(jSeparator8);

        jMenuItem12.setText("Enemy 3");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jPopupMenu4.add(jMenuItem12);
        jPopupMenu4.add(jSeparator22);

        jMenuItem31.setText("Enemy 4");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jPopupMenu4.add(jMenuItem31);

        jMenuItem16.setText("Enemy 1");
        jPopupMenu6.add(jMenuItem16);
        jPopupMenu6.add(jSeparator11);

        jMenuItem17.setText("Enemy 2");
        jPopupMenu6.add(jMenuItem17);
        jPopupMenu6.add(jSeparator12);

        jMenuItem18.setText("Enemy 3");
        jPopupMenu6.add(jMenuItem18);
        jPopupMenu6.add(jSeparator24);

        jMenuItem33.setText("Enemy 4");
        jPopupMenu6.add(jMenuItem33);

        jMenuItem19.setText("Enemy 1");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jPopupMenu7.add(jMenuItem19);
        jPopupMenu7.add(jSeparator13);

        jMenuItem20.setText("Enemy 2");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jPopupMenu7.add(jMenuItem20);
        jPopupMenu7.add(jSeparator14);

        jMenuItem21.setText("Enemy 3");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jPopupMenu7.add(jMenuItem21);
        jPopupMenu7.add(jSeparator25);

        jMenuItem34.setText("Enemy 4");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jPopupMenu7.add(jMenuItem34);

        jMenuItem25.setText("Enemy 1");
        jPopupMenu9.add(jMenuItem25);
        jPopupMenu9.add(jSeparator17);

        jMenuItem26.setText("Enemy 2");
        jPopupMenu9.add(jMenuItem26);
        jPopupMenu9.add(jSeparator18);

        jMenuItem27.setText("Enemy 3");
        jPopupMenu9.add(jMenuItem27);
        jPopupMenu9.add(jSeparator3);

        jMenuItem4.setText("Enemy 4");
        jPopupMenu9.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("H.A-Battlefield");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 32767));
        jPanel1.setLayout(null);

        jTextField1.setBackground(java.awt.SystemColor.controlDkShadow);
        jTextField1.setFont(new java.awt.Font("Draggle BRK", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Hp");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(136, 78, 17, 22);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(13, 86, 117, 14);
        jPanel1.add(jProgressBar2);
        jProgressBar2.setBounds(13, 158, 117, 14);
        jPanel1.add(jProgressBar3);
        jProgressBar3.setBounds(13, 118, 117, 14);
        jPanel1.add(jProgressBar4);
        jProgressBar4.setBounds(13, 196, 117, 14);

        jTextField2.setEditable(false);
        jTextField2.setBackground(java.awt.SystemColor.controlDkShadow);
        jTextField2.setFont(new java.awt.Font("DkgHandwriting", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Stats");
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(13, 21, 55, 32);

        jTextField3.setBackground(java.awt.SystemColor.controlDkShadow);
        jTextField3.setFont(new java.awt.Font("Draggle over kerned BRK", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Agility");
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(136, 118, 37, 22);

        jTextField4.setBackground(java.awt.SystemColor.controlDkShadow);
        jTextField4.setFont(new java.awt.Font("Draggle over kerned BRK", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("Defense");
        jTextField4.setBorder(null);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(136, 150, 53, 22);

        jTextField5.setBackground(java.awt.SystemColor.controlDkShadow);
        jTextField5.setFont(new java.awt.Font("Draggle over kerned BRK", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setText("Damage");
        jTextField5.setBorder(null);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(136, 196, 53, 22);

        jTextField6.setEditable(false);
        jTextField6.setBackground(java.awt.SystemColor.controlDkShadow);
        jTextField6.setFont(new java.awt.Font("DkgHandwriting", 0, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setText("Actions");
        jTextField6.setBorder(null);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(10, 300, 78, 32);

        jButton3.setText("Skill");
        jButton3.setComponentPopupMenu(jPopupMenu3);
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 560, 93, 23);

        jButton10.setText("Map");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(60, 350, 93, 23);

        jButton1.setText("Attack");
        jButton1.setComponentPopupMenu(jPopupMenu1);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 440, 90, 23);
        jButton1.getAccessibleContext().setAccessibleDescription("");

        jButton2.setText("Defend");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 500, 90, 23);

        jButton11.setText("Attack");
        jButton11.setComponentPopupMenu(jPopupMenu4);
        jPanel1.add(jButton11);
        jButton11.setBounds(60, 440, 90, 23);

        jButton12.setText("Defend");
        jPanel1.add(jButton12);
        jButton12.setBounds(60, 500, 90, 23);

        jButton13.setText("Skill");
        jButton13.setComponentPopupMenu(jPopupMenu6);
        jPanel1.add(jButton13);
        jButton13.setBounds(60, 560, 90, 23);

        jButton14.setText("Attack");
        jButton14.setComponentPopupMenu(jPopupMenu7);
        jPanel1.add(jButton14);
        jButton14.setBounds(60, 440, 90, 23);

        jButton15.setText("Defend");
        jPanel1.add(jButton15);
        jButton15.setBounds(60, 500, 90, 23);

        jButton16.setText("Skill");
        jButton16.setComponentPopupMenu(jPopupMenu9);
        jPanel1.add(jButton16);
        jButton16.setBounds(60, 560, 90, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 200, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1080, 0, 210, 720);

        jInternalFrame2.setVisible(true);
        getContentPane().add(jInternalFrame2);
        jInternalFrame2.setBounds(670, 260, 230, 130);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/R3.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(540, 240, 120, 137);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/E5.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5);
        jButton5.setBounds(60, 80, 90, 160);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/E7.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        getContentPane().add(jButton6);
        jButton6.setBounds(280, 360, 100, 140);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/E8.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        getContentPane().add(jButton7);
        jButton7.setBounds(70, 570, 50, 130);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/R1.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(810, 540, 100, 140);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/R2.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(860, 90, 70, 150);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/battlefield.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 1070, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(true);
        jButton11.setVisible(false);
        jButton12.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(true);
        jButton13.setVisible(false);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(false);
        jButton11.setVisible(true);
        jButton12.setVisible(false);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton13.setVisible(true);
        jButton14.setVisible(false);
        jButton15.setVisible(false);
        jButton16.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2ComponentAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton1.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton13.setVisible(false);
        jButton14.setVisible(true);
        jButton15.setVisible(true);
        jButton16.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       // battlefield1.atacar(heroe0, enemigo0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe0, enemigo1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe0, enemigo2);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
       //battlefield1.atacar(heroe0, enemigo3);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe1, enemigo0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe1, enemigo1);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
       //battlefield1.atacar(heroe1, enemigo2);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe1, enemigo3);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe2, enemigo0);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe2, enemigo1);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        //battlefield1.atacar(heroe2, enemigo2);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:
       //battlefield1.atacar(heroe2, enemigo3);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

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
            java.util.logging.Logger.getLogger(BattlefieldUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattlefieldUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattlefieldUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattlefieldUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BattlefieldUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JPopupMenu jPopupMenu7;
    private javax.swing.JPopupMenu jPopupMenu9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}