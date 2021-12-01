package com.onda.register.service;

import java.util.List;

import com.onda.register.bean.Conge;
import com.onda.register.vo.CongeVo;

public interface CongeService {

    public int save(Conge conge);

    public void update(Conge conge);

    public int add(CongeVo congeVo);
    
    List<Conge> findByRegisterMatricule(String matricule);

    int deleteByRegisterMatricule(String matricule);
    
    void deleteById(Long id);

    public List<Conge> findAll();
}
