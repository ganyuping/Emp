package com.direct.vo;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.direct.serviceimp.Userserviceimp;



public class TestUtil {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Userserviceimp udi=(Userserviceimp)context.getBean("userserviceimp");
		ArrayList<UserInfo> arr=udi.show();
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getUsername());
			
		}
		
	}

}
