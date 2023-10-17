package org.ulpgc.is1.model;

import java.util.Date;

public class Payment {
	private Date date;
	private int amount;

	public Payment(Date date, int amount) {
		this.amount = amount;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public int getAmount() {
		return amount;
	}
}
