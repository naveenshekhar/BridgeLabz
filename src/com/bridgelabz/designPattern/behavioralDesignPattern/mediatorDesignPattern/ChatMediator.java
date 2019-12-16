package com.bridgelabz.designPattern.behavioralDesignPattern.mediatorDesignPattern;

public interface ChatMediator
{
	public void sendMessage(String msg, User user);

	void addUser(User user); 

}
