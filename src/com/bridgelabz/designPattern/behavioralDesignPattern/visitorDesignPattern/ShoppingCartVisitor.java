package com.bridgelabz.designPattern.behavioralDesignPattern.visitorDesignPattern;

public interface ShoppingCartVisitor
{
	int visit(Book book);
	int visit(Fruit fruit);

}
