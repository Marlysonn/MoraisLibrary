package viewFuncionario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Pessoa;
import model.dao.PessoaDAO;

public class LivroAdd extends javax.swing.JInternalFrame {

    public LivroAdd() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaAddLivro.getModel(); // FAZER ORDENAÇÃO NA TABELA
        tabelaAddLivro.setRowSorter(new TableRowSorter(modelo));
        readTabela();
    }
    
    public void readTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaAddLivro.getModel();
        modelo.setNumRows(0);
        PessoaDAO pdao = new PessoaDAO();
        
        for (Pessoa p: pdao.read()){
            
            modelo.addRow(new Object[]{
                p.getMatricula(),
                p.getPsw(),
                p.getFuncao()
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLivro = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditora = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaAddLivro = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Livros"));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("LIVRO");

        jLabel2.setText("AUTOR");

        jLabel3.setText("EDITORA");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabelaAddLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "SENHA", "FUNÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaAddLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAddLivroMouseClicked(evt);
            }
        });
        tabelaAddLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaAddLivroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaAddLivro);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addComponent(jScrollPane3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel1)
                            .addGap(464, 818, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(13, 13, 13)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(82, 82, 82)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar)
                        .addComponent(btnExcluir))
                    .addContainerGap(503, Short.MAX_VALUE)))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        DefaultTableModel dtmLivros = (DefaultTableModel)tabelaAddLivro.getModel();         //ADICIONAR ITENS NA TABELA
        Object[] dados = {txtLivro.getText(), txtAutor.getText(), txtEditora.getText()};
        dtmLivros.addRow(dados);
        readTabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //        System.out.println("Linha Selecionada"+tabelaLivros.getSelectedRow());    REMOVER LINHA SELECIONADA NA TABELA

        if (tabelaAddLivro.getSelectedRow() != -1){
        DefaultTableModel dtmLivros = (DefaultTableModel)tabelaAddLivro.getModel();
        dtmLivros.removeRow(tabelaAddLivro.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione Um Livro para Excluir ");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaAddLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAddLivroMouseClicked

        if (tabelaAddLivro.getSelectedRow() != -1){
            txtLivro.setText(tabelaAddLivro.getValueAt(tabelaAddLivro.getSelectedRow(), 0).toString());
            txtAutor.setText(tabelaAddLivro.getValueAt(tabelaAddLivro.getSelectedRow(), 1).toString());
            txtEditora.setText(tabelaAddLivro.getValueAt(tabelaAddLivro.getSelectedRow(), 2).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione Um Livro para Excluir ");
        }

    }//GEN-LAST:event_tabelaAddLivroMouseClicked

    private void tabelaAddLivroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaAddLivroKeyReleased
         if (tabelaAddLivro.getSelectedRow() != -1){                                        //EDITAR ITENS DA TABELA
            txtLivro.setText(tabelaAddLivro.getValueAt(tabelaAddLivro.getSelectedRow(), 0).toString());
            txtAutor.setText(tabelaAddLivro.getValueAt(tabelaAddLivro.getSelectedRow(), 1).toString());
            txtEditora.setText(tabelaAddLivro.getValueAt(tabelaAddLivro.getSelectedRow(), 2).toString());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione Um Livro para Editar ");
        }


    }//GEN-LAST:event_tabelaAddLivroKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        if (tabelaAddLivro.getSelectedRow() != -1){
           tabelaAddLivro.setValueAt(txtLivro.getText(), tabelaAddLivro.getSelectedRow(), 0);
           tabelaAddLivro.setValueAt(txtAutor.getText(), tabelaAddLivro.getSelectedRow(), 1);
           tabelaAddLivro.setValueAt(txtEditora.getText(), tabelaAddLivro.getSelectedRow(), 2);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione Um Livro para Editar ");
            
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaAddLivro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtLivro;
    // End of variables declaration//GEN-END:variables
}
