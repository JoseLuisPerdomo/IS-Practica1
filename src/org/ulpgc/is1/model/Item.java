package org.ulpgc.is1.model;
import java.util.List;

public class Item {

	//Constructor
	private int quantity;
	private SparePart sparePart;
	public Item(int quantity, SparePart sparePart){
		this.quantity = quantity;
		this.sparePart = sparePart;
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
	public List<Repair> getRepair() {
		return sparePart.getRepairs();
	}
}
