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
public class VentanaResumen extends JFrame{
    
    public VentanaResumen(String nombreMedicamento, String tipoMedicamento, int cantidad,
                          String distribuidor, boolean enviarPrincipal, boolean enviarSecundaria) {
        setTitle("Pedido al distribuidor " + distribuidor);
        setSize(500, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        // Mensaje de pedido
        String mensajePedido = "ustd solciito " + cantidad + " de unidades del " + tipoMedicamento.toLowerCase() + " " + nombreMedicamento;
        JLabel lblPedido = new JLabel(mensajePedido, JLabel.CENTER);
        add(lblPedido);
        
        
        setVisible(true);
        }
    
}
