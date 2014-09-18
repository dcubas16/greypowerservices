package org.greypowerservices.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHEMICAL_PRODUCTS")
@AttributeOverrides({
	@AttributeOverride(name="name", column=@Column(name="NAME")),
	@AttributeOverride(name="description", column=@Column(name="DESCRIPTION")),
})
public class ChemicalProduct extends Product {
	
//	@Column(name="UNIT_OF_MEASURE")
//	private String unitOfMeasure;
	
	@Column(name="PRICE")
	private double unitPrice;

	@Column(name="IMAGE_PATH")
	private String imagePath;

	@ManyToOne
	private UnitMeasure unitMeasure;
	
	public ChemicalProduct() {}
	
	public ChemicalProduct(UnitMeasure unitMeasure, double unitPrice, String imagePath) {
		this.unitMeasure = unitMeasure;
		this.unitPrice = unitPrice;
		this.imagePath = imagePath;
	}
	
	public UnitMeasure getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(UnitMeasure unitMeasure) {
		this.unitMeasure = unitMeasure;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
