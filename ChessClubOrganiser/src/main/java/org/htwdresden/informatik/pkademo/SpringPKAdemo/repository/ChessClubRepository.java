package org.htwdresden.informatik.pkademo.SpringPKAdemo.repository;

import java.util.List;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChessClubRepository extends CrudRepository<ChessClub, Long> {

	List<ChessClub> findByNameContaining(String name);
	
	List<ChessClub> findByZPSCode(String ZPSCode);
	
	List<ChessClub> findByZPSCodeStartingWith(String code);
	
	@Query("SELECT c FROM ChessClub c JOIN c.address WHERE c.address.city = ?1")
	List<ChessClub> findByCity(String city);
	
	@Query("SELECT c FROM ChessClub c JOIN c.chairperson WHERE c.chairperson.name = ?1")
	List<ChessClub> findByChairpersonName(Name name);
	
	// nicht funktioniert
	// gleiches Problem wie MemberRepository
	// unnötig
	//@Query("SELECT c FROM ChessClub c JOIN c.chairperson WHERE c.chairperson.name.lastName LIKE ?1")
	//List<ChessClub> findByChairpersonLastNameContaining(String lastName);
	
	
}
