package ktp_task4;

import java.util.Scanner;


public class ex4_4 {
//Напишите функцию, которая вычисляет сверхурочную работу и оплату, связанную с сверхурочной работой.
	static String overTime (double begin, double end,double stavka, double plus) {
		double price;
		double begMin;
		double endMin;
	    stavka = stavka/60;
		begMin = (int)begin*60 + ((begin-(int)begin)*100);
		endMin = (int)end*60 + ((end-(int)end)*100);		
		if (begMin >= 1020) { //все время будет сверхурочным
			price = (endMin- begMin)*stavka*plus;
		}
		else {
			if (endMin<=1020) {//нет сверхурочных
				price = (endMin- begMin)*stavka;
			}
			else {
				price = ((1020-begMin)*stavka)+((endMin-1020)*stavka*plus);
			}
		}
		return "$"+String.valueOf(price);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);	
		System.out.println("enter parametrs");
		System.out.println(overTime(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble()));
		in.close();
	}

}
