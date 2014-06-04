package org.greypowerservices.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CHEMICAL_PRODUCTS")
@AttributeOverrides({
	@AttributeOverride(name="name", column=@Column(name="NAME")),
	@AttributeOverride(name="description", column=@Column(name="DESCRIPTION")),
})

public class ChemicalProduct extends Product {
	
	@Column(name="UNIT_OF_MEASURE")
	private String unitOfMeasure;
	
	@Column(name="PRICE")
	private double unitPrice;

	@Column(name="IMAGE_PATH")
	private String imagePath;

	public ChemicalProduct() {}
	
	public ChemicalProduct(String unitOfMeasure, double unitPrice, String imagePath) {
		this.unitOfMeasure = unitOfMeasure;
		this.unitPrice = unitPrice;
		this.imagePath = imagePath;
	}
	
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
