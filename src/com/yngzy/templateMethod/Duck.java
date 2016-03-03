package com.yngzy.templateMethod;

/**
 * @author Young
 *
 * @date 2016年3月1日下午10:05:30
 *
 * @Title Duck.java
 */
public class Duck implements Comparable<Duck> {
	private String name;
	private int weight;
	
	
	public Duck(String name,int weight) {
		this.name=name;
		this.weight=weight;
	}
	
	
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return name+" weights "+weight;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	/* 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Duck o) {
		if(this.weight<o.weight)
			return -1;
		else if(this.weight==o.weight)
			return 0;
		else 
			return 1;
	}

}
