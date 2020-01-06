package loginresistor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.Manager;
import javax.media.Player;
import javax.media.Time;
import javax.swing.JFrame;


public class AudioPlayerCV extends javax.swing.JFrame {

    Player audioPlayer = null;
    String audioPath = "";
    int l;
    int cn = 0;
    String[] s;
    public AudioPlayerCV() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        File f = new File("src\\audioF");
        s = f.list();

        l = s.length;

        audioPath = "src\\audioF\\" + s[cn];
        initAudioPlayer(audioPath);
       
    }

    private void initAudioPlayer(String pathname) {
        try {
            URL url = new File(pathname).toURL();
            System.out.println(pathname);
            //System.out.println(l);
            audioPlayer = Manager.createRealizedPlayer(url);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        previous = new javax.swing.JButton();
        PlayjToggleButton1 = new javax.swing.JToggleButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(36, 47, 65));

        previous.setBackground(new java.awt.Color(36, 47, 65));
        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/rsz_pre.png"))); // NOI18N
        previous.setToolTipText("pre");
        previous.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        PlayjToggleButton1.setBackground(new java.awt.Color(36, 47, 65));
        PlayjToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/play.png"))); // NOI18N
        PlayjToggleButton1.setToolTipText("play/Push");
        PlayjToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PlayjToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayjToggleButton1ActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(36, 47, 65));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/rsz_next.png"))); // NOI18N
        next.setToolTipText("next");
        next.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/rsz_59647312-logo-des-yeux-de-modèle-de-vecteur-de-conception-colorful-icône-du-support-creative-concept-de-vision-log.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayjToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayjToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PlayjToggleButton1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayjToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayjToggleButton1ActionPerformed
        //Play  or Pause

        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setText("play");
            audioPlayer.start();
        } else {
            PlayjToggleButton1.setText("pause");
            audioPlayer.stop();
        }
    }//GEN-LAST:event_PlayjToggleButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        audioPlayer.stop();
        cn++;
        audioPath = "src\\audioF\\" + s[cn % l];
        //System.out.println(audioPath);
        initAudioPlayer(audioPath);

        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setSelected(true);
            audioPlayer.stop();
        } else {
            PlayjToggleButton1.setSelected(true);
            PlayjToggleButton1.setText("Play");
        }
        audioPlayer.start();

    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // Previous
        audioPlayer.stop();
        cn--;
        if (cn == -1) {
            cn = l - 1;
        }
        audioPath = "src\\audioF\\" + s[cn % l];
        //System.out.println(audioPath);
        initAudioPlayer(audioPath);
        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setSelected(true);
            audioPlayer.stop();
        } else {
            PlayjToggleButton1.setSelected(true);
            PlayjToggleButton1.setText("Play");
        }

        audioPlayer.start();
    }//GEN-LAST:event_previousActionPerformed
   
    
    
    
    
    
    public void next(){
         audioPlayer.stop();
        cn++;
        audioPath = "src\\audioF\\" + s[cn % l];
        //System.out.println(audioPath);
        initAudioPlayer(audioPath);

        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setSelected(true);
            audioPlayer.stop();
        } else {
            PlayjToggleButton1.setSelected(true);
            PlayjToggleButton1.setText("Play");
        }
        audioPlayer.start();
     }
     public void previous(){
            audioPlayer.stop();
            cn--;
            if (cn == -1) {
                cn = l - 1;
            }
            audioPath = "src\\audioF\\" + s[cn % l];
            //System.out.println(audioPath);
            initAudioPlayer(audioPath);
            if (PlayjToggleButton1.isSelected()) {
                PlayjToggleButton1.setSelected(true);
                audioPlayer.stop();
            } else {
                PlayjToggleButton1.setSelected(true);
                PlayjToggleButton1.setText("Play");
            }

            audioPlayer.start();
     }
     public void play(){
            audioPlayer.start();
     }
     public void stop(){
          audioPlayer.stop();
        audioPlayer.setMediaTime(new Time(0.0));
     }
     public void pause(){
          audioPlayer.stop();

     }
      public void close(){
           audioPlayer.stop();
          
     }
      
      
      
      
      
      
      
      
      
      
      
      
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioPlayerCV().setVisible(true);
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton PlayjToggleButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
