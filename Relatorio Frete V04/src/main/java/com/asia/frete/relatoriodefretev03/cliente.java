package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class cliente implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private String tp_cliente;
   private java.lang.String contato;
   private java.lang.String des_email;
   private java.lang.String telefone;

   private int cadimp;

   private java.lang.String cnee;

   public cliente()
   {
   }

   public java.lang.String getContato()
   {
      return this.contato;
   }

   public void setContato(java.lang.String contato)
   {
      this.contato = contato;
   }

   public java.lang.String getDes_email()
   {
      return this.des_email;
   }

   public void setDes_email(java.lang.String des_email)
   {
      this.des_email = des_email;
   }

   public java.lang.String getTelefone()
   {
      return this.telefone;
   }

   public void setTelefone(java.lang.String telefone)
   {
      this.telefone = telefone;
   }

   public java.lang.String getTp_cliente()
   {
      return this.tp_cliente;
   }

   public void setTp_cliente(java.lang.String tp_cliente)
   {
      this.tp_cliente = tp_cliente;
   }

   public int getCadimp()
   {
      return this.cadimp;
   }

   public void setCadimp(int cadimp)
   {
      this.cadimp = cadimp;
   }

   public java.lang.String getCnee()
   {
      return this.cnee;
   }

   public void setCnee(java.lang.String cnee)
   {
      this.cnee = cnee;
   }

   public cliente(java.lang.String tp_cliente, java.lang.String contato,
         java.lang.String des_email, java.lang.String telefone, int cadimp,
         java.lang.String cnee)
   {
      this.tp_cliente = tp_cliente;
      this.contato = contato;
      this.des_email = des_email;
      this.telefone = telefone;
      this.cadimp = cadimp;
      this.cnee = cnee;
   }

}