/**
 * 
 */
package com.king.myThread;

/**
 * @author Administrator
 *
 */
public class Calculator {
    private int num1;
    private int num2;
    private int totle;
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/**
	 * @return the totle
	 */
	public int getTotle() {
		return num1+num2;
	}
	public void calculate(){
		totle=num1+num2;
	}
    
}
