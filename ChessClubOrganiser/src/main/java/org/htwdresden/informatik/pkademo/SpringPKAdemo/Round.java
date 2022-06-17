package org.htwdresden.informatik.pkademo.SpringPKAdemo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Address;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.LocalDateAttributeConverter;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.RoundArt;

@Entity
public class Round {

	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rid;
	
	@Column
	private int roundNr;
	
	@OneToOne(cascade = CascadeType.ALL)
	// creates column with name "address_id" in db table
	@JoinColumn(name = "address_id", referencedColumnName = "aid", foreignKey = @ForeignKey(name="FK_RADDRESS"))
	private Address location;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column
	private LocalDate roundBegin;
	
	@Enumerated(EnumType.STRING)
	private RoundArt roundArt;
	
	// constructor
	public Round() {}
	
	// getter setter
	public int getRoundNr() {
		return roundNr;
	}
	public void setRoundNr(int roundNr) {
		this.roundNr = roundNr;
	}
	public Address getLocation() {
		return location;
	}
	public void setLocation(Address location) {
		this.location = location;
	}
	public LocalDate getRoundBegin() {
		return roundBegin;
	}
	public void setRoundBegin(LocalDate roundBegin) {
		this.roundBegin = roundBegin;
	}
	public RoundArt getRoundArt() {
		return roundArt;
	}
	public void setRoundArt(RoundArt roundArt) {
		this.roundArt = roundArt;
	}

	
	
}
