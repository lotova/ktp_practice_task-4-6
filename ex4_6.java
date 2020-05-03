package ktp_task4;

import java.util.Scanner;

public class ex4_6 {
static int Multy_fig(int x) {
	int res = 1;
	while (x!=0) {
		res = res * (x%10);
		x = x/10;
	}
	return res;
}
static int bugge (int num) {
	int count=0;
	while (num>=10) {
		num = Multy_fig(num);
		count++;
	}
		return count;
}
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter number");
		System.out.println(bugge(in.nextInt()));
		in.close();
	}

}
