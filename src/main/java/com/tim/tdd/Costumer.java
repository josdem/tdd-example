package com.tim.tdd;

import com.tim.tdd.bean.CostumerType;

public class Costumer {
	
	private Integer stars = 0;

	public CostumerType getStatus() {
		return CostumerType.BASIC;
	}

	public Boolean isNewbie() {
		return stars==0;
	}

	public void addStar() {
		stars++;
	}

}
