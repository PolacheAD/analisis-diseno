
import java.sql.ResultSet;
import libreria_sql.Libreria_sql;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuniorBenjmin
 */
public class registro extends javax.swing.JFrame {

    /**
     * Creates new form registro
     */
    public registro() {
        initComponents();
        con=new Libreria_sql();
        this.setLocationRelativeTo(null);
        contra.setEchoChar((char)0);
    contra_nuevamente.setEchoChar((char)0);
    }
    libreria_sql.Libreria_sql con;
    String update,accion,existe,aux,nombrefull;
    ResultSet ret;
    int diseno1=0,diseno2=0,diseno3=0,diseno4=0,diseno5=0,diseno6=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        contra_nuevamente = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 152, 224));
        jLabel3.setText("Reg??strate");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 152, 224));
        jLabel2.setText("Nombre");

        nombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombreMouseEntered(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 152, 224));
        jLabel4.setText("Apellido");

        apellido.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apellidoMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 152, 224));
        jLabel5.setText("Correo Electr??nico");

        correo.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                correoMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(81, 152, 224));
        jLabel6.setText("Nombre de Usuario");

        usuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuarioMouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(81, 152, 224));
        jLabel7.setText("Contrase??a");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(81, 152, 224));
        jLabel8.setText("Ingresa Nuevamente la contrase??a");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(81, 152, 224));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        contra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contra.setText("CONTRASE??A");
        contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contraMouseEntered(evt);
            }
        });

        contra_nuevamente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        contra_nuevamente.setText("INGRESE NUEVAMENTE LA CONTRASE??A");
        contra_nuevamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contra_nuevamenteMouseEntered(evt);
            }
        });

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(apellido)))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(correo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(contra_nuevamente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contra_nuevamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseEntered
        if(diseno3==0){
        correo.setText("");}
        diseno3++;
    }//GEN-LAST:event_correoMouseEntered

    private void nombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseEntered
       
         if(diseno1==0){
          nombre.setText("");
      
     }
       diseno1++;   
        
    }//GEN-LAST:event_nombreMouseEntered

    private void apellidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseEntered
        if(diseno2==0){
        apellido.setText("");}
        diseno2++;
    }//GEN-LAST:event_apellidoMouseEntered

    private void usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseEntered
        if(diseno4==0){
        usuario.setText("");}
         diseno4++;
    }//GEN-LAST:event_usuarioMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
     con.conectar();
      String contrase=String.valueOf(this.contra.getPassword());
      String contrase_repetir=String.valueOf(contra_nuevamente.getPassword());
     nombrefull=nombre.getText().trim()+" "+apellido.getText().trim();
     
       existe = "select * from catedratico where usuario = \"" +usuario.getText()+"\"";
      
       accion ="insert into catedratico (nombre_cated,usuario,pass,correo) values("
                    + "'"+nombrefull+"',"
                    + "'"+usuario.getText()+"',"
                    + "'"+contrase+"',"
                    + "'"+correo.getText()+"')";
       
       
       
          ret = con.seleccionar(existe);
        
        try {
            
            aux=ret.getString("usuario");
            
            if (aux==null) {
              
                
            
            }
                else{usuario.setText("USUARIO YA EXISTE");
            diseno4=0;
            }
            
           
        } catch (Exception e) {
           
          
          
           
              if (numero(contrase)) {
                    contra.setText("INGRESE NUEVAMENTE");
                    contra_nuevamente.setText("");
                    diseno5=0;
                }
                
                else{
               
                 if(contrase.equals(contrase_repetir)){
                 
                    if(nickname(usuario.getText())){usuario.setText("INGRESE NUEVAMENTE USUARIO");} 
                    else{
                   con.insertar(accion);
                   con.cerrar();
                   JOptionPane.showMessageDialog(null,"SE HA REGISTRADO SACTIFACTORIAMENTE ");
                   nombre.setText("");
                   apellido.setText("");
                   usuario.setText("");
                   contra.setText("");
                   contra_nuevamente.setText("");
                    }
                    
                 }
                 else{
                 
                 contra_nuevamente.setText("INGRESE NUEVAMENTE");
                 diseno6=0;
                 }
                  
                    
                
                }
           
            
        }
        
       
         
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
            if (jCheckBox1.isSelected()) {
      contra_nuevamente.setEchoChar((char)0); //password = JPasswordField
   } else {
     contra_nuevamente.setEchoChar('*');
   }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void contraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraMouseEntered
         if(diseno5==0){
          contra.setText("");
          contra.setEchoChar('*');
          jCheckBox1.setSelected(false);
     }
         diseno5++;
    }//GEN-LAST:event_contraMouseEntered

    private void contra_nuevamenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contra_nuevamenteMouseEntered
            if(diseno6==0){
          contra_nuevamente.setText("");
          contra_nuevamente.setEchoChar('*');
          jCheckBox2.setSelected(false);
     }
            diseno6++;
    }//GEN-LAST:event_contra_nuevamenteMouseEntered

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
      
             if (jCheckBox1.isSelected()) {
      contra.setEchoChar((char)0); //password = JPasswordField
   } else {
     contra.setEchoChar('*');
   }
        
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

      public boolean numero(String comparar){
    boolean bool =true;
    if(comparar.length()==0 || comparar.length()<7){}
    else{
       if(comparar.contains(" ")){}
       else{
        for (int i = 0; i <comparar.length(); i++) {
            
          if(Character.isDigit(comparar.charAt(i))){  
              bool=false;
              
          }
        }
    
       }
    }
    return bool;
    }
      
     public boolean nickname(String nick){
         
        
        
    boolean bool =true;
    if(nick.length()==0){}
    else{
       if(nick.contains(" ")){}
       else{
        
            
        
           bool=false;
       }
    }
    return bool;
    }   
    
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
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JPasswordField contra;
    private javax.swing.JPasswordField contra_nuevamente;
    private javax.swing.JTextField correo;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
