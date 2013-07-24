package com.gonevertical.test;

public class Blank {
 
    private void run() {
        System.out.println("fast");
    }
    
	public void newMethodOne() {
		System.out.println("Hi");
	}
	
	public void newMethodTwo() {
		System.out.println("there");
	}
	
	public void newMethodThree() {
		System.out.println("Do I conflict?");
		
		if (true) {
			System.out.print("Maybe...");
		}
	}
	
}
