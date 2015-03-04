package com.tim.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tim.tdd.bean.CostumerType;

public class TestCostumer {

	@Test
	public void shouldGiveAnStar() throws Exception {
		Costumer costumer = new Costumer();
		assertEquals(CostumerType.BASIC, costumer.getStatus());
	}
	
}
