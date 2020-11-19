/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Deena
 */
public class order_Interface extends javax.swing.JFrame {
BufferedReader r=new BufferedReader(new FileReader("order.txt"));

    /**
     * Creates new form order
     * @throws java.io.FileNotFoundException
     * @throws java.text.ParseException
     */
    public order_Interface() throws FileNotFoundException, IOException, ParseException {
        initComponents();
        cart.setBackground(new Color(255, 255, 255, 100));
        jPanel5.setBackground(new Color(255, 255, 255, 0));
        jPanel5.setBackground(new Color(255, 255, 255, 0));
        jPanel7.setBackground(new Color(255, 255, 255, 0));
        jPanel8.setBackground(new Color(255, 255, 255, 0));
        jPanel6.setBackground(new Color(255, 255, 255, 0));
      
        order1.setForeground(new Color(51, 51, 51));
        orderstatus1.setForeground(new Color(51, 51, 51));
        orderdate1.setForeground(new Color(51, 51, 51));
        order2.setForeground(new Color(51, 51, 51));
        orderstatus2.setForeground(new Color(51, 51, 51));
        orderdate2.setForeground(new Color(51, 51, 51));
        order3.setForeground(new Color(51, 51, 51));
        orderstatus3.setForeground(new Color(51, 51, 51));
        orderdate3.setForeground(new Color(51, 51, 51));
        order4.setForeground(new Color(51, 51, 51));
        orderstatus4.setForeground(new Color(51, 51, 51));
        orderdate4.setForeground(new Color(51, 51, 51));
       
        orders.setBackground(new Color(255, 255, 255, 100));
        info.setBackground(new Color(255, 255, 255, 100));
        jdelete1.setForeground(new Color(51, 51, 51));
        jdelete2.setForeground(new Color(51, 51, 51));
        jdelete3.setForeground(new Color(51, 51, 51));
        jdelete4.setForeground(new Color(51, 51, 51));
     
        delete1.setBackground(new Color(255, 255, 255, 0));
        delete2.setBackground(new Color(255, 255, 255, 0));
        delete3.setBackground(new Color(255, 255, 255, 0));
        delete4.setBackground(new Color(255, 255, 255, 0));
        delete7.setBackground(new Color(255, 255, 255, 0));
        delete5.setBackground(new Color(255, 255, 255, 0));
        String order;

Order o=new Order();o.pointer=0;
while((order=r.readLine())!=null){
String[] s= order.split(",");
String dates=s[1];

if(o.pointer==0){
     jdelete1.setForeground(new Color(51,51,51));
                delete1.setBackground(new Color(255, 255, 204, 0));
      jPanel6.setBackground(new Color(255, 255, 255, 100));
       order1.setForeground(new Color(255,255,255));
          orderstatus1.setForeground(new Color(255,255,255));
              orderdate1.setForeground(new Color(255,255,255));
order1.setText("ORDER # "+s[0]);
orderstatus1.setText("order satuse: "+checkStatuse(dates)); 
orderdate1.setText("Date: "+s[1]);
jLabel1.setText("<html>PAYMENT METHOD:  "+s[4]+"<br/>"+" ORDER ID: "+s[2]+"<br/>" +"Total: "+s[3]+ "SR"+"<html>");
jLabel12.setText(s[2]);
o.pointer=1;

}
else if(o.pointer==1) {
           jdelete2.setForeground(new Color(51,51,51));
                delete7.setBackground(new Color(255, 255, 204, 0));
          jPanel5.setBackground(new Color(255, 255, 255, 100));
       order2.setForeground(new Color(255,255,255));
          orderstatus2.setForeground(new Color(255,255,255));
              orderdate2.setForeground(new Color(255,255,255));
order2.setText("ORDER #"+s[0]);
orderstatus2.setText("order satuse: "+checkStatuse(dates));
orderdate2.setText("Date: "+s[1]);
jLabel8.setText("<html>PAYMENT METHOD:  "+s[4]+"<br/>"+" ORDER ID: "+s[2]+"<br/>" +"Total: "+s[3]+ "SR"+"<html>");
o.pointer=2;
jLabel13.setText(s[2]);

}
else if(o.pointer==2){
     jdelete3.setForeground(new Color(51,51,51));
                delete4.setBackground(new Color(255, 255, 204, 0));
          jPanel7.setBackground(new Color(255, 255, 255, 100));
       order3.setForeground(new Color(255,255,255));
          orderstatus3.setForeground(new Color(255,255,255));
              orderdate3.setForeground(new Color(255,255,255));
order3.setText("ORDER # "+s[0]);
orderstatus3.setText("order satuse: "+checkStatuse(dates)); 
orderdate3.setText("Date: "+s[1]);
jLabel9.setText("<html>PAYMENT METHOD:  "+s[4]+"<br/>"+" ORDER ID: "+s[2]+"<br/>" +"Total: "+s[3]+ "SR"+"<html>");
o.pointer=3;
jLabel20.setText(s[2]);

}else if(o.pointer==3) {
     jdelete4.setForeground(new Color(51,51,51));
                delete5.setBackground(new Color(255, 255, 204, 0));
          jPanel8.setBackground(new Color(255, 255, 255, 100));
       order4.setForeground(new Color(255,255,255));
          orderstatus4.setForeground(new Color(255,255,255));
              orderdate4.setForeground(new Color(255,255,255));
order4.setText("ORDER #"+s[0]);
orderstatus4.setText("order satuse: "+checkStatuse(dates));
orderdate4.setText("Date: "+s[1]);
jLabel10.setText("<html>PAYMENT METHOD:  "+s[4]+"<br/>"+" ORDER ID: "+s[2]+"<br/>" +"Total: "+s[3]+ "SR"+"<html>");
o.pointer=4;
jLabel23.setText(s[2]);

}

}



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        delete3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        delete1 = new javax.swing.JPanel();
        jdelete1 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        order2 = new javax.swing.JLabel();
        orderstatus2 = new javax.swing.JLabel();
        orderdate2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        order1 = new javax.swing.JLabel();
        orderstatus1 = new javax.swing.JLabel();
        orderdate1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        order3 = new javax.swing.JLabel();
        orderstatus3 = new javax.swing.JLabel();
        orderdate3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        order4 = new javax.swing.JLabel();
        orderstatus4 = new javax.swing.JLabel();
        orderdate4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        delete4 = new javax.swing.JPanel();
        jdelete3 = new javax.swing.JLabel();
        delete5 = new javax.swing.JPanel();
        jdelete4 = new javax.swing.JLabel();
        delete7 = new javax.swing.JPanel();
        jdelete2 = new javax.swing.JLabel();

        delete2.setBackground(new java.awt.Color(255, 204, 153));
        delete2.setForeground(new java.awt.Color(255, 153, 51));
        delete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete2MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("AR JULIAN", 0, 24)); // NOI18N
        jLabel14.setText("Delete");

