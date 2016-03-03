package com.yngzy.adapter;

import com.yngzy.adapter.interfaces.Duck;
import com.yngzy.adapter.interfaces.Turkey;

/**
 * @author Young
 *
 * @date 2016年2月29日下午9:08:56
 *
 * @Title TurkeyAdapter.java
 */
public class TurkeyAdapter implements Duck{

	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey=turkey;
	}
	/* 
	 * @see com.yngzy.adapter.interfaces.Duck#quack()
	 */
	@Override
	public void quack() {
		turkey.gobble();
	}

	/* 
	 * @see com.yngzy.adapter.interfaces.Duck#fly()
	 */
	@Override
	public void fly() {
		for(int i=0;i<5;i++){
			turkey.fly();
		}
	}

}
