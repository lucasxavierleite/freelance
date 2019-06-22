
package view;

import controller.EmpresaController;
import controller.NotificacaoController;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import controller.Persist;
import controller.ServicoController;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import model.ConnectionDb;
import model.EmpresaModel;
import model.NotificacaoModel;
import model.ServicoModel;
import model.UsuarioModel;



/**
 * Classe de manejamento do painel principal do programa
 * @author lucas
 */
public class Freelance extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    
    public Freelance() {
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

        tabbedPane = new javax.swing.JTabbedPane();
        perfilSplitPane = new javax.swing.JSplitPane();
        perfilMenuPanel = new javax.swing.JPanel();
        perfilMenuList = new javax.swing.JList<>();
        menuSelecaoScrollPane = new javax.swing.JScrollPane();
        notificacoesScrollPane = new javax.swing.JScrollPane();
        notificacoesPanel = new javax.swing.JPanel();
        empresasPanel = new javax.swing.JPanel();
        empresasFiltrosPanel = new javax.swing.JPanel();
        empresasBarraBuscaTextField = new javax.swing.JTextField();
        empresasBarraBuscaButton = new javax.swing.JButton();
        empresasValorLabel = new javax.swing.JLabel();
        empresasValorSlider = new javax.swing.JSlider();
        empresasDistanciaLabel = new javax.swing.JLabel();
        empresasDistanciaSlider = new javax.swing.JSlider();
        empresasCategoriaComboBox = new javax.swing.JComboBox<>();
        empresasCategoriaLabel = new javax.swing.JLabel();
        empresasMaisButton = new javax.swing.JButton();
        empresasAplicarButton = new javax.swing.JButton();
        empresasOrdenacaoLabel = new javax.swing.JLabel();
        empresasOrdenacaoComboBox = new javax.swing.JComboBox<>();
        empresasScrollPane = new javax.swing.JScrollPane();
        empresasTree = new javax.swing.JTree();
        servicosPanel = new javax.swing.JPanel();
        servicosFiltrosPanel = new javax.swing.JPanel();
        servicosBarraBuscaTextField = new javax.swing.JTextField();
        servicosBarraBuscaButton = new javax.swing.JButton();
        servicosValorLabel = new javax.swing.JLabel();
        servicosValorSlider = new javax.swing.JSlider();
        servicosDistanciaLabel = new javax.swing.JLabel();
        servicosDistanciaSlider = new javax.swing.JSlider();
        servicosCategoriaComboBox = new javax.swing.JComboBox<>();
        servicosCategoriaLabel = new javax.swing.JLabel();
        servicosEntregaLabel = new javax.swing.JLabel();
        servicosEntregaTextField = new javax.swing.JTextField();
        servicosPresencaCheckBox = new javax.swing.JCheckBox();
        servicosTransporteCheckBox = new javax.swing.JCheckBox();
        servicosMaisButton = new javax.swing.JButton();
        servicosAplicarButton = new javax.swing.JButton();
        servicosOrdenacaoLabel = new javax.swing.JLabel();
        servicosOrdenacaoComboBox = new javax.swing.JComboBox<>();
        servicosScrollPane = new javax.swing.JScrollPane();
        servicosTree = new javax.swing.JTree();
        btnCriaServico = new javax.swing.JButton();
        matchPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        opcoesMenu = new javax.swing.JMenu();
        preferenciasMenuItem = new javax.swing.JMenuItem();
        sairMenuItem = new javax.swing.JMenuItem();
        ajudaMenu = new javax.swing.JMenu();
        ajudaMenuItem = new javax.swing.JMenuItem();
        sobreMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Freelance");
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabbedPane.setPreferredSize(new java.awt.Dimension(860, 600));

        perfilSplitPane.setDividerLocation(150);

        perfilMenuPanel.setLayout(new java.awt.GridLayout(1, 0));

        perfilMenuList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pessoal", "Profissional", "Preferências", "Favoritos", "Histórico" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        perfilMenuList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        perfilMenuList.setRequestFocusEnabled(false);
        perfilMenuList.setSelectedIndices(new int[] {-1});
        perfilMenuList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                perfilMenuListValueChanged(evt);
            }
        });
        perfilMenuPanel.add(perfilMenuList);

        perfilSplitPane.setLeftComponent(perfilMenuPanel);
        perfilSplitPane.setRightComponent(menuSelecaoScrollPane);

        tabbedPane.addTab("Perfil", perfilSplitPane);

        notificacoesPanel.setLayout(new javax.swing.BoxLayout(notificacoesPanel, javax.swing.BoxLayout.PAGE_AXIS));
        notificacoesScrollPane.setViewportView(notificacoesPanel);

        tabbedPane.addTab("Notificações", notificacoesScrollPane);

        empresasBarraBuscaButton.setText("Buscar");

        empresasValorLabel.setText("Valor médio");

        empresasValorSlider.setName(""); // NOI18N

        empresasDistanciaLabel.setText("Distância");

        empresasDistanciaSlider.setName(""); // NOI18N

        empresasCategoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        empresasCategoriaLabel.setText("Área de atuação");

        empresasMaisButton.setText("Mais >");
        empresasMaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresasMaisButtonActionPerformed(evt);
            }
        });

        empresasAplicarButton.setText("Aplicar");
        empresasAplicarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresasAplicarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empresasFiltrosPanelLayout = new javax.swing.GroupLayout(empresasFiltrosPanel);
        empresasFiltrosPanel.setLayout(empresasFiltrosPanelLayout);
        empresasFiltrosPanelLayout.setHorizontalGroup(
            empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empresasFiltrosPanelLayout.createSequentialGroup()
                .addComponent(empresasBarraBuscaTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empresasBarraBuscaButton))
            .addGroup(empresasFiltrosPanelLayout.createSequentialGroup()
                .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empresasValorLabel)
                    .addComponent(empresasValorSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empresasDistanciaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresasDistanciaLabel))
                .addGap(18, 18, 18)
                .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empresasCategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresasCategoriaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(empresasMaisButton)
                .addGap(18, 18, 18)
                .addComponent(empresasAplicarButton))
        );
        empresasFiltrosPanelLayout.setVerticalGroup(
            empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empresasFiltrosPanelLayout.createSequentialGroup()
                .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empresasBarraBuscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresasBarraBuscaButton))
                .addGap(33, 33, 33)
                .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(empresasFiltrosPanelLayout.createSequentialGroup()
                        .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empresasDistanciaLabel)
                            .addComponent(empresasValorLabel)
                            .addComponent(empresasCategoriaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empresasValorSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empresasDistanciaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empresasFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empresasCategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empresasMaisButton)
                        .addComponent(empresasAplicarButton)))
                .addContainerGap())
        );

        empresasOrdenacaoLabel.setText("Ordenar por");

        empresasOrdenacaoComboBox.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        empresasOrdenacaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        empresasTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        empresasTree.setLargeModel(true);
        empresasTree.setRootVisible(false);
        empresasTree.setToggleClickCount(1);
        empresasTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empresasTreeMousePressed(evt);
            }
        });
        empresasScrollPane.setViewportView(empresasTree);

        javax.swing.GroupLayout empresasPanelLayout = new javax.swing.GroupLayout(empresasPanel);
        empresasPanel.setLayout(empresasPanelLayout);
        empresasPanelLayout.setHorizontalGroup(
            empresasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empresasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empresasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empresasScrollPane)
                    .addComponent(empresasFiltrosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empresasPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(empresasOrdenacaoLabel)
                        .addGap(3, 3, 3)
                        .addComponent(empresasOrdenacaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        empresasPanelLayout.setVerticalGroup(
            empresasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empresasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empresasFiltrosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(empresasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empresasOrdenacaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empresasOrdenacaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empresasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane.addTab("Empresas", empresasPanel);

        servicosBarraBuscaButton.setText("Buscar");

        servicosValorLabel.setText("Valor");

        servicosValorSlider.setName(""); // NOI18N

        servicosDistanciaLabel.setText("Distância");

        servicosDistanciaSlider.setName(""); // NOI18N

        servicosCategoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        servicosCategoriaLabel.setText("Categoria");

        servicosEntregaLabel.setText("Entrega");

        servicosPresencaCheckBox.setText("Presença");
        servicosPresencaCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servicosPresencaCheckBoxItemStateChanged(evt);
            }
        });

        servicosTransporteCheckBox.setText("Transporte");
        servicosTransporteCheckBox.setEnabled(false);

        servicosMaisButton.setText("Mais >");
        servicosMaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosMaisButtonActionPerformed(evt);
            }
        });

        servicosAplicarButton.setText("Aplicar");
        servicosAplicarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosAplicarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout servicosFiltrosPanelLayout = new javax.swing.GroupLayout(servicosFiltrosPanel);
        servicosFiltrosPanel.setLayout(servicosFiltrosPanelLayout);
        servicosFiltrosPanelLayout.setHorizontalGroup(
            servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                .addComponent(servicosBarraBuscaTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicosBarraBuscaButton))
            .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosValorLabel)
                    .addComponent(servicosValorSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosDistanciaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicosDistanciaLabel))
                .addGap(18, 18, 18)
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosCategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicosCategoriaLabel))
                .addGap(18, 18, 18)
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosEntregaLabel)
                    .addComponent(servicosEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(servicosTransporteCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(servicosMaisButton)
                        .addGap(18, 18, 18)
                        .addComponent(servicosAplicarButton))
                    .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(servicosPresencaCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        servicosFiltrosPanelLayout.setVerticalGroup(
            servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicosBarraBuscaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicosBarraBuscaButton))
                .addGap(33, 33, 33)
                .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                        .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(servicosDistanciaLabel)
                            .addComponent(servicosValorLabel)
                            .addComponent(servicosCategoriaLabel)
                            .addComponent(servicosEntregaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(servicosValorSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servicosDistanciaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(servicosFiltrosPanelLayout.createSequentialGroup()
                        .addComponent(servicosPresencaCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(servicosFiltrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(servicosCategoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servicosEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(servicosTransporteCheckBox)
                            .addComponent(servicosMaisButton)
                            .addComponent(servicosAplicarButton))))
                .addContainerGap())
        );

        servicosOrdenacaoLabel.setText("Ordenar por");

        servicosOrdenacaoComboBox.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        servicosOrdenacaoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        servicosTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        servicosTree.setLargeModel(true);
        servicosTree.setRootVisible(false);
        servicosTree.setToggleClickCount(1);
        servicosTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                servicosTreeMousePressed(evt);
            }
        });
        servicosScrollPane.setViewportView(servicosTree);

        btnCriaServico.setText("Criar Serviço");
        btnCriaServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriaServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout servicosPanelLayout = new javax.swing.GroupLayout(servicosPanel);
        servicosPanel.setLayout(servicosPanelLayout);
        servicosPanelLayout.setHorizontalGroup(
            servicosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servicosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosScrollPane)
                    .addComponent(servicosFiltrosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicosPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(servicosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicosPanelLayout.createSequentialGroup()
                                .addComponent(servicosOrdenacaoLabel)
                                .addGap(3, 3, 3)
                                .addComponent(servicosOrdenacaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCriaServico, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        servicosPanelLayout.setVerticalGroup(
            servicosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicosFiltrosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCriaServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(servicosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosOrdenacaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(servicosOrdenacaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(servicosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbedPane.addTab("Serviços", servicosPanel);

        tituloLabel.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tituloLabel.setText("Nós podemos encontrar o serviço ideal para você");

        jButton1.setText("Tentar match");

        javax.swing.GroupLayout matchPanelLayout = new javax.swing.GroupLayout(matchPanel);
        matchPanel.setLayout(matchPanelLayout);
        matchPanelLayout.setHorizontalGroup(
            matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchPanelLayout.createSequentialGroup()
                .addGroup(matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(matchPanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(tituloLabel))
                    .addGroup(matchPanelLayout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jButton1)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        matchPanelLayout.setVerticalGroup(
            matchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(matchPanelLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addGap(201, 201, 201))
        );

        tabbedPane.addTab("Match", matchPanel);

        opcoesMenu.setText("Opções");

        preferenciasMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        preferenciasMenuItem.setText("Preferências");
        opcoesMenu.add(preferenciasMenuItem);

        sairMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        sairMenuItem.setText("Sair");
        opcoesMenu.add(sairMenuItem);

        menuBar.add(opcoesMenu);

        ajudaMenu.setText("Ajuda");

        ajudaMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        ajudaMenuItem.setText("Ajuda");
        ajudaMenu.add(ajudaMenuItem);

        sobreMenuItem.setText("Sobre");
        ajudaMenu.add(sobreMenuItem);

        menuBar.add(ajudaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void servicosMaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosMaisButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicosMaisButtonActionPerformed

    private void servicosAplicarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosAplicarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicosAplicarButtonActionPerformed

    private void servicosPresencaCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servicosPresencaCheckBoxItemStateChanged
        servicosTransporteCheckBox.setEnabled(servicosPresencaCheckBox.isSelected());
    }//GEN-LAST:event_servicosPresencaCheckBoxItemStateChanged

    private void perfilMenuListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_perfilMenuListValueChanged
        //Troca de painel de acordo com o que foi selecionado no menu
        switch (perfilMenuList.getSelectedValue()) {
            case "Pessoal":
                menuSelecaoScrollPane.getViewport().add(new PerfilPessoal());
                break;
            case "Profissional":
                menuSelecaoScrollPane.getViewport().add(new PerfilProfissional());
                break;
        }
    }//GEN-LAST:event_perfilMenuListValueChanged

    private void empresasAplicarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresasAplicarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresasAplicarButtonActionPerformed

    private void empresasMaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresasMaisButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresasMaisButtonActionPerformed

    private void empresasTreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empresasTreeMousePressed
        //Evento abre tela da empresa de acordo com o que foi selecionado na árvore de empresas
        int linha = empresasTree.getRowForLocation(evt.getX(), evt.getY());
        TreePath caminho = empresasTree.getPathForLocation(evt.getX(), evt.getY());
        if(linha != -1 && evt.getClickCount() == 2) {
            String[] selPathSplit = caminho.toString().split(",");
            int nivel = selPathSplit.length - 1;
            String empresaNome = selPathSplit[nivel].trim().replace("]", "");
            if(nivel == 2)
                JOptionPane.showMessageDialog(this, "Abrir pop-up da empresa " + empresaNome);
         }
    }//GEN-LAST:event_empresasTreeMousePressed

    private void servicosTreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicosTreeMousePressed
        //Evento abre tela de serviços de acordo com o que foi selecionado na árvore de serviços
        int linha = servicosTree.getRowForLocation(evt.getX(), evt.getY());
        TreePath caminho = servicosTree.getPathForLocation(evt.getX(), evt.getY());
        if(linha != -1 && evt.getClickCount() == 2) {
            String[] selPathSplit = caminho.toString().split(",");
            int nivel = selPathSplit.length - 1;
            String servicoTitulo = selPathSplit[nivel].trim().replace("]", "");
            if(nivel == 2){
                //ServicoFrame sf = new ServicoFrame(Persist.get);
            }
                
        }
    }//GEN-LAST:event_servicosTreeMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*
            Popula árvores de serviço e empresas e aba de notificações
        */
        
        perfilMenuList.setSelectedIndex(0);

        notificacoesPanel.removeAll();
        notificacoesPanel.revalidate();
        notificacoesPanel.repaint();
               
        ConnectionDb cdb = new ConnectionDb();
        
        UsuarioModel um = new UsuarioModel(cdb);
        um.populateUsuarios(2);
        
        EmpresaModel em = new EmpresaModel(cdb);
        em.populateEmpresas();
        
        ServicoModel sm = new ServicoModel(cdb);
        sm.populateServicos();
        
        carregarArvore(servicosTree, Persist.getListEmpresas());
        carregarArvore(empresasTree, Persist.getListUsuarios());
        carregarNotificacoes();
        expandirArvore(servicosTree);
        expandirArvore(empresasTree);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCriaServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriaServicoActionPerformed
        //Abre a tela de criar conta
        CriarServico cs = new CriarServico();
        this.setVisible(false);
        cs.setVisible(true);
    }//GEN-LAST:event_btnCriaServicoActionPerformed

    private void carregarNotificacoes() {
        //Carrega notificações carregadas na classe de persistência
        NotificacaoModel nm = new NotificacaoModel();
        nm.populateNotificacoes();
        if(!Persist.getListNotificacao().isEmpty()){
            for(NotificacaoController nc : Persist.getListNotificacao()){
                Notificacao n = new Notificacao(nc.getServicoController(), nc.getEmailRemetente(), nc);
                n.setId(nc.getServicoController().getId());
                n.setServico(new ServicoFrame(nc.getServicoController()));
                notificacoesPanel.add(n.getContentPane());
            }
            
        }else
            notificacoesPanel.add(new JLabel("Você não tem novas notificações"));


    }
    
    private void expandirArvore(JTree arvore) {
        for (int i = 0; i < arvore.getRowCount(); i++) {
            arvore.expandRow(i);
        }
    }
    
    /**
     * Carrega árvore selecionada de acordo com o tipo de elemento da lista
     * @param arvore árvore a ser populada
     * @param grupos Lista de objetos a serem carregados na árvore
     */
    private void carregarArvore(JTree arvore, List grupos) {
        DefaultTreeModel model = (DefaultTreeModel) arvore.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) arvore.getModel().getRoot();
               
        for(Object grupo : grupos) {
            DefaultMutableTreeNode noPai = null;
            
            if(grupo instanceof controller.EmpresaController) {
                EmpresaController empresa = (EmpresaController) grupo;
                noPai = new DefaultMutableTreeNode(empresa.getUsuario().getPerfil().getNome());                    
                root.add(noPai);
                for(Object dado : empresa.getListServicos()){
                    DefaultMutableTreeNode noFilho = null;

                    if(dado instanceof ServicoController) {
                        ServicoController servico = (ServicoController) dado;
                        noFilho = new DefaultMutableTreeNode(servico.getEmpresa());
                    }

                    noPai.add(noFilho);
                }
            }
        }
        
        model.reload(root);
        //arvore.setModel(model);
    }
    
    public static void main(String[] args) {
        
        
        new Freelance().setVisible(true);   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMenu;
    private javax.swing.JMenuItem ajudaMenuItem;
    private javax.swing.JButton btnCriaServico;
    private javax.swing.JButton empresasAplicarButton;
    private javax.swing.JButton empresasBarraBuscaButton;
    private javax.swing.JTextField empresasBarraBuscaTextField;
    private javax.swing.JComboBox<String> empresasCategoriaComboBox;
    private javax.swing.JLabel empresasCategoriaLabel;
    private javax.swing.JLabel empresasDistanciaLabel;
    private javax.swing.JSlider empresasDistanciaSlider;
    private javax.swing.JPanel empresasFiltrosPanel;
    private javax.swing.JButton empresasMaisButton;
    private javax.swing.JComboBox<String> empresasOrdenacaoComboBox;
    private javax.swing.JLabel empresasOrdenacaoLabel;
    private javax.swing.JPanel empresasPanel;
    private javax.swing.JScrollPane empresasScrollPane;
    private javax.swing.JTree empresasTree;
    private javax.swing.JLabel empresasValorLabel;
    private javax.swing.JSlider empresasValorSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel matchPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane menuSelecaoScrollPane;
    private javax.swing.JPanel notificacoesPanel;
    private javax.swing.JScrollPane notificacoesScrollPane;
    private javax.swing.JMenu opcoesMenu;
    private javax.swing.JList<String> perfilMenuList;
    private javax.swing.JPanel perfilMenuPanel;
    private javax.swing.JSplitPane perfilSplitPane;
    private javax.swing.JMenuItem preferenciasMenuItem;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JButton servicosAplicarButton;
    private javax.swing.JButton servicosBarraBuscaButton;
    private javax.swing.JTextField servicosBarraBuscaTextField;
    private javax.swing.JComboBox<String> servicosCategoriaComboBox;
    private javax.swing.JLabel servicosCategoriaLabel;
    private javax.swing.JLabel servicosDistanciaLabel;
    private javax.swing.JSlider servicosDistanciaSlider;
    private javax.swing.JLabel servicosEntregaLabel;
    private javax.swing.JTextField servicosEntregaTextField;
    private javax.swing.JPanel servicosFiltrosPanel;
    private javax.swing.JButton servicosMaisButton;
    private javax.swing.JComboBox<String> servicosOrdenacaoComboBox;
    private javax.swing.JLabel servicosOrdenacaoLabel;
    private javax.swing.JPanel servicosPanel;
    private javax.swing.JCheckBox servicosPresencaCheckBox;
    private javax.swing.JScrollPane servicosScrollPane;
    private javax.swing.JCheckBox servicosTransporteCheckBox;
    private javax.swing.JTree servicosTree;
    private javax.swing.JLabel servicosValorLabel;
    private javax.swing.JSlider servicosValorSlider;
    private javax.swing.JMenuItem sobreMenuItem;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
