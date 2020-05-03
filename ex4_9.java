package ktp_task4;

import java.util.Scanner;
//функци€, котора€ принимает два целых числа и возвращает true, если
//существует цифра, повтор€юща€с€ три раза подр€д в любом месте в num1 и два раза  -  в num2. 
public class ex4_9 {
	static boolean trouble (long first, long second) {
		//составл€ем строки из каждого числа 
		String num_1 = String.valueOf(first);
		String num_2 = String.valueOf(second);
		//формируем строки дл€ проверки (три раза повтор€юща€с€ цифра дл€ 1-го и два раза - дл€ 2-го
		//проверка осуществл€етс€ поочередно с каждой цифрой, пока не найдет его или пока не выйдет из цикла
		for (int i = 0; i<10;i++) {
			String d3 = String.valueOf(i)+String.valueOf(i)+String.valueOf(i);
			String d2 = String.valueOf(i)+String.valueOf(i);
			if ((num_1.contains(d3))&&(num_2.contains(d2))) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter numbers");
		System.out.println(trouble(in.nextLong(), in.nextLong()));
		in.close();
	}
}