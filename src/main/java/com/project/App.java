package com.project;

import com.project.view.Clientes.ClienteAddGUI;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ClienteAddGUI cli_add = new ClienteAddGUI();
        cli_add.GUI();
        cli_add.setResizable(false);
        cli_add.setSize(500, 750);
        cli_add.setVisible(true);
    }
}
