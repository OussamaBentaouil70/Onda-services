package com.onda.register.dao;

import com.onda.register.bean.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterDao extends JpaRepository<Register, Long> {

    public Register findByMatricule(String matricule);

    public int deleteByMatricule(String matricule);
}
