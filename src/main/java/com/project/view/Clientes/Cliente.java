package com.project.view.Clientes;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.project.model.ClienteCRUD;

public class Cliente extends JFrame {
  public void clientet() {

    setTitle("Clientes");
    DefaultTableModel tm = new DefaultTableModel();

    tm.addColumn("ID");
    tm.addColumn("Nombre");
    tm.addColumn("Telefono");
    tm.addColumn("Direccion");
    tm.addColumn("Email");

    ClienteCRUD crud = new ClienteCRUD();
    Cliente cliente = new Cliente();
    int total = 0;
    total = crud.countCliente(total);
    System.out.println(total);
  }
}
