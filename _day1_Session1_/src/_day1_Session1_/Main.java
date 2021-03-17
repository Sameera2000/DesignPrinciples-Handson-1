package _day1_Session1_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair!");
		String processoption=sc.next().toLowerCase();
		PhoneOrderRepair por=new PhoneOrderRepair();
		String productdetail="";
		switch(processoption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productdetail=sc.next().trim();
			por.ProcessOrder(productdetail);
			break;
		case "repair":
			System.out.println("Phone or Accesory");
			String producttype=sc.next().trim();
			if(producttype.equals("phone")) {
				System.out.println("please provide the phone model name");
				productdetail=sc.next().trim();
				por.ProcessPhoneRepair(productdetail);
			}
			else {
				System.out.println("please provide the Accessory detail like headphone,charger,etc..");
				productdetail=sc.next().trim();
				por.ProcessAccessoryRepair(productdetail);
			}
			break;
		default:
			break;
		}
		sc.close();

	}

}
