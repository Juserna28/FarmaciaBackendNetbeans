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
public class FormularioPedido extends JFrame {

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
        comboTipo = new JComboBox<>(new String[]{
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

        //Metodo para borrar o dejar en blanco todo
        btnBorrar.addActionListener(e -> {
            txtNombre.setText("");
            txtCantidad.setText("");
            grupoDistribuidores.clearSelection();
            chkPrincipal.setSelected(false);
            chkSecundaria.setSelected(false);
        });

        btnConfirmar.addActionListener(e -> {
            String nombreMedicamento = txtNombre.getText().trim();
            String tipoMedicamento = (String) comboTipo.getSelectedItem();
            String cantidadTexto = txtCantidad.getText().trim();

            String distribuidor = null;
            if (rbtnCofarma.isSelected()) {
                distribuidor = "Cofarma";
            } else if (rbtnEmpsephar.isSelected()) {
                distribuidor = "Empsephar";
            } else if (rbtnCemefar.isSelected()) {
                distribuidor = "Cemefar";
            }

            boolean enviarPrincipal = chkPrincipal.isSelected();
            boolean enviarSecundaria = chkSecundaria.isSelected();

            // Validaciones
            if (nombreMedicamento.isEmpty() || !nombreMedicamento.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s]+")) {
                JOptionPane.showMessageDialog(this, "Ingrese un nombre de medicamento valido");
                return;
            }

            int cantidad;
            try {
                cantidad = Integer.parseInt(cantidadTexto);
                if (cantidad <= 0) {
                    JOptionPane.showMessageDialog(this, "La cantidad debe ser un numero positivo");
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un numero válido");
                return;
            }

        });

        setVisible(true);
    }

}
