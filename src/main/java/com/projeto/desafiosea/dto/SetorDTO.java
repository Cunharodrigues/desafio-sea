package com.projeto.desafiosea.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.projeto.desafiosea.entities.Cargo;
import com.projeto.desafiosea.entities.Setor;


public class SetorDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	//@OneToMany(mappedBy = "setor")
	private List<Cargo> cargos = new ArrayList<>();
	
	public SetorDTO() {
		
	}

	public SetorDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public SetorDTO(Setor entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	@SuppressWarnings("unchecked")
	public SetorDTO(Setor entity, List<Cargo> cargos) {
		this(entity);
		for(Cargo c : cargos) {
			this.cargos.addAll((Collection<? extends Cargo>) new CargoDTO(c));
		}
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
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
		Setor other = (Setor) obj;
		if (id == null) {
			if (other.getId() != null)
				return false;
		} else if (!id.equals(other.getId()))
			return false;
		return true;
	}
	
	
}
