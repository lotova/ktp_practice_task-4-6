package ktp_task4;

import java.util.Scanner;
//функция, которая преобразует строку в звездную стенографию
public class ex4_7 {
	static String toStarShorthand (String line) {
		int n = 1; //счетчик повторений
		String result = "";
		char [] sym = line.toCharArray();
		if (sym.length==0) {
			return "";
		}
		//текущий символ сравнивается со следующим и выводится в результирующую строку, если их больше нет
		for (int i = 0; i  < sym.length-1;i++) {
			if (sym[i] == sym[i+1]) {
				n++;
			} else {
				if (n!=1) {
					result+= String.valueOf(sym[i])+"*"+n;
				}
				else {
					result+= String.valueOf(sym[i]);
				}
			n=1;
			}
		}
		if (n!=1) {
		result+= String.valueOf(sym[sym.length-1])+"*"+n;
		} else result+= String.valueOf(sym[sym.length-1]);
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter line");
		System.out.println(toStarShorthand(in.nextLine()));
		in.close();
	}

}
