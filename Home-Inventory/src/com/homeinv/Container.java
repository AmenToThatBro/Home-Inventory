package com.homeinv;
import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

public class Container 
{
	//public member
	
	//statics
	public static Integer totalContainers;
	
	//getters
	public Integer getContainerID() {
		return containerID;
	}
	public String getContainerName() {
		return containerName;
	}
	public Integer getAmountOfItems() {
		return items.size();
	}
	public void getAllItems() {
		for(int i = 0; i < items.size(); i++)
		{
			System.out.println(items.get(i).getName());//unsure if this will work. Attempting to grab the object at index of i
													   //then use that objects method to retrieve name. May be a better idea
													   //to overload the output operator?(c++) and get it to automatically handle
													   //this type of access.
		}
	}
	//setters
	public void setContainerName(String newName) {
		containerName = newName;
	}
	public void addContainerType(String newType) {
		types.add(newType);
	}
	//constructors
	public Container() {
		totalContainers++;
		containerID = totalContainers;
	}
	
	//private members
	private Integer containerID;
	private String containerName;
	private ArrayList <Item> items;
	private ArrayList <String> types;
	
}
