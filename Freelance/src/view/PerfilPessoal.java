/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.ConnectionDb;
import controller.Persist;
import controller.Usuario;
import model.PerfilPessoalModel;
/**
 *
 * @author lucas
 */
public class PerfilPessoal extends javax.swing.JPanel {

    /**
     * Creates new form PerfilPessoal
     */
    
    private ConnectionDb cdb = new ConnectionDb();
    public PerfilPessoal() {
        initComponents();
        txtNome.setText(Persist.getPerfilModel().getNome());
        txtEmail.setText(Persist.getUser().getEmail());
        txtCEP.setText(Persist.getPerfilModel().getCep());
        txtCidade.setText(Persist.getPerfilModel().getCidade());
        
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboUF = new javax.swing.JComboBox<>();
        desbloquearToggleButton = new javax.swing.JToggleButton();
        descartarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();

        jLabel1.setText("Nome: ");

        txtNome.setEditable(false);
        txtNome.setPreferredSize(new java.awt.Dimension(90, 32));

        jLabel2.setText("Email:");

        txtEmail.setEditable(false);
        txtEmail.setPreferredSize(new java.awt.Dimension(90, 32));

        txtCEP.setEditable(false);
        txtCEP.setPreferredSize(new java.awt.Dimension(90, 32));

        jLabel3.setText("CEP:");

        txtCidade.setEditable(false);
        txtCidade.setPreferredSize(new java.awt.Dimension(90, 32));

        jLabel4.setText("Cidade:");

        jLabel5.setText("UF:");

        comboUF.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        comboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        comboUF.setMinimumSize(new java.awt.Dimension(60, 31));
        comboUF.setPreferredSize(new java.awt.Dimension(50, 32));

        desbloquearToggleButton.setText("Desbloquear");
        desbloquearToggleButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desbloquearToggleButtonItemStateChanged(evt);
            }
        });

        descartarButton.setText("Descartar alterações");
        descartarButton.setEnabled(false);

        salvarButton.setText("Salvar");
        salvarButton.setEnabled(false);
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(desbloquearToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descartarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descartarButton)
                    .addComponent(salvarButton)
                    .addComponent(desbloquearToggleButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void desbloquearToggleButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desbloquearToggleButtonItemStateChanged
        if(desbloquearToggleButton.isSelected()) {
            desbloquearToggleButton.setText("Bloquear");
            descartarButton.setEnabled(true);
            salvarButton.setEnabled(true);
            comboUF.setEnabled(true);
            txtCEP.setEnabled(true);
            txtCEP.setEditable(true);
            txtCidade.setEditable(true);
            txtNome.setEditable(true);
        } else {
            desbloquearToggleButton.setText("Desbloquear");
            descartarButton.setEnabled(false);
            salvarButton.setEnabled(false);
            comboUF.setEnabled(false);
            txtCEP.setEditable(false);
            txtCidade.setEditable(false);
            txtNome.setEditable(false);
        }
    }//GEN-LAST:event_desbloquearToggleButtonItemStateChanged

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        desbloquearToggleButton.setSelected(false);
        PerfilPessoalModel ppm = new PerfilPessoalModel();
        Persist.getPerfilModel().setNome(txtNome.getText());
        Persist.getPerfilModel().setCep(txtCEP.getText());
        Persist.getPerfilModel().setCidade(txtCidade.getText());
        Persist.getPerfilModel().setEstado(comboUF.getSelectedItem().toString());
        ppm.updatePerfilPessoal();
    }//GEN-LAST:event_salvarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboUF;
    private javax.swing.JToggleButton desbloquearToggleButton;
    private javax.swing.JButton descartarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
