package org.htwdresden.informatik.pkademo.SpringPKAdemo.repository;

import java.time.LocalDate;
import java.util.List;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.FIDETitle;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Member;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.MemberStatus;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Name;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface MemberRepository extends PagingAndSortingRepository<Member, Long>{

	
	// nicht funktioniert
	//@Query("SELECT m FROM Member m WHERE m.lastName LIKE ?1")
	//List<Member> findByLastNameContaining(String name);
	
	//@Query("SELECT m FROM Member m WHERE m.name.getLastName() LIKE ?1")
	//@Query("SELECT m FROM Member m WHERE m.name.lastName LIKE ?1")
	//List<Member> findByNameLike(String name);
	
	List<Member> findByZPSClubCode(String ZPSClubCode);
	List<Member> findByMemberNr(String memberNr);
	
	@Query("SELECT m FROM Member m WHERE year(m.dateJoin) >= ?1")
	List<Member> findByYearJoinGreaterThanEqual(int year);
	
	List<Member> findByDateJoinGreaterThan(LocalDate dateJoin);
	
	List<Member> findByStatus(MemberStatus status);
	List<Member> findByTitle(FIDETitle title);
	
	List<Member> findByName(Name name);
	
}
