
import static java.awt.Color.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author user
 */
public class Tic_Tac_Toe_Game extends javax.swing.JFrame {

    /**
     * Creates new form Tic_Tac_Toe_Game
     */
    private String turn = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public Tic_Tac_Toe_Game() {
        initComponents();
    }
    
    public void choosePlayer() {
        if(turn.equalsIgnoreCase("X")) {
            turn = "O";
        }
        else {
            turn = "X";
        }
        whoseTurn.setText(turn + "'s Turn");
    }
    
    private void setScore() {
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }
    
    public void chooseWinner() {
        String b1 = txtBtn1.getText();
        String b2 = txtBtn2.getText();
        String b3 = txtBtn3.getText();
        String b4 = txtBtn4.getText();
        String b5 = txtBtn5.getText();
        String b6 = txtBtn6.getText();
        String b7 = txtBtn7.getText();
        String b8 = txtBtn8.getText();
        String b9 = txtBtn9.getText();
        
        if(b1 == "X" && b2 == "X" && b3 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn1.setBackground(yellow);
            txtBtn2.setBackground(yellow);
            txtBtn3.setBackground(yellow);
        }
        
        else if(b4 == "X" && b5 == "X" && b6 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn4.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn6.setBackground(yellow);
        }
        
        else if(b7 == "X" && b8 == "X" && b9 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn7.setBackground(yellow);
            txtBtn8.setBackground(yellow);
            txtBtn9.setBackground(yellow);
        }
        
        else if(b1 == "X" && b4 == "X" && b7 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn1.setBackground(yellow);
            txtBtn4.setBackground(yellow);
            txtBtn7.setBackground(yellow);
        }
        
        else if(b2 == "X" && b5 == "X" && b8 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn2.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn8.setBackground(yellow);
        }
        
        else if(b3 == "X" && b6 == "X" && b9 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn3.setBackground(yellow);
            txtBtn6.setBackground(yellow);
            txtBtn9.setBackground(yellow);
        }
        
        else if(b1 == "X" && b5 == "X" && b9 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn1.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn9.setBackground(yellow);
        }
        
        else if(b3 == "X" && b5 == "X" && b7 == "X") {
            winner.setText("X Wins");
            xCount++;
            setScore();
            
            txtBtn3.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn7.setBackground(yellow);
        }
        
        
        
        else if(b1 == "O" && b2 == "O" && b3 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn1.setBackground(yellow);
            txtBtn2.setBackground(yellow);
            txtBtn3.setBackground(yellow);
        }
        
        else if(b4 == "O" && b5 == "O" && b6 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn4.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn6.setBackground(yellow);
        }
        
        else if(b7 == "O" && b8 == "O" && b9 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn7.setBackground(yellow);
            txtBtn8.setBackground(yellow);
            txtBtn9.setBackground(yellow);
        }
        
        else if(b1 == "O" && b4 == "O" && b7 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn1.setBackground(yellow);
            txtBtn4.setBackground(yellow);
            txtBtn7.setBackground(yellow);
        }
        
        else if(b2 == "O" && b5 == "O" && b8 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn2.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn8.setBackground(yellow);
        }
        
        else if(b3 == "O" && b6 == "O" && b9 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn3.setBackground(yellow);
            txtBtn6.setBackground(yellow);
            txtBtn9.setBackground(yellow);
        }
        
        else if(b1 == "O" && b5 == "O" && b9 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn1.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn9.setBackground(yellow);
        }
        
        else if(b3 == "O" && b5 == "O" && b7 == "O") {
            winner.setText("O Wins");
            oCount++;
            setScore();
            
            txtBtn3.setBackground(yellow);
            txtBtn5.setBackground(yellow);
            txtBtn7.setBackground(yellow);
        }
        whoseTurn.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBtn1 = new javax.swing.JButton();
        txtBtn4 = new javax.swing.JButton();
        txtBtn7 = new javax.swing.JButton();
        txtBtn2 = new javax.swing.JButton();
        txtBtn5 = new javax.swing.JButton();
        txtBtn8 = new javax.swing.JButton();
        txtBtn3 = new javax.swing.JButton();
        txtBtn6 = new javax.swing.JButton();
        txtBtn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        whoseTurn = new javax.swing.JLabel();
        winner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBtn1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn1ActionPerformed(evt);
            }
        });

        txtBtn4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn4ActionPerformed(evt);
            }
        });

        txtBtn7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn7ActionPerformed(evt);
            }
        });

        txtBtn2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn2ActionPerformed(evt);
            }
        });

        txtBtn5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn5ActionPerformed(evt);
            }
        });

        txtBtn8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn8ActionPerformed(evt);
            }
        });

        txtBtn3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn3ActionPerformed(evt);
            }
        });

        txtBtn6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn6ActionPerformed(evt);
            }
        });

        txtBtn9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txtBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtn9ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe Game");
        jLabel1.setOpaque(true);

        resetBtn.setBackground(new java.awt.Color(102, 102, 255));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 51, 51));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Player X :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Player O :");

        xScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        oScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Scores");

        whoseTurn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        whoseTurn.setText("X's Turn");

        winner.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        winner.setForeground(new java.awt.Color(255, 0, 0));
        winner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(whoseTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whoseTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        txtBtn1.setText(null);
        txtBtn2.setText(null);
        txtBtn3.setText(null);
        txtBtn4.setText(null);
        txtBtn5.setText(null);
        txtBtn6.setText(null);
        txtBtn7.setText(null);
        txtBtn8.setText(null);
        txtBtn9.setText(null);
        
        txtBtn1.setBackground(null);
        txtBtn2.setBackground(null);
        txtBtn3.setBackground(null);
        txtBtn4.setBackground(null);
        txtBtn5.setBackground(null);
        txtBtn6.setBackground(null);
        txtBtn7.setBackground(null);
        txtBtn8.setBackground(null);
        txtBtn9.setBackground(null);
        
        whoseTurn.setText("X's Turn");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void txtBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn1ActionPerformed
        // TODO add your handling code here:
        txtBtn1.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn1.setForeground(green);
        }
        else {
            txtBtn1.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn1ActionPerformed

    private void txtBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn2ActionPerformed
        // TODO add your handling code here:
        txtBtn2.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn2.setForeground(green);
        }
        else {
            txtBtn2.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn2ActionPerformed

    private void txtBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn3ActionPerformed
        // TODO add your handling code here:
        txtBtn3.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn3.setForeground(green);
        }
        else {
            txtBtn3.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn3ActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void txtBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn4ActionPerformed
        // TODO add your handling code here:
        txtBtn4.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn4.setForeground(green);
        }
        else {
            txtBtn4.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn4ActionPerformed

    private void txtBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn5ActionPerformed
        // TODO add your handling code here:
        txtBtn5.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn5.setForeground(green);
        }
        else {
            txtBtn5.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn5ActionPerformed

    private void txtBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn6ActionPerformed
        // TODO add your handling code here:
        txtBtn6.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn6.setForeground(green);
        }
        else {
            txtBtn6.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn6ActionPerformed

    private void txtBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn7ActionPerformed
        // TODO add your handling code here:
        txtBtn7.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn7.setForeground(green);
        }
        else {
            txtBtn7.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn7ActionPerformed

    private void txtBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn8ActionPerformed
        // TODO add your handling code here:
        txtBtn8.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn8.setForeground(green);
        }
        else {
            txtBtn8.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn8ActionPerformed

    private void txtBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtn9ActionPerformed
        // TODO add your handling code here:
        txtBtn9.setText(turn);
        if(turn.equalsIgnoreCase("X")) {
            txtBtn9.setForeground(green);
        }
        else {
            txtBtn9.setForeground(red);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_txtBtn9ActionPerformed


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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel oScore;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton txtBtn1;
    private javax.swing.JButton txtBtn2;
    private javax.swing.JButton txtBtn3;
    private javax.swing.JButton txtBtn4;
    private javax.swing.JButton txtBtn5;
    private javax.swing.JButton txtBtn6;
    private javax.swing.JButton txtBtn7;
    private javax.swing.JButton txtBtn8;
    private javax.swing.JButton txtBtn9;
    private javax.swing.JLabel whoseTurn;
    private javax.swing.JLabel winner;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables
}
