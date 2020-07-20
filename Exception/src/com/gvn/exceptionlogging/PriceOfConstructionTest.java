

package com.gvn.exceptionlogging;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class PriceOfConstructionTest {

	@Test
	void constructionCostStandard()
	{
		PriceOfConstruction standardMaterial=new PriceOfConstruction();
		standardMaterial.takeInputParameters(55,"standard",false);
		double constructionPrice=standardMaterial.calConstructionCost();
		assertEquals(66000,constructionPrice,1);
	}
	@Test
	void constructionCostAboveStandard()
	{
		PriceOfConstruction aboveStandardMaterial=new PriceOfConstruction();
		aboveStandardMaterial.takeInputParameters(60,"aboveStandard");
		double constructionPrice=aboveStandardMaterial.calConstructionCost();
		assertEquals(90000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandard()
	{
		PriceOfConstruction highStandardMaterial=new PriceOfConstruction();
		highStandardMaterial.takeInputParameters(100,"highStandard",false);
		double constructionPrice=highStandardMaterial.calConstructionCost();
		assertEquals(180000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandardAutoHome()
	{
		PriceOfConstruction highStandardMaterialAuto=new PriceOfConstruction();
		highStandardMaterialAuto.takeInputParameters(400,"highStandard",true);
		double constructionPrice=highStandardMaterialAuto.calConstructionCost();
		assertEquals(1000000,constructionPrice,1);
	}

}
