package analisador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

public class Interface extends javax.swing.JFrame {
    
    public JTextArea jText;
    
    public void execute() throws Exception {

        int count = 1;

        jText = jTextArea1;
        String aux;

        aux = (String)jText.getText();
        Lexico lexico = new Lexico(new StringReader(aux));
        
			
	String resultado="";

        while (true) {
            Token tokens = lexico.yylex();
            if (tokens == null) {

                jTextArea2.setText(resultado);

                return;
            }
            
            switch (tokens) {

                case LINHA:
                    count++;
                    break;
                
                case PALAVRA_RESERVADA:
                    resultado = resultado + "Linha: " + count + " PALAVRA_RESERVADA " + lexico.lexeme + "\n";
                    break;

                case ID:
                    resultado = resultado + "Linha: " + count + " IDENTIFICADOR " + lexico.lexeme + "\n";
                    break;

                case NUMERO_INTEIRO:
                    resultado = resultado + "Linha: " + count + " NUMERO_INTEIRO " + lexico.lexeme + "\n";
                    break;

                case NUMERO_REAL:
                    resultado = resultado + "Linha: " + count + " NUMERO_REAL " + lexico.lexeme + "\n";
                    break;

                case DELIMITADORES:
                    resultado = resultado + "Linha: " + count + " DELIMITADORES " + lexico.lexeme + "\n";
                    break;

                case ATRIBUICAO:
                    resultado = resultado + "Linha: " + count + " ATRIBUICAO " + lexico.lexeme + "\n";
                    break;

                case RELACIONAL:
                    resultado = resultado + "Linha: " + count + " RELACIONAL " + lexico.lexeme + "\n";
                    break;

                case ADITIVO:
                    resultado = resultado + "Linha: " + count + " ADITIVO " + lexico.lexeme + "\n";
                    break;

                case MULTIPLICATIVO:
                    resultado = resultado + "Linha: " + count + " MULTIPLICATIVO " + lexico.lexeme + "\n";
                    break;

                case ERROR:
                    resultado = resultado + "erro na Linha: " + count + " simbolo não pertece a linguagem \n";
                    break;

                default:
                    resultado = resultado + "Linha: " + count + "<" + lexico.lexeme + ">" + count++;
                    break; 
            }
        }
}

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Analisar = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        AnaliseSintatica = new javax.swing.JButton();
        AbrirArquivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Analisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Analisar.setText("Analisar");
        Analisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalisarActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextPane1.setText("Análise Sintática");
        jScrollPane3.setViewportView(jTextPane1);

        jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextPane2.setText("Análise Léxica");
        jScrollPane4.setViewportView(jTextPane2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane5.setViewportView(jTextArea3);

        AnaliseSintatica.setText("Analisar");
        AnaliseSintatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaliseSintaticaActionPerformed(evt);
            }
        });

        AbrirArquivo.setText("Arquivo");
        AbrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(AbrirArquivo)
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Analisar)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(Limpar)))
                            .addComponent(jScrollPane5))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnaliseSintatica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AbrirArquivo)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Analisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(AnaliseSintatica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnalisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalisarActionPerformed
        try {
            execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AnalisarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void AnaliseSintaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaliseSintaticaActionPerformed
        String st = jTextArea1.getText();
        Parser s = new Parser(new analisador.LexicoCup(new StringReader(st)));

        try {
            s.parse();
            jTextArea3.setText("sem erro sintático");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            jTextArea3.setText("Error de sintaxis. Linha: " + (sym.right + 1) + " Coluna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
        }

    }//GEN-LAST:event_AnaliseSintaticaActionPerformed

    private void AbrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirArquivoActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            jTextArea1.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AbrirArquivoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirArquivo;
    private javax.swing.JButton Analisar;
    private javax.swing.JButton AnaliseSintatica;
    private javax.swing.JButton Limpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
