package com.yngzy.decorator.myIOClass;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Title:LowerCaseInputStream.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午10:32:06
 *
 * @Copyright:Copyright(c) 2016
 */
public class LowerCaseInputStream extends FilterInputStream{

	/**
	 * @param in
	 */
	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c =super.read();
		return c==-1?c:Character.toLowerCase(c);
	}
	
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result= super.read(b, off, len);
		for(int i=off;i<off+len;i++){
			b[i]=(byte) Character.toLowerCase(b[i]);
		}
		return result;
	}
}
