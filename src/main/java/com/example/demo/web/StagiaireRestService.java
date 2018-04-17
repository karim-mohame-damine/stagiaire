package com.example.demo.web;

import com.example.demo.dao.StagiaireRepository;
import com.example.demo.entities.Stagiaire;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "stagiaire")
@CrossOrigin("*")
public class StagiaireRestService {
    @Autowired
    private StagiaireRepository stagiaireRepository;

    @ApiOperation(value = "ajouter")
    @RequestMapping(value = "/stagiaire", method = RequestMethod.POST)
    public Stagiaire save(@RequestBody Stagiaire c) {
        return stagiaireRepository.save( c );
    }
    @ApiOperation(value = "modifier")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Stagiaire update(@PathVariable Long id, @RequestBody Stagiaire c) {
        c.setId( id );
        return stagiaireRepository.save( c );
    }

    @ApiOperation(value = "desister")
    @RequestMapping(value = "/desistement", method = RequestMethod.PUT)
    public Stagiaire desistement(@RequestAttribute String desistement, @RequestBody Stagiaire c) {
        c.setMotifdesistement( desistement );
        return stagiaireRepository.save( c );
    }
    @ApiOperation(value = "absence")
    @RequestMapping(value = "/absence", method = RequestMethod.PUT)
    public Stagiaire absence(@RequestAttribute String absence, @RequestBody Stagiaire c) {
        c.setJustifabsence( absence );
        return stagiaireRepository.save( c );
    }

}
