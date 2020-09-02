/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagesetorganizer.presentation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author DoughnutVan
 */
public class SettingsUI extends javax.swing.JFrame {

    ArrayList<String> configMemory = new ArrayList<>();
    ArrayList<String> configChanges = new ArrayList<>();
    File destinationDirSrc;
    File sourceDirSrc;
    JFileChooser fileChooser;
    int imageSetNumCatcher = 0;
    boolean configError = false;
    /**
     * Creates new form SettingsUI
     */
    public SettingsUI() {
        if(configMemory.isEmpty())
            initializeConfig();
        initComponents();
    }
    
    public SettingsUI(ArrayList<String> configMemory, 
            ArrayList<String> configChanges, File destinationDirSrc,
            File sourceDirSrc, int imageSetNumCatcher) {
        this.configMemory = configMemory;
        this.configChanges = configChanges;
        this.destinationDirSrc = destinationDirSrc;
        this.sourceDirSrc = sourceDirSrc;
        this.imageSetNumCatcher = imageSetNumCatcher;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsUIjPanel = new javax.swing.JPanel();
        settingsTextField = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        destinationBtn = new javax.swing.JButton();
        sourceBtn = new javax.swing.JButton();
        imageSetNumBtn = new javax.swing.JButton();
        resetConfigBtn = new javax.swing.JButton();
        statsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        settingsUIjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        settingsTextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsTextField.setText("Settings");
        settingsTextField.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        destinationBtn.setText("Change Destination");
        destinationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationBtnActionPerformed(evt);
            }
        });

        sourceBtn.setText("Change Source");
        sourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceBtnActionPerformed(evt);
            }
        });

        imageSetNumBtn.setText("Change Amount Of Image Sets");
        imageSetNumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageSetNumBtnActionPerformed(evt);
            }
        });

        resetConfigBtn.setText("Reset Config");
        resetConfigBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetConfigBtnActionPerformed(evt);
            }
        });

        statsBtn.setText("Show Stats");
        statsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsUIjPanelLayout = new javax.swing.GroupLayout(settingsUIjPanel);
        settingsUIjPanel.setLayout(settingsUIjPanelLayout);
        settingsUIjPanelLayout.setHorizontalGroup(
            settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsUIjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(settingsUIjPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsUIjPanelLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(statsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(imageSetNumBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addComponent(destinationBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sourceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetConfigBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        settingsUIjPanelLayout.setVerticalGroup(
            settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsUIjPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(settingsTextField)
                .addGap(18, 18, 18)
                .addComponent(destinationBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sourceBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageSetNumBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetConfigBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statsBtn)
                .addGap(18, 18, 18)
                .addComponent(closeBtn)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetConfigBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetConfigBtnActionPerformed
        boolean userChoice = trueFalsePrompt("Are you sure you want to reset"
                + " the config?", "Are you sure?");
        if (userChoice){
            this.setVisible(false);
            ImageSetPickerUI imageSetPicker = new ImageSetPickerUI();
            imageSetPicker.setVisible(true);
        }
    }//GEN-LAST:event_resetConfigBtnActionPerformed

    private void imageSetNumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageSetNumBtnActionPerformed
        if (!configError) {
            this.setVisible(false);
            ImageSetPickerUI imageSetPicker = new ImageSetPickerUI(configMemory, 
                        configChanges, destinationDirSrc, sourceDirSrc, 2);
            imageSetPicker.setVisible(true);
            if (!configChanges.contains("ImageSetNum"))
                configChanges.add("ImageSetNum");
            System.out.println("ImageSetNum Changed: " + configChanges.size());
        } else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, please\n"
              + "reset the config. If you do\n"
              + "not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_imageSetNumBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        String changes = "";
        boolean updateConfig = true;
        System.out.println("ConfigChanges: " + configChanges.size());
        
        if(configError)
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, please\n"
              + "reset the config. If you do\n"
              + "not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
        
        if(configChanges.contains("ImageSetNum")) {
            configMemory.set(2, String.valueOf(imageSetNumCatcher));
            changes += "number of image sets ";
        }
        if(configChanges.contains("DestinationDirSrc")) {
            configMemory.set(3, destinationDirSrc.getAbsolutePath());
            if(configChanges.size() == 2)
                changes += "and the ";
            else if(configChanges.size() == 3)
                changes += ",";
            changes += "destination folder ";
        }
        if(configChanges.contains("SourceDirSrc")) {
            configMemory.set(4, sourceDirSrc.getAbsolutePath());
            if(configChanges.size() == 2)
                changes += "and the ";
            else if(configChanges.size() == 3)
                changes += ", and the ";
            changes += "source folder";
        }
        
        if(!configChanges.isEmpty()){
            updateConfig = trueFalsePrompt(
                  "Since you updated the\n" + changes + ",\n"
                + "the config can now be updated.\n\n"
                + "Would you like to update the config?",
                  "Update Config?");
        }
        
        if(updateConfig)
            writeToConfig();
        this.setVisible(false);
        WelcomeUI welcomeUI = new WelcomeUI();
        welcomeUI.setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void sourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceBtnActionPerformed
        if (!configError) {
            sourceDirSrc = fetchDirectoryPrompt("source");
            if (!configChanges.contains("SourceDirSrc"))
                configChanges.add("SourceDirSrc");
            System.out.println("SourceDirSrc Changed: " + configChanges.size());
        } else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, please\n"
              + "reset the config. If you do\n"
              + "not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_sourceBtnActionPerformed

    private void destinationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationBtnActionPerformed
        if (!configError) {
            destinationDirSrc = fetchDirectoryPrompt("destination");
            if (!configChanges.contains("DestinationDirSrc"))
                configChanges.add("DestinationDirSrc");
            System.out.println("DestinationDirSrc Changed: " + configChanges.size());
        } else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, please\n"
              + "reset the config. If you do\n"
              + "not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_destinationBtnActionPerformed

    private void statsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsBtnActionPerformed
        if (!configError) {
            StatsUI statsUI = new StatsUI(configMemory);
            statsUI.setVisible(true);
        } else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, this\n"
              + "page is inaccessible. If you\n"
              + "do not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_statsBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SettingsUI().setVisible(true);
        });
    }
    
    private void initializeConfig(){
        File configFile = new File("config.txt");
        
        try {
            FileReader fReader = new FileReader(configFile);
            BufferedReader bReader = new BufferedReader(fReader);
            String output;
            while((output = bReader.readLine()) != null)
                configMemory.add(output);
            System.out.println("Config Read: " + configMemory.size());
        } catch (IOException ioe) {
            System.out.println("Error: Config Not Read...");
            JOptionPane.showMessageDialog(null,
                "There was an error reading\n"
              + "the config... Is the config\n"
              + "corrupted? Please reset the\n"
              + "config.",
                "Failed Reading Config", JOptionPane.ERROR_MESSAGE);
            configError = true;
        }
    }
    
    private void writeToConfig(){
        File configFile = new File("config.txt");
        
        if (configFile.exists() && configFile.isFile() && configFile.canWrite())
            try {
                configFile.delete();
                configFile.createNewFile();
                FileWriter fWriter = new FileWriter(configFile);
                PrintWriter writer = new PrintWriter(fWriter);
                for (int i = 0; i < configMemory.size(); i++)
                    writer.println(configMemory.get(i));
                writer.close();
            } catch (IOException ioe){
                System.out.println("Error: Config Not Written...");
                JOptionPane.showMessageDialog(null,
                        "There was an error writing\n"
                      + "to the config file... Config\n"
                      + "not changed.",
                        "Config Write Error", JOptionPane.ERROR_MESSAGE);
            }
        else {
            System.out.println("Config File Does Not Exist");
            JOptionPane.showMessageDialog(null,
                    "There was an error writing\n"
                  + "to the config file... Config\n"
                  + "not changed.",
                    "Config Does Not Exist", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean trueFalsePrompt(String prompt, String title){
        while(true) {
            int userChoice = JOptionPane.showOptionDialog(null, prompt, title,
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    new String[]{"No", "Yes"}, "default");
            if (userChoice == 1) {
                return true;
            } else if (userChoice != -1) {
                return false;
            }
        }
    }
    
    private File fetchDirectoryPrompt(String searchTerm){
        File userInputDirSrc;
        
        JOptionPane.showMessageDialog(null,
                "Please use the following window to\n"
              + "choose a proper " + searchTerm + " directory.",
                "Please Choose A Directory",
                JOptionPane.PLAIN_MESSAGE);
        
        while (true) {
            fileChooser = new JFileChooser(FileSystemView.getFileSystemView());
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                userInputDirSrc = fileChooser.getSelectedFile();
                if(testReadWrite(userInputDirSrc))
                    break;
                else
                    JOptionPane.showMessageDialog(null,
                            "The directory you chose is invalid\n"
                          + "Please choose another directory!",
                            "Unsuitable Directory", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "You did not choose a directory.\n"
                      + "Please choose a directory to continue.",
                        "Unsuitable Directory", JOptionPane.ERROR_MESSAGE);
            }
        }
        return userInputDirSrc;
    }
    
    private boolean testReadWrite(File directory){
        return directory.exists() && directory.canRead() && directory.canWrite();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton destinationBtn;
    private javax.swing.JButton imageSetNumBtn;
    private javax.swing.JButton resetConfigBtn;
    private javax.swing.JLabel settingsTextField;
    private javax.swing.JPanel settingsUIjPanel;
    private javax.swing.JButton sourceBtn;
    private javax.swing.JButton statsBtn;
    // End of variables declaration//GEN-END:variables
}
