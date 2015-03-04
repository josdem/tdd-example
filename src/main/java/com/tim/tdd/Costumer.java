package com.tim.tdd;

import com.tim.tdd.bean.CostumerType;

public class Costumer {
	
	private Integer stars = 0;

	public CostumerType getStatus() {
		return stars >=5 ? CostumerType.PLUS : CostumerType.BASIC;
	}

	public Boolean isNewbie() {
		return stars==0;
	}

	public void addStar() {
		stars++;
	}

}
