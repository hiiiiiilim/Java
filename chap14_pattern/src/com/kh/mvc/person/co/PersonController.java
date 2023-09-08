package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {
	private PersonModel model;
	private PersonView view;
	
	public PersonController(PersonModel model, PersonView view) {
		this.model = model;
		this.view=view;
	}
	
	public void run() {
		String name = view.getInput();
		model.setPerson(name);
		name = model.isVaildNumber();
		if(name=="") {
			view.noName();
		}else {
			view.display(name);
		}
		
	}
}
