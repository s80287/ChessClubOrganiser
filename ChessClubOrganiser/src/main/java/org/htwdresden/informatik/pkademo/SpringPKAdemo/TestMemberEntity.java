package org.htwdresden.informatik.pkademo.SpringPKAdemo;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.FIDETitle;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Member;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.MemberStatus;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Name;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*
@SpringBootApplication
public class TestMemberEntity {

	public static final Logger log = LoggerFactory.getLogger(TestMemberEntity.class);
	public static final String Sort = null;
	
	public static void main(String[] args) {
		SpringApplication.run(TestMemberEntity.class, args);

	}
	
	@Bean
	public CommandLineRunner demo(MemberRepository memberRepository) {
		return (args) -> {
			// constructor with name, member number, zps club code,
			// date join, status, elo, title
			memberRepository.save(new Member(new Name("Max", ' ', "Mustermann"), "F1102", "01", 
					LocalDate.of(2010, 10, 10), MemberStatus.A , 500, FIDETitle.GM));
			memberRepository.save(new Member(new Name("Melanie",' ', "Musterfrau"), "F1234", "02",
					LocalDate.of(2015, 5, 5), MemberStatus.D, 900, FIDETitle.IM));
			memberRepository.save(new Member(new Name("David", ' ', "Kloster"), "F1357", "06",
					LocalDate.of(2021, 1, 1), MemberStatus.A, 350, FIDETitle.CM));
			
			///*
			// findAll()
			log.info("Member found with findAll()");
			log.info("---------------------------");
			for (Member m : memberRepository.findAll()) {
				log.info(m.toString());
			}
			log.info("");
			//*/
			
			// nicht funktioniert
			// findByLastName()
			/*
			log.info("Member found with findByLastNameContaining()");
			log.info("------------------------------");
			for (Member m : memberRepository.findByLastName("mann")) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByZPSCode()
			log.info("Member found with findByZPSCode()");
			log.info("---------------------------------");
			for (Member m : memberRepository.findByZPSClubCode("F1234")) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByMemberNr()
			log.info("Member found with findByMemberNr()");
			log.info("----------------------------------");
			for (Member m : memberRepository.findByMemberNr("06")) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByYearJoinGreaterThanEqual()
			log.info("Member found with findByYearJoinGreaterThanEqual()");
			log.info("----------------------------------");
			for (Member m : memberRepository.findByYearJoinGreaterThanEqual(2015)) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByDateJoinGreaterThan()
			log.info("Member found with findByDateJoinGreaterThan()");
			log.info("---------------------------------------------");
			for (Member m : memberRepository.findByDateJoinGreaterThan(LocalDate.of(2015, 1, 1))) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByMemberStatus()
			log.info("Member found by findByStatus()");
			log.info("------------------------------------");
			for (Member m : memberRepository.findByStatus(MemberStatus.A)) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByTitle()
			log.info("Member found by findByTitle()");
			log.info("-----------------------------");
			for (Member m : memberRepository.findByTitle(FIDETitle.GM)) {
				log.info(m.toString());
			}
			log.info("");
			*/
			
			/*
			// findByName()
			log.info("Member found by findByName()");
			log.info("----------------------------");
			for (Member m : memberRepository.findByName(new Name("Max", ' ', "Mustermann"))) {
				log.info(m.toString());
			}
			log.info("");
			*/
			

// uncomment first line before @SpringBootApplication and last 3 lines			
//		};
	
//	}
	
//}
