package ktp_task4;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4_1 {
static ArrayList<String> format (int n,int place,String text){
	ArrayList<String> result = new ArrayList<String>(); 
	int numList=0;//������� ����� ������
	String workline=""; //������� ����� �����
	String [] lines = text.split(" "); //�������� ������ ����
	for (String word: lines) {
		if (place>=word.length()) {///���� � ������� ������ ���� �����
			workline+=word+" "; //��������� �����
			place = place - word.length();//���������� �����
			n++;
		}
		else {//���� ����� �� ������
			//�������� � ��������� ������� ������
			result.add(workline);
			numList++;
			place=7;
			workline=""; //������������ ������	
			workline+=word+ " "; //��������� �����
			place = place - word.length();//���������� �����
			n++;
		}
	}
	result.add(workline);
	return result;
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter");
		ArrayList<String> result = format(in.nextInt(),in.nextInt(),in.nextLine());
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
		in.close();
	}

}
