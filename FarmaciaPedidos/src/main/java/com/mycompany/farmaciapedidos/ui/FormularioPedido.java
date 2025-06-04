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

        
        setVisible(true);
    }
    
}
