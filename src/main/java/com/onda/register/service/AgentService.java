package com.onda.register.service;

import java.util.List;

import com.onda.register.bean.Agent;

public interface AgentService {

    public int save(Agent agent);

    public void update(Agent agent);

    public Agent findByUsername(String username);

    public int deleteByUsername(String username);
    
    Agent findByUsernameAndPassword(String username, String password);

    public List<Agent> findAll();
}
