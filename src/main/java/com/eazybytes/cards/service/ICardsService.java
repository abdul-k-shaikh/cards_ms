package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface ICardsService {
	/**
	 * 
	 * @param mobileNumber - Customer Mobile number
	 */
	void createCard(String mobileNumber);

	/**
	 * 
	 * @param mobileNumber - Input mobile Number
	 * @return Card Details based on a given mobileNumber
	 */
	CardsDto fetchCard(String mobileNumber);

	/**
	 * 
	 * @param cardsDto object
	 * @return boolean indicating if the update of card details is successful or not
	 */
	boolean updateCard(CardsDto cardsDto);

	/**
	 * @param mobileNumber - Input MobileNumber
	 * @return boolean indicating if the delete of card details is successful or not
	 */
	boolean deleteCard(String mobileNumber);
}
