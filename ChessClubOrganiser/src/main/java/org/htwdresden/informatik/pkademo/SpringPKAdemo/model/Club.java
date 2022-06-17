package org.htwdresden.informatik.pkademo.SpringPKAdemo.model;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Person;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Address;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Name;

@Entity
public class Club {
	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//@Convert(converter = NameAttributeConverter.class)
	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	// creates column with name "address_id" in db table
	@JoinColumn(name = "address_id", referencedColumnName = "aid", foreignKey = @ForeignKey(name="FK_CADDRESS"))
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="FK_CPERSON"))
	private Person chairperson;
	
	// constructor
	// default
	public Club()
	{
		this("Musterclub",
			new Address("Musterstr.", 10, "01069", "Dresden"),
			new Person(new Name("Max", 'a', "Mustermann"),
				new Address("Musterstr.", 1, "01069", "Dresden")));
	}
	
	// parameter
	public Club(String name, Address address, Person chairperson)
	{
		this.name = name;
		this.address = address;
		this.chairperson = chairperson;
	}
	
	// methods
	// getter setter
	// chairperson
	public void setClubChairperson(Person person)
	{
		this.chairperson = person;
	}
	
	public Person getClubChairperson()
	{
		return this.chairperson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.name; 
	}
	
}
