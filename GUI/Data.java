/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import LOGIC.Activity;
import LOGIC.KickBoxing;
import LOGIC.Running;
import LOGIC.StrengthTraining;
import LOGIC.Swimming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kerog
 */
public class Data extends javax.swing.JFrame {

    /**
     * Creates new form Data
     */
    public Data() {
        initComponents();
    }

    public void sort(){
            
            List<String> data = new Vector<String>();
            float runningC = 0; float swimmingC= 0;float KCKc =0 ;float STc=0;
            float runningHB = 0 ;float swimmingHB= 0;float KCKhb = 0;float SThb=0;
            for(int i = 0; i < Menu.list.size() ; i++ ){
                if (Menu.list.get(i) instanceof Swimming){
                    swimmingC +=((Swimming)Menu.list.get(i)).calculateCalories();
                    swimmingHB += ((Swimming)Menu.list.get(i)).calculateHeartBeat();
                }else if (Menu.list.get(i) instanceof Running){
                     runningC +=((Running)Menu.list.get(i)).calculateCalories();
                     runningHB += ((Running)Menu.list.get(i)).calculateHeartBeat();
                
                }else if (Menu.list.get(i) instanceof KickBoxing){
                    KCKc +=((KickBoxing)Menu.list.get(i)).calculateCalories();
                    KCKhb += ((KickBoxing)Menu.list.get(i)).calculateHeartBeat();
                
                 }else{
                    STc +=((StrengthTraining)Menu.list.get(i)).calculateCalories();
                    SThb += ((StrengthTraining)Menu.list.get(i)).calculateHeartBeat();
                }
            }
            List <Float> s = new Vector <Float> ();
            if (swimmingC !=0 )
                s.add(swimmingC);
            if (runningC !=0 )
                 s.add(runningC);
            if (KCKc !=0 )
                s.add(KCKc);
            if (STc !=0 )
                s.add(STc);
            
            Collections.sort(s);
            for(int i = s.size()-1 ; i >=0 ; i--){
                if(s.get(i) == swimmingC){
                    data.add("Swimming");
                    data.add(Float.toString(swimmingC));
                    data.add(Float.toString(swimmingHB));
                }else if (s.get(i) == runningC){
                    data.add("Running");
                    data.add(Float.toString(runningC));
                    data.add(Float.toString(runningHB));
                }else if (s.get(i) == KCKc){
                    data.add("Kick_Boxing");
                    data.add(Float.toString(KCKc));
                    data.add(Float.toString(KCKhb));
                }else if (s.get(i) == STc){
                    data.add("Strength_Training");
                    data.add(Float.toString(STc));
                    data.add(Float.toString(SThb));
                }
            }
        jLabel3.setText(Float.toString(Activity.calories));
        jLabel4.setText(Float.toString(Activity.heartBeat));
        
        
        DefaultTableModel j = (DefaultTableModel)jTable2.getModel();
        j.setRowCount(0);
        int x = 0 ;
        for(int i = 0 ; i < data.size() ;i+=3){
            List<String> Data = new Vector<String>();
            Data.add(data.get(i));
            Data.add(data.get(i+1));
            Data.add(data.get(i+2));
            j.insertRow(x, (Vector)Data);
            x++;
        }  
    }
    
    public void update(){
        
        List<String> data = new Vector<String>();
        
        for(int i = 0 ; i < Menu.list.size() ; i++){
            if (Menu.list.get(i) instanceof Swimming){
                data.add( "Swimming");
                data.add( Float.toString(((Swimming)Menu.list.get(i)).calculateCalories()));
                data.add( Float.toString(((Swimming)Menu.list.get(i)).calculateHeartBeat()));
            }else if (Menu.list.get(i) instanceof Running){
                data.add("Running");
                data.add( Float.toString(((Running)Menu.list.get(i)).calculateCalories()));
                data.add( Float.toString(((Running)Menu.list.get(i)).calculateHeartBeat()));
            }else if (Menu.list.get(i) instanceof KickBoxing){
                data.add( "Kick_Boxing");
                data.add( Float.toString(((KickBoxing)Menu.list.get(i)).calculateCalories()));
                data.add( Float.toString(((KickBoxing)Menu.list.get(i)).calculateHeartBeat()));
            }else{
                data.add("Strength_Training");
                data.add( Float.toString(((StrengthTraining)Menu.list.get(i)).calculateCalories()));
                data.add( Float.toString(((StrengthTraining)Menu.list.get(i)).calculateHeartBeat()));
            }
        }
        
        jLabel3.setText(Float.toString(Activity.calories));
        jLabel4.setText(Float.toString(Activity.heartBeat));
        DefaultTableModel j = (DefaultTableModel)jTable2.getModel();
        
        int x = 0 ;
        for(int i = 0 ; i < data.size() ;i+=3){
            List<String> Data = new Vector<String>();
            Data.add(data.get(i));
            Data.add(data.get(i+1));
            Data.add(data.get(i+2));
            j.insertRow(x, (Vector)Data);
            x++;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Type", "calories burnt", "heart rate increase"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Total calories burnt​:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Total heart rate​: ");

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu u = new Menu();
        u.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sort();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
