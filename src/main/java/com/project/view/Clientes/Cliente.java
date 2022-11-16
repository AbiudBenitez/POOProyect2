package com.project.view.Clientes;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
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
    int total = 0;
    total = crud.countCliente(total);
    String[][] fields = new String[total][5];
    ArrayList<com.project.model.Cliente> temp;
    for (int i = 0; i < total; i++) {
      temp = crud.selectCliente("", null);
      fields[i][0] = Integer.toString(temp.get(i).getid_cli());
      fields[i][1] = temp.get(i).getnom_cli();
      fields[i][2] = temp.get(i).gettel_cli();
      fields[i][3] = temp.get(i).getdir_cli();
      fields[i][4] = temp.get(i).getemail_cli();
      System.out.print(fields[0][0]);
      tm.addRow(fields[i]);
    }
    JTable tabla = new JTable(tm);
    tabla.setBounds(12, 22, 500, 500);
    setSize(750, 700);
    setLayout(null);
    add(tabla);
  }
}
