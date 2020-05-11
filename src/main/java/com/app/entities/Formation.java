package com.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Formation {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="description", length=100)
	@NotNull
	@Size(min = 3, max = 200)
	private String description;
	
	@Column(name="title", length=20)
	@NotNull
	@Size(min = 3, max = 40)
	private String title;
	
	@Column(name="formateur", length=20)
	@NotNull
	@Size(min = 3, max = 40)
	private String formateur;
	 
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeDebut;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeFin;
	
	@Column(name="prix", length=20)
	@NotNull
	@Size(min = 3, max = 40)
	private String prix;
	

	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFormateur() {
		return formateur;
	}
	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
	public Date getDateDeDebut() {
		return dateDeDebut;
	}
	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}
	public Date getDateDeFin() {
		return dateDeFin;
	}
	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}
	public Formation(Long id, String description, String title, String formateur, Date dateDeDebut, Date dateDeFin,
			String prix) {
		super();
		this.id = id;
		this.description = description;
		this.title = title;
		this.formateur = formateur;
		this.dateDeDebut = dateDeDebut;
		this.dateDeFin = dateDeFin;
		this.prix = prix;
	}
	public Formation() {
		super();
	}
	
	
	

}
