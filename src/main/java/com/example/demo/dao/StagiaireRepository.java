package com.example.demo.dao;

import com.example.demo.entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface StagiaireRepository extends JpaRepository<Stagiaire, Long> {

    public Page<Stagiaire> findByNomContains(String mc, Pageable pageable);


    public Page<Stagiaire> findByMobiliteContains(String mc, Pageable pageable);


}

