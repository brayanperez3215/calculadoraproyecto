/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import calculadoraproyecto.CalculadoraAritmetica;

/**
 *
 * @author Estudiantes
 */
public class CalculadoraGrafica extends javax.swing.JFrame {
   
    CalculadoraAritmetica miCalculadora=new CalculadoraAritmetica();
    
   private boolean punto=true; 
   String valor1, valor2, signo, contenido;
   double resultado;

    /**
     * Creates new form CalculadoraGrafica
     */
    public CalculadoraGrafica() {
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

        txtmostrar = new javax.swing.JTextField();
        btntangente = new javax.swing.JButton();
        btncoseno = new javax.swing.JButton();
        btnseno = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnparentesis = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnporciento = new javax.swing.JButton();
        btn1sobrex = new javax.swing.JButton();
        btnresultado = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnraiz = new javax.swing.JButton();
        btnsumaresta = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 30));

        btntangente.setText("TAN");
        btntangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntangenteActionPerformed(evt);
            }
        });
        getContentPane().add(btntangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        btncoseno.setText("COS");
        btncoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosenoActionPerformed(evt);
            }
        });
        getContentPane().add(btncoseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        btnseno.setText("SEN");
        btnseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsenoActionPerformed(evt);
            }
        });
        getContentPane().add(btnseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 30));

        btnparentesis.setText("(  )");
        btnparentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnparentesisActionPerformed(evt);
            }
        });
        getContentPane().add(btnparentesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 50, 30));

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 30));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 30));

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 30));

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 30));

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, 30));

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 30));

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        getContentPane().add(btnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 30));

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, 30));

        btnpunto.setText(".");
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 30));

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 50, 30));

        btnporciento.setText("%");
        btnporciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporcientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnporciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 50, 30));

        btn1sobrex.setText("1/x");
        btn1sobrex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1sobrexActionPerformed(evt);
            }
        });
        getContentPane().add(btn1sobrex, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        btnresultado.setText("=");
        btnresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 50, 110));

        btndividir.setText("/");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });
        getContentPane().add(btndividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 30));

        btnraiz.setText(" √ ");
        btnraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnraizActionPerformed(evt);
            }
        });
        getContentPane().add(btnraiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 50, 30));

        btnsumaresta.setText("+/-");
        btnsumaresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumarestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsumaresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 50, 30));

        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, 30));

        btnmultiplicar.setText("*");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 30));

        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        getContentPane().add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, 30));

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, 30));

        btnborrar.setText("<---");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 253, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntangenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntangenteActionPerformed

    private void btncosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncosenoActionPerformed

    private void btnsenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsenoActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnparentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnparentesisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnparentesisActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCEActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        // TODO add your handling code here:
        contenido=txtmostrar.getText();
        
        if(contenido.length()<=0){
            txtmostrar.setText("0.");
        }else
            if(txtmostar.getText().contains(".")) {
                
            }else{
                txtmostrar.setText(txtmostrar.getText()+".");
                punto=false;
            }
            

    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btnporcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporcientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnporcientoActionPerformed

    private void btn1sobrexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1sobrexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1sobrexActionPerformed

    private void btnresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultadoActionPerformed
        // TODO add your handling code here:
        txtmostrar.setText("");
    }//GEN-LAST:event_btnresultadoActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndividirActionPerformed

    private void btnraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnraizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnraizActionPerformed

    private void btnsumarestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumarestaActionPerformed
        // TODO add your handling code here:
        contenido=(txtmostar.getText();
        if(contenido.length()>0){
            resultado=(-1)*double.parsedouble(string contenido1 = contenido;
)
        }
    }//GEN-LAST:event_btnsumarestaActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtmostar.setText(txtmostrar.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnborrarActionPerformed

    private void txtmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmostrarActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraGrafica().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1sobrex;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btncoseno;
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnparentesis;
    private javax.swing.JButton btnporciento;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnraiz;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnresultado;
    private javax.swing.JButton btnseno;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton btnsumaresta;
    private javax.swing.JButton btntangente;
    private javax.swing.JTextField txtmostrar;
    // End of variables declaration//GEN-END:variables

    private static class txtmostar {

        private static void setText(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public txtmostar() {
        }
    }
}
