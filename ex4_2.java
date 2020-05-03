package ktp_task4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ex4_2 {
// функция, которая группирует строку в кластер скобок. Каждый кластер должен быть сбалансирован.
	static ArrayList<String> skobFormat (String line){
	ArrayList<String> result = new ArrayList<String>(); //результирующий список
	char[] scobs = line.toCharArray();
	int openS = 0; //счетчик открывающих скобок
	String klaster= "";//кластер-буффер
	for (int i = 0; i< line.length(); i++) {
		if (scobs[i]== '(') {
			openS++;		
			klaster+="(";
		}
		else if (scobs[i]==')') {
			openS--;
			klaster+=")";
			if (openS==0) {			
					result.add(klaster);
					klaster="";//освобождение буфера				
			}
	}
	}
	return  result;	
	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter line");
		ArrayList<String> klaster_scobs = skobFormat(in.next()); //результирующий список		
		System.out.print(klaster_scobs);
		in.close();		
		
	}

}
