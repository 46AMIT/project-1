package com.banking;

import java.util.Scanner;
import static java.lang.System.*;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner amit=new Scanner(System.in);
		datavalidation dv=new datavalidation();
		out.println("Enter username");
		String username=amit.next();
		try {
			if(dv.checkUsername(username)) {//checking username 
			
				out.println("Enter Password");
				String password=amit.next();
					try {
						if(dv.checkPassword(password))//checking password
						{
							try {
							if(dv.logincheck(username, password)) {//checking for login
								out.println("Login Success");
							}
						}
							catch(Exception e) {
								out.println(e.getMessage());
							}
						}
					}
					catch(Exception e) {
						out.println(e.getMessage());
					}				
			}
			
		}
		catch(Exception e) {
			out.println(e.getMessage());
		}
	amit.close();//close scanner
	}

}
