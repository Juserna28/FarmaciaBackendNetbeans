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
public class VentanaResumen extends JFrame {

    public VentanaResumen(String nombreMedicamento, String tipoMedicamento, int cantidad,
            String distribuidor, boolean enviarPrincipal, boolean enviarSecundaria) {
        setTitle("Pedido al distribuidor " + distribuidor);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        // Mensaje de pedido
        String mensajePedido = "ustd solciito " + cantidad + " de unidades del " + tipoMedicamento.toLowerCase() + " " + nombreMedicamento;
        JLabel lblPedido = new JLabel(mensajePedido, JLabel.CENTER);
        add(lblPedido);

        // Direcciones de entrega
        StringBuilder direccion = new StringBuilder("Para la farmacia situada en ");
        if (enviarPrincipal) {
            direccion.append("Calle de la Rosa n.28");
        }
        if (enviarPrincipal && enviarSecundaria) {
            direccion.append(" y para la situada en ");
        }
        if (enviarSecundaria) {
            direccion.append("Calle Alcazabilla n.3");
        }
        JLabel lblDireccion = new JLabel(direccion.toString(), JLabel.CENTER);
        add(lblDireccion);

        // Botones finles
        JPanel panelBotones = new JPanel(new FlowLayout());
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnEnviar = new JButton("Enviar Pedido");

        panelBotones.add(btnCancelar);
        panelBotones.add(btnEnviar);
        add(panelBotones);

        // Acciones
        btnCancelar.addActionListener(e -> dispose());
        btnEnviar.addActionListener(e -> {
            System.out.println("Pedido enviado");
            dispose();
        });
        
        setVisible(true);
    }

}
