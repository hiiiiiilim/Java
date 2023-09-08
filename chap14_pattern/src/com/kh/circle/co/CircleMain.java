package com.kh.circle.co;

import com.kh.circle.mo.CircleModel;
import com.kh.circle.vo.CircleView;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleModel model = new CircleModel();
		CircleView view = new CircleView();
		CircleController controller2 = new CircleController(model, view);
		
		controller2.run();
		
		
	}

}
