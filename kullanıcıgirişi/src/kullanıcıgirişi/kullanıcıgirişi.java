package kullanýcýgiriþi;

import java.util.Scanner;

public class kullanýcýgiriþi {

	public static void main(String[] args) {
		
		String userName,password,newuserName,newpassword;
		int s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("kullanýcý adýný giriniz: ");
		userName=input.next();
		
		System.out.println("passwordu giriniz: ");
		password=input.next();
		
		if(userName.equals("patika") && password.equals("java123")) {
			
			
			System.out.println("kullanýcý adýnýz ve þifreniz doðru: ");
			
		}
		else {
			System.out.println("kullanýcý adýnýz ve þifreniz yanlýþ: ");
			System.out.println("þifrenizi deðiþtirmek istermisiniz: ");
			System.out.println("1- kullanýcý adýnýzý deðiþtirin: ");
			System.out.println("2- þifrenizi deðiþtirin: ");
			System.out.println("3- kullanýcý adýnýz ve þifreniz deðiþtirin: ");
			s=input.nextInt();
			switch(s) {
				
			case 1:
				
				System.out.println("yeni kullanýzý adýnýzý giriniz: ");
				newuserName=input.next();
				if(newuserName.equals("patika")) {
				System.out.println("kullanýcý adýnýz bir önceki þifrenizle ayný olamaz:  ");
				break;
				}
				else {
					System.out.println("kullanýcý adýnýz deðiþti:  ");
					break;
				}
			case 2:
				
				System.out.println("yeni þirenizi giriniz: ");
				newpassword=input.next();
				if( newpassword.equals("java123")) {
				System.out.println("þifreniz bir önbceki þifrenizle ayný olamaz:  ");
				break;
				}
				else {
					System.out.println("þifreniz deðiþti:  ");
					break;
				}
			case 3:
				
				System.out.println("yeni kullanýzý adýnýzý giriniz: ");
				newuserName=input.next();
				System.out.println("yeni þirenizi giriniz: ");
				newpassword=input.next();
				if(newuserName.equals("patika")) {
					System.out.println("kullanýcý adýnýz  bir önceki kullanýcý adýnýzla ayný olamaz:  ");
				break;
				}
				
				
				else if(newpassword.equals("java123")) {
				
					System.out.println("þifreniz bir önceki þifrenizle ayný olamaz:  ");
					break;
				}
				else {
					System.out.println("kullanýcý adýnýz ve þifreniz deðiþti:  ");
					break;
				}
			
			}
		}


	}

}
