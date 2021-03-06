/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author Aaron
 */
public class PointsCalc extends javax.swing.JPanel {

    /**
     * Creates new form AlgebraMenu
     */
    public PointsCalc() {
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

        subjectGroup1 = new javax.swing.ButtonGroup();
        subjectGroup2 = new javax.swing.ButtonGroup();
        subjectGroup3 = new javax.swing.ButtonGroup();
        subjectGroup4 = new javax.swing.ButtonGroup();
        subjectGroup5 = new javax.swing.ButtonGroup();
        subjectGroup6 = new javax.swing.ButtonGroup();
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        gradeLbl = new javax.swing.JLabel();
        levelLbl = new javax.swing.JLabel();
        pointsLbl = new javax.swing.JLabel();
        subjectLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        subjectBox1 = new javax.swing.JComboBox();
        hlRadio1 = new javax.swing.JRadioButton();
        olRadio1 = new javax.swing.JRadioButton();
        gradeBox1 = new javax.swing.JComboBox();
        subjectBox2 = new javax.swing.JComboBox();
        hlRadio2 = new javax.swing.JRadioButton();
        olRadio2 = new javax.swing.JRadioButton();
        gradeBox2 = new javax.swing.JComboBox();
        subjectBox3 = new javax.swing.JComboBox();
        hlRadio3 = new javax.swing.JRadioButton();
        olRadio3 = new javax.swing.JRadioButton();
        gradeBox3 = new javax.swing.JComboBox();
        subjectBox4 = new javax.swing.JComboBox();
        hlRadio4 = new javax.swing.JRadioButton();
        olRadio4 = new javax.swing.JRadioButton();
        gradeBox4 = new javax.swing.JComboBox();
        subjectBox5 = new javax.swing.JComboBox();
        hlRadio5 = new javax.swing.JRadioButton();
        olRadio5 = new javax.swing.JRadioButton();
        gradeBox5 = new javax.swing.JComboBox();
        subjectBox6 = new javax.swing.JComboBox();
        hlRadio6 = new javax.swing.JRadioButton();
        olRadio6 = new javax.swing.JRadioButton();
        gradeBox6 = new javax.swing.JComboBox();
        calculateBtn = new javax.swing.JButton();

        mainMenuPanel.setBackground(new java.awt.Color(52, 152, 219));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(400, 640));
        mainMenuPanel.setLayout(null);

        copyrightLbl.setBackground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        copyrightLbl.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLbl.setText("Copyright © 2015 | Maths Mate");
        copyrightLbl.setAlignmentY(0.0F);
        mainMenuPanel.add(copyrightLbl);
        copyrightLbl.setBounds(30, 580, 340, 30);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/homeIcon.png"))); // NOI18N
        homeBtn.setAlignmentY(0.0F);
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        homeBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        homeBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(homeBtn);
        homeBtn.setBounds(300, 10, 80, 50);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/backIcon.png"))); // NOI18N
        backBtn.setAlignmentY(0.0F);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        backBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        backBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(backBtn);
        backBtn.setBounds(20, 10, 80, 50);

        screenTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        screenTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        screenTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenTitleLbl.setText("CAO Points");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        gradeLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gradeLbl.setForeground(new java.awt.Color(255, 255, 255));
        gradeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gradeLbl.setText("Grade");
        mainMenuPanel.add(gradeLbl);
        gradeLbl.setBounds(280, 60, 100, 40);

        levelLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        levelLbl.setForeground(new java.awt.Color(255, 255, 255));
        levelLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        levelLbl.setText("HL/OL");
        mainMenuPanel.add(levelLbl);
        levelLbl.setBounds(190, 60, 100, 40);

        pointsLbl.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        pointsLbl.setForeground(new java.awt.Color(255, 255, 255));
        pointsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pointsLbl.setText("600 Points");
        mainMenuPanel.add(pointsLbl);
        pointsLbl.setBounds(0, 470, 400, 70);

        subjectLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subjectLbl.setForeground(new java.awt.Color(255, 255, 255));
        subjectLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subjectLbl.setText("Subject");
        mainMenuPanel.add(subjectLbl);
        subjectLbl.setBounds(20, 60, 100, 40);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        subjectBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Irish", "Maths", "Geography", "Technology", "French", "Applied Maths", "German", "Construction Studies", "Religion" }));
        subjectBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBox1ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(subjectBox1);
        subjectBox1.setBounds(30, 100, 160, 20);

        subjectGroup1.add(hlRadio1);
        hlRadio1.setContentAreaFilled(false);
        mainMenuPanel.add(hlRadio1);
        hlRadio1.setBounds(210, 100, 20, 21);

        subjectGroup1.add(olRadio1);
        olRadio1.setContentAreaFilled(false);
        olRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olRadio1ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(olRadio1);
        olRadio1.setBounds(240, 100, 20, 21);

        gradeBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "D1", "D2", "D3", "E", "F", "NG" }));
        mainMenuPanel.add(gradeBox1);
        gradeBox1.setBounds(290, 100, 80, 20);

        subjectBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Irish", "Maths", "Geography", "Technology", "French", "Applied Maths", "German", "Construction Studies", "Religion" }));
        subjectBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBox2ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(subjectBox2);
        subjectBox2.setBounds(30, 150, 160, 20);

        subjectGroup2.add(hlRadio2);
        hlRadio2.setContentAreaFilled(false);
        mainMenuPanel.add(hlRadio2);
        hlRadio2.setBounds(210, 150, 20, 21);

        subjectGroup2.add(olRadio2);
        olRadio2.setContentAreaFilled(false);
        olRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olRadio2ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(olRadio2);
        olRadio2.setBounds(240, 150, 20, 21);

        gradeBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "D1", "D2", "D3", "E", "F", "NG" }));
        mainMenuPanel.add(gradeBox2);
        gradeBox2.setBounds(290, 150, 80, 20);

        subjectBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Irish", "Maths", "Geography", "Technology", "French", "Applied Maths", "German", "Construction Studies", "Religion" }));
        subjectBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBox3ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(subjectBox3);
        subjectBox3.setBounds(30, 200, 160, 20);

        subjectGroup3.add(hlRadio3);
        hlRadio3.setContentAreaFilled(false);
        mainMenuPanel.add(hlRadio3);
        hlRadio3.setBounds(210, 200, 20, 21);

        subjectGroup3.add(olRadio3);
        olRadio3.setContentAreaFilled(false);
        olRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olRadio3ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(olRadio3);
        olRadio3.setBounds(240, 200, 20, 21);

        gradeBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "D1", "D2", "D3", "E", "F", "NG" }));
        mainMenuPanel.add(gradeBox3);
        gradeBox3.setBounds(290, 200, 80, 20);

        subjectBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Irish", "Maths", "Geography", "Technology", "French", "Applied Maths", "German", "Construction Studies", "Religion" }));
        subjectBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBox4ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(subjectBox4);
        subjectBox4.setBounds(30, 250, 160, 20);

        subjectGroup4.add(hlRadio4);
        hlRadio4.setContentAreaFilled(false);
        mainMenuPanel.add(hlRadio4);
        hlRadio4.setBounds(210, 250, 20, 21);

        subjectGroup4.add(olRadio4);
        olRadio4.setContentAreaFilled(false);
        olRadio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olRadio4ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(olRadio4);
        olRadio4.setBounds(240, 250, 20, 21);

        gradeBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "D1", "D2", "D3", "E", "F", "NG" }));
        mainMenuPanel.add(gradeBox4);
        gradeBox4.setBounds(290, 250, 80, 20);

        subjectBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Irish", "Maths", "Geography", "Technology", "French", "Applied Maths", "German", "Construction Studies", "Religion" }));
        subjectBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBox5ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(subjectBox5);
        subjectBox5.setBounds(30, 300, 160, 20);

        subjectGroup5.add(hlRadio5);
        hlRadio5.setContentAreaFilled(false);
        mainMenuPanel.add(hlRadio5);
        hlRadio5.setBounds(210, 300, 20, 21);

        subjectGroup5.add(olRadio5);
        olRadio5.setContentAreaFilled(false);
        olRadio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olRadio5ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(olRadio5);
        olRadio5.setBounds(240, 300, 20, 21);

        gradeBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "D1", "D2", "D3", "E", "F", "NG" }));
        mainMenuPanel.add(gradeBox5);
        gradeBox5.setBounds(290, 300, 80, 20);

        subjectBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Irish", "Maths", "Geography", "Technology", "French", "Applied Maths", "German", "Construction Studies", "Religion" }));
        subjectBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectBox6ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(subjectBox6);
        subjectBox6.setBounds(30, 350, 160, 20);

        subjectGroup6.add(hlRadio6);
        hlRadio6.setContentAreaFilled(false);
        mainMenuPanel.add(hlRadio6);
        hlRadio6.setBounds(210, 350, 20, 21);

        subjectGroup6.add(olRadio6);
        olRadio6.setContentAreaFilled(false);
        olRadio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olRadio6ActionPerformed(evt);
            }
        });
        mainMenuPanel.add(olRadio6);
        olRadio6.setBounds(240, 350, 20, 21);

        gradeBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A1", "A2", "B1", "B2", "B3", "C1", "C2", "C3", "D1", "D2", "D3", "E", "F", "NG" }));
        mainMenuPanel.add(gradeBox6);
        gradeBox6.setBounds(290, 350, 80, 20);

        calculateBtn.setText("Calculate Points");
        mainMenuPanel.add(calculateBtn);
        calculateBtn.setBounds(120, 430, 150, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "EXTRAS_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void subjectBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectBox1ActionPerformed

    private void olRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olRadio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olRadio1ActionPerformed

    private void subjectBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectBox2ActionPerformed

    private void olRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olRadio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olRadio2ActionPerformed

    private void subjectBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectBox3ActionPerformed

    private void olRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olRadio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olRadio3ActionPerformed

    private void subjectBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectBox4ActionPerformed

    private void olRadio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olRadio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olRadio4ActionPerformed

    private void subjectBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectBox5ActionPerformed

    private void olRadio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olRadio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olRadio5ActionPerformed

    private void subjectBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectBox6ActionPerformed

    private void olRadio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olRadio6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_olRadio6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JComboBox gradeBox1;
    private javax.swing.JComboBox gradeBox2;
    private javax.swing.JComboBox gradeBox3;
    private javax.swing.JComboBox gradeBox4;
    private javax.swing.JComboBox gradeBox5;
    private javax.swing.JComboBox gradeBox6;
    private javax.swing.JLabel gradeLbl;
    private javax.swing.JRadioButton hlRadio1;
    private javax.swing.JRadioButton hlRadio2;
    private javax.swing.JRadioButton hlRadio3;
    private javax.swing.JRadioButton hlRadio4;
    private javax.swing.JRadioButton hlRadio5;
    private javax.swing.JRadioButton hlRadio6;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel levelLbl;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JRadioButton olRadio1;
    private javax.swing.JRadioButton olRadio2;
    private javax.swing.JRadioButton olRadio3;
    private javax.swing.JRadioButton olRadio4;
    private javax.swing.JRadioButton olRadio5;
    private javax.swing.JRadioButton olRadio6;
    private javax.swing.JLabel pointsLbl;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JComboBox subjectBox1;
    private javax.swing.JComboBox subjectBox2;
    private javax.swing.JComboBox subjectBox3;
    private javax.swing.JComboBox subjectBox4;
    private javax.swing.JComboBox subjectBox5;
    private javax.swing.JComboBox subjectBox6;
    private javax.swing.ButtonGroup subjectGroup1;
    private javax.swing.ButtonGroup subjectGroup2;
    private javax.swing.ButtonGroup subjectGroup3;
    private javax.swing.ButtonGroup subjectGroup4;
    private javax.swing.ButtonGroup subjectGroup5;
    private javax.swing.ButtonGroup subjectGroup6;
    private javax.swing.JLabel subjectLbl;
    // End of variables declaration//GEN-END:variables
}
