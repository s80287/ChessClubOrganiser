package org.htwdresden.informatik.pkademo.SpringPKAdemo.model;

import java.util.Observable;
import java.util.Observer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChessClub extends Club implements Observer {
	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String ZPSCode;

	// constructor
	public ChessClub() {
		super();
		this.ZPSCode = "unknown";
	}
	
	public ChessClub(String ZPSCode, String name, 
			Address address, Person chairperson) {
		super(name, address, chairperson);
		if (ZPSCode.length() != 5) {
			throw new IllegalArgumentException("ZPS code's length must be 5");
		}
		else {
			this.ZPSCode = ZPSCode;
		}
	}
	
	// method
	// getter setter
	public void setChessClubZPSCode(String ZPSCode)
	{
		this.ZPSCode = ZPSCode;
	}
	
	public String getChessClubZPSCode()
	{
		return this.ZPSCode;
	}
	
	@Override
	public String toString() {
		return this.ZPSCode + ", " + super.toString();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
