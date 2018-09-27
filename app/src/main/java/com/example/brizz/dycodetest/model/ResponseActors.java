package com.example.brizz.dycodetest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseActors{

	@SerializedName("actors")
	private List<ActorsItem> actors;

	public void setActors(List<ActorsItem> actors){
		this.actors = actors;
	}

	public List<ActorsItem> getActors(){
		return actors;
	}

	@Override
 	public String toString(){
		return 
			"ResponseActors{" + 
			"actors = '" + actors + '\'' + 
			"}";
		}
}