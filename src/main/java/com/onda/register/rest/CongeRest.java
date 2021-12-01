package com.onda.register.rest;

import java.util.List;

import com.onda.register.bean.Conge;
import com.onda.register.service.CongeServiceImpl;
import com.onda.register.vo.CongeVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/onda/conge")
public class CongeRest {

    @Autowired
    private CongeServiceImpl congeServiceImpl;


    

    @DeleteMapping("/id/{id}")
	public void deleteById(@PathVariable Long id) {
		congeServiceImpl.deleteById(id);
	}

	@PostMapping("/add/")
    public int add(@RequestBody CongeVo congeVo) {
		return congeServiceImpl.add(congeVo);
	}

	@PutMapping("/")
    public void update(@RequestBody Conge conge) {
        congeServiceImpl.update(conge);
    }

    @PostMapping("/")
    public int save(@RequestBody Conge conge) {
        return congeServiceImpl.save(conge);
    }

    @GetMapping("/matricule/{matricule}")
    public List<Conge> findByRegisterMatricule(@PathVariable String matricule) {
        return congeServiceImpl.findByRegisterMatricule(matricule);
    }

    @DeleteMapping("/matricule/{matricule}")
    public int deleteByRegisterMatricule(@PathVariable String matricule) {
        return congeServiceImpl.deleteByRegisterMatricule(matricule);
    }

    @GetMapping("/")
    public List<Conge> findAll() {
        return congeServiceImpl.findAll();
    }

}
