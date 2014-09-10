package org.greypowerservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "UNITS_MEASURE")
public class UnitMeasure {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@NotEmpty
	@Column(name="NAME")
	private String name;
	
	@NotEmpty
	@Column(name="ABBREVIATION")
	private String abbreviation;
}
