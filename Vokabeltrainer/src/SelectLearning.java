
import java.util.Random;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SelectLearning extends javax.swing.JFrame {

    WordsBL bl = new WordsBL();

    String germanWord;
    String otherWord;
    int count = 0;
    int right;

    Random rand = new Random();

    public SelectLearning() {
        initComponents();

        JFileChooser chooser = new JFileChooser("C:\\Users");
        int i = chooser.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            bl.loadEdit(chooser.getSelectedFile());
        }

        String text = "" + bl.getElementAt(count);
        String parts[] = text.split(" ");
        germanWord = parts[0];
        otherWord = parts[1];
        tfGermanWord.setText(germanWord);
        right = rand.nextInt((4 - 1)) + 1;

        switch (right) {
            case 1:
                cb1.setText(otherWord);
                cb2.setText("test");
                cb3.setText("turtle");
                cb4.setText("tree");
                break;
            case 2:
                cb2.setText(otherWord);
                cb1.setText("test");
                cb3.setText("turtle");
                cb4.setText("tree");
                break;
            case 3:
                cb3.setText(otherWord);
                cb1.setText("test");
                cb2.setText("turtle");
                cb4.setText("tree");
                break;
            case 4:
                cb4.setText(otherWord);
                cb1.setText("test");
                cb2.setText("turtle");
                cb3.setText("tree");
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btCancel = new javax.swing.JButton();
        tfGermanWord = new javax.swing.JTextField();
        btCheck = new javax.swing.JButton();
        cb1 = new javax.swing.JRadioButton();
        cb2 = new javax.swing.JRadioButton();
        cb3 = new javax.swing.JRadioButton();
        cb4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCancel.setText("Abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        tfGermanWord.setEditable(false);

        btCheck.setText("Kontrollieren");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckActionPerformed(evt);
            }
        });

        buttonGroup1.add(cb1);

        buttonGroup1.add(cb2);

        buttonGroup1.add(cb3);

        buttonGroup1.add(cb4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGermanWord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb1)
                                .addGap(18, 18, 18)
                                .addComponent(cb2)
                                .addGap(18, 18, 18)
                                .addComponent(cb3)
                                .addGap(18, 18, 18)
                                .addComponent(cb4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfGermanWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1)
                    .addComponent(cb2)
                    .addComponent(cb3)
                    .addComponent(cb4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btCheck))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        LearningMenu lm = new LearningMenu();
        lm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckActionPerformed
        try {
            if (cb1.isSelected() && cb1.getText().equals(otherWord)) {
                JOptionPane.showMessageDialog(null, "Richtig!");
                count += 1;
                String text = "" + bl.getElementAt(count);
                String parts[] = text.split(" ");
                germanWord = parts[0];
                otherWord = parts[1];
                tfGermanWord.setText(germanWord);
                right = rand.nextInt((4 - 1)) + 1;

                switch (right) {
                    case 1:
                        cb1.setText(otherWord);
                        cb2.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 2:
                        cb2.setText(otherWord);
                        cb1.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 3:
                        cb3.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 4:
                        cb4.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb3.setText("tree");
                        break;
                }
            } else if (cb2.isSelected() && cb2.getText().equals(otherWord)) {
                JOptionPane.showMessageDialog(null, "Richtig!");
                count += 1;
                String text = "" + bl.getElementAt(count);
                String parts[] = text.split(" ");
                germanWord = parts[0];
                otherWord = parts[1];
                tfGermanWord.setText(germanWord);
                right = rand.nextInt((4 - 1)) + 1;

                switch (right) {
                    case 1:
                        cb1.setText(otherWord);
                        cb2.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 2:
                        cb2.setText(otherWord);
                        cb1.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 3:
                        cb3.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 4:
                        cb4.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb3.setText("tree");
                        break;
                }
            } else if (cb3.isSelected() && cb3.getText().equals(otherWord)) {
                JOptionPane.showMessageDialog(null, "Richtig!");
                count += 1;
                String text = "" + bl.getElementAt(count);
                String parts[] = text.split(" ");
                germanWord = parts[0];
                otherWord = parts[1];
                tfGermanWord.setText(germanWord);
                right = rand.nextInt((4 - 1)) + 1;

                switch (right) {
                    case 1:
                        cb1.setText(otherWord);
                        cb2.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 2:
                        cb2.setText(otherWord);
                        cb1.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 3:
                        cb3.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 4:
                        cb4.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb3.setText("tree");
                        break;
                }
            } else if (cb4.isSelected() && cb4.getText().equals(otherWord)) {
                JOptionPane.showMessageDialog(null, "Richtig!");
                count += 1;
                String text = "" + bl.getElementAt(count);
                String parts[] = text.split(" ");
                germanWord = parts[0];
                otherWord = parts[1];
                tfGermanWord.setText(germanWord);
                right = rand.nextInt((4 - 1)) + 1;

                switch (right) {
                    case 1:
                        cb1.setText(otherWord);
                        cb2.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 2:
                        cb2.setText(otherWord);
                        cb1.setText("test");
                        cb3.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 3:
                        cb3.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb4.setText("tree");
                        break;
                    case 4:
                        cb4.setText(otherWord);
                        cb1.setText("test");
                        cb2.setText("turtle");
                        cb3.setText("tree");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Falsch!");
            }
        } catch (IndexOutOfBoundsException ioobe) {
            JOptionPane.showMessageDialog(null, "Quiz erfolgreich abgeschlossen!");
            MainMenu mm = new MainMenu();
            mm.setVisible(true);
            this.dispose();
        }
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btCheckActionPerformed

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
            java.util.logging.Logger.getLogger(SelectLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectLearning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectLearning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btCheck;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cb1;
    private javax.swing.JRadioButton cb2;
    private javax.swing.JRadioButton cb3;
    private javax.swing.JRadioButton cb4;
    private javax.swing.JTextField tfGermanWord;
    // End of variables declaration//GEN-END:variables
}
