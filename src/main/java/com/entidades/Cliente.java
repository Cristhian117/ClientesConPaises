/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author joeli
 */

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private int idCliente;
	private String nomCliente;
	private String appatCliente;
	private String appmatCliente;
	
	@OneToOne
	private Pais pais;	
	public Cliente() {		
	}	
	public Cliente(String nomCliente, String appatCliente, String appmatCliente) {
		super();
		this.nomCliente = nomCliente;
		this.appatCliente = appatCliente;
		this.appmatCliente = appmatCliente;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getAppatCliente() {
		return appatCliente;
	}
	public void setAppatCliente(String appatCliente) {
		this.appatCliente = appatCliente;
	}
	public String getAppmatCliente() {
		return appmatCliente;
	}
	public void setAppmatCliente(String appmatCliente) {
		this.appmatCliente = appmatCliente;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomCliente=" + nomCliente + ", appatCliente=" + appatCliente
				+ ", appmatCliente=" + appmatCliente + "]";
	}
	
	
}
