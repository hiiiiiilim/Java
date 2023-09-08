package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;
import com.kh.pattern.mvc.controller.StudentController;

public class StudentClient {
	/*mvc ������ ����Ͽ� �л� ������ �ٷ�� ��*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�𵨰�ü����
		StudentModel model = new StudentModel("���л�", 16);
		// �䰴ü ���� view
		StudentView view = new StudentView();
		//��Ʈ�ѷ� ��ü ���� controller(�� ����)
		StudentController controller = new StudentController(model, view);
		//�л������� ������Ʈ�ؼ� ���
		controller.updateView();
		//������Ʈ�� �л������� ������Ʈ ����!
		controller.setStudentName("�̾�����Ʈ");
		controller.setStudentAge(18);
		//������Ʈ �� �л� ������ ���
		controller.updateView();
		
		
	}

}
