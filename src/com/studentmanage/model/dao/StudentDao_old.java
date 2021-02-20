package com.studentmanage.model.dao;

import com.studentmanage.model.vo.Student;

//클라이언트가 등록하는 학생들을 관리,
//맴버변수(5개), 등록, 조회, 수정
    public class StudentDao_old{

    	private Student s1;
    	private Student s2;
    	private Student s3;   	
	    private Student s4;
	    private Student s5;
	
	public StudentDao_old() {  }
	
	public boolean insertStudent(Student s) {  //String으로 입력실패 넣을수도 있으나 숫자,boolean메소드가 더 합리적
		//멤버변수 중 비어있는 변수에 값을 넣으면
		//비어있는건 멤버변수의 값이 null인것;
		boolean flag=true;
		if(s1==null) {
			s1=s;
		}else if(s2==null) {
			s2=s;
		}else if(s3==null) {
			s3=s;
		}else if(s4==null) {
			s4=s;
		}else if(s5==null){
			s5=s;
				
		}else {	flag=false;
			
		}
		return flag;
	}

	public String searchAllStudent() {
		String value="";
		if(s1!=null) {
			value+=s1.getName()+"\t"+s1.getAge()+"\t"+s1.getAddress()
			+"\t"+s1.getKor()+"\t"+s1.getEng()+"\t"+s1.getMath()
			+"\t"+s1.getCoding()+"\n";
		}
		
		if(s2!=null) {
			value+=s2.getName()+"\t"+s2.getAge()+"\t"+s2.getAddress()
			+"\t"+s2.getKor()+"\t"+s2.getEng()+"\t"+s2.getMath()
			+"\t"+s2.getCoding()+"\n";
			
		}
 		if(s3!=null) {
 			value+=s3.getName()+"\t"+s3.getAge()+"\t"+s3.getAddress()
			+"\t"+s3.getKor()+"\t"+s3.getEng()+"\t"+s3.getMath()
			+"\t"+s3.getCoding()+"\n";
 			
 		}
 		if(s4!=null) {
 			value+=s4.getName()+"\t"+s4.getAge()+"\t"+s4.getAddress()
			+"\t"+s4.getKor()+"\t"+s4.getEng()+"\t"+s4.getMath()
			+"\t"+s4.getCoding()+"\n";
 			
 		}
 		if(s5!=null ) {
 			value+=s5.getName()+"\t"+s5.getAge()+"\t"+s5.getAddress()
			+"\t"+s5.getKor()+"\t"+s5.getEng()+"\t"+s5.getMath()
			+"\t"+s5.getCoding()+"\n";
 			
 		}
 		return value;
	}
	
	public boolean updateStudent(Student s) {
		
		String name=s.getName();
		//매개변수에 있는 객체의 이름과 동일한 멤버변수를 찾는다.
		boolean flag=true;
		if(s1.getName().equals(s.getName())) {
			//s1이름이 같음.
			s1.setAge(s.getAge());
			s1.setAddress(s.getAddress());
		}else if(s2.getName().equals(s.getName())) {
			//s2이름이랑 같음
			s2.setAge(s.getAge());
			s2.setAddress(s.getAddress());
		}else if(s3.getName().equals(name)) {
			s3.setAge(s.getAge());
			s3.setAddress(s.getAddress());
		}else if(s4.getName().equals(name)) {
			s4.setAge(s.getAge());
			s4.setAddress(s.getAddress());
		}else if(s5.getName().equals(name)) {
			s5.setAge(s.getAge());
			s5.setAddress(s.getAddress());
		}else {
			flag=false;
		}
		return flag;
	}
	
	
	
}
