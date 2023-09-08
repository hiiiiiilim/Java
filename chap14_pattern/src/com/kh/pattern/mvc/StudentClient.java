package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {
	/*mvc 패턴을 사용하여 학생 정보를 다루는 곳*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//모델객체생성
		StudentModel model = new StudentModel("복학생", 16);
		// 뷰객체 생성 view
		StudentView view = new StudentView();
		//컨트롤러 객체 생성 controller(모델 생성)
		StudentController controller = new StudentController(model, view);
		//학생정보를 업데이트해서 출력
		controller.updateView();
		//업데이트된 학생정보를 업데이트 하자!
		controller.setStudentName("이업데이트");
		controller.setStudentAge(18);
		//업데이트 된 학생 정보를 출력
		controller.updateView();
		
		
	}

}
