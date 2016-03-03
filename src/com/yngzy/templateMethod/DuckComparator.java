package com.yngzy.templateMethod;

import java.util.Comparator;

/**
 * @author Young
 *
 * @date 2016年3月1日下午10:23:42
 *
 * @Title ConcreteComparator.java
 */
public class DuckComparator implements Comparator<Duck> {

	/* 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Duck o1, Duck o2) {
		if(o1.getWeight()<o2.getWeight())
			return -1;
		else if(o1.getWeight()==o2.getWeight())
			return 0;
		else 
			return 1;
	}

}
