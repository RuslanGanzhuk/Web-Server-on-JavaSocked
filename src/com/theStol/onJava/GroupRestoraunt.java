package com.theStol.onJava;

import java.util.ArrayList;
import java.util.List;

public class GroupRestoraunt {

	private String nameListRestouraunt;
	private List<Restoraunt> listRestoraunts = new ArrayList<>();
	
	public GroupRestoraunt(String nameListRestouraunt) {
		super();
		this.nameListRestouraunt = nameListRestouraunt;
	}

	public GroupRestoraunt() {
		super();
	}

	public void addRestoraunt(Restoraunt restoraunt){
		listRestoraunts.add(restoraunt);
	}
	
	public Restoraunt [] getRestoraunts(){
		Restoraunt []temp = new Restoraunt [listRestoraunts.size()];
		for (int i = 0; i < listRestoraunts.size();i++){
			temp[i] = listRestoraunts.get(i);
		}
		
		return temp;
	}


	public String getNameListRestouraunt() {
		return nameListRestouraunt;
	}

	public void setNameListRestouraunt(String nameListRestouraunt) {
		this.nameListRestouraunt = nameListRestouraunt;
	}
	
    
}
