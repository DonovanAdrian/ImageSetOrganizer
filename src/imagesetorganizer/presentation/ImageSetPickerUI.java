/*
 * This project was created by Donovan Adrian and any
 * edits or changes must be confirmed as valid by Donovan
 * with written consent under any circumstance.
 */
package imagesetorganizer.presentation;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Donovan Adrian
 */
public class ImageSetPickerUI extends javax.swing.JFrame {
    
    ArrayList<File> createdFolders = new ArrayList<>();
    ArrayList<String> configMemory = new ArrayList<>();
    ArrayList<String> configChanges = new ArrayList<>();
    String imageSetNum = "0";
    String destinationDir = "";
    String sourceDir = "";
    String sourceDirName = "";
    File destinationDirSrc;
    File sourceDirSrc;
    JFileChooser fileChooser;
    int outsideOfMethod = 0;
    int imageSetNumCatcher = 0;
    
    public ImageSetPickerUI() {
        initComponents();
    }
    
    public ImageSetPickerUI(int outsideOfMethod) {
        this.outsideOfMethod = outsideOfMethod;
        initComponents();
    }
    
    public ImageSetPickerUI(ArrayList<String> configMemory,
            ArrayList<String> configChanges, File destinationDirSrc,
            File sourceDirSrc, int outsideOfMethod) {
        this.configMemory = configMemory;
        this.configChanges = configChanges;
        this.destinationDirSrc = destinationDirSrc;
        this.sourceDirSrc = sourceDirSrc;
        this.outsideOfMethod = outsideOfMethod;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageSetPickerUIjPanel = new javax.swing.JPanel();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        imageSetPickerTextFieldA = new javax.swing.JLabel();
        imageSetPickerTextFieldB = new javax.swing.JLabel();
        imageSetPickerTextFieldC = new javax.swing.JLabel();
        keypadOutputIndicator = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        continueBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imageSetPickerUIjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        backspace.setText("<---");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        imageSetPickerTextFieldA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageSetPickerTextFieldA.setText("Use the keypad below to choose how");
        imageSetPickerTextFieldA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imageSetPickerTextFieldB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageSetPickerTextFieldB.setText("many image sets you would like");
        imageSetPickerTextFieldB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imageSetPickerTextFieldC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageSetPickerTextFieldC.setText("(Max 20)");
        imageSetPickerTextFieldC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        keypadOutputIndicator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keypadOutputIndicator.setText("0");
        keypadOutputIndicator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cancelBtn.setText("Cancel");
        cancelBtn.setSize(new java.awt.Dimension(100, 29));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        continueBtn.setText("Continue");
        continueBtn.setSize(new java.awt.Dimension(100, 29));
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imageSetPickerUIjPanelLayout = new javax.swing.GroupLayout(imageSetPickerUIjPanel);
        imageSetPickerUIjPanel.setLayout(imageSetPickerUIjPanelLayout);
        imageSetPickerUIjPanelLayout.setHorizontalGroup(
            imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imageSetPickerUIjPanelLayout.createSequentialGroup()
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueBtn))
                    .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(imageSetPickerTextFieldA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageSetPickerTextFieldB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keypadOutputIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageSetPickerTextFieldC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        imageSetPickerUIjPanelLayout.setVerticalGroup(
            imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageSetPickerUIjPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imageSetPickerTextFieldA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageSetPickerTextFieldB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageSetPickerTextFieldC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(keypadOutputIndicator)
                .addGap(18, 18, 18)
                .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(imageSetPickerUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(continueBtn))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageSetPickerUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageSetPickerUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        numPressed("1");
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        numPressed("2");
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        numPressed("3");
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        numPressed("4");
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        numPressed("5");
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        numPressed("6");
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        numPressed("7");
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        numPressed("8");
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        numPressed("9");
    }//GEN-LAST:event_num9ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        if (imageSetNum.equals("1") || imageSetNum.equals("2")){
            imageSetNum += "0";
        }
        updateJLabel(imageSetNum);
    }//GEN-LAST:event_num0ActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        if (imageSetNum.length() == 2){
            imageSetNum = Character.toString(imageSetNum.charAt(0));
        } else if (imageSetNum.length() == 1){
            imageSetNum = "0";
        }
        updateJLabel(imageSetNum);
    }//GEN-LAST:event_backspaceActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.setVisible(false);
        WelcomeUI welcomeUI = new WelcomeUI();
        welcomeUI.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        if(imageSetNum.equals("0") || imageSetNum.equals("2!")){
            JOptionPane.showMessageDialog(null,
                    "Please pick a valid number of image\n"
                  + "sets to create!",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
        } else if (outsideOfMethod == 0) {
            this.setVisible(false);
            boolean userChoiceA = trueFalsePrompt("Desktop", "Elsewhere",
                    "Will these image sets be on the desktop\n"
                  + "or will they be placed elsewhere?", "Desktop? Elsewhere?");
            if (userChoiceA){//desktop
                destinationDirSrc = new File(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "/Desktop/");
                destinationDir = destinationDirSrc.getAbsolutePath();
                if (!testReadWrite(destinationDirSrc)){
                    JOptionPane.showMessageDialog(null,
                            "Unable to locate the desktop! Please\n"
                          + "point us to where it may be located.",
                            "Unsuitable Directory", JOptionPane.ERROR_MESSAGE);
                    destinationDirSrc = fetchDirectoryPrompt("destination");
                    destinationDir = destinationDirSrc.getAbsolutePath();
                }
            } else {
                destinationDirSrc = fetchDirectoryPrompt("destination");
                destinationDir = destinationDirSrc.getAbsolutePath();
            }
            boolean userChoiceB = trueFalsePrompt("Yes", "No",
                "Would you like to set up a source folder now?", "Source Folder?");
            if (userChoiceB){
                sourceDirSrc = fetchDirectoryPrompt("source");
                sourceDir = sourceDirSrc.getAbsolutePath();
                completeSetup();
            } else {
                completeSetup();
            }
        } else if (outsideOfMethod == 1) {
            this.setVisible(false);
            WelcomeUI welcomeUI = new WelcomeUI();
            welcomeUI.imageSetNumCatcher(Integer.valueOf(imageSetNum));
            welcomeUI.setVisible(true);
        } else {
            this.setVisible(false);
            SettingsUI settingsUI = new SettingsUI(configMemory, 
            configChanges, destinationDirSrc, sourceDirSrc, Integer.valueOf(imageSetNum));
            settingsUI.setVisible(true);
        }
    }//GEN-LAST:event_continueBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ImageSetPickerUI().setVisible(true);
        });
    }
    
    private void numPressed(String num){
        if (imageSetNum.equals("1")){
            imageSetNum += num;
        } else if (imageSetNum.equals("2")){
            imageSetNum = "2!";
        } else if (imageSetNum.length() == 1){
            imageSetNum = num;
        }
        updateJLabel(imageSetNum);
    }
    
    private void updateJLabel(String num){
        keypadOutputIndicator.setText(num);
        super.update(this.getGraphics());
    }
    
    private boolean trueFalsePrompt(String optionA, String optionB, 
            String prompt, String title){
        while(true) {
            int userChoice = JOptionPane.showOptionDialog(null, prompt, title,
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    new String[]{optionB, optionA}, "default");
            if (userChoice == 1) {
                return true;
            } else if (userChoice != -1) {
                return false;
            }
        }
    }
    
    private void completeSetup(){
        boolean setUpCompleted = false;
        File tempImageSetFolder;
        File imageSetSrc;
        int retryNum = 0;
        if (!sourceDir.equals("")) {
            sourceDirName = sourceDirSrc.getName();
        } else {
            while (true) {
                sourceDirName = JOptionPane.showInputDialog(null,
                        "Since a source directory wasn't set, please\n"
                      + "choose a name for the image set folders.",
                        "Input A File Name",
                        JOptionPane.PLAIN_MESSAGE);
                if(userInputValid(sourceDirName))
                    break;
                else
                    JOptionPane.showMessageDialog(null,
                        "Please enter a valid name for the\n"
                      + "image set folders... Please try again!",
                        "Unsuitable Name", JOptionPane.ERROR_MESSAGE);
            }
        }
        for (int i = 1; i < Integer.parseInt(imageSetNum) + 1; i++) {
            tempImageSetFolder = new File(destinationDir + "/" + sourceDirName + " - " + i + " Print");
            if(!tempImageSetFolder.exists())
                if(tempImageSetFolder.mkdir())
                    createdFolders.add(tempImageSetFolder);
        }
        imageSetSrc = new File(destinationDir + "/" + sourceDirName + " - " + 1 + " Print");
        while (true){
            if(testReadWrite(imageSetSrc))
                if(verifyImageSetFolders()) {
                    setUpCompleted = true;
                    break;
                }
                else
                    retryNum++;
            else
                retryNum++;
            if(retryNum == 3) {
                failedSetUp("the image set folders");
                break;
            }
        }
        if(setUpCompleted) {
            writeDataToConfig();
            JOptionPane.showMessageDialog(null,
                    "Setup complete! The program will now exit.\n"
                  + "Once you have organized all your pictures,\n"
                  + "just reopen this program! Thanks!", "Setup Complete!",
                  JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
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
    
    private boolean userInputValid(String userInput){
        return !userInput.matches("[/\\\"<>:|?*]");
    }
    
    private boolean testReadWrite(File directory){
        return directory.exists() && directory.canRead() && directory.canWrite();
    }
    
    private void writeDataToConfig(){
        File configFile = new File("config.txt");
        if (configFile.exists() && configFile.isFile() && configFile.canWrite())
            try {
                configFile.delete();
                configFile.createNewFile();
                FileWriter fWriter = new FileWriter(configFile);
                PrintWriter writer = new PrintWriter(fWriter);
                writer.println("*****CONFIG SETTINGS*****");
                writer.println("***PLEASE DO NOT EDIT!***");
                writer.println(imageSetNum);
                writer.println(destinationDir);
                if (sourceDir.equals(""))
                    writer.println("###NO SOURCE DIR PROVIDED###");
                else
                    writer.println(sourceDir);
                writer.close();
            } catch (IOException ioe){
                System.out.println("Error: Config Not Written...");
                tryToCreateNewConfig(configFile);
                failedSetUp("the config file");
            }
        else {
            System.out.println("Config File Does Not Exist");
            tryToCreateNewConfig(configFile);
            failedSetUp("the config file");
        }
    }
    
    private boolean tryToCreateNewConfig(File config){
        try {
            if (config.exists()){
                config.delete();
                config.createNewFile();
            } else {
                config.createNewFile();
            }
            return true;
        } catch (IOException ioe) {
            return false;
        }
    }
    
    private boolean verifyImageSetFolders(){
        ArrayList<String> imageSetFolderNames = new ArrayList<>();
        for (final File fileEntry : destinationDirSrc.listFiles())
            if (fileEntry.getName().contains(sourceDirName) && fileEntry.getName().contains("Print"))
                imageSetFolderNames.add(fileEntry.getName());
        if(imageSetFolderNames.size() == Integer.parseInt(imageSetNum))
            return true;
        else {
            System.out.println("Error: Not All Image Set Folders Present!");
            return false;
        }
    }
    
    private void failedSetUp(String failReason){
        JOptionPane.showMessageDialog(null,
                "There was an error setting up\n"
              + failReason + "... Please try again!",
                "Failed Set Up", JOptionPane.ERROR_MESSAGE);
        for (int i = 0; i < createdFolders.size(); i++)
            if(!createdFolders.get(i).delete())
                System.out.println("Print Folder " + i + " Not Deleted...");
        WelcomeUI welcomeUI = new WelcomeUI();
        welcomeUI.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspace;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel imageSetPickerTextFieldA;
    private javax.swing.JLabel imageSetPickerTextFieldB;
    private javax.swing.JLabel imageSetPickerTextFieldC;
    private javax.swing.JPanel imageSetPickerUIjPanel;
    private javax.swing.JLabel keypadOutputIndicator;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    // End of variables declaration//GEN-END:variables
}
