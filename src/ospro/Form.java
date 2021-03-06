/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ospro;

import java.util.Arrays;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alkady
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Trans
     */
    public Form() {
        initComponents();
        table.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fcfs = new javax.swing.JButton();
        sdf = new javax.swing.JButton();
        pr = new javax.swing.JButton();
        rr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        trt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        wt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Algorithms");

        fcfs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fcfs.setText("FCFS");
        fcfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcfsActionPerformed(evt);
            }
        });

        sdf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sdf.setText("SJF");
        sdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdfActionPerformed(evt);
            }
        });

        pr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pr.setText("priority");
        pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prActionPerformed(evt);
            }
        });

        rr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rr.setText("RR");

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_N", "Time arrival", "Time Burst", "Priority", "Turn Around Time", "Waiting Time"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("AvgTRTime");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("AvgWTime");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Operating System Project");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fcfs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trt)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wt))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fcfs)
                        .addGap(18, 18, 18)
                        .addComponent(sdf)
                        .addGap(18, 18, 18)
                        .addComponent(pr)
                        .addGap(18, 18, 18)
                        .addComponent(rr)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(wt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fcfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcfsActionPerformed
        // TODO add your handling code here:
        firstCFServe();
      
        
    }//GEN-LAST:event_fcfsActionPerformed
private void firstCFServe()
    {
       int []arrival= Time();

       Process process;
         for (int i = 0; i <arrival.length; i++) 
         {
            process=new Process();
            process.setArrivalTime(arrival[i]);
            
         }
         Vector vc = new Vector();

       // Process process;
          
          for (int i = 1; i <arrival.length; i++) {

            process = new Process();
            process.setArrivalTime(arrival[i]);
            process.setBurstTime((int) (Math.random() * 100));
            vc.addElement(process);
          }

        DefaultTableModel dtm =(DefaultTableModel)table.getModel();
        dtm.setRowCount(0);
        int ar=0;
        double atimeallpr=0;
         double wtimeallpr=0;
        for (int i = 0; i < vc.size(); i++) {
            Vector newRow = new Vector();
            Process  pc1 =(Process)vc.get(i);
            newRow.addElement(i);
            newRow.addElement(pc1.getArrivalTime());
            newRow.addElement(pc1.getBurstTime());
             newRow.addElement(0);
             if(ar<pc1.getArrivalTime())
                ar+=pc1.getArrivalTime()-ar;
             ar+=pc1.getBurstTime();
             newRow.addElement((ar-pc1.getArrivalTime())); ////// around time =finish-arrival
             newRow.addElement((ar-pc1.getArrivalTime())-pc1.getBurstTime()); ///waiting time=around time-burst
             atimeallpr+=(ar-pc1.getArrivalTime());
             wtimeallpr+=(ar-pc1.getArrivalTime())-pc1.getBurstTime();
            dtm.addRow(newRow);
          }
        double avgtr=atimeallpr/1000;
        double avgwt=wtimeallpr/1000;
         String str=""+avgtr;
         trt.setText(str);
         String str1=""+avgwt;
         wt.setText(str1);
        
        table.setModel(dtm);
        table.updateUI();
        jScrollPane1.setViewportView(table);
    }
    
    private void sdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdfActionPerformed
        SJF();
    }//GEN-LAST:event_sdfActionPerformed

    private void prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prActionPerformed
// TODO add your handling code here:
        
        
    }//GEN-LAST:event_prActionPerformed

    
    
    private void SJF() {
        // TODO add your handling code here:
        
        int [] burst= Time();
        
        Process process;
        for (int i = 0; i <burst.length; i++)
        {
            process=new Process();
            process.setArrivalTime(burst[i]);
            
        }
        Vector vc = new Vector();
        for (int i = 1; i <burst.length; i++) {
            
            process = new Process();
            process.setArrivalTime(burst[i]);
            process.setBurstTime((int) (Math.random() * 1000));
            vc.addElement(process);
        }
         DefaultTableModel dtm =(DefaultTableModel)table.getModel();
        dtm.setRowCount(0);
       vc=fun(vc);
       int ar=0;
       double atimeallpr=0;
       double wtimeallpr=0;
      for (int i = 0; i < vc.size(); i++) {
            Vector newRow = new Vector();
            Process  pc1 =(Process)vc.get(i);
            newRow.addElement(i);
            newRow.addElement(pc1.getArrivalTime());
            newRow.addElement(pc1.getBurstTime());
             newRow.addElement(0);
            if(ar<pc1.getArrivalTime())
                ar+=pc1.getArrivalTime()-ar;
             ar+=pc1.getBurstTime();
             newRow.addElement((ar-pc1.getArrivalTime())); ////// around time =finish-arrival
             newRow.addElement((ar-pc1.getArrivalTime())-pc1.getBurstTime()); ///waiting time=around time-burst
             atimeallpr+=(ar-pc1.getArrivalTime());
             wtimeallpr+=(ar-pc1.getArrivalTime())-pc1.getBurstTime();
            dtm.addRow(newRow);
        }
       double avgtr=atimeallpr/1000;
        double avgwt=wtimeallpr/1000;
         String str=""+avgtr;
         trt.setText(str);
         String str1=""+avgwt;
         wt.setText(str1);
       table.setModel(dtm);
        table.updateUI();
        jScrollPane1.setViewportView(table);
//            
    }
    private Vector fun(Vector vc)
    {
    
    for (int i = 0, j = 0; i < vc.size() - 1; i++) {
            Process pc1 = (Process) vc.get(i);

            Process pc2 = new Process();

            int btimepc1 = pc1.getBurstTime();

            int atimepc1 = pc1.getArrivalTime();

            int min_Atime_ind = i;

            int next_ATime_V = 0;

            for (j = i + 1; j < vc.size() - 2; j++)
      {
                pc2 = (Process) vc.get(j);

                next_ATime_V = pc2.getArrivalTime();

                int burstTimeOfNextOfobject2 = pc2.getBurstTime();

                if (btimepc1 == burstTimeOfNextOfobject2) 
             {
                    if (next_ATime_V < atimepc1) 
             {
                        int tempValue = atimepc1;

                        atimepc1 = next_ATime_V;

                        next_ATime_V = tempValue;

                        min_Atime_ind = j;
                    }
                }
            }
            if (min_Atime_ind != i) {
                pc1.setArrivalTime(atimepc1); 
                pc2.setArrivalTime(next_ATime_V);
                vc.remove(i);
                vc.add(i, pc1);
                vc.remove(j);
                vc.add(j, pc2);
            }
        }
    return vc;
    
    }

    private int [] Time() {
        int array[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = (int) (Math.random() * 1100);
        }
        
        Arrays.sort(array);
        return array;
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fcfs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pr;
    private javax.swing.JButton rr;
    private javax.swing.JButton sdf;
    private javax.swing.JTable table;
    private javax.swing.JTextField trt;
    private javax.swing.JTextField wt;
    // End of variables declaration//GEN-END:variables
}
