package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			sum +=sc.nextInt();
		}
		System.out.println("평균은 "+ (double)sum / 5 +"입니다");
		sc.close();
	}

}
