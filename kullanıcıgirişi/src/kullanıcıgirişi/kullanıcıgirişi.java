package kullan�c�giri�i;

import java.util.Scanner;

public class kullan�c�giri�i {

	public static void main(String[] args) {
		
		String userName,password,newuserName,newpassword;
		int s;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("kullan�c� ad�n� giriniz: ");
		userName=input.next();
		
		System.out.println("passwordu giriniz: ");
		password=input.next();
		
		if(userName.equals("patika") && password.equals("java123")) {
			
			
			System.out.println("kullan�c� ad�n�z ve �ifreniz do�ru: ");
			
		}
		else {
			System.out.println("kullan�c� ad�n�z ve �ifreniz yanl��: ");
			System.out.println("�ifrenizi de�i�tirmek istermisiniz: ");
			System.out.println("1- kullan�c� ad�n�z� de�i�tirin: ");
			System.out.println("2- �ifrenizi de�i�tirin: ");
			System.out.println("3- kullan�c� ad�n�z ve �ifreniz de�i�tirin: ");
			s=input.nextInt();
			switch(s) {
				
			case 1:
				
				System.out.println("yeni kullan�z� ad�n�z� giriniz: ");
				newuserName=input.next();
				if(newuserName.equals("patika")) {
				System.out.println("kullan�c� ad�n�z bir �nceki �ifrenizle ayn� olamaz:  ");
				break;
				}
				else {
					System.out.println("kullan�c� ad�n�z de�i�ti:  ");
					break;
				}
			case 2:
				
				System.out.println("yeni �irenizi giriniz: ");
				newpassword=input.next();
				if( newpassword.equals("java123")) {
				System.out.println("�ifreniz bir �nbceki �ifrenizle ayn� olamaz:  ");
				break;
				}
				else {
					System.out.println("�ifreniz de�i�ti:  ");
					break;
				}
			case 3:
				
				System.out.println("yeni kullan�z� ad�n�z� giriniz: ");
				newuserName=input.next();
				System.out.println("yeni �irenizi giriniz: ");
				newpassword=input.next();
				if(newuserName.equals("patika")) {
					System.out.println("kullan�c� ad�n�z  bir �nceki kullan�c� ad�n�zla ayn� olamaz:  ");
				break;
				}
				
				
				else if(newpassword.equals("java123")) {
				
					System.out.println("�ifreniz bir �nceki �ifrenizle ayn� olamaz:  ");
					break;
				}
				else {
					System.out.println("kullan�c� ad�n�z ve �ifreniz de�i�ti:  ");
					break;
				}
			
			}
		}


	}

}
