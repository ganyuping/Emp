package com.direct.serviceimp;

import java.util.ArrayList;

import com.direct.daoimp.Userdaoimp;
import com.direct.service.Userservice;
import com.direct.vo.UserInfo;

public class Userserviceimp implements Userservice{
	private Userdaoimp userdaoimp;
	
	public Userdaoimp getUserdaoimp() {
		return userdaoimp;
	}

	public void setUserdaoimp(Userdaoimp userdaoimp) {
		this.userdaoimp = userdaoimp;
	}

	public ArrayList<UserInfo> show() {
		// TODO Auto-generated method stub
		return userdaoimp.show();
	}

	public void add(UserInfo us) {
		// TODO Auto-generated method stub
		
	}

	public void delect(UserInfo us) {
		// TODO Auto-generated method stub
		
	}

	public void update(UserInfo us) {
		// TODO Auto-generated method stub
		
	}

}
