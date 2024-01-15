package com.kh.practice.generics.model.vo;

public class Nut extends Farm{
	private String name;
	
	public Nut() {
		
	}
	public Nut(String kind, String name) {
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
		if(obj instanceof Nut)
            return this.name.equals(((Nut)obj).name);
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
    
}
