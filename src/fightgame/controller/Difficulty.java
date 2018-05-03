package fightgame.controller;

public enum Difficulty {

	RANDOM("Random"),
	EASY("Easy"),
	HARD("Hard");
	
	private String difficulty = "";
	
	Difficulty(String difficulty) {
		this.difficulty=difficulty;
	}
	public String getDifficulty() {
		return this.difficulty;
	}
}
