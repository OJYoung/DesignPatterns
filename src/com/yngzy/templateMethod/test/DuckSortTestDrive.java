package com.yngzy.templateMethod.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yngzy.templateMethod.Duck;
import com.yngzy.templateMethod.DuckComparator;

/**
 * @author Young
 *
 * @date 2016年3月1日下午10:12:07
 *
 * @Title DuckSortTestDrive.java
 */
public class DuckSortTestDrive {

	/**
	 * Title:@param args
	 */
	public static void main(String[] args) {
		Duck[] ducks = {
				new Duck("Daffy",8),
				new Duck("Dewey",2),
				new Duck("Howard",7),
				new Duck("Louie",2),
				new Duck("Donald",10),
				new Duck("Huey",3)
				};
		
		
		List<Duck> list = new ArrayList<Duck>();
		list.addAll(Arrays.asList(ducks));
		
		System.out.println("Before sorting------------: ");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\n After sorting----------:");
		display(ducks);
		
		
	
		System.out.println("\n\nBefore list sorting------------: ");
		display(list);
		
		list.sort(new DuckComparator());
		System.out.println("\n After list sorting----------:");
		display(list);
		
		
	}

	/**
	 * Title:@param list
	 */
	private static void display(List<Duck> list) {
		for(Duck duck:list){
			System.out.println(duck);
		}
	}

	/**
	 * Title:@param ducks
	 */
	private static void display(Duck[] ducks) {
		for(Duck duck:ducks){
			System.out.println(duck);
		}
	}

}
