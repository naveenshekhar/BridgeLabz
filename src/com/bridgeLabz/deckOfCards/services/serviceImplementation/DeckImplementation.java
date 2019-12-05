package com.bridgeLabz.deckOfCards.services.serviceImplementation;

import com.bridgeLabz.deckOfCards.services.DeckInterface;

public class DeckImplementation implements DeckInterface {
	String colors[] = { "club", "diamond", "heart", "spades" };
	String cards[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
	int numberofcards = (colors.length) * (cards.length);
	String deck[] = new String[numberofcards];

	@Override
	public void initiallizeCard() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < colors.length; j++) {
				deck[colors.length * i + j] = colors[j] + " " + cards[i];
			}
		}
	}

	@Override
	public void suffleCard() {
		for (int i = 0; i < numberofcards; i++) {
			int r = i + (int) (Math.random() * (numberofcards - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
	}

	@Override
	public void displayCard() {
		for(int i=0;i<numberofcards;i++)
		{
			System.out.println(deck[i]);
		}

	}

}
