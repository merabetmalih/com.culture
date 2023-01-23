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
@Table(name="lieu")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Lieu {
	@Id
	@Column(name="codeinsee")
	private String codeInsee;
	
	@Column(name="nom_com")
	private String nomCom;
	
	@Column(name="longitude")
	private double longitude;
	
	@Column(name="latitude")
	private double latitude;
	

	@OneToOne @JoinColumn(name="numDep") @Cascade(CascadeType.ALL)
	private Departement departement;


	public Lieu(String codeInsee) {
		super();
		this.codeInsee = codeInsee;
	}
	
	
	
	


}
