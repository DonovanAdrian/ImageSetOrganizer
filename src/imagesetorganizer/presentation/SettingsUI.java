/*
 * This project was created by Donovan Adrian and any
 * edits or changes must be confirmed as valid by Donovan
 * with written consent under any circumstance.
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
 * @author Donovan Adrian
 */
public class SettingsUI extends javax.swing.JFrame {

    ArrayList<String> configMemory = new ArrayList<>();
    ArrayList<String> configChanges = new ArrayList<>();
    File destinationDirSrc = null;
    File oldDestinationDirSrc;
    File sourceDirSrc;
    File oldSourceDirSrc;
    JFileChooser fileChooser;
    int imageSetNumCatcher = 0;
    int oldImageSetNumCatcher = 0;
    boolean configError = false;
    boolean configEmpty = false;
    
    public SettingsUI() {
        if(configMemory.isEmpty())
            initializeConfig();
        initComponents();
        if(configEmpty)
            resetConfigBtn.setText("Create New Config");
    }
    
    public SettingsUI(ArrayList<String> configMemory, 
            ArrayList<String> configChanges, File destinationDirSrc,
            File sourceDirSrc, int imageSetNumCatcher) {
        this.configMemory = configMemory;
        this.configChanges = configChanges;
        this.destinationDirSrc = destinationDirSrc;
        this.sourceDirSrc = sourceDirSrc;
        this.imageSetNumCatcher = imageSetNumCatcher;
        if(configMemory.isEmpty())
            initializeConfig();
        initComponents();
        if(configEmpty)
            resetConfigBtn.setText("Create New Config");
    }

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
        destinationInfo = new javax.swing.JButton();
        sourceInfo = new javax.swing.JButton();

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

