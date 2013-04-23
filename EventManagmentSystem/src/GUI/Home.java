/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author Sid
 */
public class Home extends javax.swing.JFrame {

    
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        subEventPanel1.setVisible(false);
        taskPanel1.setVisible(false);
        committeePanel2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        linkPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        committeePanel2 = new EMS_GUI.CommitteePanel();
        subEventPanel1 = new EMS_GUI.SubEventPanel();
        taskPanel1 = new EMS_GUI.TaskPanel();
        emsMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.CutAction());
        copyMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.CopyAction());
        pasteMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.PasteAction());
        toolsMenu = new javax.swing.JMenu();
        reportsMenu = new javax.swing.JMenu();
        committeeReportsMenuItem = new javax.swing.JMenuItem();
        registrationReportsMenuItem = new javax.swing.JMenuItem();
        budgetReportsMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        linkPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 75));

        jButton1.setText("jButton1");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        linkPanel.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        linkPanel.add(jButton2);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        linkPanel.add(jButton3);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainPanel.add(committeePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 92, -1, -1));
        mainPanel.add(subEventPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
        mainPanel.add(taskPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        fileMenu.setText("File");

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setText("Exit");
        fileMenu.add(exitMenuItem);

        emsMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        emsMenuBar.add(editMenu);

        toolsMenu.setText("Tools");

        reportsMenu.setText("Reports");

        committeeReportsMenuItem.setText("Committee");
        reportsMenu.add(committeeReportsMenuItem);

        registrationReportsMenuItem.setText("Registration");
        registrationReportsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationReportsMenuItemActionPerformed(evt);
            }
        });
        reportsMenu.add(registrationReportsMenuItem);

        budgetReportsMenuItem.setText("Budget");
        reportsMenu.add(budgetReportsMenuItem);

        toolsMenu.add(reportsMenu);
        toolsMenu.add(jMenu1);

        emsMenuBar.add(toolsMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        emsMenuBar.add(helpMenu);

        setJMenuBar(emsMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(linkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(linkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void registrationReportsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationReportsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrationReportsMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        subEventPanel1.setVisible(true);
        taskPanel1.setVisible(false);
        committeePanel2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        subEventPanel1.setVisible(false);
        taskPanel1.setVisible(true);
        committeePanel2.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        subEventPanel1.setVisible(false);
        taskPanel1.setVisible(false);
        committeePanel2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem budgetReportsMenuItem;
    private EMS_GUI.CommitteePanel committeePanel2;
    private javax.swing.JMenuItem committeeReportsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuBar emsMenuBar;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel linkPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem registrationReportsMenuItem;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JMenuItem saveMenuItem;
    private EMS_GUI.SubEventPanel subEventPanel1;
    private EMS_GUI.TaskPanel taskPanel1;
    private javax.swing.JMenu toolsMenu;
    // End of variables declaration//GEN-END:variables
}
