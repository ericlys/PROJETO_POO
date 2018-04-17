/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ew.e_comerce.visao;

import com.ew.e_comerce.controle.UsuarioDaoArquivo;
import com.ew.e_comerce.modelo.Usuario;
import java.awt.Point;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.time.LocalDate;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Ericlys e Wanielton
 */
public class CadastroUsuario extends javax.swing.JFrame {

    private Point point;
    private Login parent;
    private UsuarioDaoArquivo userdao;

    /**
     * Creates new form CadastroUsuario
     */
    CadastroUsuario(Login aThis) {
        this.point = new Point();
        this.parent = aThis;
        initComponents();

        jRadioButton4.setSelected(true);
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);

        try {
            userdao = new UsuarioDaoArquivo();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao abrir arquivo");
        }

    }

    public CadastroUsuario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro\n");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(30, 60, 450, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro novo usuário");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 210, 50);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sobrenome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 130, 82, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 210, 44, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 90, 45, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 320, 34, 20);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 170, 40, 20);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirmar senha:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 250, 114, 20);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 170, 230, 20);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 90, 230, 20);

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 130, 230, 20);

        jButton1.setBackground(new java.awt.Color(52, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 390, 110, 30);

        jButton2.setBackground(new java.awt.Color(217, 81, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 390, 110, 30);

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(180, 210, 230, 20);

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(180, 250, 230, 20);

        jRadioButton4.setBackground(new java.awt.Color(0, 107, 139));
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Cliente");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(190, 320, 71, 28);

        jRadioButton5.setBackground(new java.awt.Color(0, 107, 139));
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Administrador");
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(280, 320, 122, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ew/e_comerce/imagens/login.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 470);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 460);

        setSize(new java.awt.Dimension(526, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Usuario u = montarObjeto();

        try {
            if (!"".equals(u.getNome()) && !"".equals(u.getEmail()) && !"".equals(u.getSobrenome()) && !"".equals(u.getSenha())) {
                if (userdao.salvar(u)) {
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Ja existe um usuario com esse email cadastrado");
                    vibrar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "preencha todos os campos.");
                vibrar();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao ler arquivo");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "classe não encontrada");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Senhas não conferem");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    private Usuario montarObjeto() {
        Usuario u = new Usuario();

        u.setNome(jTextField2.getText());

        u.setSobrenome(jTextField3.getText());

        u.setEmail(jTextField1.getText());

        String senha = new String(jPasswordField1.getPassword());

        String senha2 = new String(jPasswordField2.getPassword());

        if (senha.equals(senha2)) {
            u.setSenha(senha);
        } else {
            return null;
        }

        u.setDtCriação(LocalDate.now());

        if (jRadioButton4.isSelected()) {
            u.setPermissao(jRadioButton4.getText());
        } else if (jRadioButton5.isSelected()) {
            u.setPermissao(jRadioButton5.getText());
        }

        return u;
    }

    private void vibrar() {
        Point p = this.getLocation();
        CadastroUsuario cadastroUser = this;
        new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 6; i++) {
                        cadastroUser.setLocation(p.x - 10, p.y);
                        sleep(20);
                        cadastroUser.setLocation(p.x + 10, p.y);
                        sleep(20);
                    }
                    cadastroUser.setLocation(p.x, p.y);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

}
