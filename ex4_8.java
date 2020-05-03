package ktp_task4;

import java.util.Scanner;

public class ex4_8 {
//проверка рифмующихся строки
	static boolean doesRhyme(String a, String b) {
		String [] str1 = a.split(" ");
		String [] str2 = b.split(" ");
		//считывание последнего слова в каждом предложении
		StringBuffer last1 = new StringBuffer(str1[str1.length-1].toLowerCase());
		StringBuffer last2 = new StringBuffer(str2[str2.length-1].toLowerCase());
		//удаление из слов всех символов кроме гласных
		String glus_sounds = "aeiuyo";
		for (int i = 0; i<last1.length();i++) {
			if (glus_sounds.contains(String.valueOf(last1.charAt(i)))) {			
			}else {
				last1.deleteCharAt(i);
				i--;
			}
		}		
		for (int i = 0; i<last2.length();i++) {
			if (glus_sounds.contains(String.valueOf(last2.charAt(i)))) {			
			}else { 
				last2.deleteCharAt(i);
				i--;
			}
		}
		if (last1.toString().contentEquals(last2.toString())) {
			return true;
		} else return false;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter sentences");
		System.out.println(doesRhyme(in.nextLine(), in.nextLine()));
		in.close();
	}

}