        destinationInfo.setText("?");
        destinationInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationInfoActionPerformed(evt);
            }
        });

        sourceInfo.setText("?");
        sourceInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceInfoActionPerformed(evt);
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
                    .addComponent(imageSetNumBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(resetConfigBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(settingsUIjPanelLayout.createSequentialGroup()
                        .addGroup(settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sourceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sourceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        settingsUIjPanelLayout.setVerticalGroup(
            settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsUIjPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(settingsTextField)
                .addGap(18, 18, 18)
                .addGroup(settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationBtn)
                    .addComponent(destinationInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(settingsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceBtn)
                    .addComponent(sourceInfo))
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
        String configWindowText = "Are you sure you want to reset the config?";
        
        if(configEmpty)
            configWindowText = "Are you sure you want to create a new config?";
        
        boolean userChoice = trueFalsePrompt(configWindowText, "Are you sure?");
        if (userChoice){
            this.setVisible(false);
            ImageSetPickerUI imageSetPicker = new ImageSetPickerUI();
            imageSetPicker.setVisible(true);
        }
    }//GEN-LAST:event_resetConfigBtnActionPerformed

    private void imageSetNumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageSetNumBtnActionPerformed
        if (!configError && !configEmpty) {
            this.setVisible(false);
            ImageSetPickerUI imageSetPicker = new ImageSetPickerUI(configMemory, 
                        configChanges, destinationDirSrc, sourceDirSrc, 2);
            imageSetPicker.setVisible(true);
            if (!configChanges.contains("ImageSetNum"))
                configChanges.add("ImageSetNum");
            System.out.println("ImageSetNum Changed: " + configChanges.size());
        } else if (configEmpty)
            JOptionPane.showMessageDialog(null,
                "Because the config was empty,\n"
              + "there is nothing to change.\n"
              + "Please create a config so\n"
              + "that the program can work\n"
              + "properly. Thank you.",
                "Please Create Config", JOptionPane.ERROR_MESSAGE);
        else
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
        else if (configEmpty)
            JOptionPane.showMessageDialog(null,
                "Because the config was empty,\n"
              + "there is nothing to change.\n"
              + "Please create a config so\n"
              + "that the program can work\n"
              + "properly. Thank you.",
                "Please Create Config", JOptionPane.ERROR_MESSAGE);
        else {
            oldImageSetNumCatcher = Integer.valueOf(configMemory.get(2));
            oldDestinationDirSrc = new File(configMemory.get(3));
            oldSourceDirSrc = new File(configMemory.get(4));
        }
            
        
        if(configChanges.contains("ImageSetNum")) {
            configMemory.set(2, String.valueOf(imageSetNumCatcher));
            changes += "number of image sets";
        }
        if(configChanges.contains("DestinationDirSrc")) {
            configMemory.set(3, destinationDirSrc.getAbsolutePath());
            if(configChanges.size() == 2)
                changes += "\nand the ";
            else if(configChanges.size() == 3)
                changes += ",\n";
            changes += "destination folder";
        }
        if(configChanges.contains("SourceDirSrc")) {
            configMemory.set(4, sourceDirSrc.getAbsolutePath());
            if(configChanges.size() == 2)
                changes += "\nand the ";
            else if(configChanges.size() == 3)
                changes += ",\nand the ";
            changes += "source folder";
        }
        
        if(!configChanges.isEmpty()){
            updateConfig = trueFalsePrompt(
                  "Since you updated the\n" + changes
                + ",\nthe config can now be updated.\n\n"
                + "Would you like to update the config?",
                  "Update Config?");
        }
        
        if(updateConfig) {
            writeToConfig();
            if(configChanges.contains("DestinationDirSrc")) {
                createNewImageSetFolders();
                deleteOldFolders(oldDestinationDirSrc);
            }
            else if(!configChanges.contains("DestinationDirSrc") && 
                        configChanges.contains("ImageSetNum"))
                updateImageSetFolders();
        }
        this.setVisible(false);
        WelcomeUI welcomeUI = new WelcomeUI();
        welcomeUI.setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void sourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceBtnActionPerformed
        if (!configError && !configEmpty) {
            sourceDirSrc = fetchDirectoryPrompt("source");
            if (!configChanges.contains("SourceDirSrc"))
                configChanges.add("SourceDirSrc");
            System.out.println("SourceDirSrc Changed: " + configChanges.size());
        } else if (configEmpty) 
            JOptionPane.showMessageDialog(null,
                    "Because the config was empty,\n"
                  + "there is nothing to change.\n"
                  + "Please create a config so\n"
                  + "that the program can work\n"
                  + "properly. Thank you.",
                    "Please Create Config", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, please\n"
              + "reset the config. If you do\n"
              + "not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_sourceBtnActionPerformed

    private void destinationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationBtnActionPerformed
        if (!configError && !configEmpty) {
            destinationDirSrc = fetchDirectoryPrompt("destination");
            if (!configChanges.contains("DestinationDirSrc"))
                configChanges.add("DestinationDirSrc");
            System.out.println("DestinationDirSrc Changed: " + configChanges.size());
        } else if (configEmpty)
            JOptionPane.showMessageDialog(null,
                "Because the config was empty,\n"
              + "there is nothing to change.\n"
              + "Please create a config so\n"
              + "that the program can work\n"
              + "properly. Thank you.",
                "Please Create Config", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, please\n"
              + "reset the config. If you do\n"
              + "not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_destinationBtnActionPerformed

    private void statsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsBtnActionPerformed
        if (!configError && !configEmpty) {
            StatsUI statsUI = new StatsUI(configMemory);
            statsUI.setVisible(true);
        } else if (configEmpty)
            JOptionPane.showMessageDialog(null,
                "Because the config was empty,\n"
              + "there is nothing to change.\n"
              + "Please create a config so\n"
              + "that the program can work\n"
              + "properly. Thank you.",
                "Please Create Config", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,
                "Because there was an error\n"
              + "reading the config, this\n"
              + "page is inaccessible. If you\n"
              + "do not reset the config, this\n"
              + "program may not work properly.",
                "Please Reset Config", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_statsBtnActionPerformed

    private void destinationInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationInfoActionPerformed
        JOptionPane.showMessageDialog(null,
                "The \"destination\" is the folder where\n"
              + "the images ORIGINALLY came from. It is\n" 
              + "REQUIRED to set up a destination folder\n"
              + "when creating or resetting a config.",
                "What Is The Destination?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_destinationInfoActionPerformed

    private void sourceInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceInfoActionPerformed
        JOptionPane.showMessageDialog(null,
                "The \"source\" is the folder where\n"
              + "the images are CURRENTLY stored. It\n"
              + "is OPTIONAL to set up a source folder\n"
              + "when creating or resetting a config,",
                "What Is The Source?", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sourceInfoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SettingsUI().setVisible(true);
        });
    }
    
    private void initializeConfig(){
        File configFile = new File("config.txt");
        
        if (!configFile.exists())
            try {
                configFile.createNewFile();
            } catch (IOException ioe) {
                System.out.println("New Config File Not Created");
                configError = true;
            }
        
        if(!configError) {
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
            
            if(configMemory.isEmpty()) {
                configEmpty = true;
            }
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
    
    private void createNewImageSetFolders(){
        File tempImageSetFolder;
        File sourceDirSrc;
        String sourceDirName;
        
        if(!configMemory.get(4).equals("###NO SOURCE DIR PROVIDED###")){
            sourceDirSrc = new File(configMemory.get(4));
            sourceDirName = sourceDirSrc.getName();
        } else
            while (true) {
                    sourceDirName = JOptionPane.showInputDialog(null,
                            "Since a source directory wasn't set, please\n"
                          + "choose a name for the image set folders.",
                            "Input A File Name",
                            JOptionPane.PLAIN_MESSAGE);
                    if(userInputValid(sourceDirName)) {
                        if(trueFalsePrompt(
                                "Are you sure you want the name:\n"
                               + sourceDirName + "?", "Confirm New Name"))
                            break;
                    } else
                        JOptionPane.showMessageDialog(null,
                            "Please enter a valid name for the\n"
                          + "image set folders... Please try again!",
                            "Unsuitable Name", JOptionPane.ERROR_MESSAGE);
                }
        
        if(imageSetNumCatcher == 0)
            imageSetNumCatcher = Integer.valueOf(configMemory.get(2));
        
        imageSetNumCatcher++;
        for (int i = 1; i < imageSetNumCatcher; i++) {
                tempImageSetFolder = new File(destinationDirSrc + "/" + 
                        sourceDirName + " - " + i + " Print");
                if(!tempImageSetFolder.exists())
                    if(tempImageSetFolder.mkdir())
                        System.out.println("Created Image Set Folder " + i);
                    else
                        System.out.println("Failed To Create Folder: " + 
                                tempImageSetFolder.getName());
            }
    }
    
    private void updateImageSetFolders(){
        ArrayList<File> imageSetFolders = new ArrayList<>();
        File tempImageSetFolder;
        String sourceDirName;
        int newImageSetInt;
        int filesNotDeletedCount = 0;
        boolean filePresent = false;
        boolean filesNotDeleted = false;
        
        if (destinationDirSrc == null)
            destinationDirSrc = new File(configMemory.get(3));
        
        for (final File fileEntry : destinationDirSrc.listFiles())
                if (fileEntry.getName().contains(" - ") && 
                    fileEntry.getName().contains(" Print")){
                    imageSetFolders.add(fileEntry);
                    System.out.println("Added: " + fileEntry.getName());
                }
        
        if (!imageSetFolders.isEmpty()) {
            imageSetFolders = sortImageSetFolders(imageSetFolders);
            sourceDirName = fetchSourceDirName(
                    imageSetFolders.get(imageSetFolders.size()-1).getName());
            
            while (imageSetFolders.size() > imageSetNumCatcher) {
                for (final File fileEntry : imageSetFolders.get(imageSetFolders.size()-1).listFiles()) {
                    System.out.println("File Found In Folder, Cannot Delete");
                    filePresent = true;
                    break;
                }
                
                if(!filePresent)
                    if(imageSetFolders.get(imageSetFolders.size()-1).delete())
                        System.out.println("Folder Successfully Deleted");
                    else {
                        System.out.println("Folder Not Deleted");
                        filesNotDeleted = true;
                        filesNotDeletedCount++;
                    }
                imageSetFolders.remove(imageSetFolders.size()-1);
                filePresent = false;
            }

            while (imageSetFolders.size() < imageSetNumCatcher) {
                newImageSetInt = imageSetFolders.size() + 1;
                tempImageSetFolder = new File(destinationDirSrc + "/" + 
                            sourceDirName + " - " + newImageSetInt + " Print");
                    if(!tempImageSetFolder.exists())
                        if(tempImageSetFolder.mkdir())
                            System.out.println("Created Image Set Folder");
                        else
                            System.out.println("Failed To Create Folder: " + 
                                    tempImageSetFolder.getName());
                imageSetFolders.add(tempImageSetFolder);
            }
            
            if (filesNotDeleted) {
                String supplementaryText = "file";
                if (filesNotDeletedCount > 1)
                    supplementaryText += "s were";
                else
                    supplementaryText += " was";
                JOptionPane.showMessageDialog(null,
                    "Due to the change in the\n"
                  + "number of image sets, we\n"
                  + "deleted some old folders.\n\n"
                  + "Unfortunately, " + filesNotDeletedCount + supplementaryText + "\n"
                  + "not deleted because there\n"
                  + "are still files present in\n"
                  + "each folder.",
                    "Some Folders Were Not Deleted", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("No Image Set Folders Found!");
            imageSetNumCatcher++;
            for (int i = 1; i < imageSetNumCatcher; i++) {
                tempImageSetFolder = new File(destinationDirSrc + "/" + 
                        "Default - " + i + " Print");
                if(!tempImageSetFolder.exists())
                    if(tempImageSetFolder.mkdir())
                        System.out.println("Created Image Set Folder " + i);
                    else {
                        System.out.println("Failed To Create Folder: " + 
                                tempImageSetFolder.getName());
                    }
            }
        }
    }
    
    private void deleteOldFolders(File oldDirectory){
        ArrayList<File> imageSetFolders = new ArrayList<>();
        boolean filePresent = false;
        
        for (final File fileEntry : oldDirectory.listFiles())
                if (fileEntry.getName().contains(" - ") && 
                    fileEntry.getName().contains(" Print")){
                    imageSetFolders.add(fileEntry);
                    System.out.println("Added: " + fileEntry.getName());
                }
        
        for (int i = 0; i < imageSetFolders.size(); i++) {
            for (final File fileEntry : imageSetFolders.get(i).listFiles()) {
                System.out.println("File Found In Old Folder, Cannot Delete");
                filePresent = true;
                break;
            }
            if(!filePresent)
                if (imageSetFolders.get(i).delete())
                    System.out.println("Deleted Old Folder " + 
                            imageSetFolders.get(i).getName());
                else
                    System.out.println("Failed To Delete Old Folder: " + 
                            imageSetFolders.get(i).getName());
            else
                System.out.println("Old Folder Not Deleted: Files Present");
            filePresent = false;
        }
    }
    
    private String fetchSourceDirName(String fileName){
        String sourceDirName;
        int i = fileName.indexOf(" - ");
        
        sourceDirName = fileName.substring(0, i);
        
        return sourceDirName;
    }
    
    private ArrayList<File> sortImageSetFolders(ArrayList<File> imageSetFolders){
        ArrayList<File> sortedImageSetFolders = new ArrayList<>();
        String[] imageSetNums = {" 0 ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", 
            " 6 ", " 7 ", " 8 ", " 9 ", " 10 ", " 11 ", " 12 ", " 13 ",
            " 14 ", " 15 ", " 16 ", " 17 ", " 18 ", " 19 ", " 20 "};
        String tempFileName;
        int adjustedN;
        
        for(int i = 0; i < imageSetFolders.size(); i++)
            sortedImageSetFolders.add(imageSetFolders.get(i));
        
        for(int i = 0; i < imageSetFolders.size(); i++){
            tempFileName = imageSetFolders.get(i).getName();
            for(int n = 0; n < imageSetNums.length; n++)
                if(tempFileName.contains(imageSetNums[n])) {
                    adjustedN = n - 1;
                    sortedImageSetFolders.set(adjustedN, imageSetFolders.get(i));
                }
        }
        
        System.out.println("Sorted Folders");
        return sortedImageSetFolders;
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
    
    private boolean userInputValid(String userInput){
        return !userInput.matches("[/\\\"<>:|?*]");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton destinationBtn;
    private javax.swing.JButton destinationInfo;
    private javax.swing.JButton imageSetNumBtn;
    private javax.swing.JButton resetConfigBtn;
    private javax.swing.JLabel settingsTextField;
    private javax.swing.JPanel settingsUIjPanel;
    private javax.swing.JButton sourceBtn;
    private javax.swing.JButton sourceInfo;
    private javax.swing.JButton statsBtn;
    // End of variables declaration//GEN-END:variables
}
