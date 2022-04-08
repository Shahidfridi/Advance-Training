package com;

public class Medicine {
	public void displayLabel()
	{
	System.out.println("Company :  Apolo ");
	System.out.println("Address : Guntakal");
	}
	}
	class Tablet extends Medicine
	{
	public void displayLabel()
	{
	System.out.println("store in a cool dry place");
	}
	}
	class Syrup extends Medicine
	{
	public void displayLabel()
	{
	System.out.println("Consumption as directed by the physician");
	}
	}
	class Ointment extends Medicine
	{
	public void displayLabel()
	{
	System.out.println("for external use only");
	}
	}

