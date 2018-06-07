package com.han.test;

import java.util.Scanner;

/**
 * 测试
 * @author 10262
 *
 */
public class Demo {
	//程序的入口
	public static void main(String[] args) {
		//键盘输入
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("输入你是煞笔：");
			String next = sc.nextLine();
			get(next);
		}
	}
	
	//自定义方法
	public static void get(String input){
		if(input.equals("1")){
			System.exit(0);
		}
	}
}
