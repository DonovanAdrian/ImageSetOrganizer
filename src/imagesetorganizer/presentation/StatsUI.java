/*
 * This project was created by Donovan Adrian and any
 * edits or changes must be confirmed as valid by Donovan
 * with written consent under any circumstance.
 */
package imagesetorganizer.presentation;

import java.util.ArrayList;

/**
 *
 * @author Donovan Adrian
 */
public class StatsUI extends javax.swing.JFrame {

    ArrayList<String> configMemory = new ArrayList<>();
    
    public StatsUI() {
        initComponents();
    }
    
    public StatsUI(ArrayList<String> configMemory) {
        initComponents();
        this.configMemory = configMemory;
        initializeLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statsUIjPanel = new javax.swing.JPanel();
        closeBtn = new javax.swing.JButton();
        statsUITitleLabel = new javax.swing.JLabel();
        totalTransferLabel = new javax.swing.JLabel();
        smartScoreLabel = new javax.swing.JLabel();
        smartWinsLabel = new javax.swing.JLabel();
        smartLossesLabel = new javax.swing.JLabel();
        smartIgnoresLabel = new javax.swing.JLabel();
        failedTransfersLabel = new javax.swing.JLabel();
        partialTransfersLabel = new javax.swing.JLabel();
        totalTransfers = new javax.swing.JLabel();
        smartScore = new javax.swing.JLabel();
        smartWins = new javax.swing.JLabel();
        smartLosses = new javax.swing.JLabel();
        smartIgnores = new javax.swing.JLabel();
        failedTransfers = new javax.swing.JLabel();
        partialTransfers = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        statsUIjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        statsUITitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statsUITitleLabel.setText("Statistics");
        statsUITitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        totalTransferLabel.setText("Total Transfers:");

        smartScoreLabel.setText("Smart Score:");

        smartWinsLabel.setText("Smart Wins:");

        smartLossesLabel.setText("Smart Losses:");

        smartIgnoresLabel.setText("Smart Ignores:");

        failedTransfersLabel.setText("Failed Transfers:");

        partialTransfersLabel.setText("Partial Transfers:");

        totalTransfers.setText("Loading...");

        smartScore.setText("Loading...");

        smartWins.setText("Loading...");

        smartLosses.setText("Loading...");

        smartIgnores.setText("Loading...");

        failedTransfers.setText("Loading...");

        partialTransfers.setText("Loading...");

        javax.swing.GroupLayout statsUIjPanelLayout = new javax.swing.GroupLayout(statsUIjPanel);
        statsUIjPanel.setLayout(statsUIjPanelLayout);
        statsUIjPanelLayout.setHorizontalGroup(
            statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsUIjPanelLayout.createSequentialGroup()
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsUIjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(failedTransfersLabel)
                            .addComponent(smartIgnoresLabel)
                            .addComponent(smartLossesLabel)
                            .addComponent(smartWinsLabel)
                            .addComponent(smartScoreLabel)
                            .addComponent(totalTransferLabel))
                        .addGap(24, 24, 24)
                        .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTransfers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(smartScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(smartWins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(smartLosses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(smartIgnores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(failedTransfers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(statsUIjPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(statsUITitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(statsUIjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(partialTransfersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(partialTransfers, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        statsUIjPanelLayout.setVerticalGroup(
            statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statsUIjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statsUITitleLabel)
                .addGap(10, 10, 10)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTransferLabel)
                    .addComponent(totalTransfers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smartScoreLabel)
                    .addComponent(smartScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smartWinsLabel)
                    .addComponent(smartWins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smartLossesLabel)
                    .addComponent(smartLosses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smartIgnoresLabel)
                    .addComponent(smartIgnores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(failedTransfersLabel)
                    .addComponent(failedTransfers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statsUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partialTransfersLabel)
                    .addComponent(partialTransfers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statsUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statsUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new StatsUI().setVisible(true);
        });
    }
    
    private void initializeLabels(){
        String smartScoreSliced;
        double smartScoreInt;
        double smartWinsInt = 0;
        double smartLossesInt = 0;
        int totalTransfersInt = 0;
        int smartIgnoresInt = 0;
        int failedTransfersInt = 0;
        int partialTransfersInt = 0;
        
        for (int i = 0; i < configMemory.size(); i++) {
            if (configMemory.get(i).contains("SMART SOURCE: YES"))
                smartWinsInt++;
            else if (configMemory.get(i).contains("SMART SOURCE: NO"))
                smartLossesInt++;
            else if (configMemory.get(i).contains("SMART SOURCE: IGNORE"))
                smartIgnoresInt++;
            if (configMemory.get(i).contains("FAILED"))
                failedTransfersInt++;
            else if (configMemory.get(i).contains("PARTIAL"))
                partialTransfersInt++;
            if (i > 8)
                totalTransfersInt++;
        }
        
        if(smartWinsInt != 0.0) {
            smartScoreInt = smartWinsInt / (smartWinsInt + smartLossesInt);
            smartScoreSliced = String.valueOf(smartScoreInt).substring(0, 5);
        } else
            smartScoreSliced = "0.0";
        
        totalTransfers.setText(String.valueOf(totalTransfersInt));
        smartScore.setText(smartScoreSliced);
        smartWins.setText(String.valueOf(smartWinsInt));
        smartLosses.setText(String.valueOf(smartLossesInt));
        smartIgnores.setText(String.valueOf(smartIgnoresInt));
        failedTransfers.setText(String.valueOf(failedTransfersInt));
        partialTransfers.setText(String.valueOf(partialTransfersInt));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel failedTransfers;
    private javax.swing.JLabel failedTransfersLabel;
    private javax.swing.JLabel partialTransfers;
    private javax.swing.JLabel partialTransfersLabel;
    private javax.swing.JLabel smartIgnores;
    private javax.swing.JLabel smartIgnoresLabel;
    private javax.swing.JLabel smartLosses;
    private javax.swing.JLabel smartLossesLabel;
    private javax.swing.JLabel smartScore;
    private javax.swing.JLabel smartScoreLabel;
    private javax.swing.JLabel smartWins;
    private javax.swing.JLabel smartWinsLabel;
    private javax.swing.JLabel statsUITitleLabel;
    private javax.swing.JPanel statsUIjPanel;
    private javax.swing.JLabel totalTransferLabel;
    private javax.swing.JLabel totalTransfers;
    // End of variables declaration//GEN-END:variables
}
