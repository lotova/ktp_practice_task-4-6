package ktp_task4;

import java.util.Scanner;

public class ex4_3 {
//функции, замен€ющие заглавную буквы на _ и обратно (в camelCase, либо в snake_case), реализованные разными способами
	static String toCamelCase(String line){//_ => UpperCase
		String buff="";
		while (line.contains("_")) { //проверка необходимости замены, не осуществл€етс проход по всей строке и посимвольна€ проверка
			buff+= line.substring(0, line.indexOf("_"));
			buff+=line.substring(line.indexOf("_")+1,line.indexOf("_")+2).toUpperCase();
			buff+=line.substring(line.indexOf("_")+2,line.length());
			line=buff;//обновл€ем исходник дл€ след проверки
			buff="";//очищаем буфер
		}
		return line;
	}
	static String toSnakeCase(String line) {//_
		String buff="";
		//создаеним символьный массив, преобразованный из строки
		char [] check = line.toCharArray();
		//один проход всей строки посимвольно
		for (int i=0;i<line.length();i++) {
			if (Character.isUpperCase(check[i])) {
				buff+="_"+ String.valueOf(check[i]).toLowerCase();
			}
			else {
			buff+=String.valueOf(check[i]);
		}
		}
		return buff;
		}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What to Camel Case?");
		System.out.println(toCamelCase(in.next()));
		System.out.print("What to Snake Case?");
		System.out.println(toSnakeCase(in.next()));
		in.close();
	}

}
