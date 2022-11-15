package com.project;

import com.project.view.ClienteGUI;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ClienteGUI c = new ClienteGUI();
        c.GUI();
        c.setSize(400, 400);
        c.setVisible(true);
    }
}
