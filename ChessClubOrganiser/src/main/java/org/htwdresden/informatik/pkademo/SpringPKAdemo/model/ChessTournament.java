package org.htwdresden.informatik.pkademo.SpringPKAdemo.model;

import java.time.LocalDate;

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

import org.htwdresden.informatik.pkademo.SpringPKAdemo.Round;

@Entity
public class ChessTournament {
	
	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String tournamentCode;
	
	@Column
	private String tournamentName;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column
	private LocalDate tournamentBegin;
	
	@Convert(converter = LocalDateAttributeConverter.class)
	@Column
	private LocalDate tournamentEnd;
	
	@OneToOne(cascade = CascadeType.ALL)
	// creates column with name "round_id" in db table
	@JoinColumn(name = "round_id", referencedColumnName = "rid", foreignKey = @ForeignKey(name="FK_TROUND"))
	private Round tournamentRound;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="FK_TPERSON"))
	private Person organizer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName = "id", foreignKey = @ForeignKey(name="FK_TPERSON"))
	private Person teamLeader;

		
	// constructor
	public ChessTournament() {}
	
	// getter setter
	public String getTournamentCode() {
		return tournamentCode;
	}

	public void setTournamentCode(String tournamentCode) {
		this.tournamentCode = tournamentCode;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public LocalDate getTournamentBegin() {
		return tournamentBegin;
	}

	public void setTournamentBegin(LocalDate tournamentBegin) {
		this.tournamentBegin = tournamentBegin;
	}

	public LocalDate getTournamentEnd() {
		return tournamentEnd;
	}

	public void setTournamentEnd(LocalDate tournamentEnd) {
		this.tournamentEnd = tournamentEnd;
	}

	public Round getTournamentRound() {
		return tournamentRound;
	}

	public void setTournamentRound(Round tournamentRound) {
		this.tournamentRound = tournamentRound;
	}

	public Person getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Person organizer) {
		this.organizer = organizer;
	}

	public Person getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(Person teamLeader) {
		this.teamLeader = teamLeader;
	}

	
	
}
