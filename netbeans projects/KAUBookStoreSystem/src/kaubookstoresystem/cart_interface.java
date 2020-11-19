/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;
import cpit380practice.Picture;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author manar
 */
public class cart_interface extends javax.swing.JFrame {

    cart_linkedlist cartList = new cart_linkedlist();
    Order o;
    int count1 = 1;
    int count2 = 1;
    int count3 = 1;
    int count4 = 1;
    int count5 = 1;
    int count6 = 1;
static double p1,p2,p3,p4,p5,p6;
    static String line;
    static String bookLine[];
    static String line1;
    static String line2;
    static String line3;
    static String line4;
    static String line5;
    static String line6;
    static double totPrice;
    ArrayList<String> linesNo = new ArrayList<>();
    String b1[];
    String b11[];
    String b22[];
    String b[];
    String bb[];
    String b33[];
    String[] l;
    String[] l1;
    String[] l2;
    String[] l3;
    String[] s0;
    String[] s1;
    String[] s2;
    String[] s3;
    String[] s4;
    String[] n0;
    String[] n1;
    String[] n2;
    String[] n3;
    String[] n4;
    String[] n5;
static double tot;
    Cart cart1;
 
    static FileWriter write;
    /**
     * Creates new form cart_interface
     */
    public cart_interface() throws IOException {
        initComponents();
      
    
          cart.setBackground(new Color(255, 255, 255, 100));
        orders.setBackground(new Color(255, 255, 255, 100));
        info.setBackground(new Color(255, 255, 255, 100));
        decpic1.setBackground(new Color(0, 0, 0, 0));
        decpic2.setBackground(new Color(0, 0, 0, 0));
        decpic3.setBackground(new Color(0, 0, 0, 0));
        decpic4.setBackground(new Color(0, 0, 0, 0));
        decpic5.setBackground(new Color(0, 0, 0, 0));
        decpic6.setBackground(new Color(0, 0, 0, 0));
        incpic1.setBackground(new Color(0, 0, 0, 0));
        incpic2.setBackground(new Color(0, 0, 0, 0));
        incpic3.setBackground(new Color(0, 0, 0, 0));
        incpic4.setBackground(new Color(0, 0, 0, 0));
        incpic5.setBackground(new Color(0, 0, 0, 0));
        incpic6.setBackground(new Color(0, 0, 0, 0));
    panel1.setBackground(new Color(0, 0, 0, 0));
         panel2.setBackground(new Color(0, 0, 0, 0));
        panel5.setBackground(new Color(0, 0, 0, 0));
        panel6.setBackground(new Color(0, 0, 0, 0));
          panel4.setBackground(new Color(0, 0, 0, 0));
          panel3.setBackground(new Color(0, 0, 0, 0));
     
        //-----------------------------------------------------------------------
        File file = new File("Book.txt");
        
        Scanner read = new Scanner(file);
   File file1 = new File("Cart.txt");
  
        Scanner read1 = new Scanner(file1);
        while (read1.hasNextLine()) {
            line = read1.nextLine();
            linesNo.add(line);
            System.out.println(linesNo.size());
            switch (linesNo.size()) {
                case 0:
                    break;
                case 1:
                    b1 = line.split(",");
                    Picture bookPic1 = new Picture(b1[2]);

                    pic1.setIcon(new ImageIcon(bookPic1.getImage().getScaledInstance(140, 140, 1)));

                    incpic1.setBackground(new Color(255, 255, 253));

                    decpic1.setBackground(new Color(255, 255, 253));

                    incpic1.setForeground(new Color(0, 0, 0));

                    decpic1.setForeground(new Color(0, 0, 0));

                    panel1.setBackground(new Color(255, 255, 255));

                    quan1.setForeground(new Color(0, 0, 0));

                    quan1.setText(count1 + "");

                     p1 = price(Integer.valueOf(b1[1]), count1);

                    setTotal.setText(p1 + "");
                 tot=(p1);
              

                    break;

                case 2:

                    line1 = Files.readAllLines(Paths.get("Cart.txt")).get(0);

                    line2 = Files.readAllLines(Paths.get("Cart.txt")).get(1);

                    b11 = line1.split(",");

                    b22 = line2.split(",");

                    Picture bookPic2 = new Picture(b11[2]);

                    pic1.setIcon(new ImageIcon(bookPic2.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic3 = new Picture(b22[2]);

                    pic2.setIcon(new ImageIcon(bookPic3.getImage().getScaledInstance(140, 140, 1)));

                    incpic1.setBackground(new Color(255, 255, 253));

                    decpic1.setBackground(new Color(255, 255, 253));

                    incpic1.setForeground(new Color(0, 0, 0));

                    decpic1.setForeground(new Color(0, 0, 0));

                    panel1.setBackground(new Color(255, 255, 255));

                    quan1.setForeground(new Color(0, 0, 0));

                    quan1.setText(count1 + "");

 

                    incpic2.setBackground(new Color(255, 255, 253));

                    decpic2.setBackground(new Color(255, 255, 253));

                    incpic2.setForeground(new Color(0, 0, 0));

                    decpic2.setForeground(new Color(0, 0, 0));

                    panel2.setBackground(new Color(255, 255, 255));

                    quan2.setForeground(new Color(0, 0, 0));

                    quan2.setText(count2 + "");

 

                    p1 = price(Integer.valueOf(b11[1]), count1);

                     p2 = price(Integer.valueOf(b22[1]), count2);

                    setTotal.setText((p1 + p2) + "");
                         tot=(p1+p2);
                     break;

                    

                case 3:

                    line1 = Files.readAllLines(Paths.get("Cart.txt")).get(0);

                    line2 = Files.readAllLines(Paths.get("Cart.txt")).get(1);

                    line3 = Files.readAllLines(Paths.get("Cart.txt")).get(2);

                    b = line1.split(",");

                    bb = line2.split(",");

                    b33 = line3.split(",");

                    Picture bookPic4 = new Picture(b[2]);

                    pic1.setIcon(new ImageIcon(bookPic4.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic6 = new Picture(b33[2]);

                    pic2.setIcon(new ImageIcon(bookPic6.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic5 = new Picture(bb[2]);

                    pic3.setIcon(new ImageIcon(bookPic5.getImage().getScaledInstance(140, 140, 1)));

                    incpic1.setBackground(new Color(255, 255, 253));

                    decpic1.setBackground(new Color(255, 255, 253));

                    incpic1.setForeground(new Color(0, 0, 0));

                    decpic1.setForeground(new Color(0, 0, 0));

                    panel1.setBackground(new Color(255, 255, 255));

                    quan1.setForeground(new Color(0, 0, 0));

                    quan1.setText(count1 + "");

 

                    incpic2.setBackground(new Color(255, 255, 253));

                    decpic2.setBackground(new Color(255, 255, 253));

                    incpic2.setForeground(new Color(0, 0, 0));

                    decpic2.setForeground(new Color(0, 0, 0));

                    panel2.setBackground(new Color(255, 255, 255));

                    quan2.setForeground(new Color(0, 0, 0));

                    quan2.setText(count2 + "");

                    incpic3.setBackground(new Color(255, 255, 253));

                    decpic3.setBackground(new Color(255, 255, 253));

                    incpic3.setForeground(new Color(0, 0, 0));

                    decpic3.setForeground(new Color(0, 0, 0));

                    panel3.setBackground(new Color(255, 255, 255));

                    quan3.setForeground(new Color(0, 0, 0));

                    quan3.setText(count3 + "");

                    /*     double price = price(Integer.parseInt(b[1]), count3);

                 setTotal.setText(price+"");*/

                    p1 = price(Integer.valueOf(b[1]), count1);

                    p2 = price(Integer.valueOf(bb[1]), count2);

                     p3 = price(Integer.valueOf(b33[1]), count3);

                    setTotal.setText((p1 + p2 + p3) + "");
     tot=(p1+p2+p3);
                    

                    break;

                case 4:

                    line1 = Files.readAllLines(Paths.get("Cart.txt")).get(0);

                    line2 = Files.readAllLines(Paths.get("Cart.txt")).get(1);

                    line3 = Files.readAllLines(Paths.get("Cart.txt")).get(2);

                    line4 = Files.readAllLines(Paths.get("Cart.txt")).get(3);

                    l = line1.split(",");

                    l1 = line2.split(",");

                    l2 = line3.split(",");

                    l3 = line4.split(",");

                    Picture bookPic7 = new Picture(l[2]);

                    pic1.setIcon(new ImageIcon(bookPic7.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic8 = new Picture(l1[2]);

                    pic2.setIcon(new ImageIcon(bookPic8.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic9 = new Picture(l2[2]);

                    pic3.setIcon(new ImageIcon(bookPic9.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic10 = new Picture(l3[2]);

                    pic4.setIcon(new ImageIcon(bookPic10.getImage().getScaledInstance(140, 140, 1)));

                    incpic1.setBackground(new Color(255, 255, 253));

                    decpic1.setBackground(new Color(255, 255, 253));

                    incpic1.setForeground(new Color(0, 0, 0));

                    decpic1.setForeground(new Color(0, 0, 0));

                    panel1.setBackground(new Color(255, 255, 255));

                    quan1.setForeground(new Color(0, 0, 0));

                    quan1.setText(count1 + "");

 

                    incpic2.setBackground(new Color(255, 255, 253));

                    decpic2.setBackground(new Color(255, 255, 253));

                    incpic2.setForeground(new Color(0, 0, 0));

                    decpic2.setForeground(new Color(0, 0, 0));

                    panel2.setBackground(new Color(255, 255, 255));

                    quan2.setForeground(new Color(0, 0, 0));

                    quan2.setText(count2 + "");

                    incpic3.setBackground(new Color(255, 255, 253));

                    decpic3.setBackground(new Color(255, 255, 253));

                    incpic3.setForeground(new Color(0, 0, 0));

                    decpic3.setForeground(new Color(0, 0, 0));

                    panel3.setBackground(new Color(255, 255, 255));

                    quan3.setForeground(new Color(0, 0, 0));

                    quan3.setText(count3 + "");

                    incpic4.setBackground(new Color(255, 255, 253));

                    decpic4.setBackground(new Color(255, 255, 253));

                    incpic4.setForeground(new Color(0, 0, 0));

                    decpic4.setForeground(new Color(0, 0, 0));

                    panel4.setBackground(new Color(255, 255, 255));

                    quan4.setForeground(new Color(0, 0, 0));

                    quan4.setText(count4 + "");

                    p1 = price(Integer.valueOf(l[1]), count1);

                    p2 = price(Integer.valueOf(l1[1]), count2);

                    p3 = price(Integer.valueOf(l2[1]), count3);

                     p4 = price(Integer.valueOf(l3[1]), count4);

                    setTotal.setText((p1 + p2 + p3 + p4) + "");
                    tot=(p1+p2+p3+p4);
                    break;
                case 5:

                    line1 = Files.readAllLines(Paths.get("Cart.txt")).get(0);

                    line2 = Files.readAllLines(Paths.get("Cart.txt")).get(1);

                    line3 = Files.readAllLines(Paths.get("Cart.txt")).get(2);

                    line4 = Files.readAllLines(Paths.get("Cart.txt")).get(3);

                    line5 = Files.readAllLines(Paths.get("Cart.txt")).get(4);

                    s0 = line1.split(",");

                    s1 = line2.split(",");

                    s2 = line3.split(",");

                    s3 = line4.split(",");

                    s4 = line4.split(",");

                    Picture bookPic11 = new Picture(s0[2]);

                    pic1.setIcon(new ImageIcon(bookPic11.getImage().getScaledInstance(140, 140, 1)));

                   Picture bookPic12 = new Picture(s1[2]);

                    pic2.setIcon(new ImageIcon(bookPic12.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic13 = new Picture(s2[2]);

                    pic3.setIcon(new ImageIcon(bookPic13.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic14 = new Picture(s3[2]);

                    pic4.setIcon(new ImageIcon(bookPic14.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic15 = new Picture(s4[2]);

                    pic5.setIcon(new ImageIcon(bookPic15.getImage().getScaledInstance(140, 140, 1)));

                    incpic1.setBackground(new Color(255, 255, 253));

                    decpic1.setBackground(new Color(255, 255, 253));

                    incpic1.setForeground(new Color(0, 0, 0));

                    decpic1.setForeground(new Color(0, 0, 0));

                    panel1.setBackground(new Color(255, 255, 255));

                    quan1.setForeground(new Color(0, 0, 0));

                    quan1.setText(count1 + "");

 

                    incpic2.setBackground(new Color(255, 255, 253));

                    decpic2.setBackground(new Color(255, 255, 253));

                    incpic2.setForeground(new Color(0, 0, 0));

                    decpic2.setForeground(new Color(0, 0, 0));

                    panel2.setBackground(new Color(255, 255, 255));

                    quan2.setForeground(new Color(0, 0, 0));

                    quan2.setText(count2 + "");

                    incpic3.setBackground(new Color(255, 255, 253));

                    decpic3.setBackground(new Color(255, 255, 253));

                    incpic3.setForeground(new Color(0, 0, 0));

                    decpic3.setForeground(new Color(0, 0, 0));

                    panel3.setBackground(new Color(255, 255, 255));

                    quan3.setForeground(new Color(0, 0, 0));

                    quan3.setText(count3 + "");

                    incpic4.setBackground(new Color(255, 255, 253));

                    decpic4.setBackground(new Color(255, 255, 253));

                    incpic4.setForeground(new Color(0, 0, 0));

                    decpic4.setForeground(new Color(0, 0, 0));

                    panel4.setBackground(new Color(255, 255, 255));

                    quan4.setForeground(new Color(0, 0, 0));

                    quan4.setText(count4 + "");

                    incpic5.setBackground(new Color(255, 255, 253));

                    decpic5.setBackground(new Color(255, 255, 253));

                    incpic5.setForeground(new Color(0, 0, 0));

                    decpic5.setForeground(new Color(0, 0, 0));

                    panel5.setBackground(new Color(255, 255, 255));

                    quan5.setForeground(new Color(0, 0, 0));

                    quan5.setText(count5 + "");

 

                    p1 = price(Integer.valueOf(s0[1]), count1);

                    p2 = price(Integer.valueOf(s1[1]), count2);

                    p3 = price(Integer.valueOf(s2[1]), count3);

                    p4 = price(Integer.valueOf(s3[1]), count4);

                     p5 = price(Integer.valueOf(s4[1]), count5);

                    setTotal.setText((p1 + p2 + p3 + p4 + p5) + "");
  tot=(p1+p2+p3+p4+p5);
                    break;

 

                case 6:

                    line1 = Files.readAllLines(Paths.get("Cart.txt")).get(0);

                    line2 = Files.readAllLines(Paths.get("Cart.txt")).get(1);

                    line3 = Files.readAllLines(Paths.get("Cart.txt")).get(2);

                    line4 = Files.readAllLines(Paths.get("Cart.txt")).get(3);

                    line5 = Files.readAllLines(Paths.get("Cart.txt")).get(4);

                    line6 = Files.readAllLines(Paths.get("Cart.txt")).get(5);

                    n0 = line1.split(",");

                    n1 = line2.split(",");

                    n2 = line3.split(",");

                    n3 = line4.split(",");

                    n4 = line5.split(",");

                    n5 = line6.split(",");

                    Picture bookPic20 = new Picture(n0[2]);

                    pic1.setIcon(new ImageIcon(bookPic20.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic21 = new Picture(n1[2]);

                    pic2.setIcon(new ImageIcon(bookPic21.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic22 = new Picture(n2[2]);

                    pic3.setIcon(new ImageIcon(bookPic22.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic23 = new Picture(n3[2]);

                    pic1.setIcon(new ImageIcon(bookPic23.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic24 = new Picture(n4[2]);

                    pic5.setIcon(new ImageIcon(bookPic24.getImage().getScaledInstance(140, 140, 1)));

                    Picture bookPic25 = new Picture(n5[2]);

                    pic6.setIcon(new ImageIcon(bookPic25.getImage().getScaledInstance(140, 140, 1)));

                    incpic1.setBackground(new Color(255, 255, 253));

                    decpic1.setBackground(new Color(255, 255, 253));

                    incpic1.setForeground(new Color(0, 0, 0));

                    decpic1.setForeground(new Color(0, 0, 0));

                    panel1.setBackground(new Color(255, 255, 255));

                    quan1.setForeground(new Color(0, 0, 0));

                    quan1.setText(count1 + "");

 

                    incpic2.setBackground(new Color(255, 255, 253));

                    decpic2.setBackground(new Color(255, 255, 253));

                    incpic2.setForeground(new Color(0, 0, 0));

                    decpic2.setForeground(new Color(0, 0, 0));

                    panel2.setBackground(new Color(255, 255, 255));

                    quan2.setForeground(new Color(0, 0, 0));

                    quan2.setText(count2 + "");

                    incpic3.setBackground(new Color(255, 255, 253));

                    decpic3.setBackground(new Color(255, 255, 253));

                    incpic3.setForeground(new Color(0, 0, 0));

                    decpic3.setForeground(new Color(0, 0, 0));

                    panel3.setBackground(new Color(255, 255, 255));

                    quan3.setForeground(new Color(0, 0, 0));

                    quan3.setText(count3 + "");

                    incpic4.setBackground(new Color(255, 255, 253));

                    decpic4.setBackground(new Color(255, 255, 253));

                    incpic4.setForeground(new Color(0, 0, 0));

                    decpic4.setForeground(new Color(0, 0, 0));

                    panel4.setBackground(new Color(255, 255, 255));

                    quan4.setForeground(new Color(0, 0, 0));

                    quan4.setText(count4 + "");

                    incpic5.setBackground(new Color(255, 255, 253));

                    decpic5.setBackground(new Color(255, 255, 253));

                    incpic5.setForeground(new Color(0, 0, 0));

                    decpic5.setForeground(new Color(0, 0, 0));

                    panel5.setBackground(new Color(255, 255, 255));

                    quan5.setForeground(new Color(0, 0, 0));

                    quan5.setText(count5 + "");

 

                    incpic6.setBackground(new Color(255, 255, 253));

                    decpic6.setBackground(new Color(255, 255, 253));

                    incpic6.setForeground(new Color(0, 0, 0));

                    decpic6.setForeground(new Color(0, 0, 0));

                    panel6.setBackground(new Color(255, 255, 255));

                    quan6.setForeground(new Color(0, 0, 0));

                    quan6.setText(count6 + "");

 

                    p1 = price(Integer.valueOf(n0[1]), count1);

                    p2 = price(Integer.valueOf(n1[1]), count2);

                    p3 = price(Integer.valueOf(n2[1]), count3);

                    p4 = price(Integer.valueOf(n3[1]), count4);

                    p5 = price(Integer.valueOf(n4[1]), count5);

                     p6 = price(Integer.valueOf(n5[1]), count6);

                    setTotal.setText((p1 + p2 + p3 + p4 + p5 + p6) + "");
  tot=(p1+p2+p3+p4+p6);
                    break;

            }

        }
    
        //write.close();

 

    }


            
        
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cart = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        orders = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JPanel();
        setTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        purchase = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        decpic1 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        quan1 = new javax.swing.JLabel();
        incpic1 = new javax.swing.JButton();
        pic6 = new javax.swing.JLabel();
        decpic2 = new javax.swing.JButton();
        incpic2 = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        quan2 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        decpic3 = new javax.swing.JButton();
        incpic3 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        quan3 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        decpic4 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        quan4 = new javax.swing.JLabel();
        incpic4 = new javax.swing.JButton();
        pic2 = new javax.swing.JLabel();
        decpic5 = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        quan6 = new javax.swing.JLabel();
        incpic5 = new javax.swing.JButton();
        pic5 = new javax.swing.JLabel();
        decpic6 = new javax.swing.JButton();
        incpic6 = new javax.swing.JButton();
        panel6 = new javax.swing.JPanel();
        quan5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2651, 879));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(2675, 879));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        cart.setBackground(new java.awt.Color(255, 204, 102));
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cart");

        javax.swing.GroupLayout cartLayout = new javax.swing.GroupLayout(cart);
        cart.setLayout(cartLayout);
        cartLayout.setHorizontalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartLayout.setVerticalGroup(
            cartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        orders.setBackground(new java.awt.Color(255, 204, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Orders");

        javax.swing.GroupLayout ordersLayout = new javax.swing.GroupLayout(orders);
        orders.setLayout(ordersLayout);
        ordersLayout.setHorizontalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        ordersLayout.setVerticalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        info.setBackground(new java.awt.Color(255, 204, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Information");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("AR JULIAN", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("cart");

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setForeground(new java.awt.Color(255, 153, 51));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("AR JULIAN", 0, 24)); // NOI18N
        jLabel3.setText("Back");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setForeground(new java.awt.Color(255, 153, 51));
        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
        });

        setTotal.setFont(new java.awt.Font("AR JULIAN", 0, 24)); // NOI18N
        setTotal.setForeground(new java.awt.Color(0, 0, 0));
        setTotal.setText("   ");

        javax.swing.GroupLayout totalLayout = new javax.swing.GroupLayout(total);
        total.setLayout(totalLayout);
        totalLayout.setHorizontalGroup(
            totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(setTotal)
                .addGap(26, 26, 26))
        );
        totalLayout.setVerticalGroup(
            totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalLayout.createSequentialGroup()
                .addComponent(setTotal)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        purchase.setBackground(new java.awt.Color(204, 255, 204));
        purchase.setForeground(new java.awt.Color(255, 153, 51));
        purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("AR JULIAN", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("purchase");

        javax.swing.GroupLayout purchaseLayout = new javax.swing.GroupLayout(purchase);
        purchase.setLayout(purchaseLayout);
        purchaseLayout.setHorizontalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(26, 26, 26))
        );
        purchaseLayout.setVerticalGroup(
            purchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaseLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        decpic1.setForeground(new java.awt.Color(51, 51, 51));
        decpic1.setText("-");
        decpic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpic1ActionPerformed(evt);
            }
        });

        quan1.setForeground(new java.awt.Color(51, 51, 51));
        quan1.setText("jLabel1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quan1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(quan1))
        );

        incpic1.setForeground(new java.awt.Color(51, 51, 51));
        incpic1.setText("+");
        incpic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incpic1ActionPerformed(evt);
            }
        });

        decpic2.setForeground(new java.awt.Color(51, 51, 51));
        decpic2.setText("-");
        decpic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpic2ActionPerformed(evt);
            }
        });

        incpic2.setForeground(new java.awt.Color(51, 51, 51));
        incpic2.setText("+");
        incpic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incpic2ActionPerformed(evt);
            }
        });

        quan2.setForeground(new java.awt.Color(51, 51, 51));
        quan2.setText("jLabel1");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quan2)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(quan2))
        );

        decpic3.setForeground(new java.awt.Color(51, 51, 51));
        decpic3.setText("-");
        decpic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpic3ActionPerformed(evt);
            }
        });

        incpic3.setForeground(new java.awt.Color(51, 51, 51));
        incpic3.setText("+");
        incpic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incpic3ActionPerformed(evt);
            }
        });

        quan3.setForeground(new java.awt.Color(51, 51, 51));
        quan3.setText("jLabel1");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quan3)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(quan3))
        );

        decpic4.setForeground(new java.awt.Color(51, 51, 51));
        decpic4.setText("-");
        decpic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpic4ActionPerformed(evt);
            }
        });

        quan4.setForeground(new java.awt.Color(51, 51, 51));
        quan4.setText("jLabel1");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quan4)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(quan4))
        );

        incpic4.setForeground(new java.awt.Color(51, 51, 51));
        incpic4.setText("+");
        incpic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incpic4ActionPerformed(evt);
            }
        });

        decpic5.setForeground(new java.awt.Color(51, 51, 51));
        decpic5.setText("-");
        decpic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpic5ActionPerformed(evt);
            }
        });

        quan6.setForeground(new java.awt.Color(51, 51, 51));
        quan6.setText("jLabel1");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quan6)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(quan6))
        );

        incpic5.setForeground(new java.awt.Color(51, 51, 51));
        incpic5.setText("+");
        incpic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incpic5ActionPerformed(evt);
            }
        });

        decpic6.setForeground(new java.awt.Color(51, 51, 51));
        decpic6.setText("-");
        decpic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpic6ActionPerformed(evt);
            }
        });

        incpic6.setForeground(new java.awt.Color(51, 51, 51));
        incpic6.setText("+");
        incpic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incpic6ActionPerformed(evt);
            }
        });

        quan5.setForeground(new java.awt.Color(51, 51, 51));
        quan5.setText("jLabel1");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quan5)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(quan5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(decpic1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(incpic1)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(pic4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(7, 7, 7)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(decpic4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(incpic4)))
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(decpic2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(decpic5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(incpic5)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(incpic2)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1393, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(444, 444, 444)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(680, 680, 680)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(decpic3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(incpic3))
                                            .addComponent(pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(decpic6)
                                            .addGap(2, 2, 2)
                                            .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(incpic6))
                                        .addComponent(pic6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(630, 630, 630)
                    .addComponent(pic5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1849, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decpic1)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incpic1)
                    .addComponent(decpic2)
                    .addComponent(incpic2)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incpic3)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decpic3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pic6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decpic4)
                            .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(incpic4)
                                .addComponent(decpic5))
                            .addComponent(decpic6)
                            .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incpic6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(incpic5))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(346, 346, 346)
                    .addComponent(pic5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2675, 879);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
        cart_interface crt;
        try {
            crt = new cart_interface();    crt.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(cart_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }//GEN-LAST:event_cartMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        selectbookstore sn = new selectbookstore();
        sn.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked
        Purchase pur = new Purchase();
        pur.setPaymentMethod("cash");
        cash_interface cash = new cash_interface ();
        cash.setVisible(true);
    }//GEN-LAST:event_totalMouseClicked
  public double price(int price, int count) {
         totPrice = price * count;
        return totPrice;
    }
    private void purchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseMouseClicked
       Purchase pur = new Purchase ();
       File ff= new File ("Purchase.txt");
       FileWriter fr;
        try {
            fr = new FileWriter (ff,true);   fr.write(setTotal.getText());
       pur.setAmount(Double.valueOf(setTotal.getText()));
     
       fr.close();
        checkout_interface f = new checkout_interface();
      f.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(cart_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_purchaseMouseClicked

    private void incpic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incpic1ActionPerformed
     count1++;
        quan1.setText(count1 + "");
         p1 = price(Integer.valueOf(b1[1]), count1);
       // price44.setText(p1 + " ");
        setTotal.setText(p1 + "");
        tot=p1;
        cart1.setTotal(p1);
   
    }//GEN-LAST:event_incpic1ActionPerformed

    private void decpic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpic1ActionPerformed
        count1--;
        quan1.setText(count1 + "");

         p1 = price(Integer.valueOf(b1[1]), count1);
        //price44.setText(p1 + " ");
        setTotal.setText(p1 + "");
        cart1.setTotal(p1);
        tot=p1;
    }//GEN-LAST:event_decpic1ActionPerformed

    private void decpic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpic2ActionPerformed
  count2--;
        quan2.setText(count2 + "");

         p1 = price(Integer.valueOf(b11[1]), count1);
       //price44.setText(p1 + "");
         p2 = price(Integer.valueOf(b22[1]), count2);
     //price2.setText(p2 + "");
     setTotal.setText((p1 + p2) + "");
        cart1.setTotal(p1+p2);      
        tot=p1+p2;
    }//GEN-LAST:event_decpic2ActionPerformed

    private void incpic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incpic2ActionPerformed
        count2++;
        quan2.setText(count2 + "");

         p1 = price(Integer.valueOf(b11[1]), count1);
      // price44.setText(p1 + "");
         p2 = price(Integer.valueOf(b22[1]), count2);
      // price2.setText(p2 + "");
       setTotal.setText((p1 + p2) + "");
        cart1.setTotal(p1+p2);
           tot=p1+p2;
    }//GEN-LAST:event_incpic2ActionPerformed

    private void incpic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incpic3ActionPerformed
 count3++;
        quan3.setText(count3 + "");

         p1 = price(Integer.valueOf(b[1]), count1);
      //  price44.setText(p1 + "");
         p2 = price(Integer.valueOf(bb[1]), count2);
      // price2.setText(p2 + "");
         p3 = price(Integer.valueOf(b33[1]), count3);
      // price3.setText(p3 + "");
       setTotal.setText((p1 + p2 + p3) + "");
        cart1.setTotal(p1+p2+p3);
           tot=p1+p2+p3;
    }//GEN-LAST:event_incpic3ActionPerformed

    private void decpic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpic3ActionPerformed
           count3--;
        quan3.setText(count3 + "");

         p1 = price(Integer.valueOf(b[1]), count1);
      //  price44.setText(p1 + "");
         p2 = price(Integer.valueOf(bb[1]), count2);
      //  price2.setText(p2 + "");
         p3 = price(Integer.valueOf(b33[1]), count3);
      //  price3.setText(p3 + "");
        setTotal.setText((p1 + p2 + p3) + "");
        cart1.setTotal(p1+p2+p3);
           tot=p1+p2+p3;
    }//GEN-LAST:event_decpic3ActionPerformed

    private void decpic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpic5ActionPerformed
   count5--;
        quan5.setText(count5 + "");
         p1 = price(Integer.valueOf(s0[1]), count1);
     //   price44.setText(p1 + "");
         p2 = price(Integer.valueOf(s1[1]), count2);
     //   price2.setText(p2 + "");
         p3 = price(Integer.valueOf(s2[1]), count3);
     //   price3.setText(p3 + "");
         p4 = price(Integer.valueOf(s3[1]), count4);
        //price5.setText(p4 + "");
         p5 = price(Integer.valueOf(s4[1]), count5);
     //   price6.setText(p5 + "");
        setTotal.setText((p1 + p2 + p3 + p4 + p5) + "");
        cart1.setTotal(p1+p2+p3+p4+p5);
           tot=p1+p2+p3+p4+p5;
    }//GEN-LAST:event_decpic5ActionPerformed

    private void incpic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incpic5ActionPerformed
           // increase 5
        count5++;
        quan5.setText(count5 + "");
         p1 = price(Integer.valueOf(s0[1]), count1);
       // price44.setText(p1 + "");
         p2 = price(Integer.valueOf(s1[1]), count2);
       // price2.setText(p2 + "");
         p3 = price(Integer.valueOf(s2[1]), count3);
       // price3.setText(p3 + "");
         p4 = price(Integer.valueOf(s3[1]), count4);
     //   price5.setText(p4 + "");
         p5 = price(Integer.valueOf(s4[1]), count5);
     //   price6.setText(p5 + "");
        setTotal.setText((p1 + p2 + p3 + p4 + p5) + "");
        cart1.setTotal(p1+p2+p3+p4+p5);   tot=p1+p2+p3+p4+p5;
    }//GEN-LAST:event_incpic5ActionPerformed

    private void decpic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpic6ActionPerformed
       // decrease 6
        count6--;
        quan6.setText(count6 + "");
         p1 = price(Integer.valueOf(n0[1]), count1);
       // price44.setText(p1 + "");
         p2 = price(Integer.valueOf(n1[1]), count2);
       // price2.setText(p2 + "");
         p3 = price(Integer.valueOf(n2[1]), count3);
     //   price3.setText(p3 + "");
         p4 = price(Integer.valueOf(n3[1]), count4);
       // price5.setText(p4 + "");
         p5 = price(Integer.valueOf(n4[1]), count5);
     //  price6.setText(p5 + "");
         p6 = price(Integer.valueOf(n5[1]), count6);
      //  price1.setText(p6 + "");
        setTotal.setText((p1 + p2 + p3 + p4 + p5 + p6) + "");
        cart1.setTotal(p1+p2+p3+p4+p5+p6);
           tot=p1+p2+p3+p4+p5+p6;
    }//GEN-LAST:event_decpic6ActionPerformed

    private void decpic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpic4ActionPerformed
       // decrese 4
        count4--;
        quan4.setText(count4 + "");
         p1 = price(Integer.valueOf(l[1]), count1);
     //   price44.setText(p1 + "");
         p2 = price(Integer.valueOf(l1[1]), count2);
       // price2.setText(p2 + "");
         p3 = price(Integer.valueOf(l2[1]), count3);
       // price3.setText(p3 + "");
         p4 = price(Integer.valueOf(l3[1]), count4);
   //     price5.setText(p4 + "");
        setTotal.setText((p1 + p2 + p3 + p4) + "");
        cart1.setTotal(p1+p2+p3+p4);
           tot=p1+p2+p3+p4;
    }//GEN-LAST:event_decpic4ActionPerformed

    private void incpic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incpic4ActionPerformed
      //increase 4
        count4++;
        quan4.setText(count4 + "");
         p1 = price(Integer.valueOf(l[1]), count1);
       // price44.setText(p1 + "");
         p2 = price(Integer.valueOf(l1[1]), count2);
       // price2.setText(p2 + "");
         p3 = price(Integer.valueOf(l2[1]), count3);
        //price3.setText(p3 + "");
         p4 = price(Integer.valueOf(l3[1]), count4);
       // price5.setText(p4 + "");
        setTotal.setText((p1 + p2 + p3 + p4) + "");
        cart1.setTotal(p1+p2+p3+p4);   tot=p1+p2+p3+p4;
    }//GEN-LAST:event_incpic4ActionPerformed

    private void incpic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incpic6ActionPerformed
         // increase 6
        count6++;
        quan6.setText(count6 + "");
         p1 = price(Integer.valueOf(n0[1]), count1);
        //price44.setText(p1 + "");
         p2 = price(Integer.valueOf(n1[1]), count2);
       // price2.setText(p2 + "");
         p3 = price(Integer.valueOf(n2[1]), count3);
      //  price3.setText(p3 + "");
         p4 = price(Integer.valueOf(n3[1]), count4);
       // price5.setText(p4 + "");
         p5 = price(Integer.valueOf(n4[1]), count5);
        //price6.setText(p5 + "");
         p6 = price(Integer.valueOf(n5[1]), count6);
        //price1.setText(p6 + "");
        setTotal.setText((p1 + p2 + p3 + p4 + p5 + p6) + "");
        cart1.setTotal(p1+p2+p3+p4+p5+p6);   tot=p1+p2+p3+p4+p5+p6;
    }//GEN-LAST:event_incpic6ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(cart_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cart_interface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(cart_interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cart;
    private javax.swing.JButton decpic1;
    private javax.swing.JButton decpic2;
    private javax.swing.JButton decpic3;
    private javax.swing.JButton decpic4;
    private javax.swing.JButton decpic5;
    private javax.swing.JButton decpic6;
    private javax.swing.JButton incpic1;
    private javax.swing.JButton incpic2;
    private javax.swing.JButton incpic3;
    private javax.swing.JButton incpic4;
    private javax.swing.JButton incpic5;
    private javax.swing.JButton incpic6;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel orders;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JPanel purchase;
    private javax.swing.JLabel quan1;
    private javax.swing.JLabel quan2;
    private javax.swing.JLabel quan3;
    private javax.swing.JLabel quan4;
    private javax.swing.JLabel quan5;
    private javax.swing.JLabel quan6;
    private javax.swing.JLabel setTotal;
    private javax.swing.JPanel total;
    // End of variables declaration//GEN-END:variables
}
