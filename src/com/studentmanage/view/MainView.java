package com.studentmanage.view;

import java.util.Scanner;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

//Ŭ���̾�Ʈ���� ���̴� ȭ���� ����ϴ� ����� �����ϴ� Ŭ����
//���θ޴�, ���ȭ��, ��ȸȭ�� -> �޼ҵ�(���)

public class MainView {
	
	public void mainMenu(StudentController stc) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.println("===== �л����� ���α׷� =====");
		System.out.println("1. ��ü�л���ȸ");
		System.out.println("2. �л���� ");
		System.out.println("3. �л����� " );
		System.out.println("4. �л��������");
		//������ ����� �л�����, �л����� �� �����Է¹ް�
		//������ �л��� ���� ����!
		System.out.println("0. ����");
	    System.out.print("�Է� : ");
	    int cho=sc.nextInt();
	    switch(cho) {
	       case 1 : stc.searchAllStudent(); break; 
	       case 2 : stc.insertStudent();break;
	       case 3 : stc.updateStudent();break;
	       case 4 : stc.insertGrade(); break;
	       case 0 : System.out.println("�л����� ���α׷��� �����մϴ�.");
	                return; //������ �극��ũ ����, ��ü �����.
	    
	              }
    
		      }
	    
	      }
	
	   public Student insertStudent() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("==== �л���� ====");
		   System.out.print("�̸� : ");
		   String name=sc.nextLine();
		   System.out.print("���� : ");
		   int age=sc.nextInt();
		   System.out.print("�б� : ");
		   sc.nextLine();
		   String school=sc.nextLine();
		   System.out.print("�ּ� : ");
		   String address=sc.nextLine();
		   Student s=new Student(name, age, school, address); //Ŭ���� ��ü s����
		   return s;
		   
	   }
	
	
	   public void printMsg(String msg) {
		   System.out.println("==== �ý��� �޼��� ====");
		   System.out.println(msg);
		   System.out.println("====================");
		   
	   }
     
	   public Student updateStudent() {
		   Scanner sc=new Scanner(System.in);
		   Student s= new Student();
		   System.out.println("====== �л����� ���� ======");
		   System.out.print("������ �л��� : ");
		   s.setName(sc.next()); //name�� �Է¹��� �� �������
		   System.out.print("������ ���� : ");
		   s.setAge(sc.nextInt());
		   sc.nextLine();
		   System.out.print("������ �ּ� : ");
		   s.setAddress(sc.nextLine());
		   
		   
		   return s;
		   
	   }
	   
	   public Student insertGrade() {
		   Scanner sc=new Scanner(System.in);
		   Student s= new Student();
		   System.out.println("====== �л����� �Է� ======");
		   System.out.print("�Է��� �л��� : ");
		   s.setName(sc.next()); 
		   System.out.print("�������� : ");
		   s.setKor(sc.nextInt());		
		   System.out.print("�������� : ");
		   s.setEng(sc.nextInt());
		   System.out.print("�������� : ");
		   s.setMath(sc.nextInt());
		   System.out.print("�ڵ����� : ");
		   s.setCoding(sc.nextInt());
		   return s;
	   }
	   
	   
	   
	   
	   
}
