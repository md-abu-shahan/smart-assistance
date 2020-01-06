package loginresistor;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.JFrame;

/**
 *
 * @author AHN
 */
public class ASSISTANT extends javax.swing.JFrame {

    public void sound(String e) {
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin");
        voice.allocate();
        voice.speak(e);
    }

    public ASSISTANT() {
        initComponents();

    }
    //for audio player
    AudioPlayerCV ad = new AudioPlayerCV();
    int treak = 0, treak2 = 0;
    SlideShow sw = new SlideShow();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HS ASSISTANT");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SolaimanLipi", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n=> Hi friend. I'm your \"HS ASSISTANT\",  Here to help you throughout your day.\n      My helpfull feature:\n\t# I can Remeber anything..\n\t# Calculation.....\n\t# Time & Date Showing...\n\t# BD Dictionary........\n\t# Conversation ........\n\t# I Know some General Knowledge......\n\t# I can detect Animal........\n\t# More and more Features......\n            \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setFont(new java.awt.Font("SolaimanLipi", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setToolTipText("How can I help...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/send.png"))); // NOI18N
        jButton1.setText("Send");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/icons8-read-online-96.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("SMART ASSISTANT");

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/detact/camera.jpeg"))); // NOI18N

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D/mute.png"))); // NOI18N
        jToggleButton1.setDisabledIcon(null);
        jToggleButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/D/speaker.png"))); // NOI18N
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/D/speaker.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(180, 180, 180)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        //     jTextField1.setText("");
        jTextField1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path = "src\\D\\chat.txt";
        String path1 = "src\\D\\dict.txt";
        //image null
        ImageIcon im_default = new ImageIcon(getClass().getResource("/detact/camera.jpeg"));
        jLabel1.setIcon(im_default);
        try {

            //for chat
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            //for dict
            BufferedReader br_dict = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "UTF-8"));

            String name = jTextField1.getText();
            name = name.toLowerCase();
            System.out.println("-" + name.equals("") + "-");
            int flag = 0;

            if (name.equals("") == true) {
                flag = 1;
            }
            //online search

            String[] words = name.split(" ");
            String sentance = "";
            for (int i = 0; i < words.length - 1; i++) {
                sentance = sentance + words[i] + "+";
            }
            sentance += words[words.length - 1];
            //   System.out.println(sentance);

            //Zahid Code.......
            if (name.contains("Help") || name.contains("help")) {
                jTextArea1.append("Here are all the command that you can use :\n\n");
                jTextArea1.append("1. For calculating any Arithmetic Problem , use 'calculate' or 'c' or 'cal' and a '='.\n");
                jTextArea1.append("2. For save something into the assistant use 'remember' or 'r' or 'rb' and a '='.\n");
                jTextArea1.append("3. For forget what you saved use 'foget remember' or 'forget all' or 'fr'.\n");
                jTextArea1.append("4. Use any kind of question.\n");
                jTextArea1.append("5. search any kind of word that you want to know about.\n\n");
                jTextField1.setText("");
                flag = 1;
            }
            if (name.equals("movie recomendation") || name.equals("movie rec")) {
                jTextArea1.append("Here are all the Best Movies in 2019 (According to Rotten Tomatoes) :\n\n");
                jTextArea1.append("1. Avengers: Endgame.\n");
                jTextArea1.append("2. Us.\n");
                jTextArea1.append("3. Toy Story 4.\n");
                jTextArea1.append("4. Knives Out\n");
                jTextArea1.append("5. The Irishman\n\n");
                jTextField1.setText("");
                flag = 1;

            }

            if (name.contains("book recomendation") || name.contains("book rec")) {
                jTextArea1.append("Here are all the Best selling Books in 2019: \n\n");
                jTextArea1.append("1. It's Not Supposed to Be This Way: Finding…\n" + "By Lysa TerKeurst\n\n");
                jTextArea1.append("2.The Very Hungry Caterpillar\n" + "By Eric Carle\n\n");
                jTextArea1.append("3. Oh, the Places You'll Go!  \n" + "By Dr. Seuss\n\n");
                jTextArea1.append("4. Howard Stern Comes Again\n" + "By Howard Stern\n\n");
                jTextArea1.append("5. Guts\n" + "By Raina Telgemeier\n");
                jTextField1.setText("");
                flag = 1;
            }
            // System.out.println(flag);
            //End here......
            boolean bl = name.contains("=");
            if (bl) {
                String sss = jTextField1.getText();
                sss = sss.toLowerCase();
                String[] info2 = sss.split("=");
                String s3 = info2[0];
                String s4 = info2[1];

                if (s3.equals("calculate") || s3.equals("c") || s3.equals("cal")) {
                    System.out.println("Dukce " + s4);
                    Calculator CO = new Calculator();
                    double ans = CO.evaluate(s4);
                    jTextArea1.append(s4 + "\n");
                    jTextArea1.append("--- Ans : " + ans + "\n\n");
                    jTextField1.setText("");
                    if (jToggleButton1.isSelected()) {
                        sound("The Ans is : " + ans + "\n\n");
                    }

                } else if (s3.equals("remember") || s3.equals("r") || s3.equals("rb")) {
                    String pr = "src\\D\\remember.txt";
                    String prt = "src\\D\\remembert.txt";
                    try {
                        PrintWriter p = new PrintWriter(pr);
                        FileReader f = new FileReader(prt);
                        BufferedReader br1 = new BufferedReader(f);

                        while (true) {
                            String line3 = br1.readLine();

                            if (line3 == null) {
                                break;
                            }

                            String line4 = line3;
                            p.println(line4);

                            p.flush();

                        }
                        p.println(s4);

                        p.close();

                        p = new PrintWriter(prt);
                        f = new FileReader(pr);
                        br1 = new BufferedReader(f);

                        while (true) {
                            String line3 = br1.readLine();

                            if (line3 == null) {
                                break;
                            }

                            String line4 = line3;
                            p.println(line4);

                            p.flush();

                        }
                        p.close();

                        jTextArea1.append("Ok, I'll remember that.\n\n");
                        //         voice.speak("Ok, I'll remember that.\n\n");
                        if (jToggleButton1.isSelected()) {
                            sound("Ok, I'll remember that.\n\n");
                        }
                        jTextField1.setText("");

                    } catch (Exception ex) {
                        System.out.println("Error =" + ex.getMessage());
                    }
                }
            } else {
                String create = jTextField1.getText();
                create = create.toLowerCase();
                if (create.equals("what time is it") || create.equals("now time") || create.equals("Now time")) {
                    LocalTime localTime2 = LocalTime.now();

                    DateTimeFormatter fo;
                    fo = DateTimeFormatter.ofPattern("hh:mm:ss");

                    String s = localTime2.format(fo);

                    jTextArea1.append(name + "\n");
                    jTextArea1.append("--- time is : " + s + "\n\n");
                    if (jToggleButton1.isSelected()) {
                        sound("--- Time is : " + s + "\n\n");

                    }
                    flag = 1;
                    jTextField1.setText("");

                } else if (create.equals("today date") || create.equals("what date is it") || create.equals("date")) {
                    Date d = new Date();

                    DateFormat dateD = new SimpleDateFormat("dd/MM/YYYY");

                    String s = dateD.format(d);
                    jTextArea1.append(name + "\n");
                    jTextArea1.append("--- Date is : " + s + "\n\n");
                    if (jToggleButton1.isSelected()) {
                        sound("--- Date is : " + s + "\n\n");
                    }
                    flag = 1;
                    jTextField1.setText("");

                } else if (name.equals("what did i ask you to remember") || name.equals("rout")) {
                    System.out.println("hi");
                    String or = "src\\D\\remembert.txt";
                    try {
                        FileReader of = new FileReader(or);
                        BufferedReader obr = new BufferedReader(of);
                        //   voice.speak("you, saved, ");
                        while (true) {
                            String line5 = obr.readLine();
                            if (line5 == null) {

                                break;
                            } else {
                                jTextArea1.append(line5);
                            }
                            jTextArea1.append("\n");
                            //      voice.speak(line5);
                            if (jToggleButton1.isSelected()) {
                                sound(line5);
                            }

                        }
                        flag = 1;
                        jTextField1.setText("");
                    } catch (Exception e) {

                    }
                } else if (name.equals("forget remember") || name.equals("forget all") || name.equals("fr")) {
                    String fg = "src\\D\\remembert.txt";
                    String fg1 = "src\\D\\remember.txt";

                    try {
                        PrintWriter p = new PrintWriter(fg);
                        PrintWriter p1 = new PrintWriter(fg1);

                        p.println(" ");
                        p.flush();
                        p.close();

                        p1.println(" ");
                        p1.flush();
                        p1.close();

                        jTextArea1.append("Forgeted All Remember\n\n");
                        //  voice.speak("Forgeted, All, Remember");
                        if (jToggleButton1.isSelected()) {
                            sound("Forgeted, All, Remember");
                        }
                        jTextArea1.append("\n");
                        jTextField1.setText("");
                        flag = 1;

                    } catch (Exception e) {

                    }

                } else if (create.equals("open music player") || create.equals("mp3") || create.equals("omp")) {
                    treak = 1;
                    flag = 1;
                    //System.out.println(treak);
                    ad.setVisible(true);
                    ad.pack();
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(AudioPlayerCV.DISPOSE_ON_CLOSE);

                    jTextField1.setText("");
                } else if ((create.equals("next") || (create.equals("n"))) && treak == 1) {
                    flag = 1;
                    ad.next();
                } else if ((create.equals("previous") || (create.equals("p"))) && treak == 1) {
                    flag = 1;
                    ad.previous();
                } else if ((create.equals("play") || (create.equals("ply"))) && treak == 1) {
                    flag = 1;
                    ad.play();
                    jTextField1.setText("");
                } else if ((create.equals("stop")) && treak == 1) {
                    flag = 1;
                    ad.stop();
                    jTextField1.setText("");
                } else if ((create.equals("pause")) && treak == 1) {
                    flag = 1;
                    ad.pause();
                    jTextField1.setText("");
                } else if ((create.equals("close")) && treak == 1) {
                    flag = 1;
                    ad.setVisible(false);
                    ad.close();
                    treak = 0;
                    jTextField1.setText("");
                } else if (create.equals("sw") || create.equals("ss") || create.equals("slideshow") || create.equals("open slideshow")) {
                    treak2 = 1;
                    flag = 1;
                    sw.setVisible(true);
                    sw.pack();
                    sw.setBounds(100, 100, 600, 500);
                    sw.setTitle("Slide Show");
                    sw.setLocationRelativeTo(null);
                    sw.setDefaultCloseOperation(AudioPlayerCV.DISPOSE_ON_CLOSE);
                    jTextField1.setText("");
                } else if ((create.equals("next") || (create.equals("n"))) && treak2 == 1) {
                    flag = 1;
                    sw.next();
                } else if ((create.equals("previous") || (create.equals("p"))) && treak2 == 1) {
                    flag = 1;
                    sw.previous();
                } else if ((create.equals("close") || (create.equals("c"))) && treak2 == 1) {
                    flag = 1;
                    sw.setVisible(false);
                    treak2 = 0;
                    jTextField1.setText("");
                } else if (name.contains("dict") || name.contains("dictionary") || name.contains("mens") || name.contains("means") || name.contains("mean") || name.contains("meaning")) {
                    System.out.println("dict aice");

                    String[] info3 = name.split(" ");
                    String s5 = info3[info3.length - 1];
                    String s6 = info3[0];

                    while (true) {

                        String line = br_dict.readLine();

                        if (line.contains("1")) {
                            break;
                        }
                        String[] info = line.split("=");
                        String s1 = info[0];
                        String s2 = info[1];
                        String s3 = info[2];
                        //System.out.println(flag);
                        if (s1.equals(s5) || (s1.equals(s6))) {
                            //text
                            flag = 1;
                            jTextArea1.append(s1 + "\n");
                            jTextArea1.append("--- " + s2 + "\n\n");
                            jTextField1.setText("");
                            //audio
                            //System.out.println(s3);
                            //voice.speak(", , , , , "+s3);
                            if (jToggleButton1.isSelected()) {
                                sound(s3);
                            }

                            //show image
                            ImageIcon im = new ImageIcon(getClass().getResource("/detact/" + s1 + ".jpeg"));
                            jLabel1.setIcon(im);

                            jTextField1.setText("");

                            break;
                        } else if (s2.equals(s5) || (s2.equals(s6))) {
                            flag = 1;
                            jTextArea1.append(name + "\n");
                            jTextArea1.append("--- " + s1 + "\n\n");
                            if (jToggleButton1.isSelected()) {
                                sound(s1);
                            }
                            jTextField1.setText("");

                            break;
                        }

                    }
                    // System.out.println(flag);
                    if (flag == 0) {
                        try {
                            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?h1=en&q=" + sentance + "&btnG=Google+Search"));
                        } catch (Exception e) {
                            System.out.println("Jahid problem error");
                        }
                    }

                } else {  //pre set conversation 
                    while (true) {
                        String line = br.readLine();

                        if (line.equals("1")) {
                            break;
                        }
                        String[] info = line.split("=");
                        String s1, s2, s3;
                        if (info.length == 2) {
                            s1 = info[0];

                            s2 = info[1];
                            s3=" ";
                        } else {
                            s1 = info[0];

                            
                            s3 = info[2];
                            s2=info[1];
                        }

                        // String s3 = info[2];
                        // System.out.println(flag);
                        if (s1.equals(name)) {
                            flag = 1;
                            jTextArea1.append(name + "\n");
                            jTextArea1.append("--- " + s2 + "\n\n");
                            
                            if (jToggleButton1.isSelected()) {
                                
                               
                                sound(s2);
                                sound(s3);
                                
                            }

                            jTextField1.setText("");

                            break;
                        } 

                    }
                    //System.out.println(flag);
                    if (flag == 0) {
                        try {
                            flag = 1;
                            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?h1=en&q=" + sentance + "&btnG=Google+Search"));
                        } catch (Exception e) {
                            System.out.println("Jahid problem error");
                        }
                    }

                }

                if ((flag == 0)) {

                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?h1=en&q=" + sentance + "&btnG=Google+Search"));
                    } catch (Exception e) {
                        System.out.println("Jahid problem error");
                    }

                }

            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String path = "src\\D\\chat.txt";
        String path1 = "src\\D\\dict.txt";
        //image null
        ImageIcon im_default = new ImageIcon(getClass().getResource("/detact/camera.jpeg"));
        jLabel1.setIcon(im_default);
        try {

            //for chat
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            //for dict
            BufferedReader br_dict = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "UTF-8"));

            String name = jTextField1.getText();
            name = name.toLowerCase();
            System.out.println("-" + name.equals("") + "-");
            int flag = 0;

            if (name.equals("") == true) {
                flag = 1;
            }
            //online search

            String[] words = name.split(" ");
            String sentance = "";
            for (int i = 0; i < words.length - 1; i++) {
                sentance = sentance + words[i] + "+";
            }
            sentance += words[words.length - 1];
            //   System.out.println(sentance);

            //Zahid Code.......
            if (name.contains("Help") || name.contains("help")) {
                jTextArea1.append("Here are all the command that you can use :\n\n");
                jTextArea1.append("1. For calculating any Arithmetic Problem , use 'calculate' or 'c' or 'cal' and a '='.\n");
                jTextArea1.append("2. For save something into the assistant use 'remember' or 'r' or 'rb' and a '='.\n");
                jTextArea1.append("3. For forget what you saved use 'foget remember' or 'forget all' or 'fr'.\n");
                jTextArea1.append("4. Use any kind of question.\n");
                jTextArea1.append("5. search any kind of word that you want to know about.\n\n");
                jTextField1.setText("");
                flag = 1;
            }
            if (name.equals("movie recomendation") || name.equals("movie rec")) {
                jTextArea1.append("Here are all the Best Movies in 2019 (According to Rotten Tomatoes) :\n\n");
                jTextArea1.append("1. Avengers: Endgame.\n");
                jTextArea1.append("2. Us.\n");
                jTextArea1.append("3. Toy Story 4.\n");
                jTextArea1.append("4. Knives Out\n");
                jTextArea1.append("5. The Irishman\n\n");
                jTextField1.setText("");
                flag = 1;

            }

            if (name.contains("book recomendation") || name.contains("book rec")) {
                jTextArea1.append("Here are all the Best selling Books in 2019: \n\n");
                jTextArea1.append("1. It's Not Supposed to Be This Way: Finding…\n" + "By Lysa TerKeurst\n\n");
                jTextArea1.append("2.The Very Hungry Caterpillar\n" + "By Eric Carle\n\n");
                jTextArea1.append("3. Oh, the Places You'll Go!  \n" + "By Dr. Seuss\n\n");
                jTextArea1.append("4. Howard Stern Comes Again\n" + "By Howard Stern\n\n");
                jTextArea1.append("5. Guts\n" + "By Raina Telgemeier\n");
                jTextField1.setText("");
                flag = 1;
            }
            // System.out.println(flag);
            //End here......
            boolean bl = name.contains("=");
            if (bl) {
                String sss = jTextField1.getText();
                sss = sss.toLowerCase();
                String[] info2 = sss.split("=");
                String s3 = info2[0];
                String s4 = info2[1];

                if (s3.equals("calculate") || s3.equals("c") || s3.equals("cal")) {
                    System.out.println("Dukce " + s4);
                    Calculator CO = new Calculator();
                    double ans = CO.evaluate(s4);
                    jTextArea1.append(s4 + "\n");
                    jTextArea1.append("--- Ans : " + ans + "\n\n");
                    jTextField1.setText("");
                    if (jToggleButton1.isSelected()) {
                        sound("The Ans is : " + ans + "\n\n");
                    }

                } else if (s3.equals("remember") || s3.equals("r") || s3.equals("rb")) {
                    String pr = "src\\D\\remember.txt";
                    String prt = "src\\D\\remembert.txt";
                    try {
                        PrintWriter p = new PrintWriter(pr);
                        FileReader f = new FileReader(prt);
                        BufferedReader br1 = new BufferedReader(f);

                        while (true) {
                            String line3 = br1.readLine();

                            if (line3 == null) {
                                break;
                            }

                            String line4 = line3;
                            p.println(line4);

                            p.flush();

                        }
                        p.println(s4);

                        p.close();

                        p = new PrintWriter(prt);
                        f = new FileReader(pr);
                        br1 = new BufferedReader(f);

                        while (true) {
                            String line3 = br1.readLine();

                            if (line3 == null) {
                                break;
                            }

                            String line4 = line3;
                            p.println(line4);

                            p.flush();

                        }
                        p.close();

                        jTextArea1.append("Ok, I'll remember that.\n\n");
                        //         voice.speak("Ok, I'll remember that.\n\n");
                        if (jToggleButton1.isSelected()) {
                            sound("Ok, I'll remember that.\n\n");
                        }
                        jTextField1.setText("");

                    } catch (Exception ex) {
                        System.out.println("Error =" + ex.getMessage());
                    }
                }
            } else {
                String create = jTextField1.getText();
                create = create.toLowerCase();
                if (create.equals("what time is it") || create.equals("now time") || create.equals("Now time")) {
                    LocalTime localTime2 = LocalTime.now();

                    DateTimeFormatter fo;
                    fo = DateTimeFormatter.ofPattern("hh:mm:ss");

                    String s = localTime2.format(fo);

                    jTextArea1.append(name + "\n");
                    jTextArea1.append("--- time is : " + s + "\n\n");
                    if (jToggleButton1.isSelected()) {
                        sound("--- Time is : " + s + "\n\n");

                    }
                    flag = 1;
                    jTextField1.setText("");

                } else if (create.equals("today date") || create.equals("what date is it") || create.equals("date")) {
                    Date d = new Date();

                    DateFormat dateD = new SimpleDateFormat("dd/MM/YYYY");

                    String s = dateD.format(d);
                    jTextArea1.append(name + "\n");
                    jTextArea1.append("--- Date is : " + s + "\n\n");
                    if (jToggleButton1.isSelected()) {
                        sound("--- Date is : " + s + "\n\n");
                    }
                    flag = 1;
                    jTextField1.setText("");

                } else if (name.equals("what did i ask you to remember") || name.equals("rout")) {
                    System.out.println("hi");
                    String or = "src\\D\\remembert.txt";
                    try {
                        FileReader of = new FileReader(or);
                        BufferedReader obr = new BufferedReader(of);
                        //   voice.speak("you, saved, ");
                        while (true) {
                            String line5 = obr.readLine();
                            if (line5 == null) {

                                break;
                            } else {
                                jTextArea1.append(line5);
                            }
                            jTextArea1.append("\n");
                            //      voice.speak(line5);
                            if (jToggleButton1.isSelected()) {
                                sound(line5);
                            }

                        }
                        flag = 1;
                        jTextField1.setText("");
                    } catch (Exception e) {

                    }
                } else if (name.equals("forget remember") || name.equals("forget all") || name.equals("fr")) {
                    String fg = "src\\D\\remembert.txt";
                    String fg1 = "src\\D\\remember.txt";

                    try {
                        PrintWriter p = new PrintWriter(fg);
                        PrintWriter p1 = new PrintWriter(fg1);

                        p.println(" ");
                        p.flush();
                        p.close();

                        p1.println(" ");
                        p1.flush();
                        p1.close();

                        jTextArea1.append("Forgeted All Remember\n\n");
                        //  voice.speak("Forgeted, All, Remember");
                        if (jToggleButton1.isSelected()) {
                            sound("Forgeted, All, Remember");
                        }
                        jTextArea1.append("\n");
                        jTextField1.setText("");
                        flag = 1;

                    } catch (Exception e) {

                    }

                } else if (create.equals("open music player") || create.equals("mp3") || create.equals("omp")) {
                    treak = 1;
                    flag = 1;
                    //System.out.println(treak);
                    ad.setVisible(true);
                    ad.pack();
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(AudioPlayerCV.DISPOSE_ON_CLOSE);

                    jTextField1.setText("");
                } else if ((create.equals("next") || (create.equals("n"))) && treak == 1) {
                    flag = 1;
                    ad.next();
                } else if ((create.equals("previous") || (create.equals("p"))) && treak == 1) {
                    flag = 1;
                    ad.previous();
                } else if ((create.equals("play") || (create.equals("ply"))) && treak == 1) {
                    flag = 1;
                    ad.play();
                    jTextField1.setText("");
                } else if ((create.equals("stop")) && treak == 1) {
                    flag = 1;
                    ad.stop();
                    jTextField1.setText("");
                } else if ((create.equals("pause")) && treak == 1) {
                    flag = 1;
                    ad.pause();
                    jTextField1.setText("");
                } else if ((create.equals("close")) && treak == 1) {
                    flag = 1;
                    ad.setVisible(false);
                    ad.close();
                    treak = 0;
                    jTextField1.setText("");
                } else if (create.equals("sw") || create.equals("gellary") || create.equals("g") || create.equals("open gellary")) {
                    treak2 = 1;
                    flag = 1;
                    sw.setVisible(true);
                    sw.pack();
                    sw.setBounds(100, 100, 600, 500);
                    sw.setTitle("Slide Show");
                    sw.setLocationRelativeTo(null);
                    sw.setDefaultCloseOperation(AudioPlayerCV.DISPOSE_ON_CLOSE);
                    jTextField1.setText("");
                } else if ((create.equals("next") || (create.equals("n"))) && treak2 == 1) {
                    flag = 1;
                    sw.next();
                } else if ((create.equals("previous") || (create.equals("p"))) && treak2 == 1) {
                    flag = 1;
                    sw.previous();
                } else if ((create.equals("close") || (create.equals("c"))) && treak2 == 1) {
                    flag = 1;
                    sw.setVisible(false);
                    treak2 = 0;
                    jTextField1.setText("");
                } else if (name.contains("dict") || name.contains("dictionary") || name.contains("mens") || name.contains("means") || name.contains("mean") || name.contains("meaning")) {
                    System.out.println("dict aice");

                    String[] info3 = name.split(" ");
                    String s5 = info3[info3.length - 1];
                    String s6 = info3[0];

                    while (true) {

                        String line = br_dict.readLine();

                        if (line.contains("1")) {
                            break;
                        }
                        String[] info = line.split("=");
                        String s1 = info[0];
                        String s2 = info[1];
                        String s3 = info[2];
                        //System.out.println(flag);
                        if (s1.equals(s5) || (s1.equals(s6))) {
                            //text
                            flag = 1;
                            jTextArea1.append(s1 + "\n");
                            jTextArea1.append("--- " + s2 + "\n\n");
                            jTextField1.setText("");
                            //audio
                            //System.out.println(s3);
                            //voice.speak(", , , , , "+s3);
                            if (jToggleButton1.isSelected()) {
                                sound(s3);
                            }

                            //show image
                            ImageIcon im = new ImageIcon(getClass().getResource("/detact/" + s1 + ".jpeg"));
                            jLabel1.setIcon(im);

                            jTextField1.setText("");

                            break;
                        } else if (s2.equals(s5) || (s2.equals(s6))) {
                            flag = 1;
                            jTextArea1.append(name + "\n");
                            jTextArea1.append("--- " + s1 + "\n\n");
                            if (jToggleButton1.isSelected()) {
                                sound(s1);
                            }
                            jTextField1.setText("");

                            break;
                        }

                    }
                    // System.out.println(flag);
                    if (flag == 0) {
                        try {
                            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?h1=en&q=" + sentance + "&btnG=Google+Search"));
                        } catch (Exception e) {
                            System.out.println("Jahid problem error");
                        }
                    }

                } else {  //pre set conversation 
                    while (true) {
                        String line = br.readLine();

                        if (line.equals("1")) {
                            break;
                        }
                        String[] info = line.split("=");
                        String s1, s2, s3;
                        if (info.length == 2) {
                            s1 = info[0];

                            s2 = info[1];
                            s3=" ";
                        } else {
                            s1 = info[0];

                            
                            s3 = info[2];
                            s2=info[1];
                        }

                        // String s3 = info[2];
                        // System.out.println(flag);
                        if (s1.equals(name)) {
                            flag = 1;
                            jTextArea1.append(name + "\n");
                            jTextArea1.append("--- " + s2 + "\n\n");
                            
                            if (jToggleButton1.isSelected()) {
                                
                               
                                sound(s2);
                                sound(s3);
                                
                            }

                            jTextField1.setText("");

                            break;
                        } 

                    }
                    //System.out.println(flag);
                    if (flag == 0) {
                        try {
                            flag = 1;
                            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?h1=en&q=" + sentance + "&btnG=Google+Search"));
                        } catch (Exception e) {
                            System.out.println("Jahid problem error");
                        }
                    }

                }

                if ((flag == 0)) {

                    try {
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.google.com/search?h1=en&q=" + sentance + "&btnG=Google+Search"));
                    } catch (Exception e) {
                        System.out.println("Jahid problem error");
                    }

                }

            }

        } catch (Exception e) {

        }


        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        commandAbout ca = new commandAbout();
        ca.setVisible(true);
        ca.pack();
        ca.setLocationRelativeTo(null);
        ca.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(ASSISTANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASSISTANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASSISTANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASSISTANT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASSISTANT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
