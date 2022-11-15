package com.project.view;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.project.model.Cliente;
import com.project.model.ClienteCRUD;

public class ClienteGUI extends JFrame implements ActionListener {

  JTextField txtnom_cli, txttel_cli, txtdir_cli, txtemail_cli;
  JButton btnguardar;

  public void GUI() {

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Clientes");

    Container frame = this.getContentPane();
    frame.setLayout(new GridBagLayout());

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

    gdc.gridx = 1;
    gdc.gridy = 0;
    gdc.gridwidth = 4;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lbltitle_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 1;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lblnom_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 2;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lbltel_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 3;
    gdc.gridwidth = 2;
    gdc.gridheight = 1;
    gdc.insets = new Insets(10, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(lbldir_cli, gdc);

    gdc.gridx = 1;
    gdc.gridy = 4;
    gdc.gridwidth = 2;
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
    gdc.insets = new Insets(15, 0, 0, 0);
    gdc.fill = GridBagConstraints.NONE;
    frame.add(btnguardar, gdc);

    btnguardar.addActionListener(this);
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
      }
    }
  }
}
