package com.projeto.desafiosea.entities;

import java.io.Serializable;

public class Trabalhador implements Serializable{
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private boolean cpf;
	private String sexo;
	private String setor;
	private String cargo;
	private Role role;
	
	public Trabalhador() {
		
	}

	public Trabalhador(String id, String name, boolean cpf, String sexo, String setor, String cargo, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.sexo = sexo;
		this.setor = setor;
		this.cargo = cargo;
		this.role = role;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCpf() {
		return cpf;
	}

	public void setCpf(boolean cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabalhador other = (Trabalhador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
