package org;

public class NewOne {
	private void sample() {
		System.out.println("task--1");
	}
	private void add() {
		System.out.println("task--2");
		
	}
	public static void main(String[] args) {
		NewOne a = new NewOne();
		a.add();
		a.sample();
	}

}
