package loginresistor;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener {

    private Container c;
    private JButton b1, b2;
    private JPanel p;
    private JLabel l;
    private CardLayout cd;
    private ImageIcon ima;

    SlideShow() {

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);

        cd = new CardLayout();

        p = new JPanel(cd);
        p.setBounds(10, 10, 560, 380);
        c.add(p);

        b1 = new JButton("Previous");
        b1.setBounds(10, 400, 100, 50);
        c.add(b1);

        b2 = new JButton("Next");
        b2.setBounds(470, 400, 100, 50);
        c.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        Images();

    }

    public void Images() {
        String[] s;
        File f = new File("src\\detact");
        s = f.list();

        String[] pict = s;
        for (String n : pict) {
            ima = new ImageIcon("src\\detact\\" + n);

            //resize
            Image ic = ima.getImage();
            Image newImage = ic.getScaledInstance(p.getWidth(), p.getHeight(), Image.SCALE_SMOOTH);
            ima = new ImageIcon(newImage);

            l = new JLabel(ima);
            p.add(l);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            cd.next(p);
        } else if (e.getSource() == b1) {
            cd.previous(p);
        }

    }
    public void next(){
           cd.next(p);
    }
    public void previous(){
        cd.previous(p);
    }

    public static void main(String[] args) {

        new SlideShow().setVisible(true);

    }

    private URL getCodeBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
