package com.culture.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Table(name="departement")
@Data @NoArgsConstructor @AllArgsConstructor 
public class Departement {
	@Id
	@Column(name="numDep")
	private String numDep;
	
	@Column(name="nomDep")
	private String nomDep;
	
	
	@OneToOne @Cascade(CascadeType.ALL)
	@JoinColumn(name="code_insee")
	private Lieu Lieu;


	@Override
	public String toString() {
		if(Lieu!=null) {
			return "Departement [numDep=" + numDep+"]";
		}
		return "Lieu vide";
		
	}


	
	
}
