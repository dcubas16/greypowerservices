package org.greypowerservices.test.data.mother;

import org.greypowerservices.entities.UnitMeasure;

public class UnitMeasureMother {
	
	public static UnitMeasure getUnitMeasureKilo()
	{
		UnitMeasure unitMeasure = new UnitMeasure(1L, "Kilo", "kg.");
		return unitMeasure;
	}
	
	public static UnitMeasure getUnitMeasureUnidad()
	{
		UnitMeasure unitMeasure = new UnitMeasure(2L, "Unidad", "und.");
		return unitMeasure;
	}
	
	public static UnitMeasure getUnitMeasureTonelada()
	{
		UnitMeasure unitMeasure = new UnitMeasure(3L, "Tonelada", "ton.");
		return unitMeasure;
	}
}
