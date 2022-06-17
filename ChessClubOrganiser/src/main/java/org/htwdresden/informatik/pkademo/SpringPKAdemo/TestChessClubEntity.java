package org.htwdresden.informatik.pkademo.SpringPKAdemo;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Address;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.ChessClub;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Name;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Person;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.repository.ChessClubRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class TestChessClubEntity {
private static final Logger log = LoggerFactory.getLogger(TestChessClubEntity.class);
	
	public static void main(String[] args) {
		//SpringApplication.run(SpringPkAdemoApplication.class, args);
		SpringApplication.run(TestChessClubEntity.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ChessClubRepository chessclubRepository) {
		return (args) -> {
			chessclubRepository.save(new ChessClub("F2813", "USV TU Dresden",
					new Address("Hochschulstr.", 99, "01069", "Dresden"),
					new Person()));
			chessclubRepository.save(new ChessClub("F2605", "TuS Coswig 1920",
					new Address("Musterstr.", 56, "01568", "Coswig"),
					new Person()));
			chessclubRepository.save(new ChessClub("F2806", "SV Dresden-Leuben",
					new Address("Marktstr.", 12, "01305", "Dresden"),
					new Person(new Name("Jake", ' ', "Peralta"))));
			
			///*
			// findAll()
			log.info("Chess club found by findAll()");
			log.info("----------------------------");
			for (ChessClub c : chessclubRepository.findAll()) {
				log.info(c.toString());
			}
			log.info("");
			//*/
			
			/*
			// findByNameContaining()
			log.info("Chess club found by findByNameContaining()");
			log.info("------------------------------------------");
			for (ChessClub c : chessclubRepository.findByNameContaining("TU")) {
				log.info(c.toString());
			}
			log.info("");
			*/
			
			/*
			// findByZPSCode()
			log.info("Chess club found by findByZPSCode()");
			log.info("----------------------------------");
			for (ChessClub c : chessclubRepository.findByZPSCode("F2813")) {
				log.info(c.toString());
			}
			log.info("");
			*/
			
			/*
			// findByCity()
			log.info("Chess club found by findByCity()");
			log.info("----------------------------------");
			for (ChessClub c : chessclubRepository.findByCity("Dresden")) {
				log.info(c.toString());
			}
			log.info("");
			*/
			
			/*
			// findByChairpersonName()
			log.info("Chess club found by findByChairpersonName()");
			log.info("-------------------------------------------");
			for (ChessClub c : chessclubRepository.findByChairpersonName(new Name("Jake", ' ', "Peralta"))) {
				log.info(c.toString());
			}
			log.info("");
			*/
			
			/*
			// findByChairpersonLastNameContaining()
			log.info("Chess club found by findByChairpersonLastNameContaining()");
			log.info("--------------------------------------------------------");
			for (ChessClub c : chessclubRepository.findByChairpersonLastNameContaining("Peralta")) {
				log.info(c.toString());
			}
			log.info("");
			*/
			
			///*
			// findByZPSCodeStartWith()
			log.info("Chess club found by findByZPSCodeStartingWith()");
			log.info("--------------------------------------------------------");
			// F26: Meissen
			for (ChessClub c : chessclubRepository.findByZPSCodeStartingWith("F26")) {
				log.info(c.toString());
			}
			log.info("");
			//*/
			
		};
	}


	
}