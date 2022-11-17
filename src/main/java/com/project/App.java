package com.project;

import com.project.view.Clientes.Clientes;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Hello world!
 *
 */
public class App extends JFrame implements ActionListener {

    JPanel app;

    public static void main(String[] args) {
        App app = new App();
        app.GUI();
        app.setResizable(false);
        app.setSize(600, 750);
        app.setVisible(true);

    }

    JButton btn_clientes;

    public void GUI() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container frame = this.getContentPane();
        btn_clientes = new JButton("Clientes");
        frame.add(btn_clientes);
        btn_clientes.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_clientes) {
            Clientes cli_gui = new Clientes();
            cli_gui.GUI();
            cli_gui.setSize(800, 650);
            cli_gui.setVisible(true);
            this.setVisible(false);
        }

    }
}
