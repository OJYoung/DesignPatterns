package com.yngzy.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Young
 * @param <E>
 *
 * @date 2016年2月29日下午9:35:01
 *
 * @Title EnumerationInterator.java
 */
public class EnumerationInterator<E> implements Iterator<E> {

	private Enumeration<E> enume;
	
	public EnumerationInterator(Enumeration<E> enume) {
		this.enume = enume;
	}
	/* 
	 * @see java.util.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		
		return enume.hasMoreElements();
	}

	/* 
	 * @see java.util.Iterator#next()
	 */
	@Override
	public E next() {
		
		return enume.nextElement();
	}

	/* 
	 * @see java.util.Iterator#remove()
	 */
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
