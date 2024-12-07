 package com.cjc.ims.app.serviceimpl;
 
import com.cjc.ims.app.servicei.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar  implements Cjc {
	
	List<Course> clist =new ArrayList<>();
	List<Faculty> flist =new ArrayList<>();
	List<Batch> blist =new ArrayList<>();
	List<Student> slist =new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void addCourse() {
		 Course c=new Course();
		 System.out.println("Enter Course Id");
		 c.setCid(sc.nextInt());
		 System.out.println("Enter Course Name");
		 c.setCname(sc.next());
		 clist.add(c);
	} 
		 
	@Override
	public void viewCourse() {
		   Iterator<Course> itr =clist.iterator();
		   while(itr.hasNext())
		   {
			   Course c=itr.next();
			  System.out.println("COURSE ID:" + c.getCid());
			  System.out.println("COURSE NAME:" + c.getCname());
		   }
	}

	@Override
	public void addFaculty() {
		Faculty f=new Faculty();
		 System.out.println("Enter faculty Id");
		 f.setFid(sc.nextInt());
		 System.out.println("Enter Faculty Name");
		 f.setFname(sc.next());
		 
		 viewCourse();
		 System.out.println("select any course to assign by using course ID");
		 
		   int cid=sc.nextInt();
		   for (Course c : clist) {
			   if(cid==c.getCid()) {
				   f.setCourse(c);
				   break;
			   }
			   else {
				   System.out.println("invalid course Id");
			   }
		}
		    flist.add(f);
		}
	
	
	@Override
	public void viewFaculty() {
		 Iterator<Faculty> itr =flist.iterator();
		   while(itr.hasNext())
		   {
			   Faculty f=itr.next();
			  System.out.println("FACULTY ID:" + f.getFid());
			  System.out.println("FACULTY NAME:" + f.getFname());
			  System.out.println("COURSE ID:" + f.getCourse().getCid());
			  System.out.println("COURSE NAME:" + f.getCourse().getCname());
		   }

	}
	

	@Override
	public void addBatch() {
		 Batch b=new Batch();
		 System.out.println("Enter Batch Id");
		 b.setBid(sc.nextInt());
		 System.out.println("Enter Batch Name");
		 b.setBname(sc.next());
		 
		 viewFaculty();
		 System.out.println("Select any faculty to assign by using faculty id");
		 int fid=sc.nextInt();
		   for (Faculty f : flist) {
			   if(fid==f.getFid()) {
				   b.setFaculty(f);
				   break;
			   }
			   else {
				   System.out.println("invalid faculty Id");
			   }
		}
		    blist.add(b);
	}

	@Override
	public void viewBatch() {
		 Iterator<Batch> itr =blist.iterator();
		   while(itr.hasNext())
		   {
			   Batch b=itr.next();
			  System.out.println("BATCH ID:" + b.getBid());
			  System.out.println("BATCH NAME:" + b.getBname());
			  System.out.println("FACULTY ID:" + b.getFaculty().getFid());
			  System.out.println("FACULTY NAME:" + b.getFaculty().getFname());
		      System.out.println("COURSE ID:" + b.getFaculty().getCourse().getCid());
			  System.out.println("COURSE NAME:" + b.getFaculty().getCourse().getCname());
		   }
		
		   }
	
	@Override
	public void addStudent() {
		 Student s=new Student();
		 System.out.println("Enter Student Id");
		 s.setSid(sc.nextInt());
		 System.out.println("Enter Student Name");
		 s.setSname(sc.next());
		 
		  viewFaculty();
		 System.out.println("Select any batch to assign by using batch id");
		 int bid=sc.nextInt();
		   for (Batch b : blist) {
			   if(bid==b.getBid()) {
				   s.setBatch(b);
				   break;
			   }
			   else {
				   System.out.println("invalid batch Id");
			   }
		}
      slist.add(s);
		
	}

	@Override
	public void viewStudent() {
		 Iterator<Student> itr =slist.iterator();
		   while(itr.hasNext())
		   {
			   Student s=itr.next();
			  System.out.println("COURSE ID:" + s.getSid());
			  System.out.println("COURSE NAME:" + s.getSname());
			  System.out.println("BATCH ID:" + s.getBatch().getBid());
			  System.out.println("BATCH NAME:" + s.getBatch().getBname());
			  System.out.println("FACULTY ID:" + s.getBatch().getFaculty().getFid());
			  System.out.println("FACULTY NAME:" + s.getBatch().getFaculty().getFname());
		      System.out.println("COURSE ID:" + s.getBatch().getFaculty().getCourse().getCid());
			  System.out.println("COURSE NAME:" + s.getBatch().getFaculty().getCourse().getCname());
		   }
		   }
	}
  		
		
    
	

