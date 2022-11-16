package com.project;

import com.project.view.Clientes.Cliente;
import com.project.view.Clientes.ClienteAddGUI;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ClienteAddGUI cli_add = new ClienteAddGUI();
        Cliente cli_norm = new Cliente();
        cli_norm.clientet();
        cli_norm.setVisible(true);
        cli_add.GUI();
        cli_add.setSize(400, 400);
        cli_add.setVisible(true);
    }
}
