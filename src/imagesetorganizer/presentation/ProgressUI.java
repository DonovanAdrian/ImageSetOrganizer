/*
 * This project was created by Donovan Adrian and any
 * edits or changes must be confirmed as valid by Donovan
 * with written consent under any circumstance.
 */
package imagesetorganizer.presentation;

/**
 *
 * @author Donovan Adrian
 */
public class ProgressUI extends javax.swing.JFrame {

    int MINIMUM = 0;
    int MAXIMUM = 100;
    
    public ProgressUI() {
        initComponents();
    }
    
    public ProgressUI(String labelInput, int maximumInput) {
        initComponents();
        if(!labelInput.equals(""))
            progressTextField.setText(labelInput);
        else
            progressTextField.setText("Please Wait...");
        if(maximumInput != 0)
            MAXIMUM = maximumInput;
        
        progressBar.setMinimum(MINIMUM);
        progressBar.setMaximum(MAXIMUM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressUIjPanel = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        progressTextField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        progressUIjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        progressTextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progressTextField.setText("Please Wait...");
        progressTextField.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout progressUIjPanelLayout = new javax.swing.GroupLayout(progressUIjPanel);
        progressUIjPanel.setLayout(progressUIjPanelLayout);
        progressUIjPanelLayout.setHorizontalGroup(
            progressUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progressUIjPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(progressUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(progressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        progressUIjPanelLayout.setVerticalGroup(
            progressUIjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progressUIjPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(progressTextField)
                .addGap(42, 42, 42)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressUIjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressUIjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressUI().setVisible(true);
            }
        });
    }
    
    public void updateBar(int newValue) {
        progressBar.setValue(newValue);
    }
    
    public void updateDescription(String labelInput) {
        if(!labelInput.equals(""))
            progressTextField.setText(labelInput);
        else
            progressTextField.setText("Please Wait...");
    }
    
    public void updateMaximum(int newMaxValue) {
        if (newMaxValue > 0)
            progressBar.setMaximum(newMaxValue);
        else
            progressBar.setMaximum(MAXIMUM);
    }
    
    public void openWindow(){
        this.setVisible(true);
    }

    public void closeWindow(){
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressTextField;
    private javax.swing.JPanel progressUIjPanel;
    // End of variables declaration//GEN-END:variables
}
