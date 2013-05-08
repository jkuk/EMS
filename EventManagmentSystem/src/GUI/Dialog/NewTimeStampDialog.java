/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Dialog;

import BackEnd.EventSystem.TimeSchedule;
import javax.swing.DefaultComboBoxModel;
import java.util.Calendar;

/**
 *
 * @author Sid
 */


public class NewTimeStampDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewTimeStampDialog
     */
    private boolean confirm;
    private TimeSchedule original;
    
    public NewTimeStampDialog(java.awt.Frame parent, boolean modal, TimeSchedule t) {
        super(parent, modal);
        initComponents();
        confirm = false;
        original = t;
        DefaultComboBoxModel yearModel = new DefaultComboBoxModel();
        DefaultComboBoxModel dayModel = new DefaultComboBoxModel();
        DefaultComboBoxModel minModel = new DefaultComboBoxModel();
        for(int i = 0; i < 32; i++)
        {
            if(i == 0)
            { dayModel.addElement("Day"); }
            else
            { dayModel.addElement(i); }
        }
        yearModel.addElement("Year");
        for(int i = 2013; i < 2050; i++)
        {
            yearModel.addElement(i);
        }
        minModel.addElement("Minute");
        for(int i = 1; i < 61; i++)
        {
            minModel.addElement(i);
        }
        startMinute.setModel(minModel);
        endMinute.setModel(minModel);
        startYear.setModel(yearModel);
        endYear.setModel(yearModel);
        startDay.setModel(dayModel);
        endDay.setModel(dayModel);
        updateInfo(t);
    }
    
    public void updateInfo(TimeSchedule t)
    {
        Calendar start = t.getStartDateTimeCalendar();
        Calendar end = t.getEndDateTimeCalendar();
        startMinute.setSelectedIndex(start.get(Calendar.MINUTE));
        endMinute.setSelectedIndex(end.get(Calendar.MINUTE));
        if(start.get(Calendar.HOUR_OF_DAY) > 12)
        {
            int hour = start.get(Calendar.HOUR_OF_DAY) - 12;
            startHour.setSelectedIndex(hour);
            startPM.setSelected(true);
        }
        else
        {
            startHour.setSelectedIndex(start.get(Calendar.HOUR_OF_DAY));
        }
        if(end.get(Calendar.HOUR_OF_DAY) > 12)
        {
            int hour = start.get(Calendar.HOUR_OF_DAY) - 12;
            endHour.setSelectedIndex(hour);
            endPM.setSelected(true);
        }
        else
        {
            endHour.setSelectedIndex(end.get(Calendar.HOUR_OF_DAY));
        }
        startYear.setSelectedIndex(start.get(Calendar.YEAR)-2012);
        endYear.setSelectedIndex(end.get(Calendar.YEAR)-2012);
        startMonth.setSelectedIndex(start.get(Calendar.MONTH)+1);
        endMonth.setSelectedIndex(end.get(Calendar.MONTH)+1);
        startDay.setSelectedIndex(start.get(Calendar.DATE));
        endDay.setSelectedIndex(end.get(Calendar.DATE));
    }
    
    public boolean getConfirm()
    { return confirm; }
    
    public TimeSchedule createTimeSchedule()
    {
        TimeSchedule t = new TimeSchedule();
        
        t.setStartDateTime(startYear.getSelectedIndex()+2012, startMonth.getSelectedIndex(), startDay.getSelectedIndex(), startHour.getSelectedIndex(), startMinute.getSelectedIndex());
        t.setEndDateTime(endYear.getSelectedIndex()+2012, endMonth.getSelectedIndex(), endDay.getSelectedIndex(), endHour.getSelectedIndex(), endMinute.getSelectedIndex());
        return t;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startHour = new javax.swing.JComboBox();
        startMinute = new javax.swing.JComboBox();
        startPM = new javax.swing.JCheckBox();
        startYear = new javax.swing.JComboBox();
        startDay = new javax.swing.JComboBox();
        startMonth = new javax.swing.JComboBox();
        endHour = new javax.swing.JComboBox();
        endMinute = new javax.swing.JComboBox();
        endPM = new javax.swing.JCheckBox();
        endYear = new javax.swing.JComboBox();
        endDay = new javax.swing.JComboBox();
        endMonth = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        startHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hour", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        startMinute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Minute" }));

        startPM.setText("PM");
        startPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPMActionPerformed(evt);
            }
        });

        startYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year" }));

        startDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day" }));

        startMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        endHour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hour", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        endMinute.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Minute" }));

        endPM.setText("PM");
        endPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endPMActionPerformed(evt);
            }
        });

        endYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year" }));

        endDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day" }));

        endMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Start Time");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("End Time");

        jCheckBox1.setText("Use Current Time");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(startMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(startPM)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(startMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saveButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(endMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(endYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(endPM)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(endMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(startMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(startMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startPM))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(endMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(endHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endPM)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(closeButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startPMActionPerformed

    private void endPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endPMActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        confirm = true;
        this.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox endDay;
    private javax.swing.JComboBox endHour;
    private javax.swing.JComboBox endMinute;
    private javax.swing.JComboBox endMonth;
    private javax.swing.JCheckBox endPM;
    private javax.swing.JComboBox endYear;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox startDay;
    private javax.swing.JComboBox startHour;
    private javax.swing.JComboBox startMinute;
    private javax.swing.JComboBox startMonth;
    private javax.swing.JCheckBox startPM;
    private javax.swing.JComboBox startYear;
    // End of variables declaration//GEN-END:variables
}