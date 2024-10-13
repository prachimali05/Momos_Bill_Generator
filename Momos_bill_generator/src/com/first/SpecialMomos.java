package com.first;

public class SpecialMomos extends Momos {

	public SpecialMomos(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraChutney();
	}

	@Override
	public void addExtraCheese() {
	}

	@Override
	public void addExtraChutney() {
	}

	
}
