/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaciapedidos.ui;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Usuario
 */
public class FormularioPedido extends JFrame{
    
    // Componentes 
    private JTextField txtNombre, txtCantidad;
    private JComboBox<String> comboTipo;
    private JRadioButton rbtnCofarma, rbtnEmpsephar, rbtnCemefar;
    private JCheckBox chkPrincipal, chkSecundaria;
    private JButton btnBorrar, btnConfirmar;
    private ButtonGroup grupoDistribuidores;

    public FormularioPedido() {
        setTitle("Pedido de Medicamentos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Encontree estas config en stack para los tamaños
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Nombre del medicamento
        add(new JLabel("Nombre del Medicamento:"));
        txtNombre = new JTextField();
        add(txtNombre);
        
        // Tipo del medicamentos segun el docmento
        add(new JLabel("Tipo del Medicamento:"));
        comboTipo = new JComboBox<>(new String[] {
            "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibiótico"
        });
        add(comboTipo);
        
         // Cantidad
        add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField();
        add(txtCantidad);
        
        // Distribuidores 
        add(new JLabel("Distribuidor:"));
        JPanel panelDistribuidor = new JPanel(new FlowLayout());
        rbtnCofarma = new JRadioButton("Cofarma");
        rbtnEmpsephar = new JRadioButton("Empsephar");
        rbtnCemefar = new JRadioButton("Cemefar");
        
        grupoDistribuidores = new ButtonGroup();
        grupoDistribuidores.add(rbtnCofarma);
        grupoDistribuidores.add(rbtnEmpsephar);
        grupoDistribuidores.add(rbtnCemefar);

        panelDistribuidor.add(rbtnCofarma);
        panelDistribuidor.add(rbtnEmpsephar);
        panelDistribuidor.add(rbtnCemefar);
        add(panelDistribuidor);
        
        // Sucursales 
        add(new JLabel("Sucursal:"));
        JPanel panelSucursal = new JPanel(new FlowLayout());
        chkPrincipal = new JCheckBox("Principal");
        chkSecundaria = new JCheckBox("Secundaria");
        panelSucursal.add(chkPrincipal);
        panelSucursal.add(chkSecundaria);
        add(panelSucursal);
        
        // Borrar y confirmar
        btnBorrar = new JButton("Borrar");
        btnConfirmar = new JButton("Confirmar");
        add(btnBorrar);
        add(btnConfirmar);
        
        setVisible(true);
    }
    
}