        delete3.setBackground(new java.awt.Color(255, 204, 153));
        delete3.setForeground(new java.awt.Color(255, 153, 51));
        delete3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete3MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("AR JULIAN", 0, 24)); // NOI18N
        jLabel15.setText("Delete");

        javax.swing.GroupLayout delete3Layout = new javax.swing.GroupLayout(delete3);
        delete3.setLayout(delete3Layout);
        delete3Layout.setHorizontalGroup(
            delete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        delete3Layout.setVerticalGroup(
            delete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout delete2Layout = new javax.swing.GroupLayout(delete2);
        delete2.setLayout(delete2Layout);
        delete2Layout.setHorizontalGroup(
            delete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(delete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(delete2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        delete2Layout.setVerticalGroup(
            delete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(delete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(delete2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(delete3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 22767));
        jPanel1.setPreferredSize(new java.awt.Dimension(1087, 960));

        delete1.setBackground(new java.awt.Color(255, 255, 204));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });

        jdelete1.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        jdelete1.setText("DELETE");

        javax.swing.GroupLayout delete1Layout = new javax.swing.GroupLayout(delete1);
        delete1.setLayout(delete1Layout);
        delete1Layout.setHorizontalGroup(
            delete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jdelete1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        delete1Layout.setVerticalGroup(
            delete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdelete1)
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        cart.setBackground(new java.awt.Color(255, 204, 102));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(98, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("AR JULIAN", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("orders");

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
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setForeground(new java.awt.Color(204, 255, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        order2.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        order2.setText("order");

        orderstatus2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderstatus2.setText("order status: ");

        orderdate2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderdate2.setText("Date: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(order2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderstatus2)
                .addGap(19, 19, 19)
                .addComponent(orderdate2))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 102));
        jPanel6.setForeground(new java.awt.Color(204, 255, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        order1.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        order1.setText("order ");

        orderstatus1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderstatus1.setText("order status: ");

        orderdate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderdate1.setText("Date");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderdate1)
                    .addComponent(order1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(order1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderstatus1)
                .addGap(18, 18, 18)
                .addComponent(orderdate1)
                .addGap(5, 5, 5))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));
        jPanel7.setForeground(new java.awt.Color(204, 255, 204));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        order3.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        order3.setText("order ");

        orderstatus3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderstatus3.setText("order status: ");

        orderdate3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderdate3.setText("Date: ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderdate3)
                    .addComponent(order3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderstatus3))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(order3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(orderstatus3)
                .addGap(18, 18, 18)
                .addComponent(orderdate3)
                .addGap(5, 5, 5))
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setForeground(new java.awt.Color(204, 255, 204));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        order4.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        order4.setText("order");

        orderstatus4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderstatus4.setText("order status: ");

        orderdate4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderdate4.setText("Date: ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderdate4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(order4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderstatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(order4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderstatus4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(orderdate4)
                .addGap(5, 5, 5))
        );

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("jLabel1");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("jLabel1");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("jLabel1");

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("jLabel1");

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("jLabel1");

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("jLabel12");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("jLabel12");

        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("jLabel12");

        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("jLabel12");

        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("jLabel12");

        delete4.setBackground(new java.awt.Color(255, 255, 204));
        delete4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete4MouseClicked(evt);
            }
        });

        jdelete3.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        jdelete3.setText("DELETE");

        javax.swing.GroupLayout delete4Layout = new javax.swing.GroupLayout(delete4);
        delete4.setLayout(delete4Layout);
        delete4Layout.setHorizontalGroup(
            delete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jdelete3)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        delete4Layout.setVerticalGroup(
            delete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdelete3)
                .addGap(23, 23, 23))
        );

        delete5.setBackground(new java.awt.Color(255, 255, 204));
        delete5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete5MouseClicked(evt);
            }
        });

        jdelete4.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        jdelete4.setText("DELETE");

        javax.swing.GroupLayout delete5Layout = new javax.swing.GroupLayout(delete5);
        delete5.setLayout(delete5Layout);
        delete5Layout.setHorizontalGroup(
            delete5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jdelete4)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        delete5Layout.setVerticalGroup(
            delete5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdelete4)
                .addGap(23, 23, 23))
        );

        delete7.setBackground(new java.awt.Color(255, 255, 204));
        delete7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete7MouseClicked(evt);
            }
        });

        jdelete2.setFont(new java.awt.Font("AR JULIAN", 0, 18)); // NOI18N
        jdelete2.setText("DELETE");

        javax.swing.GroupLayout delete7Layout = new javax.swing.GroupLayout(delete7);
        delete7.setLayout(delete7Layout);
        delete7Layout.setHorizontalGroup(
            delete7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jdelete2)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        delete7Layout.setVerticalGroup(
            delete7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdelete2)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(720, 720, 720)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23)
                                        .addGap(103, 103, 103))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(358, 358, 358)
                                                .addComponent(jLabel12))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel13))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delete7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(260, 260, 260)
                                                        .addComponent(jLabel7))))))
                                    .addComponent(delete4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(324, 324, 324)
                                        .addComponent(jLabel20))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(jLabel24)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel8))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(88, 88, 88)
                                            .addComponent(jLabel7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel1)
                                            .addGap(336, 336, 336)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delete7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(delete4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(9, 9, 9)
                                        .addComponent(delete5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel23)))
                                .addGap(3, 3, 3)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addGap(141, 141, 141))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        selectbookstore sn = new selectbookstore();
        sn.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
   
        // TODO add your handling code here:
        String Orderinfo=jLabel1.getText();
        new orderInfo(Orderinfo).setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void delete2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete2MouseClicked

    private void delete3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete3MouseClicked

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_delete1MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        String Orderinfo=jLabel10.getText();
        new orderInfo(Orderinfo).setVisible(true);
        // o.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        String Orderinfo=jLabel9.getText();
        new orderInfo(Orderinfo).setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        String Orderinfo=jLabel8.getText();
        new orderInfo(Orderinfo).setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void delete4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete4MouseClicked

    private void delete5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete5MouseClicked

    private void delete7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete7MouseClicked

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
            java.util.logging.Logger.getLogger(order_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new order_Interface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(order_Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(order_Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cart;
    private javax.swing.JPanel delete1;
    private javax.swing.JPanel delete2;
    private javax.swing.JPanel delete3;
    private javax.swing.JPanel delete4;
    private javax.swing.JPanel delete5;
    private javax.swing.JPanel delete7;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jdelete1;
    private javax.swing.JLabel jdelete2;
    private javax.swing.JLabel jdelete3;
    private javax.swing.JLabel jdelete4;
    private javax.swing.JLabel order1;
    private javax.swing.JLabel order2;
    private javax.swing.JLabel order3;
    private javax.swing.JLabel order4;
    private javax.swing.JLabel orderdate1;
    private javax.swing.JLabel orderdate2;
    private javax.swing.JLabel orderdate3;
    private javax.swing.JLabel orderdate4;
    private javax.swing.JPanel orders;
    private javax.swing.JLabel orderstatus1;
    private javax.swing.JLabel orderstatus2;
    private javax.swing.JLabel orderstatus3;
    private javax.swing.JLabel orderstatus4;
    // End of variables declaration//GEN-END:variables

    
public static String checkStatuse(String date){
Date today=new Date();
String[] a1=date.split(" ");
String[] a2=today.toString().split(" ");
int day1=Integer.parseInt(a1[3]);int day2=Integer.parseInt(a2[2]);
int diff=day1-day2;
if(diff<-1){
date="deliverd";
}
else date="in process";
    
    return date;
    }
    
}
