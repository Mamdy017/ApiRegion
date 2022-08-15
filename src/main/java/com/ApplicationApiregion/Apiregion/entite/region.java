package com.ApplicationApiregion.Apiregion.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="region")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
	@Column(name="code_region")
    private String code_region;
    private String nom;
	private String activite;
	private float superficie;
	@ManyToOne
	Population population;
	@ManyToOne 
	Pays pays; 
}
