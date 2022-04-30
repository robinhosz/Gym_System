package telas;

import DAO.Conexao;
import DAO.UsuarioDAO;
import functions.Usuario;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Tela_Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Buscar
     */
    public Tela_Buscar() {
        initComponents();
    }
    
    Usuario usuario = new Usuario();
    String CPF;
    String nome;
    String idade;
    String endereco;
    String telefone;
    Object modalidade;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        TextBusca = new javax.swing.JLabel();
        ContainerButtons = new javax.swing.JPanel();
        BtMenu = new javax.swing.JButton();
        TextDigiteOCPF = new javax.swing.JLabel();
        TextNome = new javax.swing.JLabel();
        TextIdade = new javax.swing.JLabel();
        TextEndereco = new javax.swing.JLabel();
        TextTelefone = new javax.swing.JLabel();
        TextModalidade = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldIdade = new javax.swing.JTextField();
        TextFieldEndereco = new javax.swing.JTextField();
        TextFieldTelefone = new javax.swing.JTextField();
        TextFieldModalidade = new javax.swing.JTextField();
        TextFieldCPF = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        BtLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextBusca.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TextBusca.setForeground(new java.awt.Color(0, 0, 0));
        TextBusca.setText("Academia | Busca de Cliente");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextBusca)
                .addGap(58, 58, 58))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TextBusca)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ContainerButtons.setBackground(new java.awt.Color(204, 204, 204));
        ContainerButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtMenu.setBackground(new java.awt.Color(255, 255, 255));
        BtMenu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtMenu.setForeground(new java.awt.Color(0, 0, 0));
        BtMenu.setText("Voltar ao Menu");
        BtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMenuActionPerformed(evt);
            }
        });

        TextDigiteOCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextDigiteOCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextDigiteOCPF.setText("Digite o CPF:");

        TextNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextNome.setForeground(new java.awt.Color(0, 0, 0));
        TextNome.setText("Nome:");

        TextIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextIdade.setForeground(new java.awt.Color(0, 0, 0));
        TextIdade.setText("Idade:");

        TextEndereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextEndereco.setForeground(new java.awt.Color(0, 0, 0));
        TextEndereco.setText("Endere�o:");

        TextTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextTelefone.setForeground(new java.awt.Color(0, 0, 0));
        TextTelefone.setText("Telefone:");

        TextModalidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextModalidade.setForeground(new java.awt.Color(0, 0, 0));
        TextModalidade.setText("Modalidade:");

        TextFieldNome.setEditable(false);
        TextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeActionPerformed(evt);
            }
        });

        TextFieldIdade.setEditable(false);
        TextFieldIdade.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldIdade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldIdade.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdadeActionPerformed(evt);
            }
        });

        TextFieldEndereco.setEditable(false);
        TextFieldEndereco.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldEndereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldEndereco.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEnderecoActionPerformed(evt);
            }
        });

        TextFieldTelefone.setEditable(false);
        TextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldTelefone.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTelefoneActionPerformed(evt);
            }
        });

        TextFieldModalidade.setEditable(false);
        TextFieldModalidade.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldModalidade.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldModalidade.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldModalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModalidadeActionPerformed(evt);
            }
        });

        TextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCPFActionPerformed(evt);
            }
        });

        BtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        BtLimpar.setBackground(new java.awt.Color(255, 255, 255));
        BtLimpar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtLimpar.setForeground(new java.awt.Color(0, 0, 0));
        BtLimpar.setText("Limpar");
        BtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerButtonsLayout = new javax.swing.GroupLayout(ContainerButtons);
        ContainerButtons.setLayout(ContainerButtonsLayout);
        ContainerButtonsLayout.setHorizontalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerButtonsLayout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(TextDigiteOCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(ContainerButtonsLayout.createSequentialGroup()
                        .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextNome)
                            .addComponent(TextEndereco)
                            .addComponent(TextTelefone)
                            .addComponent(TextIdade)
                            .addComponent(TextModalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextFieldModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContainerButtonsLayout.createSequentialGroup()
                        .addComponent(BtMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BtBuscar)
                        .addContainerGap())))
        );
        ContainerButtonsLayout.setVerticalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextDigiteOCPF)
                    .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextModalidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtMenu)
                    .addComponent(BtBuscar)
                    .addComponent(BtLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContainerButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContainerButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMenuActionPerformed
        // TODO add your handling code here:
        Tela_Menu tela_menu = new Tela_Menu();
        tela_menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtMenuActionPerformed

    private void TextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeActionPerformed

    private void TextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdadeActionPerformed

    private void TextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEnderecoActionPerformed

    private void TextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTelefoneActionPerformed

    private void TextFieldModalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldModalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldModalidadeActionPerformed

    private void TextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCPFActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        // TODO add your handling code here:
        CPF = TextFieldCPF.getText();
        
        if(CPF.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor digite um CPF!", "Academia", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = (Connection) Conexao.AbrirConexao();
            UsuarioDAO sql = new UsuarioDAO((java.sql.Connection) con);
            Usuario a = new Usuario();
            
            sql.Buscar_Usuario(CPF);
            
            TextFieldCPF.setText(CPF);
            TextFieldNome.setText(UsuarioDAO.nome);
            TextFieldIdade.setText(UsuarioDAO.idade);
            TextFieldEndereco.setText(UsuarioDAO.endereco);
            TextFieldTelefone.setText(UsuarioDAO.telefone);
            TextFieldModalidade.setText(UsuarioDAO.modalidade);
            
            Conexao.FecharConexao((java.sql.Connection) con);
        }
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimparActionPerformed
        // TODO add your handling code here:
        TextFieldCPF.setText("");
        TextFieldNome.setText("");
        TextFieldIdade.setText("");
        TextFieldEndereco.setText("");
        TextFieldTelefone.setText("");
        TextFieldModalidade.setText("");
    }//GEN-LAST:event_BtLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtLimpar;
    private javax.swing.JButton BtMenu;
    private javax.swing.JPanel ContainerButtons;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TextBusca;
    private javax.swing.JLabel TextDigiteOCPF;
    private javax.swing.JLabel TextEndereco;
    private javax.swing.JTextField TextFieldCPF;
    private javax.swing.JTextField TextFieldEndereco;
    private javax.swing.JTextField TextFieldIdade;
    private javax.swing.JTextField TextFieldModalidade;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldTelefone;
    private javax.swing.JLabel TextIdade;
    private javax.swing.JLabel TextModalidade;
    private javax.swing.JLabel TextNome;
    private javax.swing.JLabel TextTelefone;
    // End of variables declaration//GEN-END:variables
}
