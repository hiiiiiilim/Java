package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UserView;

public class UserController {
/*
 모델과 뷰를 연결하는 곳
 사용자의 입력을 처리 하는 곳
 * */
	private UserModel usermodel;
	private UserView userview;
	
	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}
	//가지고 온 값을 받아와서 전달해줘야되기 때문
	public UserModel getModel() {
		return usermodel;
	}
	public UserView getView() {
		return userview;
	}
	
	public void setModel(UserModel usermodel) {
		this.usermodel = usermodel;
	}
	public void setView(UserView userview) {
		this.userview = userview;
	}
}
