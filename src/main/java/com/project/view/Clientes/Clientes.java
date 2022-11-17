package com.project.view.Clientes;

import java.awt.Container;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import com.project.App;
import com.project.controller.Tablas;

public class Clientes extends JFrame implements ActionListener {

  JButton add_cli, act_cli, eli_cli, btncasa;

  public void GUI() {
    this.setTitle("Clientes");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    Tablas ct = new Tablas();
    Container frame = this.getContentPane();
    GridBagConstraints gbc = new GridBagConstraints();

    frame.setLayout(new GridBagLayout());

    JScrollPane scroll = new JScrollPane(ct.clientet());
    JLabel name = new JLabel("Vista de Clientes");
    add_cli = new JButton("Añadir Clientes");
    act_cli = new JButton("Actualizar Cliente");
    eli_cli = new JButton("Eliminar Cliente");
    btncasa = new JButton();

    gbc.weightx = 0.5;
    gbc.weighty = 0;

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridheight = 1;
    gbc.gridwidth = 1;
    frame.add(name, gbc);

    gbc.gridx = 12;
    gbc.gridy = 5;
    gbc.insets = new Insets(0, 5, 50, 0);
    gbc.gridheight = 1;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.NONE;
    ImageIcon añadir = new ImageIcon("icon/anadir.png");
    add_cli.setIcon(new ImageIcon(
        añadir.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(add_cli, gbc);

    gbc.gridx = 12;
    gbc.gridy = 6;
    gbc.insets = new Insets(0, 5, 50, 0);
    gbc.gridheight = 1;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.NONE;
    ImageIcon actualizar = new ImageIcon("icon/actualizar.png");
    act_cli.setIcon(new ImageIcon(
        actualizar.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(act_cli, gbc);

    gbc.gridx = 12;
    gbc.gridy = 7;
    gbc.insets = new Insets(0, 5, 50, 0);
    gbc.gridheight = 1;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.NONE;
    ImageIcon eliminar = new ImageIcon("icon/eliminar.png");
    eli_cli.setIcon(new ImageIcon(
        eliminar.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(eli_cli, gbc);

    gbc.gridx = 0;
    gbc.gridy = 20;
    gbc.gridwidth = 0;
    gbc.gridheight = 0;
    gbc.fill = GridBagConstraints.NONE;
    ImageIcon casa = new ImageIcon("icon/casa.png");
    btncasa.setIcon(new ImageIcon(
        casa.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
    frame.add(btncasa, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridheight = 10;
    gbc.gridwidth = 10;
    frame.add(scroll, gbc);

    add_cli.addActionListener(this);
    act_cli.addActionListener(this);
    btncasa.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == add_cli) {
      ClienteAddGUI cag = new ClienteAddGUI();
      cag.GUI();
      cag.setResizable(false);
      cag.setSize(600, 750);
      cag.setVisible(true);
      this.setVisible(false);
    } else if (e.getSource() == act_cli) {
      ClienteActGUI act = new ClienteActGUI();
      act.GUI();
      act.setResizable(false);
      act.setSize(600, 750);
      act.setVisible(true);
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
