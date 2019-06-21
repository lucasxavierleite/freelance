/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author lucas
 */
public class Notificacao extends javax.swing.JFrame {

    /**
     * Creates new form Notificacao
     */
    public Notificacao() {
        initComponents();
        
        getContentPane().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                getContentPane().setBackground(Color.lightGray);
//                getContentPane().setBackground(new Color(0, 0, 0, 130));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                getContentPane().setBackground(null);
            }
            
        });
        
        for(Component c : getContentPane().getComponents()) {
            if(c instanceof JScrollPane)
                c = ((JScrollPane) c).getViewport().getComponents()[0];
            
            c.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    getContentPane().setBackground(Color.lightGray);
    //                getContentPane().setBackground(new Color(0, 0, 0, 130));
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    getContentPane().setBackground(null);
                }

            });
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

        tituloLabel = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        distanciaLabel = new javax.swing.JLabel();
        categoriasLabel = new javax.swing.JLabel();
        entregaLabel = new javax.swing.JLabel();
        presencaCheckBox = new javax.swing.JCheckBox();
        transporteCheckBox = new javax.swing.JCheckBox();
        descricaoScrollPane = new javax.swing.JScrollPane();
        descricaoTextArea = new javax.swing.JTextArea();
        descartarButton = new javax.swing.JButton();
        contatarButton = new javax.swing.JButton();
        aceitarButton = new javax.swing.JButton();
        maisButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tituloLabel.setText("Empresa 1: Sistema de recomendação");

        valorLabel.setText("Valor: R$ 8.260,00");

        distanciaLabel.setText("Distância: 48,4 km");

        categoriasLabel.setText("Categorias: Computação, Desenvolvimento Web, Sistemas de recomendação");

        entregaLabel.setText("Entrega: 30/11/2019");

        presencaCheckBox.setText("Presença");
        presencaCheckBox.setEnabled(false);

        transporteCheckBox.setText("Transporte");
        transporteCheckBox.setEnabled(false);

        descricaoTextArea.setEditable(false);
        descricaoTextArea.setColumns(20);
        descricaoTextArea.setRows(5);
        descricaoScrollPane.setViewportView(descricaoTextArea);

        descartarButton.setText("Descartar");

        contatarButton.setText("Contatar empresa");

        aceitarButton.setText("Aceitar");

        maisButton.setText("Ver mais >");
        maisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valorLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(categoriasLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(distanciaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(entregaLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(transporteCheckBox))
                                    .addComponent(presencaCheckBox))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(descartarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contatarButton)
                        .addGap(4, 4, 4)
                        .addComponent(aceitarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maisButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorLabel)
                    .addComponent(categoriasLabel)
                    .addComponent(presencaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanciaLabel)
                    .addComponent(entregaLabel)
                    .addComponent(transporteCheckBox))
                .addGap(18, 18, 18)
                .addComponent(descricaoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descartarButton)
                    .addComponent(contatarButton)
                    .addComponent(aceitarButton)
                    .addComponent(maisButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Notificação visualizada
    }//GEN-LAST:event_formWindowClosed

    private void maisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisButtonActionPerformed
        servico.setVisible(true);
    }//GEN-LAST:event_maisButtonActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Freelance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Freelance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Freelance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Freelance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notificacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceitarButton;
    private javax.swing.JLabel categoriasLabel;
    private javax.swing.JButton contatarButton;
    private javax.swing.JButton descartarButton;
    private javax.swing.JScrollPane descricaoScrollPane;
    private javax.swing.JTextArea descricaoTextArea;
    private javax.swing.JLabel distanciaLabel;
    private javax.swing.JLabel entregaLabel;
    private javax.swing.JButton maisButton;
    private javax.swing.JCheckBox presencaCheckBox;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JCheckBox transporteCheckBox;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables

    public JLabel getCategoriasLabel() {
        return categoriasLabel;
    }

    public JLabel getDistanciaLabel() {
        return distanciaLabel;
    }

    public JLabel getEntregaLabel() {
        return entregaLabel;
    }

    public JTextArea getNotificacoesDescricaoTextArea() {
        return descricaoTextArea;
    }

    public JCheckBox getPresencaCheckBox() {
        return presencaCheckBox;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }

    public JCheckBox getTransporteCheckBox() {
        return transporteCheckBox;
    }

    public JLabel getValorLabel() {
        return valorLabel;
    }
    
    private int id;
    private ServicoFrame servico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServicoFrame getServico() {
        return servico;
    }

    public void setServico(ServicoFrame servico) {
        this.servico = servico;
    }
}
