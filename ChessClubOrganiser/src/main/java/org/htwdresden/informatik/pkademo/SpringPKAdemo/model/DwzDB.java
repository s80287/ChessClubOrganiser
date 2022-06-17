package org.htwdresden.informatik.pkademo.SpringPKAdemo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class DwzDB extends Observable {
    /*
	private String news;
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
        
    }
    */
	
	// attributes
	private String memberNr;
	private String dwz;
	
    private List<Observer> observerList = new ArrayList<>();

    
    // methods
    /*
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }
	*/
	
    
    public void updateDWZ(String dwz) {
    	//this.memberNr = memberNr;
    	this.dwz = dwz;
    	
        setChanged();
        //notifyObservers(memberNr);
        notifyObservers(dwz);  
    }
    
    
    
	
}
