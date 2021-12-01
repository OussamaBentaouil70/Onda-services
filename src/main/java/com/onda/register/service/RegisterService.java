package com.onda.register.service;

import java.util.List;

import com.onda.register.bean.Register;

public interface RegisterService {
    public int save(Register register);
    
    public int add(Register register);

    public void update(Register register);

    public int deleteByMatricule(String matricule);

    public Register findByMatricule(String matricule);

    public List<Register> findAll();
}
