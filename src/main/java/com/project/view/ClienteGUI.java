package com.project.view;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClienteGUI extends JFrame {

  protected void GUI() {

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Clientes");
    JPanel pane = new JPanel(new GridBagLayout());

    pane.setLayout(new GridBagLayout());
    ClienteGUI c = new ClienteGUI();

  }
}
