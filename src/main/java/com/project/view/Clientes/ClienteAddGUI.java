package com.project.view.Clientes;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.project.App;
import com.project.controller.Tablas;
import com.project.model.Cliente;
import com.project.model.ClienteCRUD;

public class ClienteAddGUI extends JFrame implements ActionListener {

  JTextField txtnom_cli, txttel_cli, txtdir_cli, txtemail_cli;
  JButton btnguardar, btnlimpiar, btncancelar, btncasa;
  Tablas ct = new Tablas();

  public void GUI() {

    Container frame = this.getContentPane();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Clientes");

    frame.setLayout(new GridBagLayout());
    JScrollPane scroll = new JScrollPane(ct.clientet());
    GridBagConstraints gdc = new GridBagConstraints();

    JLabel lbltitle_cli = new JLabel("Clientes");
    JLabel lblnom_cli = new JLabel("Nombre: ");
    JLabel lbltel_cli = new JLabel("Telefono: ");
    JLabel lbldir_cli = new JLabel("Direccion: ");
    JLabel lblemail_cli = new JLabel("Email: ");

    txtnom_cli = new JTextField(15);
    txttel_cli = new JTextField(15);
    txtdir_cli = new JTextField(15);
    txtemail_cli = new JTextField(15);
    btnguardar = new JButton("Guardar");
    btnlimpiar = new JButton("Limpiar");
    btncancelar = new JButton("Cancelar");
    btncasa = new JButton();

    gdc.weightx = .5;
    gdc.weighty = 0;

    gdc.gridx = 1;
    gdc.gridy = 0;
    gdc.gridwidth = 4;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lbltitle_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 1;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lblnom_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 2;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lbltel_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 3;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lbldir_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 4;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lblemail_cli, gdc);

    gdc.gridx = 2;
    gdc.gridy = 1;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(txtnom_cli, gdc);

    gdc.gridx = 2;
    gdc.gridy = 2;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(txttel_cli, gdc);

    gdc.gridx = 2;
    gdc.gridy = 3;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(txtdir_cli, gdc);

    gdc.gridx = 2;
    gdc.gridy = 4;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(txtemail_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 5;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(15, 5, 0, 5);
    gdc.fill = GridBagConstraints.NONE;
    ImageIcon guardar = new ImageIcon("icon/guardar.png");
    btnguardar.setIcon(new ImageIcon(
        guardar.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(btnguardar, gdc);

    gdc.gridx = 2;
    gdc.gridy = 5;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(15, 5, 0, 5);
    gdc.fill = GridBagConstraints.NONE;
    ImageIcon limpiar = new ImageIcon("icon/limpiar.png");
    btnlimpiar.setIcon(new ImageIcon(
        limpiar.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(btnlimpiar, gdc);

    gdc.gridx = 3;
    gdc.gridy = 5;
    gdc.gridwidth = 1;
    gdc.gridheight = 1;
    gdc.insets = new Insets(15, 5, 0, 5);
    gdc.fill = GridBagConstraints.NONE;
    ImageIcon cancelar = new ImageIcon("icon/cancelar.png");
    btncancelar.setIcon(new ImageIcon(
        cancelar.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(btncancelar, gdc);

    gdc.gridx = 1;
    gdc.gridy = 17;
    gdc.gridwidth = 0;
    gdc.gridheight = 0;
    gdc.fill = GridBagConstraints.NONE;
    ImageIcon casa = new ImageIcon("icon/casa.png");
    btncasa.setIcon(new ImageIcon(
        casa.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(btncasa, gdc);

    gdc.gridx = 1;
    gdc.gridy = 6;
    gdc.gridwidth = 10;
    gdc.gridheight = 10;
    frame.add(scroll, gdc);

    btnguardar.addActionListener(this);
    btnlimpiar.addActionListener(this);
    btncancelar.addActionListener(this);
    btncasa.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnguardar) {
      String nom_cli = txtnom_cli.getText();
      String tel_cli = txttel_cli.getText();
      String dir_cli = txtdir_cli.getText();
      String email_cli = txtemail_cli.getText();

      ClienteCRUD crud = new ClienteCRUD();
      Cliente cliente = new Cliente();
      cliente.setnom_cli(nom_cli);
      cliente.settel_cli(tel_cli);
      cliente.setdir_cli(dir_cli);
      cliente.setemail_cli(email_cli);

      if (crud.addCliente(cliente)) {
        JOptionPane.showMessageDialog(null, "Registro agregado correctamente.", "Aviso Clientes", 1);
        txtnom_cli.setText("");
        txttel_cli.setText("");
        txtdir_cli.setText("");
        txtemail_cli.setText("");
        ct.clienteta();
        Clientes cli = new Clientes();
        cli.GUI();
        cli.setVisible(true);
        cli.setResizable(false);
        cli.setSize(800, 650);
        this.setVisible(false);
      }
    } else if (e.getSource() == btnlimpiar) {
      txtnom_cli.setText("");
      txttel_cli.setText("");
      txtdir_cli.setText("");
      txtemail_cli.setText("");
    } else if (e.getSource() == btncancelar) {
      Clientes cli = new Clientes();
      cli.GUI();
      cli.setVisible(true);
      cli.setResizable(false);
      cli.setSize(800, 650);
      this.setVisible(false);
    } else if (e.getSource() == btncasa) {
      App app = new App();
      app.GUI();
      app.setResizable(false);
      app.setSize(600, 750);
      app.setVisible(true);
      this.setVisible(false);
    }
  }
}
