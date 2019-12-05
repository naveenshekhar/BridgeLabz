package com.bridgeLabz.deckOfCards.controller;

import com.bridgeLabz.deckOfCards.Utility.Queue;

public class Player {
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		String colors[] = { "club", "diamond", "heart", "spades" };
		String cards[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };

		for (String str : colors) {
			q.enqueue(str);
			for (String str1 : cards) {
				q.enqueue(str1);
			}
		}
		q.show();

	}
}
