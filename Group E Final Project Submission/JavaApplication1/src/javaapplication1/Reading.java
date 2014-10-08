/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author x11527487
 */
public class Reading extends javax.swing.JFrame {

    /**
     * Creates new form Reading
     */
    public Reading() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Reading = new javax.swing.JPanel();
        Nci = new javax.swing.JLabel();
        Recommended = new javax.swing.JLabel();
        Rreading = new javax.swing.JLabel();
        Intro = new javax.swing.JLabel();
        Info = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Reading.setBackground(new java.awt.Color(255, 255, 255));

        Nci.setIcon(new javax.swing.ImageIcon("H:\\OOP\\OOP Project\\JavaApplication1\\ncirl.gif")); // NOI18N

        Recommended.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Recommended.setForeground(new java.awt.Color(0, 0, 102));
        Recommended.setText("Recommended");

        Rreading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Rreading.setForeground(new java.awt.Color(0, 0, 102));
        Rreading.setText("Reading");

        Intro.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Intro.setForeground(new java.awt.Color(204, 153, 0));
        Intro.setText("<html>\nSometimes what you learn in class just isn't enough to<br />\n help you, or you find it difficult to understand, so we<br />\n have a range of books in your library that yould be of\n<br /> help to you.<br />");

        Info.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("<html>\nGETTING STARTED:<br />\n<br />\nTitle: Foundation Maths<br />\nAuthor: Croft and Davison<br />\nPublisher: Prentice Hall<br />\nISBN: 9780273730767<br />\n<br />\nHas it been a while since you did Math?<br />\n Are you feeling a little anxious?<br />\n<br />\nThis book is ideal for all those who might<br />\n need a little pepping up with their mathematical<br />\n dexterity. Ideal for those returning to college after<br />\n a long time out or even those that may need a little<br />\n confidence boosting.<br />\n<br />\nEASY READS(HIGHLY RECOMMENDED)<br />\n<br />\nTitle: Statistics Unplugged<br />\nAuthor: Sally Caldwell<br />\nPublisher: Cengage<br />\nISBN: 9780495090779<br />\n<br />\nThis text is the most impressive text that has been<br />\n seen in a long time. It is an easy read that is<br />\n presented with many easy to follow examples.<br />\n<br />\nIt covers everything you need for a Quantitative <br />\nand Qualitative Methods or Research Methods module.<br />\n<br />\n<br />\nTitle: Discrete Mathematics<br />\nAuthor: Ensley and Crawley<br />\nPublisher: Wiley<br />\nISBN: 978-0-471-47602-3<br />\n<br />\nThis text is ideal for those Computing Students.<br />\n It covers everything needed for your Introduction<br />\n to Mathematics for Computing module.<br />\n<br />\nIt contains lots of examples and workings,<br />\n and many questions in the question section.<br />\n<br />");
        Info.setViewportView(jLabel5);

        BackButton.setBackground(new java.awt.Color(0, 0, 102));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 153, 0));
        BackButton.setText("Back ");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReadingLayout = new javax.swing.GroupLayout(Reading);
        Reading.setLayout(ReadingLayout);
        ReadingLayout.setHorizontalGroup(
            ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadingLayout.createSequentialGroup()
                .addGroup(ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReadingLayout.createSequentialGroup()
                        .addComponent(Nci, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Recommended, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReadingLayout.createSequentialGroup()
                                .addComponent(Rreading, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Intro, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(ReadingLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ReadingLayout.setVerticalGroup(
            ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReadingLayout.createSequentialGroup()
                .addGroup(ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReadingLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Recommended, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rreading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Nci, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Intro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        MathsSupport myFrame = new MathsSupport();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Reading().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JScrollPane Info;
    private javax.swing.JLabel Intro;
    private javax.swing.JLabel Nci;
    private javax.swing.JPanel Reading;
    private javax.swing.JLabel Recommended;
    private javax.swing.JLabel Rreading;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}