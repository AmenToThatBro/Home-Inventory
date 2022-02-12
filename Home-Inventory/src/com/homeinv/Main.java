package com.homeinv;

public class Main {

	public static void main(String[] args) {
		Container.totalContainers = 0;
		
		Container conA = new Container();
		
		conA.setContainerName("Office Desk");
		Container conB = new Container();
		Container conC = new Container();
		
		System.out.println(conA.getContainerID());
		System.out.println(conB.getContainerID());
		System.out.println(conC.getContainerID());
		
		
		
		System.out.println(conA.getContainerName());

	}

}
