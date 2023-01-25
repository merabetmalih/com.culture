package com.culture.Entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="celebrite")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Celebrite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numcelebrite")
	private int numcelebrite;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="nationalite")
	private String nationalite;
	
	@Column(name="epoque")
	private String epoque;
	
	

	

}
