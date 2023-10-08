package com.kruger.vaccination.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "employees")
@NoArgsConstructor
@Builder
@Data
public class Employee implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "identification", length = 10, nullable = false)
	private String identification;
	
	@Column(name = "names", length = 30, nullable = false)
	private String names;
	
	@Column(name = "surnames", length = 50, nullable = false)
	private String surnames;
	
	@Column(name = "email", length = 50, nullable = false)
	private String email;
	
	@Column(name = "birthdate", nullable = false)
	private LocalDate birthdate;
	
	@Column(name = "home_address", nullable = false, length = 300)
	private String homeAddress;
	
	@Column(name = "cellphone", nullable = false, length = 10)
	private String cellphone;
	
	@Column(name = "vaccination_status", nullable = false)
	private Boolean vaccinationStatus;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	@JsonBackReference
	private List<Vaccination> vaccionations;
	
}
