package com.project.model;

public class Cliente {
  private int id_cli;
  private String nom_cli;
  private String tel_cli;
  private String dir_cli;
  private String email_cli;

  public Cliente() {
  }

  public Cliente(int id_cli, String nom_cli, String tel_cli, String dir_cli, String email_cli) {
    this.id_cli = id_cli;
    this.nom_cli = nom_cli;
    this.tel_cli = tel_cli;
    this.dir_cli = dir_cli;
    this.email_cli = email_cli;
  }

  public int getid_cli() {
    return this.id_cli;
  }

  public void setid_cli(int id_cli) {
    this.id_cli = id_cli;
  }

  public String getnom_cli() {
    return this.nom_cli;
  }

  public void setnom_cli(String nom_cli) {
    this.nom_cli = nom_cli;
  }

  public String gettel_cli() {
    return this.tel_cli;
  }

  public void settel_cli(String tel_cli) {
    this.tel_cli = tel_cli;
  }

  public String getdir_cli() {
    return this.dir_cli;
  }

  public void setdir_cli(String dir_cli) {
    this.dir_cli = dir_cli;
  }

  public String getemail_cli() {
    return this.email_cli;
  }

  public void setemail_cli(String email_cli) {
    this.email_cli = email_cli;
  }
}
