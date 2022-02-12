package com.homeinv;
import java.util.ArrayList;

public class Room {
	//statics
	public Integer totalRooms;
	
	
	//getters
	public Integer getRoomID() {
		return roomID;
	}
	public String getRoomName() {
		return roomName;
	}
	public RoomType getRoomType() {
		return type;
	}
	public Container returnContainer(Integer index) {
		return containers.get(index);
	}
	
	//setters
	public void setRoomName(String n) {
		if(n.length() > 0 && n.length() <= 32) {
			roomName = n;
		}
		else {
			System.out.println("Room names must be");
			System.out.println("less that 32 characters");
		}
	}
	public void setRoomType(RoomType newType) {
		type = newType;
	}	
	public void addContainer(Container newCont) {
		containers.add(newCont);		
	}
	
	//constructors
	public Room() {
		totalRooms++;
		roomID = totalRooms;
	}
	
	//private members
	private Integer roomID;
	private String roomName;
	private RoomType type;
	private ArrayList <Container> containers;
	private ArrayList <RoomType> roomTypes;
}
