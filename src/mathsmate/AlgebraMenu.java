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
public class AlgebraMenu extends javax.swing.JPanel {

    /**
     * Creates new form AlgebraMenu
     */
    public AlgebraMenu() {
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

        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        quizBtn = new javax.swing.JButton();
        formulaBtn = new javax.swing.JButton();
        notesBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();

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

        titleLbl.setBackground(new java.awt.Color(255, 255, 255));
        titleLbl.setFont(new java.awt.Font("Calibri Light", 0, 60)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Maths Mate");
        titleLbl.setAlignmentY(0.0F);
        mainMenuPanel.add(titleLbl);
        titleLbl.setBounds(50, 80, 310, 74);

        quizBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/quizIcon.png"))); // NOI18N
        quizBtn.setAlignmentY(0.0F);
        quizBtn.setBorderPainted(false);
        quizBtn.setContentAreaFilled(false);
        quizBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quizBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        quizBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        quizBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(quizBtn);
        quizBtn.setBounds(50, 170, 310, 100);

        formulaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/formulaIcon.png"))); // NOI18N
        formulaBtn.setAlignmentY(0.0F);
        formulaBtn.setBorderPainted(false);
        formulaBtn.setContentAreaFilled(false);
        formulaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        formulaBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        formulaBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        formulaBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        formulaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formulaBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(formulaBtn);
        formulaBtn.setBounds(50, 410, 310, 100);

        notesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/notesIcon.png"))); // NOI18N
        notesBtn.setAlignmentY(0.0F);
        notesBtn.setBorderPainted(false);
        notesBtn.setContentAreaFilled(false);
        notesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notesBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        notesBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        notesBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        notesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(notesBtn);
        notesBtn.setBounds(50, 290, 310, 100);

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
        screenTitleLbl.setText("Algebra Menu");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

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

    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "ALGEBRA_QUIZ");
        }
    }//GEN-LAST:event_quizBtnActionPerformed

    private void formulaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formulaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formulaBtnActionPerformed

    private void notesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesBtnActionPerformed
       
    }//GEN-LAST:event_notesBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout)layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton formulaBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JButton notesBtn;
    private javax.swing.JButton quizBtn;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
