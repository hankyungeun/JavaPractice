package com.kh.hospital_reception.model.vo;

import java.util.Arrays;

public class CustomArray<T> {
	protected Object[] arr = new Object[10];

	public  void add(Object element) {}
	public  void remove(Object element) {}
	public T get(int idx) {
		return (T)arr[idx];			//arr[idix]데이터 타입이 Object타입이므로 T타입으로 형변환 필요
	}
	public int find(Object element) {}
	public void print() {}
	
}
