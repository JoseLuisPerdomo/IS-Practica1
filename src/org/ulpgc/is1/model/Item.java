package org.ulpgc.is1.model;

public class Item {

	//Constructor
	private int quantity;
	private SparePart sparePart;
	private Repair repair;
	public Item(int quantity, SparePart sparePart, Repair repair){
		this.quantity = quantity;
		this.sparePart = sparePart;
		this.repair = repair;
	}


	//Getters & Setters
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public SparePart getSparePart() {
		return sparePart;
	}
	public void setSparePart(SparePart sparePart) {
		this.sparePart = sparePart;
	}
	public Repair getRepair() {
		return repair;
	}
	public void setRepair(Repair repair) {
		this.repair = repair;
	}
}
