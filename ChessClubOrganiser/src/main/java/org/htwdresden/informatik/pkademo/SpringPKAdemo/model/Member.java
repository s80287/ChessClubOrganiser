package org.htwdresden.informatik.pkademo.SpringPKAdemo.model;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Name;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Person;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Address;

import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mitglied", schema="dbo")
public class Member extends Person implements Observer {
	// attributes 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String memberNr;
	
	@Column
	private String ZPSClubCode;
	
	// ZPSPlayerNr = "P" + ZPSClubCode + "-" + memberNr
	@Column
	private String ZPSPlayerNr;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column
	private LocalDate dateJoin;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column
	private LocalDate dateLeave;
	
	@Enumerated(EnumType.STRING)
	private MemberStatus status;
	
	// deutsche Wertungszahl
	@Column
	private String DWZ;
	
	@Column
	private int elo;
	
	@Enumerated(EnumType.STRING)
	private FIDETitle title;
	
	
	// test
	private String news;
	
	// constructor
	// default
	//protected Member() {}
	public Member() {}
	
	// constructor with only elo and name
	public Member(Name name, int elo) {
		super(name);
		this.elo = elo;
	}
	
	// constructor with name, member number and zps club code
	public Member(Name name, String ZPSClubCode, String memberNr) {
		super(name);
		this.ZPSClubCode = ZPSClubCode;
		this.memberNr = memberNr;
	}
	
	// constructor with name, member number, zps club code,
	// date join, status, elo, title
	public Member(Name name, String ZPSClubCode, String memberNr,
			LocalDate dateJoin, MemberStatus status, int elo, FIDETitle title) {
		super(name);
		this.ZPSClubCode = ZPSClubCode;
		this.memberNr = memberNr;
		this.dateJoin = dateJoin;
		this.status = status;
		this.elo = elo;
		this.title = title;
	}
	
	// methode
	// getter
	public String getMemberZPSPlayerNr()
	{
		return ZPSClubCode + "-" + memberNr;
	}
	
	public String getMemberNr()
	{
		return this.memberNr;
	}
	
	public String getMemberZPSClubCode()
	{
		return this.ZPSClubCode;
	}
	
	public LocalDate getMemberDateJoin()
	{
		return this.dateJoin;
	}
	
	public LocalDate getMemberDateLeave()
	{
		return this.dateLeave;
	}
	
	public String getMemberDWZ()
	{
		return this.DWZ;
	}
	
	public int getMemberElo()
	{
		return this.elo;
	}
	
	// setter
	public void setMemberNr(String nr)
	{
		this.memberNr = nr;
	}
	
	public void setMemberZPSClubCode(String clubCode)
	{
		this.ZPSClubCode = clubCode;
	}
	
	public void setMemberDateJoin(LocalDate date)
	{
		this.dateJoin = date;
	}
	
	public void setMemberDateLeave(LocalDate date)
	{
		this.dateLeave = date;
	}
	
	public void setMemberDWZ(String DWZ)
	{
		this.DWZ = DWZ;
	}
	
	public void setMemberElo(int elo)
	{
		this.elo = elo;
	}
	
	// test
	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}
	
	
	/** Override the toString method */
	@Override
	public String toString() {
		//return '\n' + name.getFullName() + '\n' +
		//	address.getFullAddress() + '\n';
		return super.toString() + getMemberZPSPlayerNr() + '\n'
			+ getMemberDateJoin() + '\n'
			+ getMemberDateLeave() + '\n'
			+ getMemberDWZ() + '\n'
			+ getMemberElo() + '\n';
	}

	@Override
	public void update(Observable o, Object dwz) {
		// TODO Auto-generated method stub
		this.setMemberDWZ((String) dwz);
	}





}
