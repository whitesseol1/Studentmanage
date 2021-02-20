package com.studentmanage.controller;

import com.studentmanage.model.dao.StudentDao;
import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

//�л��������α׷�
//1. �л��� �� 5���� ������ �� ����
//2. �л����� �̸�, ����, �б�, �ּ�, ����, ����, ����, �ڵ�
//3.�ֿ�޴�: �л����, �л���ȸ(�̸�, ����), �������(�� �л�)

//Student�� �����ϴ� �ʿ��� ȭ����, ������ ���������� ȣ���ϴ� ������ ��ü
public class StudentController {
	
	private StudentDao dao=new StudentDao(); //���� ���� new������ �ʿ�, �������� �̰ɷ� ��� ��� �ʿ�,����������
	//��������� ����!
	

	public void mainMenu() {
		dao.loadFile();
		
		new MainView().mainMenu(this); //���κ� ���� //new StudentController(); �ּҰ�����
		//���� new�� �����Ȱ� ������� 
		
		dao.saveFile();
		
		
		
		
	}
	
	public void insertStudent() {
		//1.�л������� �Է��� viewȭ��
		Student s=new MainView().insertStudent(); //  �ؿ�ó�� ���ٰ���
	    //2. StudentDao ������ ����ҿ� �����ϱ�
		boolean flag=dao.insertStudent(s);   //
		//3. �Է� ����� ���� ����ڿ��� �޼����� ���
		String msg=flag?"�Է¼���" : "������ ������ �����մϴ�";
		new MainView().printMsg(msg);
		
	}
	
	public void searchAllStudent() {
		//StudentDao�� ��������� ����Ǿ� �ִ� �����͸� ��� -> ����ڿ��� �����ִ� ��
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
		
	}
	
	public void updateStudent() {
		//������ �л��� �Ѹ� �����ؼ� �����͸� ����
     	String data=dao.searchAllStudent();
     	new MainView().printMsg(data);
     	
     	//���̿� �ּҸ� �����ϴ� ��
     	
     	Student s=new MainView().updateStudent(); //������ ������ �޾ƿ�.
     	
     	//������ �Ǹ� true�� ��ȯ, �����ϸ� false���� ��ȯ
     	boolean flag=dao.updateStudent(s);
     	
     	String msg=flag?"��������" : "��������" ;
     	new MainView().printMsg(msg);
     	
	}
	
	public void insertGrade() {
		
		Student s=new MainView().insertGrade();
		
		boolean flag=dao.insertGrade(s);
		
		String msg=flag?"��������" : "��������" ;
		new MainView().printMsg(msg);
		
	}
	
	
	
	
	
}
