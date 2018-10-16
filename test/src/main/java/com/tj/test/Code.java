package com.tj.test;

/**
 * Hello world!
 *
 */
public class Code 
{

    public void test1(int startNumber , int endNumber){
        for(int i = startNumber; i <= endNumber; i++) {
            if(i % 3 == 0) {   //3的倍数
                System.out.println("Fizz");
            }else if(i % 5 == 0) { //是5的倍数
                System.out.println("Buzz");
            }else if(i % 3 == 0 && i % 5 == 0) {  //既是3的倍数又是5的倍数
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }
    }

   
    public void test2(int startNumber , int endNumber){
        for(int i = startNumber; i <= endNumber; i++) {
            String str = String.valueOf(i);
            if(i % 3 == 0 && i % 5 == 0 && str.indexOf("3") > -1 && str.indexOf("5") > -1) { //包含以下两种情况
                System.out.println("FizzBuzz:"+i);
            }else if(i % 3 == 0 && str.indexOf("3") > -1) { //是3的倍数，而且包含3
                System.out.println("Fizz");
            }else if(i % 5 == 0 && str.indexOf("5") > -1) { //是5的倍数，而且包含5
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
