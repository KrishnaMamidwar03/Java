package com.app.validation;

import java.util.List;

import com.app.Exception.penException;
import com.app.PenStore.PenStore;

public class UpdatePen {
	
	public static PenStore UpdateStock(int id, List<PenStore>list)throws penException{
		for(PenStore p: list) {
			if(p.getId()==(id)) {
				return p;
			}
		}
		throw new penException("data not found!!");
	}
}
