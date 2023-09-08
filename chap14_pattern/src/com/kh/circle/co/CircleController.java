package com.kh.circle.co;

import com.kh.circle.mo.CircleModel;
import com.kh.circle.vo.CircleView;

public class CircleController {
	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		double userInput = view.getUserInput();
		model.setNumber(userInput);
		view.display(userInput);
		double result = model.a();
		System.out.println(result);
	}
	

}
