package ktp_task4;

import java.util.Scanner;
//�������, ������� ��������� ��� ����� ����� � ���������� true, ����
//���������� �����, ������������� ��� ���� ������ � ����� ����� � num1 � ��� ����  -  � num2. 
public class ex4_9 {
	static boolean trouble (long first, long second) {
		//���������� ������ �� ������� ����� 
		String num_1 = String.valueOf(first);
		String num_2 = String.valueOf(second);
		//��������� ������ ��� �������� (��� ���� ������������� ����� ��� 1-�� � ��� ���� - ��� 2-��
		//�������� �������������� ���������� � ������ ������, ���� �� ������ ��� ��� ���� �� ������ �� �����
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