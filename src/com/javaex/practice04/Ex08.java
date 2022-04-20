package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
//			switch (i) {
//			case 0:
//				break;
//			case 1:
//				while(true) {
//					if (lotto[i]!=lotto[i-1]) {
//						break;
//					}else {
//					lotto[i] = (int)(Math.random()*45)+1;
//					}
//				}
//				break;
//			case 2:
//				while(true) {
//					if (lotto[i]!=lotto[i-1] && lotto[i]!=lotto[i-2]) {
//						break;
//					}else {
//					lotto[i] = (int)(Math.random()*45)+1;
//					}
//				}
//				break;
//			case 3:
//				while(true) {
//					if (lotto[i]!=lotto[i-1] && lotto[i]!=lotto[i-2] && lotto[i]!=lotto[i-3]) {
//						break;
//					}else {
//					lotto[i] = (int)(Math.random()*45)+1;
//					}
//				}
//				break;
//			case 4:
//				while(true) {
//					if (lotto[i]!=lotto[i-1] && lotto[i]!=lotto[i-2] && lotto[i]!=lotto[i-3] && lotto[i]!=lotto[i-4]) {
//						break;
//					}else {
//					lotto[i] = (int)(Math.random()*45)+1;
//					}
//				}
//				break;
//			case 5:
//				while(true) {
//					if (lotto[i]!=lotto[i-1] && lotto[i]!=lotto[i-2] && lotto[i]!=lotto[i-3] && lotto[i]!=lotto[i-4] && lotto[i]!=lotto[i-5]) {
//						break;
//					}else {
//					lotto[i] = (int)(Math.random()*45)+1;
//					}
//				}
//				break;
//			}
		}
		for (int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
			}
	}
}


