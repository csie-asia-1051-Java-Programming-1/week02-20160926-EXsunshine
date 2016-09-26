package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021057 張岳埕
 */

import java.util.Scanner;

public class ex02_105021057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double X = scn.nextInt();
		double Y = scn.nextInt();
		double m = Math.pow(X, 2) + Math.pow(Y, 2);
		if (X > 100 & Y > 100) {
			System.out.println("在員外");
		}
		if (X < -100 & Y < -100) {
			System.out.println("在員外");
		} else {
			m = Math.sqrt(m);
		}
		System.out.println(m);

	}

}
