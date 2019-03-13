package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class AlienModel {
	private List<Word> dictionary;
	
	public AlienModel(){
		this.dictionary = new ArrayList<Word>();
	}
	

	public String getTrad(String w) {
		w.toLowerCase();
		String trad="";
		for(Word temp : dictionary) {
			if(temp.getAlienWord().compareTo(w)==0) {
				trad=temp.getTraductions();
				break;
			}	
		}
		return trad;
	}
	
	public void addWord(String w) {
		w.toLowerCase();
		String[] sx=w.split(" ");
		int j = existWord(sx[0].trim());
		if(j!=0) {
			dictionary.get(j).addTraductions(sx[1].trim());
		}
		else if(j==0) {
			Word nw = new Word(sx[0].trim(), sx[1].trim());
			dictionary.add(nw);
		}
		
	}
	
	
	public int existWord(String wx) {
		int j=0;
		for(int i = 0; i<dictionary.size();i++) {
			if(dictionary.get(i).getAlienWord().compareTo(wx)==0) {
				j=i;
				break;
			}
		}
		return j;
	}
	
}
