

package radio;


public class Interfazgrafica extends javax.swing.JFrame {

    private boolean frecuencia;
    private double emisora;
    private boolean ocupado;
    
    
    public Interfazgrafica() {
        initComponents();
    radio1 = new Radioclase();
    
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        boton3.setEnabled(false);
        boton4.setEnabled(false);
        boton5.setEnabled(false);
        boton6.setEnabled(false);
        boton7.setEnabled(false);
        boton8.setEnabled(false);
        boton9.setEnabled(false);
        boton10.setEnabled(false);
        boton11.setEnabled(false);
        boton12.setEnabled(false);
        Anterior.setEnabled(false);
        Siguiente.setEnabled(false);
        AM.setEnabled(false);
        FM.setEnabled(false);
        Off.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        boton12 = new javax.swing.JButton();
        On = new javax.swing.JButton();
        Off = new javax.swing.JButton();
        pantalla = new javax.swing.JLabel();
        Siguiente = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        AM = new javax.swing.JButton();
        FM = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton10.setText("10");
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });

        boton11.setText("11");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        boton12.setText("12");
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        On.setText("On");
        On.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnActionPerformed(evt);
            }
        });

        Off.setText("Off");
        Off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OffActionPerformed(evt);
            }
        });

        pantalla.setText("Radio");

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        AM.setText("AM");
        AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMActionPerformed(evt);
            }
        });

        FM.setText("FM");
        FM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(On)))
                .addGap(18, 18, 18)
                .addComponent(Off)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AM)
                            .addComponent(Siguiente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Anterior)
                            .addComponent(FM)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton9)))
                        .addGap(64, 64, 64)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1)
                    .addComponent(boton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton2)
                    .addComponent(boton8)
                    .addComponent(On)
                    .addComponent(Off))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton3)
                            .addComponent(boton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton10)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton5)
                    .addComponent(boton11)
                    .addComponent(Siguiente)
                    .addComponent(Anterior))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton6)
                            .addComponent(boton12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AM)
                            .addComponent(FM))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(radio1.sacar(3)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(3,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(3)));
            frecuencia=radio1.freq(3);
        }        
    }//GEN-LAST:event_boton3ActionPerformed

    private void OffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OffActionPerformed
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        boton3.setEnabled(false);
        boton4.setEnabled(false);
        boton5.setEnabled(false);
        boton6.setEnabled(false);
        boton7.setEnabled(false);
        boton8.setEnabled(false);
        boton9.setEnabled(false);
        boton10.setEnabled(false);
        boton11.setEnabled(false);
        boton12.setEnabled(false);
        Anterior.setEnabled(false);
        Siguiente.setEnabled(false);
        AM.setEnabled(false);
        FM.setEnabled(false);
        Off.setEnabled(false);


// TODO add your handling code here:
    }//GEN-LAST:event_OffActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(radio1.sacar(6)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(6,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(6)));
            frecuencia=radio1.freq(6);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton6ActionPerformed

    private void OnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnActionPerformed
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);
        boton4.setEnabled(true);
        boton5.setEnabled(true);
        boton6.setEnabled(true);
        boton7.setEnabled(true);
        boton8.setEnabled(true);
        boton8.setEnabled(true);
        boton9.setEnabled(true);
        boton10.setEnabled(true);
        boton11.setEnabled(true);
        boton12.setEnabled(true);
        Anterior.setEnabled(true);
        Siguiente.setEnabled(true);
        AM.setEnabled(true);
        FM.setEnabled(true);
        Off.setEnabled(true);
        






    // TODO add your handling code here:
    }//GEN-LAST:event_OnActionPerformed

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        pantalla.setText("530.0");
        frecuencia = false;

    }//GEN-LAST:event_AMActionPerformed

    private void FMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMActionPerformed
        pantalla.setText("87.90000000");
        frecuencia = true;

    }//GEN-LAST:event_FMActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        pantalla.setText(Double.toString(radio1.subirEstacion(frecuencia, Double.parseDouble(pantalla.getText()))));
        
    // TODO add your handling code here:
    }//GEN-LAST:event_SiguienteActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        pantalla.setText(Double.toString(radio1.bajarEstacion(frecuencia, Double.parseDouble(pantalla.getText()))));
        
    // TODO add your handling code here:
    }//GEN-LAST:event_AnteriorActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(radio1.sacar(1)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(1,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(1)));
            frecuencia=radio1.freq(1);
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(radio1.sacar(2)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(2,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(2)));
            frecuencia=radio1.freq(2);
        }
        
    // TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if(radio1.sacar(4)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(4,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(4)));
            frecuencia=radio1.freq(4);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(radio1.sacar(5)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(5,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(5)));
            frecuencia=radio1.freq(5);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(radio1.sacar(7)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(7,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(7)));
            frecuencia=radio1.freq(7);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(radio1.sacar(8)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(8,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(8)));
            frecuencia=radio1.freq(8);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(radio1.sacar(9)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(9,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(9)));
            frecuencia=radio1.freq(9);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        if(radio1.sacar(10)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(10,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(10)));
            frecuencia=radio1.freq(10);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        if(radio1.sacar(11)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(11,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(11)));
            frecuencia=radio1.freq(11);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton11ActionPerformed

    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        if(radio1.sacar(12)==0.0){        
            emisora = Double.parseDouble(pantalla.getText());
            radio1.guardar(12,emisora,frecuencia);
        }else{
            pantalla.setText(Double.toString(radio1.sacar(12)));
            frecuencia=radio1.freq(12);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_boton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfazgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfazgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfazgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfazgrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfazgrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AM;
    private javax.swing.JButton Anterior;
    private javax.swing.JButton FM;
    private javax.swing.JButton Off;
    private javax.swing.JButton On;
    private javax.swing.JButton Siguiente;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JLabel pantalla;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    private Radioclase radio1;
}
