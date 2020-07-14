/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Dell
 */
public class scoreTable extends javax.swing.JFrame {

    /**
     * Creates new form scoreTable
     */
    
   // userList uRecordObj;
    /**
     * Creates new form ManageFlights (constructor)
     */

    public scoreTable() {
        JTableHeader head=new JTableHeader();
        head.setBackground(Color.black);
        head.setBackground(Color.PINK);
        setSize(674,478);
        initComponents();
     //   this.uRecordObj = new userList();
        addRowToTable();
    }
    
    ArrayList<users> LoadAllScores() {
        dbConnectivity db = new dbConnectivity();
        return db.LoadAllUsers();
    }

    public void addRowToTable() {
      //  System.out.println("gointo");
        ArrayList<users> user = LoadAllScores();
        DefaultTableModel model = (DefaultTableModel) myTable.getModel();
        Object rowdata[] = new Object[2];
        for (int i = 0; i < user.size(); i++) {
            rowdata[0] = user.get(i).username;
         //   System.out.println(rowdata[0]+"scd");
            rowdata[1] = user.get(i).bestScore;
          //  System.out.println(rowdata[1]+"scd");
            model.addRow(rowdata);
        }
        myTable.setModel(model);  
  //  System.out.println(model.getRowCount()+"Ese");//returns 1
  //  System.out.println(model.getColumnCount()+"fsdfs");//returns 0
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
        jTable1 = new javax.swing.JTable();
        goBackButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(583, 453));
        getContentPane().setLayout(null);

        goBackButton.setBackground(new java.awt.Color(51, 51, 51));
        goBackButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 51, 153));
        goBackButton.setText("GO BACK");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(goBackButton);
        goBackButton.setBounds(30, 80, 110, 27);

        myTable.setBackground(new java.awt.Color(0, 0, 0));
        myTable.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        myTable.setForeground(new java.awt.Color(255, 51, 153));
        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Recent Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(myTable);
        if (myTable.getColumnModel().getColumnCount() > 0) {
            myTable.getColumnModel().getColumn(0).setResizable(false);
            myTable.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 120, 460, 240);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\gear.gif")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 30, 200, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\SCORE.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 50, 260, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\minesweeper\\src\\minesweeper\\Influenza.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -20, 730, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(scoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scoreTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable myTable;
    // End of variables declaration//GEN-END:variables
}
