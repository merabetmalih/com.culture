package com.culture.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="monument")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Monument {
	@Id
	@Column(name="geohash")
	@Size(max=12)
	@NotEmpty
	private String codeM;
	
	@NotEmpty @Size(max=80)
	@Column(name="nom")
	private String nomM;
	
	@NotEmpty @Size(max=10)
	@Column(name="proprietaire")
	private String proprietaire;
	
	@NotEmpty @Size(max=20)
	@Column(name="typem")
	private String typeM;
	
	
	@Column(name="longitude")
	private double longitude;
	
	
	@Column(name="latitude")
	private double latitude;
	
	
	@ManyToOne @JoinColumn(name="codeinsee", nullable=true)
	private Lieu codeLieu;
	
	
    @ManyToMany @Cascade(CascadeType.ALL)
    @JoinTable(name="associea", joinColumns=@JoinColumn(name="codem"), inverseJoinColumns=@JoinColumn(name="numcelebrite"))
	private Collection<Celebrite> celebrite;





  
}
