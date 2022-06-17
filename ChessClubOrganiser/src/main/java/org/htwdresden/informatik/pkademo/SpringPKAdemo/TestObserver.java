package org.htwdresden.informatik.pkademo.SpringPKAdemo;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.DwzDB;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Member;

public class TestObserver {

	public static void main(String[] args) {
		DwzDB observable = new DwzDB();
		Member observer = new Member();
		
		/*
		observable.addObserver(observer);
		observable.setNews("news");
		System.out.println(observer.getNews());
		*/
		
		observable.addObserver(observer);
		observable.updateDWZ("1234");
		System.out.println(observer.getMemberDWZ());
		
	}

}
