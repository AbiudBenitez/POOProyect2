package com.project.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteCRUD {
  private PreparedStatement pst;
  private ResultSet rs;

  public int countCliente(int cant) {
    Connection connect = null;
    int count = 0;
    try {
      connect = ConnectionPool.getInstance().getConnection();
      if (connect == null) {
        System.out.println("No conectado");
        return 0;
      }

      String sql = "SELECT * FROM cliente";
      pst = connect.prepareStatement(sql);
      rs = pst.executeQuery();

      int i = 0;
      while (rs.next()) {
        i++;
      }
      count = i;

    } catch (Exception e) {
      System.out.println(e);
      return 0;
    }
    return count;
  }

  public boolean addCliente(Cliente cliente) {
    boolean state = false;
    Connection connect = null;
    try {
      connect = ConnectionPool.getInstance().getConnection();
      if (connect == null) {
        System.out.println("No conectado");
        return state;
      }
      String sql = "INSERT INTO cliente (nom_cli, tel_cli, dir_cli, email_cli) VALUES (?,?,?,?)";
      pst = connect.prepareStatement(sql);
      pst.setString(1, cliente.getnom_cli());
      pst.setString(2, cliente.gettel_cli());
      pst.setString(3, cliente.getdir_cli());
      pst.setString(4, cliente.getemail_cli());
      int res = pst.executeUpdate();
      state = res > 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        ConnectionPool.getInstance().closeConnection(connect);
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
    return state;
  }

  public ArrayList<Cliente> selectCliente(String filter, ArrayList<String> data) {
    ArrayList<Cliente> list = new ArrayList<>();
    Cliente cliente;
    Connection connect = null;
    try {
      connect = ConnectionPool.getInstance().getConnection();
      if (connect == null) {
        System.out.println("No conectado");
        return list;
      }
      String sql = "";
      switch (filter) {
        case "nom_cli":
          sql = "SELECT * FROM cliente WHERE nom_cli REGEXP ?";
          pst = connect.prepareStatement(sql);
          pst.setString(1, data.get(0));
          break;
        case "email_cli":
          sql = "SELECT * FROM cliente WHERE email_cli REGEXP ?";
          pst = connect.prepareStatement(sql);
          pst.setString(1, data.get(0));
          break;
        case "tel_cli":
          sql = "SELECT * FROM cliente WHERE tel_cli REGEXP ?";
          pst = connect.prepareStatement(sql);
          pst.setString(1, data.get(0));
          break;
        default:
          sql = "SELECT * FROM cliente WHERE 1";
          pst = connect.prepareStatement(sql);
          break;
      }
      rs = pst.executeQuery();
      while (rs.next()) {
        cliente = new Cliente();
        cliente.setnom_cli(rs.getString("nom_cli"));
        cliente.setemail_cli(rs.getString("email_cli"));
        cliente.settel_cli(rs.getString("tel_cli"));
        list.add(cliente);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        ConnectionPool.getInstance().closeConnection(connect);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return list;
  }

  public boolean updateCliente(Cliente cliente) {
    boolean state = false;
    Connection connect = null;
    try {
      connect = ConnectionPool.getInstance().getConnection();
      if (connect == null) {
        System.out.println("No conectado");
        return state;
      }
      String sql = "UPDATE cliente SET nom_cli = ?, tel_cli = ?, dir_cli = ?, email_cli = ? WHERE id_cli = ?";
      pst = connect.prepareStatement(sql);
      pst.setString(1, cliente.getnom_cli());
      pst.setString(2, cliente.gettel_cli());
      pst.setString(3, cliente.getdir_cli());
      pst.setString(4, cliente.getemail_cli());
      pst.setInt(5, cliente.getid_cli());
      int res = pst.executeUpdate();
      state = res > 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        ConnectionPool.getInstance().closeConnection(connect);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return state;
  }

  public boolean deleteCliente(int id_cli) {
    boolean state = false;
    Connection connect = null;
    try {
      connect = ConnectionPool.getInstance().getConnection();
      if (connect == null) {
        System.out.println("No conectado");
        return state;
      }
      String sql = "DELETE FROM cliente WHERE id_cli = ?";
      pst = connect.prepareStatement(sql);
      pst.setInt(1, id_cli);
      int res = pst.executeUpdate();
      state = res > 0;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        ConnectionPool.getInstance().closeConnection(connect);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return state;
  }
}