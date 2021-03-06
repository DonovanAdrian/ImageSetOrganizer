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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Donovan Adrian
 */
public class WelcomeUI extends javax.swing.JFrame {
    
    File smartSourceDuplicatePicker = null;
    String smartSourceStatus = "";
    int imageSetNumCatcher = 0;
    int imageSetNum = 0;
    ProgressUI progWin = new ProgressUI();

    public WelcomeUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeUIjPanel = new javax.swing.JPanel();
        welcomeTextFieldA = new javax.swing.JLabel();
        welcomeTextFieldB = new javax.swing.JLabel();
        bringBackBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeUIjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        welcomeTextFieldA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeTextFieldA.setText("Welcome To The Image Set Organizer!");
        welcomeTextFieldA.setAlignmentY(1.0F);
        welcomeTextFieldA.setBounds(new java.awt.Rectangle(0, 0, 45, 16));
        welcomeTextFieldA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        welcomeTextFieldB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeTextFieldB.setText("Choose an option below to begin");
        welcomeTextFieldB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bringBackBtn.setText("Bring Back Photos");
        bringBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bringBackBtnActionPerformed(evt);
            }
        });

        settingsBtn.setText("Settings");
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomeUIjPanelLayout = new javax.swing.GroupLayout(welcomeUIjPanel);
        welcomeUIjPanel.setLayout(welcomeUIjPanelLayout);
        welcomeUIjPanelLayout.setHorizontalGroup(
            welcomeUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeUIjPanelLayout.createSequentialGroup()
                .addGroup(welcomeUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, welcomeUIjPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(welcomeUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bringBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(welcomeUIjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(welcomeUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(welcomeTextFieldB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(welcomeTextFieldA, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        welcomeUIjPanelLayout.setVerticalGroup(
            welcomeUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeUIjPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(welcomeTextFieldA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeTextFieldB)
                .addGap(24, 24, 24)
                .addComponent(bringBackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingsBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeUIjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        this.setVisible(false);
        SettingsUI settingsUI = new SettingsUI();
        settingsUI.setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void bringBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bringBackBtnActionPerformed
        ArrayList<File> imageSetFolders = new ArrayList<>();
        ArrayList<File> imageSetFiles = new ArrayList<>();
        ArrayList<File> completedTransfers = new ArrayList<>();
        ArrayList<String> configMemory = new ArrayList<>();
        Path fileQueuePath;
        File configFile = new File("config.txt");
        File tempImageSetFolder;
        File destinationDirSrc;
        File newSourceDirSrc;
        File sourceDirSrc;
        File fileQueue;
        String newSourceDir = "";
        String sourceDirName = "";
        String transferStatus = "NOMINAL";
        boolean configError = false;
        boolean imageSetNumReset = false;
        
        if (!configFile.exists())
            try {
                configFile.createNewFile();
            } catch (IOException ioe) {
                System.out.println("New Config File Not Created");
                configError = true;
            }
        
        if (!configError)
        try {
            FileReader fReader = new FileReader(configFile);
            BufferedReader bReader = new BufferedReader(fReader);
            String output;
            while((output = bReader.readLine()) != null)
                configMemory.add(output);
            System.out.println("Config Read");
        } catch (IOException ioe) {
            System.out.println("Error: Config Not Read...");
            JOptionPane.showMessageDialog(null,
                "There was an error reading\n"
              + "the config... Please try again!",
                "Failed Reading Config", JOptionPane.ERROR_MESSAGE);
            configError = true;
        }
        
        if (!configError && !configMemory.isEmpty()){
            if (imageSetNum == 0)
                imageSetNum = Integer.valueOf(configMemory.get(2));
            destinationDirSrc = new File(configMemory.get(3));
            sourceDirSrc = new File(configMemory.get(4));
            
            if (destinationDirSrc.exists() && sourceDirSrc.exists() && imageSetNum != 0) {
                System.out.println("All Operations Nominal");
                smartSourcePicker(destinationDirSrc, configMemory, true);
            } else if (destinationDirSrc.exists() && !sourceDirSrc.exists() && imageSetNum != 0){
                System.out.println("Source Set Up Required");
                sourceDirSrc = smartSourcePicker(destinationDirSrc, configMemory, false);
            } else {
                System.out.println("Destination Exists: " + destinationDirSrc.exists());
                System.out.println("Source Exists: " + sourceDirSrc.exists());
                System.out.println("Image Set #: " + imageSetNum);
                
                if(!destinationDirSrc.exists()) {
                    JOptionPane.showMessageDialog(null,
                    "There was an error finding\n"
                  + "the Destination Folder.",
                    "Failed Reading Config", JOptionPane.ERROR_MESSAGE);
                    destinationDirSrc = fetchDirectoryPrompt("destination");
                }
                
                if(!sourceDirSrc.exists()) {
                    JOptionPane.showMessageDialog(null,
                    "There was an error finding\n"
                  + "the Source Folder.",
                    "Failed Reading Config", JOptionPane.ERROR_MESSAGE);
                    sourceDirSrc = fetchDirectoryPrompt("source");
                }
                
                if(imageSetNum == 0) {
                    imageSetNumReset = true; 
                    JOptionPane.showMessageDialog(null,
                    "There was an error finding\n"
                  + "the amount of image sets.\n"
                  + "Please reset the number of\n"
                  + "image sets on the following\n"
                  + "window. You will need to restart\n"
                  + "the transfer process after\n"
                  + "entering the number.",
                    "Failed Reading Config", JOptionPane.ERROR_MESSAGE);
                    this.setVisible(false);
                    ImageSetPickerUI imageSetPicker = new ImageSetPickerUI(
                            null, null, destinationDirSrc, sourceDirSrc, 1);
                    imageSetPicker.setVisible(true);
                }
                
                System.out.println("Destination Exists: " + destinationDirSrc.exists());
                System.out.println("Source Exists: " + sourceDirSrc.exists());
                System.out.println("Image Set #: " + imageSetNum);
            }
            
            for (final File fileEntry : destinationDirSrc.listFiles())
                if (fileEntry.getName().contains(" - ") && 
                    fileEntry.getName().contains(" Print")){
                    imageSetFolders.add(fileEntry);
                    System.out.println("Added: " + fileEntry.getName());
                }
            
            if (imageSetFolders.isEmpty()){
                JOptionPane.showMessageDialog(null,
                    "There was an error finding the\n"
                  + "image set folders in that directory...\n"
                  + "Try resetting the destination in the settings.",
                    "Failed Finding Folders", JOptionPane.ERROR_MESSAGE);
                writeDataToConfig(configMemory, destinationDirSrc.getAbsolutePath(), 
                        sourceDirSrc.getAbsolutePath(), "FAILED", 
                        "", smartSourceStatus);
                return;
            }
            
            progWin.updateDescription("Please Wait...\nCollecting Files...");
            progWin.updateMaximum(imageSetFolders.size());
            progWin.openWindow();
            for (int i = 0; i < imageSetFolders.size(); i++) {
                for (final File fileEntry : imageSetFolders.get(i).listFiles()) {
                    imageSetFiles.add(fileEntry);
                    System.out.println("Added: " + fileEntry.getName());
                }
                progWin.updateBar(i);
            }
            progWin.closeWindow();
            
            
            if (imageSetFiles.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "The image set folders are empty...\n"
                  + "Please use this program once you\n"
                  + "have organized some files.",
                    "No Images Found", JOptionPane.ERROR_MESSAGE);
                writeDataToConfig(configMemory, destinationDirSrc.getAbsolutePath(), 
                    sourceDirSrc.getAbsolutePath(), "FAILED", 
                    "", smartSourceStatus);
                return;
            }
            
            progWin.updateDescription("Please Wait...\nCopying Files...");
            progWin.updateMaximum(imageSetFiles.size());
            progWin.openWindow();
            for (int i = 0; i < imageSetFiles.size(); i++) {
                fileQueue = new File(
                        sourceDirSrc.getAbsolutePath() + "/" + 
                        imageSetFiles.get(i).getName());
                try {
                    fileQueuePath = Files.copy(
                        imageSetFiles.get(i).toPath(),
                        fileQueue.toPath(),
                        StandardCopyOption.REPLACE_EXISTING);
                    
                    if (fileQueuePath != null) {
                        completedTransfers.add(fileQueue);
                    } else {
                        System.out.println("Error transferring: " + imageSetFiles.get(i).getName());
                    }
                } catch (IOException ioe) {
                    for (int z = 0; z < completedTransfers.size(); z++)
                        completedTransfers.get(z).delete();
                    JOptionPane.showMessageDialog(null,
                        "There was an error transferring\n"
                      + "your files... Please try again!",
                        "Image Transfer Failed", JOptionPane.ERROR_MESSAGE);
                    writeDataToConfig(configMemory, destinationDirSrc.getAbsolutePath(), 
                        sourceDirSrc.getAbsolutePath(), "FAILED", 
                        "", smartSourceStatus);
                    return;
                }
                progWin.updateBar(i);
            }
            progWin.closeWindow();
            
            if (completedTransfers.size() != imageSetFiles.size()) {
                for (int z = 0; z < completedTransfers.size(); z++)
                        completedTransfers.get(z).delete();
                    JOptionPane.showMessageDialog(null,
                        "There was an error transferring\n"
                      + "your files... Please try again!",
                        "Image Transfer Failed", JOptionPane.ERROR_MESSAGE);
                    writeDataToConfig(configMemory, destinationDirSrc.getAbsolutePath(), 
                        sourceDirSrc.getAbsolutePath(), "FAILED", 
                        "", smartSourceStatus);
                    return;
            }
            
            progWin.updateDescription("Please Wait...\nChecking Files...");
            progWin.updateMaximum(imageSetFiles.size());
            progWin.openWindow();
            for (int i = 0; i < completedTransfers.size(); i++) {
                if (!completedTransfers.get(i).exists() ||
                    !completedTransfers.get(i).canRead() ||
                    !completedTransfers.get(i).canWrite()) {
                    for (int z = 0; z < completedTransfers.size(); z++)
                        completedTransfers.get(z).delete();
                    JOptionPane.showMessageDialog(null,
                        "There was an error transferring\n"
                      + "your files... Please try again!",
                        "Image Transfer Failed", JOptionPane.ERROR_MESSAGE);
                    writeDataToConfig(configMemory, destinationDirSrc.getAbsolutePath(), 
                        sourceDirSrc.getAbsolutePath(), "FAILED", 
                        "", smartSourceStatus);
                    return;
                }
                progWin.updateBar(i);
            }
            progWin.closeWindow();
            
            progWin.updateDescription("Please Wait...\nRemoving Old Files...");
            progWin.updateMaximum(imageSetFiles.size());
            progWin.openWindow();
            for (int i = 0; i < imageSetFiles.size(); i++) {
                if (imageSetFiles.get(i).delete())
                    System.out.println("Deleted File " + 
                            imageSetFiles.get(i).getName());
                else {
                    System.out.println("Failed To Delete File: " + 
                            imageSetFiles.get(i).getName());
                    transferStatus = "PARTIAL";
                }
                progWin.updateBar(i);
            }
            progWin.closeWindow();
            
            boolean userChoice = trueFalsePrompt(
                "Would you like to set up a source folder for your next transfer?",
                    "Source Folder?");
            if (userChoice) {
                newSourceDirSrc = smartSourcePicker(destinationDirSrc, configMemory, false);
                newSourceDir = newSourceDirSrc.getAbsolutePath();
                sourceDirName = newSourceDirSrc.getName();
            } else
                while (true) {
                    sourceDirName = JOptionPane.showInputDialog(null,
                            "Since a new source directory wasn't set, please\n"
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
            
            for (int i = 0; i < imageSetFolders.size(); i++) {
                if (imageSetFolders.get(i).delete())
                    System.out.println("Deleted Folder " + 
                            imageSetFolders.get(i).getName());
                else {
                    System.out.println("Failed To Delete Folder: " + 
                            imageSetFolders.get(i).getName());
                    transferStatus = "PARTIAL";
                }
            }
            
            imageSetNum++;
            for (int i = 1; i < imageSetNum; i++) {
                tempImageSetFolder = new File(destinationDirSrc + "/" + 
                        sourceDirName + " - " + i + " Print");
                if(!tempImageSetFolder.exists())
                    if(tempImageSetFolder.mkdir())
                        System.out.println("Created Image Set Folder " + i);
                    else {
                        System.out.println("Failed To Create Folder: " + 
                                tempImageSetFolder.getName());
                        transferStatus = "PARTIAL";
                    }
            }
            
            if(!writeDataToConfig(configMemory, destinationDirSrc.getAbsolutePath(),
                    sourceDirSrc.getAbsolutePath(), transferStatus, newSourceDir,
                    smartSourceStatus))
                return;
            
            JOptionPane.showMessageDialog(null,
                    "Transfer complete! The program will now exit.\n"
                  + "Once you have organized all your pictures again,\n"
                  + "just reopen this program! Thanks!", "Transfer Complete!",
                  JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
                
            
        } else if (!configError && configMemory.isEmpty()) {
            boolean userChoice = trueFalsePrompt(
                    "The config is not set up. In order to\n"
                  + "continue, a config must be set up. If you\n"
                  + "have already set up image-set folders,\n"
                  + "please complete config setup and use the\n"
                  + "folders provided by this program instead.\n\n"
                  + "Would you like to set up a config?", "Set Up Config?");
            if (userChoice){
                this.setVisible(false);
                ImageSetPickerUI imageSetPicker = new ImageSetPickerUI();
                imageSetPicker.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_bringBackBtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new WelcomeUI().setVisible(true);
        });
    }
    
    public void imageSetNumCatcher(int imageSetNum){
        this.imageSetNum = imageSetNum;
    }
    
    private static boolean trueFalsePrompt(String prompt, String title){
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
    
    private boolean userInputValid(String userInput){
        return !userInput.matches("[/\\\"<>:|?*]");
    }
    
    private File fetchDirectoryPrompt(String searchTerm){
        JFileChooser fileChooser;
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
    
    private boolean writeDataToConfig(ArrayList<String> configMemory,
                            String destination, String source, String status, 
                            String newSource, String smartSourceStatus){
        
        File configFile = new File("config.txt");
        
        if(!configMemory.contains("***PAST TRANSFERS***")){
            configMemory.add("\n\n");
            configMemory.add("***PAST TRANSFERS***");
        }
        configMemory.add(destination 
                    + ">>>TRANSFERRED BACK TO>>>" 
                    + source 
                    + ">>>STATUS: " + status + ">>>" + smartSourceStatus);
        
        if (configFile.exists() && configFile.isFile() && configFile.canWrite())
            try {
                configFile.delete();
                configFile.createNewFile();
                FileWriter fWriter = new FileWriter(configFile);
                PrintWriter writer = new PrintWriter(fWriter);
                for (int i = 0; i < configMemory.size(); i++)
                    if (i != 4)
                        writer.println(configMemory.get(i));
                    else
                        if (newSource.equals(""))
                            writer.println("###NO SOURCE DIR PROVIDED###");
                        else
                            writer.println(newSource);
                
                writer.close();
            } catch (IOException ioe){
                System.out.println("Error: Config Not Written...");
                JOptionPane.showMessageDialog(null,
                        "There was an error writing\n"
                      + "to the config file... Please\n"
                      + "try again!",
                        "Config Write Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        else {
            System.out.println("Config File Does Not Exist");
            JOptionPane.showMessageDialog(null,
                    "There was an error writing\n"
                  + "to the config file... Please\n"
                  + "try again!",
                    "Config Does Not Exist", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private File smartSourcePicker(File destination, ArrayList<String> configMemory,
            boolean overrideSourceDir){
        ArrayList<String> sourceMonthFiles = new ArrayList<>();
        ArrayList<Integer> sourceMonthTracker = new ArrayList<>();
        String[] configMemorySplit;
        String[] months = {"January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December",
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
            "Nov", "Dec"};
        File sourceDirSrc = null;
        File smartSourcePicker = null;
        File smartSourceTemp = null;
        File smartSourceParent;
        double wins = 0;
        double losses = 0;
        double smartSourceScore;
        double smartSourceGoal = 0.5;
        double ignoreScore;
        double ignores = 0.0;
        double totalTransfers = 0.0;
        int sourceNameIndex = -1;
        int sourceNameScore = 0;
        int sourceMonthScore = 0;
        int mostRecentMonth = -1;
        int nextMonth;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String[] mostRecentTransfer;
        String mostRecentSource = "";
        boolean smartSourceIgnore = true;
        
        
        if (configMemory.size() > 8) {
            mostRecentTransfer = configMemory.get(configMemory.size() - 1).split(">>>");
            smartSourceTemp = new File(mostRecentTransfer[2]);
            mostRecentSource = smartSourceTemp.getName();
        }
        
        for(int i = 0; i < configMemory.size(); i++) {
            if (configMemory.get(i).contains("SMART SOURCE: YES"))
                wins++;
            else if (configMemory.get(i).contains("SMART SOURCE: NO"))
                losses++;
            else if (configMemory.get(i).contains("SMART SOURCE: IGNORE"))
                ignores++;
            
            if (i > 8) {
                if (i == configMemory.size() - 1)
                    for(int m = 0; m < months.length; m++)
                        if (mostRecentSource.contains(months[m])) {
                            mostRecentMonth = m;
                            smartSourceIgnore = false;
                            break;
                        }
                totalTransfers++;
            }
        }
        
        if(ignores > 0.0) {
            ignoreScore = ignores / totalTransfers;
            if (ignoreScore > .25)
                if(checkMoreSources(configMemory, 10, 0.5, 2))
                    smartSourceIgnore = false;
        }
        
        if(losses > 25) {
            smartSourceGoal = 0.75;
            if(checkMoreSources(configMemory, 5, 0.5 , 1))
                smartSourceIgnore = false;
            if(checkMoreSources(configMemory, 25, 0.6, 2))
                smartSourceIgnore = false;
        } else if (losses > 50) {
            smartSourceGoal = 0.9;
            if(checkMoreSources(configMemory, 10, 0.7, 1))
                smartSourceIgnore = false;
            if(checkMoreSources(configMemory, 50, 0.8, 2))
                smartSourceIgnore = false;
        }
        
        if (mostRecentMonth != -1 && !smartSourceIgnore) {
            if (mostRecentMonth == 11 || mostRecentMonth == 23)
                nextMonth = 0;
            else
                nextMonth = mostRecentMonth++;
            
            if (smartSourceTemp != null) {
                smartSourceParent = new File(smartSourceTemp.getParent());
                for (final File fileEntry : smartSourceParent.listFiles())
                    if ((fileEntry.getName().contains(months[nextMonth]) ||
                            fileEntry.getName().contains(months[nextMonth+12])) &&
                            (fileEntry.getName().contains(String.valueOf(currentYear)) ||
                            fileEntry.getName().contains(String.valueOf(currentYear--))))
                        smartSourcePicker = fileEntry;
            }
        }
        
        smartSourceScore = wins / (wins + losses);
        
        if (!overrideSourceDir) {
            if (smartSourcePicker == null && smartSourceDuplicatePicker != null)
                smartSourcePicker = smartSourceDuplicatePicker;
            
            if (smartSourcePicker != null)
                if (configMemory.size() < 18 || smartSourceScore < smartSourceGoal)
                    while (true) {
                        sourceDirSrc = fetchDirectoryPrompt("source");
                        if(trueFalsePrompt(
                                "Is this the folder you wanted\n"
                              + "to pick: " + sourceDirSrc.getName() + "?", 
                                "Confirm Directory")) {
                            if (sourceDirSrc.getAbsolutePath().equals(
                                    smartSourcePicker.getAbsolutePath()))
                                smartSourceStatus = "SMART SOURCE: YES";
                            else
                                smartSourceStatus = "SMART SOURCE: NO";
                            break;
                        }
                    }
                else
                    if(trueFalsePrompt(
                            "Is this the folder you wanted\n"
                            + "to pick: " + smartSourcePicker.getName() + "?",
                            "Smart Source Picker")) {
                        smartSourceStatus = "SMART SOURCE: YES";
                        sourceDirSrc = smartSourcePicker;
                    } else {
                        smartSourceStatus = "SMART SOURCE: NO";
                        while (true) {
                            sourceDirSrc = fetchDirectoryPrompt("source");
                            if(trueFalsePrompt(
                                    "Is this the folder you wanted\n"
                                  + "to pick: " + sourceDirSrc.getName() + "?", 
                                    "Confirm Directory"))
                                break;
                        }
                    }
            else {
                while (true) {
                    sourceDirSrc = fetchDirectoryPrompt("source");
                    if(trueFalsePrompt(
                            "Is this the folder you wanted\n"
                          + "to pick: " + sourceDirSrc.getName() + "?", 
                            "Confirm Directory"))
                        break;
                }
                smartSourceStatus = "SMART SOURCE: IGNORE";
            }
        } else
            smartSourceStatus = "SMART SOURCE: IGNORE";
        return sourceDirSrc;
    }
    
    private boolean checkMoreSources(ArrayList<String> configMemory, 
            int distance, double threshhold, int mode) {
        ArrayList<String> duplicates = new ArrayList<>();
        ArrayList<Integer> duplicatesScore = new ArrayList<>();
        String[] months = {"January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December",
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
            "Nov", "Dec"};
        String[] configMemorySplit;
        File mostRecentSourceFile;
        String mostRecentSource;
        int monthScore = 0;
        int yearScore = 0;
        int duplicateIndex;
        int maximumScore = 0;
        int largestScoreIndex = -1;
        int totalTransfers = 0;
        double distanceTransferScore;
        double totalTransferScore;
        double checkMoreScore;
        
        if(mode == 1) {
            for (int i = configMemory.size() - 1; i >= distance; i--){
                configMemorySplit = configMemory.get(i).split(">>>");
                mostRecentSourceFile = new File(configMemorySplit[2]);
                mostRecentSource = mostRecentSourceFile.getName();
                if (mostRecentSource.matches("^[12][0-9]{3}$"))
                    yearScore++;
                for (String month : months) {
                    if (mostRecentSource.contains(month))
                        monthScore++;
                }
            }

            checkMoreScore = (monthScore + yearScore) / distance;

            if (checkMoreScore > threshhold)
                return true;
        } else if (mode == 2) {
            for (int i = configMemory.size() - 1; i >= distance; i--){
                if (i > 8) {
                    configMemorySplit = configMemory.get(i).split(">>>");
                    mostRecentSourceFile = new File(configMemorySplit[2]);
                    mostRecentSource = mostRecentSourceFile.getAbsolutePath();

                    if (!duplicates.contains(mostRecentSource)) {
                        duplicates.add(mostRecentSource);
                        duplicatesScore.add(1);
                    } else {
                        duplicateIndex = duplicates.indexOf(mostRecentSource);
                        duplicatesScore.set(duplicateIndex, duplicatesScore.get(duplicateIndex) + 1);
                    }
                    totalTransfers++;
                }
            }
            
            for (int i = 0; i < duplicatesScore.size(); i++) {
                if (duplicatesScore.get(i) > maximumScore) {
                    maximumScore = duplicatesScore.get(i);
                    largestScoreIndex = i;
                }
            }
            
            if (largestScoreIndex != -1) {
                distanceTransferScore = maximumScore / distance;
                totalTransferScore = maximumScore / totalTransfers;
                
                if (distanceTransferScore > threshhold ||
                        totalTransferScore > threshhold) {
                    smartSourceDuplicatePicker = new File(
                            duplicates.get(largestScoreIndex));
                    return true;
                }
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bringBackBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JLabel welcomeTextFieldA;
    private javax.swing.JLabel welcomeTextFieldB;
    private javax.swing.JPanel welcomeUIjPanel;
    // End of variables declaration//GEN-END:variables
}
