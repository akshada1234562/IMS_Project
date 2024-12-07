package com.cjc.ims.app.client;

import java.util.Scanner;

import com.cjc.ims.app.servicei.Cjc;
import com.cjc.ims.app.serviceimpl.Karvenagar;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cjc  c =new Karvenagar();
		while (true)
		{
		System.out.println("ENTER CHOISE"+"\n1.ADD COURSE"+ "\n2.VIEW COOURSE"
		+"\n3.ADD FACULTY"+"\n4.VIEW FACULTY"
	    +"\n5.ADD BATCH"+"\n6.VIEW BATCH"
		+"\n7. ADD STUDENT"+"\n8.VIEW STUDENT");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("***Main****");
				c.addCourse();
				System.out.println("***end***");
				break;
				
			case 2:
				System.out.println("*****");
				c.viewCourse();
				System.out.println("******");
				break;
				
			case 3:
				System.out.println("******");
				c.addFaculty();
				System.out.println("*********");
				break;
				
			case 4:
				System.out.println("***********");
				c.viewFaculty();
				System.out.println("**********");
				break;
				
			case 5:
				System.out.println("**********");
				c.addBatch();
				System.out.println("**********");
				break;
				
			case 6:
				System.out.println("************");
				c.viewBatch();
				System.out.println("**********");
				break;
				
			case 7:
				System.out.println("**************");
				c.addStudent();
				System.out.println("**************");
				break;
				
			case 8:
				System.out.println("**********");
				c.viewStudent();
				System.out.println("***********");
				break;
				
				default:
					System.out.println("Invalid choise");
			}
		}
	

}
}


