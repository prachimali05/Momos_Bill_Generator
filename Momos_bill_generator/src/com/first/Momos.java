package com.first;

public class Momos {
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 50;
	private int extraChutneyPrice = 60;
	private int packPrice = 30;
	private int plainMomoPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraChutneyAdded = false;
	private boolean isOptedForParcel = false;
	
	public Momos(Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 150;
		} else {
			this.price = 250;
		}
		plainMomoPrice = this.price;
	}
	
	/*public void getMomoPrice() {
		System.out.println(this.price);
	}*/
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
	//	System.out.println("Extra cheese Added");
		this.price += extraCheesePrice;
	}
	
	public void addExtraChutney() {
		isExtraChutneyAdded = true;
		//System.out.println("Extra Chutney Added");
		this.price += extraChutneyPrice;
	}
	
	public void packParcel() {
		 isOptedForParcel = true;
		// System.out.println("Parcel opted");
		 this.price += packPrice;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Momos: "+plainMomoPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese Added: "+extraCheesePrice+ "\n";
		}
		if(isExtraChutneyAdded) {
			bill += "Extra Chutney Added: "+extraChutneyPrice+ "\n";
		}
		if(isOptedForParcel) {
			bill += "Pacel Opted: "+packPrice+ "\n";
		}
		bill += "Bill: "+this.price + "\n";
		System.out.println(bill);
	}
	

}
