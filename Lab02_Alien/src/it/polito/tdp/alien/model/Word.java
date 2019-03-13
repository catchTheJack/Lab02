package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class Word {
	private String alienWord;
	private List<String> traductions;
	
	
	public Word(String alienWord, String trad) {
		super();
		this.alienWord = alienWord;
		this.traductions = new ArrayList<String>();
		traductions.add(trad);
	}


	public String getAlienWord() {
		return alienWord;
	}


	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}


	public String getTraductions() {
		String tr = "";
		for(String temp : traductions) {
			tr = tr+temp+"\n";
		}
		return tr.substring(0,tr.length());
	}


	public void addTraductions(String t) {
		t.toLowerCase();
		if(traductions.contains(t)==false)
		traductions.add(t);
	}

	
}
