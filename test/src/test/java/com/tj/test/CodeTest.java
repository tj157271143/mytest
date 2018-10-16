package com.tj.test;

import org.junit.Test;

public class CodeTest {
	
	Code code = new Code();

	@Test
    public void test1(){
		code.test1(1,100);
    }

    @Test
    public void test2(){
    	code.test2(1,200);
    }
}
