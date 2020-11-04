package com.ingsw.MyListUtil;

import java.util.ArrayList;

public class MyListUtil {

	
	public ArrayList<Integer> ordinaCrescente(ArrayList<Integer> numbers){
		
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = 0; j < numbers.size(); j++) {
				if(i != j) {
					if(numbers.get(i) < numbers.get(j)) {
						Integer temp = numbers.get(i);
						numbers.set(i, numbers.get(j));
						numbers.set(j, temp);
					}
				}
			}
		}
		
		return numbers;
		
	}
	
	
	
	public ArrayList<Integer> ordinaDecrescente(ArrayList<Integer> numbers){
		
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = 0; j < numbers.size(); j++) {
				if(i != j) {
					if(numbers.get(i) > numbers.get(j)) {
						Integer temp = numbers.get(i);
						numbers.set(i, numbers.get(j));
						numbers.set(j, temp);
					}
				}
			}
		}
		
		return numbers;
		
	}
	
	
	
	
	
}
