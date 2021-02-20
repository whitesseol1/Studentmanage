package com.studentmanage.controller;

import com.studentmanage.model.dao.StudentDao;
import com.studentmanage.model.vo.Student;
import com.studentmanage.view.MainView;

//학생관리프로그램
//1. 학생은 총 5명을 저장할 수 있음
//2. 학생정보 이름, 나이, 학교, 주소, 국어, 영어, 수학, 코딩
//3.주요메뉴: 학생등록, 학생조회(이름, 나이), 성적등록(한 학생)

//Student를 관리하는 필요한 화면기능, 데이터 저장관리기능 호출하는 역할의 객체
public class StudentController {
	
	private StudentDao dao=new StudentDao(); //쓰기 위해 new연산자 필요, 만들어놓고 이걸로 계속 사용 필요,데이터저장
	//멤버변수로 저장!
	

	public void mainMenu() {
		dao.loadFile();
		
		new MainView().mainMenu(this); //메인뷰 실행 //new StudentController(); 주소가져옴
		//런에 new로 생성된거 집어넣음 
		
		dao.saveFile();
		
		
		
		
	}
	
	public void insertStudent() {
		//1.학생정보를 입력할 view화면
		Student s=new MainView().insertStudent(); //  밑에처럼 접근가능
	    //2. StudentDao 데이터 저장소에 저장하기
		boolean flag=dao.insertStudent(s);   //
		//3. 입력 결과에 따라 사용자에게 메세지를 출력
		String msg=flag?"입력성공" : "저장할 공간이 부족합니다";
		new MainView().printMsg(msg);
		
	}
	
	public void searchAllStudent() {
		//StudentDao의 멤버변수에 저장되어 있는 데이터를 출력 -> 사용자에게 보여주는 것
		String data=dao.searchAllStudent();
		new MainView().printMsg(data);
		
	}
	
	public void updateStudent() {
		//저장한 학생을 한명 선택해서 데이터를 수정
     	String data=dao.searchAllStudent();
     	new MainView().printMsg(data);
     	
     	//나이와 주소를 변경하는 것
     	
     	Student s=new MainView().updateStudent(); //수정할 내용을 받아옴.
     	
     	//수정이 되면 true값 반환, 실패하면 false값을 반환
     	boolean flag=dao.updateStudent(s);
     	
     	String msg=flag?"수정성공" : "수정실패" ;
     	new MainView().printMsg(msg);
     	
	}
	
	public void insertGrade() {
		
		Student s=new MainView().insertGrade();
		
		boolean flag=dao.insertGrade(s);
		
		String msg=flag?"수정성공" : "수정실패" ;
		new MainView().printMsg(msg);
		
	}
	
	
	
	
	
}
