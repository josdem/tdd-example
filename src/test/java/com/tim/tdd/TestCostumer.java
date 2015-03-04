package com.tim.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tim.tdd.bean.CostumerType;

public class TestCostumer {
	
	private Costumer costumer = new Costumer();

	@Test
	public void shouldGiveAnStar() throws Exception {
		assertEquals(CostumerType.BASIC, costumer.getStatus());
	}
	
	@Test
  public void shouldGain() throws Exception {
    assertTrue(costumer.isNewbie());
  }
	
}
