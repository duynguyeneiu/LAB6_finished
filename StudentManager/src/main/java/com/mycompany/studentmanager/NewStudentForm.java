/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.studentmanager;

import java.awt.Color;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Student
 */
public class NewStudentForm extends javax.swing.JFrame {

    private ArrayList<Student> list;

    public NewStudentForm(ArrayList<Student> list) {
        this.list = list;
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        midNameText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        yearOfBirthText = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        schoolStage = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setTitle("New Student");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Student ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jLabel1, gridBagConstraints);

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 20);
        getContentPane().add(idText, gridBagConstraints);

        jLabel2.setText("Last-Mid-First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(jLabel2, gridBagConstraints);

        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(lastNameText, gridBagConstraints);

        midNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midNameTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(midNameText, gridBagConstraints);

        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(firstNameText, gridBagConstraints);

        jLabel3.setText("Year of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(jLabel3, gridBagConstraints);

        yearOfBirthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearOfBirthTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(yearOfBirthText, gridBagConstraints);

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        getContentPane().add(male, gridBagConstraints);

        buttonGroup1.add(female);
        female.setText("Female");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        getContentPane().add(female, gridBagConstraints);

        schoolStage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elementary School", "Middle School", "High School" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        getContentPane().add(schoolStage, gridBagConstraints);

        saveButton.setText("Save");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 5, 6);
        getContentPane().add(saveButton, gridBagConstraints);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(clearButton, gridBagConstraints);

        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(cancelButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void midNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midNameTextActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void yearOfBirthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearOfBirthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearOfBirthTextActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveNewStudent(list);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked

    }//GEN-LAST:event_saveButtonMouseClicked

    public void saveNewStudent(ArrayList<Student> list) {
        if (idText.getText().isEmpty()) {
            setColorBorder(idText, Color.RED);
            JOptionPane.showMessageDialog(this, "Please enter new Student id");
            idText.requestFocus();
        } else if (lastNameText.getText().isEmpty()) {
            setColorBorder(lastNameText, Color.RED);
            JOptionPane.showMessageDialog(this, "Please enter new Student's last name");
            lastNameText.requestFocus();
        } else if (midNameText.getText().isEmpty()) {
            setColorBorder(midNameText, Color.RED);
            JOptionPane.showMessageDialog(this, "Please enter new Student's mid name");
            midNameText.requestFocus();
        } else if (firstNameText.getText().isEmpty()) {
            setColorBorder(firstNameText, Color.RED);
            JOptionPane.showMessageDialog(this, "Please enter new Student' first name");
            firstNameText.requestFocus();
        } else if (yearOfBirthText.getText().isEmpty()) {
            setColorBorder(yearOfBirthText, Color.RED);
            JOptionPane.showMessageDialog(this, "Please enter year of birth of new student");
            yearOfBirthText.requestFocus();
        } else if (!isNumber(yearOfBirthText.getText())) {
            setColorBorder(yearOfBirthText, Color.RED);
            JOptionPane.showMessageDialog(this, "Invalid Number: " + yearOfBirthText.getText());
            yearOfBirthText.requestFocus();
        } else if (list.contains(idText.getText())) {
            setColorBorder(idText, Color.RED);
            JOptionPane.showMessageDialog(this, "This ID already exists. Please enter another ID");
            idText.requestFocus();
        } else if (!male.isSelected() && !female.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please choose gender of new student");
            male.requestFocus();
        } else {
            String studentID = idText.getText();
            String lastName = lastNameText.getText();
            String midName = midNameText.getText();
            String firstName = firstNameText.getText();
            int yearOfBirth = Integer.parseInt(yearOfBirthText.getText());
            String gender = "";
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            }
            String school = schoolStage.getSelectedItem().toString();
            Student student = new Student(studentID, lastName, midName, firstName, gender, school, yearOfBirth);
            list.add(student);
            saveFile();
            dispose();
        }
    }

    public void setColorBorder(JTextField textField, Color color) {
        Border newBorder = BorderFactory.createLineBorder(color);
        textField.setBorder(newBorder);
    }

    public boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void loadFile() {
        String fileName = "StudentList.Dat";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            list = (ArrayList<Student>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error load data: " + ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error load data: " + ex.getMessage());
        }
    }

    private void saveFile() {
        String fileName = "StudentList.Dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save data: " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save data: " + ex.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField midNameText;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> schoolStage;
    private javax.swing.JTextField yearOfBirthText;
    // End of variables declaration//GEN-END:variables
}
