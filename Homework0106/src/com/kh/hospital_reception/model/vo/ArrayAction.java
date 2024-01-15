package com.kh.hospital_reception.model.vo;

public interface ArrayAction {
	
	public  void add(String element);
	public  void remove(String element);
	public String get(int idx);
	public int find(String element);
	public void print();
}
