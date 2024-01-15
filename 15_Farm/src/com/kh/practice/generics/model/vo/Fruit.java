package com.kh.practice.generics.model.vo;

public class Fruit extends Farm{
	private String name;
	
	public Fruit() {
		
	}
	public Fruit(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit)
            return this.name.equals(((Fruit)obj).name);
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
