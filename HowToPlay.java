/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

public class HowToPlay extends javax.swing.JPanel {

    /**
     * Creates new form HowToPlay
     */
    public HowToPlay() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel3.setText("Reduces 2 wrong options.");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel4.setText("You can select 2 options for one question.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel5.setText("Doubles the time.");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel6.setText("Changes the question.");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel8.setText("Home button to go back to main screen.");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        jLabel2.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel2.setText("How to Play");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 260, 90));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/icon-extratime.png"))); // NOI18N
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/fifty.png"))); // NOI18N
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/new.png"))); // NOI18N
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/double.png"))); // NOI18N
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/images/home.png"))); // NOI18N
        homeButton.setBorder(null);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    //frames created by netbeans
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        QuizApp.frame.remove(this);
        mainPanel mp = new mainPanel();
        QuizApp.frame.add(mp);
        QuizApp.frame.revalidate();
        QuizApp.frame.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
