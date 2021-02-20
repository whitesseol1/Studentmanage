package com.studentmanage.run;

import com.studentmanage.controller.StudentController;
import com.studentmanage.model.vo.Student;

public class Run {
	
	
	//StudentController.mainMenu()->MainView.mainMenu()
	public static void main(String[] args) {
		
		new StudentController().mainMenu();  //메인메뉴 실행
		
		//Student student; //변수선언. 생성된 객체 보관
//		Student student=new Student();
//		
//		Student.name="권설영";
		
	}

}
