package com.example.hackathongame;

import java.util.Random;

public class LegendaryCreature extends CommonCreature{

	private final int attkprob = 50, healprob = 20;
	
	public LegendaryCreature(String nameID, int rarityID, int[] statList, int[] rollList) {
		super(nameID, rarityID, statList, rollList);
	}
	
	public int[] getMoveSet() {
		Random rand = new Random();
		int output=0; //slot output
		int[] moveset = new int[rarity];
		for(int i = 0; i < rarity; i++){
			int n = rand.nextInt(101);
			if (n <= attkprob) 
				output = 0;
			else if (n <= attkprob + healprob) 
				output = 1;
			else if (n <= attkprob + healprob + getSpecialProbability(attkprob, healprob, rarity))
				output = rollSet[0];
			else if (n <= attkprob + healprob + 2*getSpecialProbability(attkprob, healprob, rarity))
				output = rollSet[1];
			else if (n <= attkprob + healprob + 3*getSpecialProbability(attkprob, healprob, rarity))
				output = rollSet[2];
			else if (n <= attkprob + healprob + 4*getSpecialProbability(attkprob, healprob, rarity))
				output = rollSet[3];
			moveset[i] = output;
		}
		return moveset;
	}
}
