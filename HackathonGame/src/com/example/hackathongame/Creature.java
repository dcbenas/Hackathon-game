package com.example.hackathongame;

public interface Creature {
	String getName();
	String[] getStats();
	int getRarity();
	String getImageID();
	void setName(String name);
	void setRarity(int rarity);
	void setImageID(String imgID);
}
