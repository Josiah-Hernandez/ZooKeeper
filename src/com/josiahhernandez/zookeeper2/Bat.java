package com.josiahhernandez.zookeeper2;

public class Bat {
	public String Name = "Bat";
	public int energyLevel = (300);

	public void fly() {
	System.out.println(Name + "energy" + " " + energyLevel + " " + "Has Flown");
	energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println(Name + " " + "The Bat Has The Humans" + energyLevel);
		energyLevel += 25;
	}
	
	public void attacksTown() {
		System.out.println("Town Fire Alarm Is Ringing" + energyLevel);
		energyLevel -= 100;
	}
	}