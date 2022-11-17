package com.project.view.Clientes;

import java.awt.*;

import javax.swing.*;

import com.project.controller.Tablas;

public class ClienteActGUI extends JFrame {

  Tablas tb = new Tablas();

  JButton btnbuscar;
  JTextField txtid;

  public void GUI() {

    Container frame = this.getContentPane();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Actualizacion del Cliente");

    frame.setLayout(new GridBagLayout());
    GridBagConstraints gdc = new GridBagConstraints();
    JScrollPane scroll = new JScrollPane(tb.clientet());

    JLabel lblsec = new JLabel("Ingrese el ID el cual desee buscar");
    JLabel lblid = new JLabel("ID");
    txtid = new JTextField(15);

    btnbuscar = new JButton("Buscar");

    gdc.weightx = 0.5;
    gdc.weighty = 0;

    gdc.gridx = 0;
    gdc.gridy = 0;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lblsec, gdc);

    gdc.gridx = 0;
    gdc.gridy = 1;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lblid, gdc);

    gdc.gridx = 1;
    gdc.gridy = 1;
    gdc.gridwidth = 1;
    gdc.gridheight = 0;
    gdc.fill = GridBagConstraints.NONE;
    frame.add(txtid, gdc);

    gdc.gridx = 2;
    gdc.gridy = 1;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.fill = GridBagConstraints.NONE;
    frame.add(btnbuscar, gdc);

    gdc.gridx = 0;
    gdc.gridy = 2;
    gdc.gridheight = 10;
    gdc.gridwidth = 10;
    frame.add(scroll, gdc);
  }
}
