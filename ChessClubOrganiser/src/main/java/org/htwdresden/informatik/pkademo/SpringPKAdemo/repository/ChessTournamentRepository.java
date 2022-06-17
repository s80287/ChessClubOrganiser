package org.htwdresden.informatik.pkademo.SpringPKAdemo.repository;

import java.util.List;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.ChessTournament;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Club;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ChessTournamentRepository extends CrudRepository<ChessTournament, Long>{



}