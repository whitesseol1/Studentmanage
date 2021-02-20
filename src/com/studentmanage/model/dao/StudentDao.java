package com.studentmanage.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.studentmanage.model.vo.Student;

public class StudentDao {
	
	//�л����� ������ �� �ִ� ������� ����
    private Student[] students=new Student[3];
    private static int studentsIndex=0; 
	
    public StudentDao() {}
    
    public boolean insertStudent(Student s) {
    	boolean flag=true;
    	try {
    	students[studentsIndex]=s;
    	studentsIndex++;
    	}catch(ArrayIndexOutOfBoundsException e) {
    		Student[] temp=new Student[students.length+5]; //8���� ������
    		System.arraycopy(students, 0, temp, 0, students.length);    		
    		studentsIndex=students.length;
    				students=temp;
    				students[studentsIndex]=s;
    				studentsIndex++;
    				
    	}
    	
    	
//    	for(int i=0;i<students.length;i++) {
//    		if(students[i]==null) {
//    			students[i]=s;
//    			flag=true;
//    			break;
//    		}
//	
//    	}
    	return flag;   //���� �� �ִ� �ͺ��� �� ����
    	
    }
    
    public String searchAllStudent() {
    	String value="";
    	for(int i=0; i<students.length;i++) {
    		if(students[i]!=null) {
    			value+=students[i]+"\n";
    			
    		}
    		
    	}
    	
    	return value;
    }
    
    public boolean updateStudent(Student s) {
    	boolean flag=false;
    	String name=s.getName();
    	
    	for(int i=0;i<students.length;i++) {
    		if(students[i].getName().equals(name)) {
    			students[i].setAge(s.getAge());
    			students[i].setAddress(s.getAddress());
    			flag=true;
    			break;
    		}
    		
    	}
    	
    	return flag;
    }
    
    public boolean insertGrade(Student s) {
    	 boolean flag=false;
    	 String name=s.getName();
    	 
    	 for(int i=0;i<students.length;i++) {
     		if(students[i]!=null&&students[i].getName().equals(name)) {
     			students[i].setKor(s.getKor());
     			students[i].setEng(s.getEng());
     			students[i].setMath(s.getMath());
     			students[i].setCoding(s.getCoding());
     			flag=true;
     			break;
     		}
    	 
    	 
    	
    }
    
   
    return flag;
    
    
    }
    
	public void saveFile() {
		//����Ǿ� �ִ� student�� ���Ϸ� �����ؼ� ����
		try(ObjectOutputStream oos
				=new ObjectOutputStream(new FileOutputStream("studentdata.bs"))){
			
			oos.writeObject(students);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
    
    public void loadFile() {
    	File f=new File("studentdata.bs");
    	if(f.exists()) {       	
    	    try(ObjectInputStream ois
    	    		=new ObjectInputStream(new FileInputStream("studentdata.bs"))){
    	    	
    		students=(Student[])ois.readObject();
    		studentsIndex=students.length-1;
    		
    	    }catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	    }   	
    	    catch(IOException e) {
    		e.printStackTrace();
    	}
        }
    }
    
}
