/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class CardEssentials {

	private String cardNumber = null;

	private String expiryDate = null;

	/**
	 * The complete credit/debit card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * The complete credit/debit card number
	 */
	public void setCardNumber(String value) {
		this.cardNumber = value;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY
	 */
	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
