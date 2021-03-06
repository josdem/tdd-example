package com.tim.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tim.tdd.bean.CostumerType;

public class TestCostumer {

	private Costumer costumer = new Costumer();

	@Test
	public void shouldKnowIfIsBasicCostumer() throws Exception {
		assertEquals(CostumerType.BASIC, costumer.getStatus());
	}

	@Test
	public void shouldKnowIfCostumerIsNewbie() throws Exception {
		assertTrue(costumer.isNewbie());
	}

	@Test
	public void shouldKnowIsNotNewbie() throws Exception {
		assertTrue(costumer.isNewbie());
		costumer.addStar();
		assertFalse(costumer.isNewbie());
	}
	
	@Test
  public void shouldBecomePlus() throws Exception {
      assertEquals(CostumerType.BASIC, costumer.getStatus());
      costumer.addStar();
      costumer.addStar();
      costumer.addStar();
      costumer.addStar();
      costumer.addStar();
      assertEquals(CostumerType.PLUS, costumer.getStatus());
  }

}
