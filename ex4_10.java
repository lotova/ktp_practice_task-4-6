package ktp_task4;

import java.util.Scanner;

public class ex4_10 {
//функция, возвращающая общее количество уникальных книг между всеми парами концов книги
	static  int countUniqueBooks(String Sequence, String bookEnd) {
		char symbol = bookEnd.charAt(0);
			char[] figur = Sequence.toCharArray();
			int count_fig=0;
			String buffer = "";//буффер
			int open = -1; //счетчик открывающих символов
			for (int i = 0; i< figur.length-1; i++) {
				if (figur[i]== symbol) {
					open=open*(-1);
				}
				else {
					if (open==1) {
						
					if (buffer.contains(String.valueOf(figur[i]))){
					} else count_fig++;
					buffer+=String.valueOf(figur[i]);
					}
				}		
			}	
			System.out.println(buffer);
			return count_fig;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter sentence and symbol by book end");
		System.out.println(countUniqueBooks(in.nextLine(),in.next()));	
		in.close();
	}

}
