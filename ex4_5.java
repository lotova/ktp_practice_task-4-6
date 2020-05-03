package ktp_task4;

import java.util.Scanner;
//205 pounds 73 inches
public class ex4_5 {
//вычисление ИМТ по разным типам мер измерения веса и роста и определение типа имт
	static String BMI (String weight, String height) {
		try {
			 weight = weight.trim(); 
			 double num_weight = Double.parseDouble(weight.substring(0, weight.indexOf(' ')));
			if (weight.substring(weight.indexOf(' ')+1, weight.length()).contentEquals("pounds")) {
				num_weight = num_weight/2.2; //перевод фунтов в килограммы
			}else
			{
				if (weight.substring(weight.indexOf(' ')+1, weight.length()).contentEquals("kilos")) {
					
				}else {
					return"enter right weight";
				}
			}
			height = height.trim();
			double num_height = Double.parseDouble(height.substring(0, height.indexOf(' ')));
			if (height.substring(height.indexOf(' ')+1, height.length()).contentEquals("inches")) {
				num_height = num_height/39.37; //перевод дюймов в метры
			}else {
				if (height.substring(height.indexOf(' ')+1, height.length()).contentEquals("meters")) {
					
				}else {
					return "enter right height";
				}
			}
			double BMI_check = Math.round(num_weight/Math.pow(num_height, 2)* 10d)/10d;
			//System.out.println(num_height+ "; " + num_weight);
			
			if (BMI_check<18.5) {
				return BMI_check + " Underweight";
			}else {
				if ((BMI_check>=18.5)&&(BMI_check<=24.9)){
					return BMI_check + " Normal weight";
				}else {
					if (BMI_check>=25) {
						return BMI_check + " Overweight";
					}
					else {
						return "something wrong with you";
					}
				}			
			}		
	}catch (Exception e) {
		return "error of parametrs";
	}		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter parametrs of your body");
		System.out.println(BMI(in.nextLine(),in.nextLine()));
in.close();
	}

}
