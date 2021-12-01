package com.onda.register.dao;

import com.onda.register.bean.Agent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentDao extends JpaRepository<Agent, Long> {
    public Agent findByUsername(String username);

    public int deleteByUsername(String username);
    
    Agent findByUsernameAndPassword(String username, String password);
}
