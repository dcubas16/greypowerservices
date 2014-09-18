package org.greypowerservices.test.data.mother;

import org.greypowerservices.entities.ChemicalProduct;
import org.greypowerservices.entities.Product;

public class ProductMother {
	
	public static Product getChemicalProductP2()
	{
		Product chemicalProduct = new ChemicalProduct(UnitMeasureMother.getUnitMeasureKilo(), 150.25, "/root/images");
		chemicalProduct.setName("P2");
		chemicalProduct.setDescription("P2 Description");
		
		return chemicalProduct;
	}

	public static Product getUpdatedChemicalProductP1() {
		Product chemicalProduct = new ChemicalProduct(UnitMeasureMother.getUnitMeasureKilo(), 1.1, "/root/images1");
		chemicalProduct.setId(1L);
		chemicalProduct.setName("P1 Modificated");
		chemicalProduct.setDescription("P1 Description Modified");
		
		return chemicalProduct;
	}
	
	public static Product getUpdatedChemicalProductP101() {
		Product chemicalProduct = new ChemicalProduct(UnitMeasureMother.getUnitMeasureKilo(), 101.101, "/root/images101");
		chemicalProduct.setId(101L);
		chemicalProduct.setName("P101 Modificated");
		chemicalProduct.setDescription("P101 Description Modified");
		
		return chemicalProduct;
	}

	public static Product getChemicalProductWithoutName() {
		Product chemicalProduct = new ChemicalProduct();
		chemicalProduct.setName(null);
		chemicalProduct.setDescription("P2 Description");
		
		return chemicalProduct;
	}

	public static Product getChemicalProductP1() {
		Product chemicalProduct = new ChemicalProduct(UnitMeasureMother.getUnitMeasureKilo(), 11.11, "/root/images1");
		chemicalProduct.setId(1L);
		chemicalProduct.setName("P1");
		chemicalProduct.setDescription("P1 Description");
		
		return chemicalProduct;
	}
	
	public static Product getChemicalProductP100() {
		Product chemicalProduct = new ChemicalProduct(UnitMeasureMother.getUnitMeasureKilo(), 100.100, "/root/images1");
		chemicalProduct.setId(100L);
		chemicalProduct.setName("P100");
		chemicalProduct.setDescription("P100 Description");
		
		return chemicalProduct;
	}

	public static Product getNotExistsUpdatedChemicalProductP1001() {
		Product chemicalProduct = new ChemicalProduct(UnitMeasureMother.getUnitMeasureKilo(), 11.11, "/root/images1");
		chemicalProduct.setId(1001L);
		chemicalProduct.setName("P1 Modified");
		chemicalProduct.setDescription("P1 Modified Description");
		
		return chemicalProduct;
	}
}
