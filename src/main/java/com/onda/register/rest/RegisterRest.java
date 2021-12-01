package com.onda.register.rest;

import java.util.List;

import com.onda.register.bean.Register;
import com.onda.register.service.RegisterService;

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
@RequestMapping("/onda/register")
public class RegisterRest {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/add/")
    public int add(@RequestBody Register register) {
		return registerService.add(register);
	}
    
	@PostMapping("/")
    public int save(@RequestBody Register register) {
        return registerService.save(register);
    }

    
    @PutMapping("/")
    public void update(@RequestBody Register register) {
        registerService.update(register);
    }

    @DeleteMapping("/matricule/{matricule}")
    public int deleteByMatricule(@PathVariable String matricule) {
        return registerService.deleteByMatricule(matricule);
    }

    @GetMapping("/matricule/{matricule}")
    public Register findByMatricule(@PathVariable String matricule) {
        return registerService.findByMatricule(matricule);
    }

    @GetMapping("/")
    public List<Register> findAll() {
        return registerService.findAll();
    }
}
