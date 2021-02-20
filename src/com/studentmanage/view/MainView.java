package com.studentmanage.view;

import java.util.Scanner;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

//클라이언트에게 보이는 화면을 출력하는 기능을 제공하는 클래스
//메인메뉴, 등록화면, 조회화면 -> 메소드(기능)

public class MainView {
	
	public void mainMenu(StudentController stc) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("===== 학생관리 프로그램 =====");
		System.out.println("1. 전체학생조회");
		System.out.println("2. 학생등록 ");
		System.out.println("3. 학생수정 " );
		System.out.println("4. 학생점수등록");
		//점수를 등록할 학생선정, 학생선정 후 점수입력받고
		//선정된 학생의 점수 수정!
		System.out.println("0. 종료");
	    System.out.print("입력 : ");
	    int cho=sc.nextInt();
	    switch(cho) {
	       case 1 : stc.searchAllStudent(); break; 
	       case 2 : stc.insertStudent();break;
	       case 3 : stc.updateStudent();break;
	       case 4 : stc.insertGrade(); break;
	       case 0 : System.out.println("학생관리 프로그램을 종료합니다.");
	                return; //리턴이 브레이크 역할, 전체 종료됨.
	    
	              }
    
		      }
	    
	      }
	
	   public Student insertStudent() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("==== 학생등록 ====");
		   System.out.print("이름 : ");
		   String name=sc.nextLine();
		   System.out.print("나이 : ");
		   int age=sc.nextInt();
		   System.out.print("학교 : ");
		   sc.nextLine();
		   String school=sc.nextLine();
		   System.out.print("주소 : ");
		   String address=sc.nextLine();
		   Student s=new Student(name, age, school, address); //클래스 객체 s생성
		   return s;
		   
	   }
	
	
	   public void printMsg(String msg) {
		   System.out.println("==== 시스템 메세지 ====");
		   System.out.println(msg);
		   System.out.println("====================");
		   
	   }
     
	   public Student updateStudent() {
		   Scanner sc=new Scanner(System.in);
		   Student s= new Student();
		   System.out.println("====== 학생정보 수정 ======");
		   System.out.print("수정할 학생명 : ");
		   s.setName(sc.next()); //name에 입력받은 값 집어넣음
		   System.out.print("수정할 나이 : ");
		   s.setAge(sc.nextInt());
		   sc.nextLine();
		   System.out.print("수정할 주소 : ");
		   s.setAddress(sc.nextLine());
		   
		   
		   return s;
		   
	   }
	   
	   public Student insertGrade() {
		   Scanner sc=new Scanner(System.in);
		   Student s= new Student();
		   System.out.println("====== 학생점수 입력 ======");
		   System.out.print("입력할 학생명 : ");
		   s.setName(sc.next()); 
		   System.out.print("국어점수 : ");
		   s.setKor(sc.nextInt());		
		   System.out.print("영어점수 : ");
		   s.setEng(sc.nextInt());
		   System.out.print("수학점수 : ");
		   s.setMath(sc.nextInt());
		   System.out.print("코딩점수 : ");
		   s.setCoding(sc.nextInt());
		   return s;
	   }
	   
	   
	   
	   
	   
}
