package com.direct.daoimp;

import java.util.ArrayList;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.direct.dao.UserDao;
import com.direct.vo.UserInfo;

public class Userdaoimp implements UserDao{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public ArrayList<UserInfo> show() {
		// TODO Auto-generated method stub
		 ArrayList<UserInfo> arr=(ArrayList<UserInfo>)hibernateTemplate.find("from UserInfo");
			return arr;
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
