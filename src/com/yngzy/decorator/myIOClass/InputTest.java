package com.yngzy.decorator.myIOClass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Title:InputTest.java
 *
 * @author Young
 *
 *	@date 2016-2-15 下午10:37:40
 *
 * @Copyright:Copyright(c) 2016
 */
public class InputTest {

	public static void main(String[] args) {
		int c;
		try {
			
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/com/yngzy/decorator/myIOClass/test.txt")));
		
		while((c=in.read())>=0){
			System.out.print((char)c);
		}
		in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
