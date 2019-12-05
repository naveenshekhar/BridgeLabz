package com.bridgeLabz.deckOfCards.controller;

import com.bridgeLabz.deckOfCards.services.serviceImplementation.DeckImplementation;

public class Main 
{
	public static void main(String[] args)
	{
		DeckImplementation di=new DeckImplementation();
		
		di.initiallizeCard();
		di.suffleCard();
		di.displayCard();
		
	}

}
