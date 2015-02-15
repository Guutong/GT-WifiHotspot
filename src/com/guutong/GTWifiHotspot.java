/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guutong;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author pornmongkon
 */
public class GTWifiHotspot extends javax.swing.JFrame {

    /**
     * Creates new form GTWifiHotspot
     */
    public GTWifiHotspot() {
        setTitle("GT-WiFi Hotspot v.1.0");
        setIcon();
        initComponents();
        ExecuteShellCommand executetitle = new ExecuteShellCommand();
        String command1 = "netsh wlan show drivers";
        String hostck = executetitle.executeCommand(command1);
        int intIndex = hostck.indexOf("Hosted network supported  : Yes");
        if (intIndex == - 1) {
            jTextDialog.setText("Hosted network supported  : No");
        } else {
            jTextDialog.setText("Hosted network supported  : Yes");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDialog = new javax.swing.JTextArea();
        jButtonSet = new javax.swing.JButton();
        jButtonStatus = new javax.swing.JButton();
        jLabelSsid = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jFieldSsid = new javax.swing.JTextField();
        jFieldPass = new javax.swing.JTextField();
        jButtonStart = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();
        jButtonAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setToolTipText("");

        jTextDialog.setColumns(20);
        jTextDialog.setRows(5);
        jScrollPane1.setViewportView(jTextDialog);

        jButtonSet.setText("Setting");
        jButtonSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetActionPerformed(evt);
            }
        });

        jButtonStatus.setText("Status");
        jButtonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatusActionPerformed(evt);
            }
        });

        jLabelSsid.setText("Hotspot SSID");

        jLabelPass.setText("Password");

        jFieldSsid.setText("GT-WiFiHotspot");
        jFieldSsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFieldSsidActionPerformed(evt);
            }
        });

        jFieldPass.setText("gtwifi1234");

        jButtonStart.setBackground(new java.awt.Color(0, 204, 0));
        jButtonStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonStop.setBackground(new java.awt.Color(255, 0, 0));
        jButtonStop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonStop.setText("Stop");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        jButtonAbout.setText("About");
        jButtonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAbout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSsid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFieldSsid, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jFieldPass)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSsid)
                    .addComponent(jFieldSsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass)
                    .addComponent(jFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSet)
                    .addComponent(jButtonStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStart)
                    .addComponent(jButtonStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAbout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetActionPerformed
        // TODO add your handling code here:
        ExecuteShellCommand executeSet = new ExecuteShellCommand();
        String commandSet = "netsh wlan set hostednetwork mode=allow ssid=" + jFieldSsid.getText() + " key=" + jFieldPass.getText();
        String outputSet = executeSet.executeCommand(commandSet);
        jTextDialog.setText(outputSet);
    }//GEN-LAST:event_jButtonSetActionPerformed

    private void jButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatusActionPerformed
        // TODO add your handling code here:
        ExecuteShellCommand executeShow = new ExecuteShellCommand();
        String commandShow = "netsh wlan show hostednetwork";
        String outputShow = executeShow.executeCommand(commandShow);
        jTextDialog.setText(outputShow);
    }//GEN-LAST:event_jButtonStatusActionPerformed

    private void jFieldSsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFieldSsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFieldSsidActionPerformed

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        // TODO add your handling code here:s
        execStart();
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        // TODO add your handling code here:
        ExecuteShellCommand executeStop = new ExecuteShellCommand();
        String commandStop = "netsh wlan stop hostednetwork";
        String outputStop = executeStop.executeCommand(commandStop);
        jTextDialog.setText(outputStop);
    }//GEN-LAST:event_jButtonStopActionPerformed

    private void jButtonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAboutActionPerformed
        // TODO add your handling code here:
        jTextDialog.setText("GT-WiFi Hotspot v.1.0 \r\n\r\n\r\n"
                + "This program is (Program Developer)\r\n"
                + "me has given to all participants \r\nbe used for free (FREE),\r\n"
                + "you do not have to cost you anything\r\n\r\n\r\n"
                + "Dev.by Mr.Pornmongkon Pongsai\r\n"
                + "blog : http://guutong.blogspot.com/");
    }//GEN-LAST:event_jButtonAboutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ExecuteShellCommand executeClose = new ExecuteShellCommand();
        String commandClose = "netsh wlan stop hostednetwork";
        String outputClose = executeClose.executeCommand(commandClose);
        jTextDialog.setText(outputClose);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GTWifiHotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GTWifiHotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GTWifiHotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GTWifiHotspot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GTWifiHotspot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbout;
    private javax.swing.JButton jButtonSet;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JTextField jFieldPass;
    private javax.swing.JTextField jFieldSsid;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelSsid;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextDialog;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    public void execStart(){
        ExecuteShellCommand executeStart = new ExecuteShellCommand();
        String commandStart = "netsh wlan start hostednetwork";
        String outputStart = executeStart.executeCommand(commandStart);
        jTextDialog.setText(outputStart);
    }
}