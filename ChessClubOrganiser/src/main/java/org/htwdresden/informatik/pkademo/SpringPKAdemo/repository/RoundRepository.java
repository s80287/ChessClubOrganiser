package org.htwdresden.informatik.pkademo.SpringPKAdemo.repository;

import java.util.List;

import org.htwdresden.informatik.pkademo.SpringPKAdemo.Round;
import org.htwdresden.informatik.pkademo.SpringPKAdemo.model.Club;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RoundRepository extends CrudRepository<Round, Long>{

}