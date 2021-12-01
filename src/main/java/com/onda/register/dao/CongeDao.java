package com.onda.register.dao;

import java.util.List;

import com.onda.register.bean.Conge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CongeDao extends JpaRepository<Conge, Long> {

    List<Conge> findByRegisterMatricule(String matricule);

    int deleteByRegisterMatricule(String matricule);
    
    void deleteById(Long id);
}
