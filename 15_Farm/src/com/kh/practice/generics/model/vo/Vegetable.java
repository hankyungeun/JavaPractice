package com.kh.practice.generics.model.vo;

public class Vegetable extends Farm{
	private String name;
	
	public Vegetable(){
		
	}
	public Vegetable(String kind, String name) {
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
		// TODO Auto-generated method stub
		if(obj instanceof Vegetable)
            return this.name.equals(((Vegetable)obj).name);
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
