package com.project.controller;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.project.model.ClienteCRUD;

public class Tablas {

  DefaultTableModel tm = new DefaultTableModel(new String[] { "ID", "Nombre", "Telefono", "Direccion", "Email" }, 0);
  ClienteCRUD crud = new ClienteCRUD();

  public JTable clientet() {

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
      tm.addRow(fields[i]);
    }
    JTable tabla = new JTable(tm);
    return tabla;
  }

  public void clienteta() {
    int total = 0;
    total = crud.countCliente(total) - 1;
    String[] fields = new String[5];
    ArrayList<com.project.model.Cliente> temp;
    temp = crud.selectCliente("", null);
    fields[0] = Integer.toString(temp.get(total).getid_cli());
    fields[1] = temp.get(total).getnom_cli();
    fields[2] = temp.get(total).gettel_cli();
    fields[3] = temp.get(total).getdir_cli();
    fields[4] = temp.get(total).getemail_cli();
    tm.addRow(fields);
  }
}
