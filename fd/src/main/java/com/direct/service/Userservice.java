package com.direct.service;

import java.util.ArrayList;

import com.direct.vo.UserInfo;

public interface Userservice {
	public ArrayList<UserInfo> show();
	public void add(UserInfo us);
	public void delect(UserInfo us);
	public void update(UserInfo us);

}
