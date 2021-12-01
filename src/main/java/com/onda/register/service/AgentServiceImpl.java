package com.onda.register.service;

import java.util.List;

import com.onda.register.bean.Agent;

import com.onda.register.dao.AgentDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentDao agentDao;

    @Override
    public int save(Agent agent) {
        if (findByUsername(agent.getUsername()) != null) {
            return -1;
        } else {
            agentDao.save(agent);
            return 1;
        }

    }

    @Override
    public List<Agent> findAll() {
        return agentDao.findAll();
    }

    @Override
    public Agent findByUsername(String username) {
        return agentDao.findByUsername(username);
    }

    @Override
    public void update(Agent agent) {
        agentDao.save(agent);
    }

    @Override
    @Transactional
    public int deleteByUsername(String username) {
        return agentDao.deleteByUsername(username);
    }

	@Override
	public Agent findByUsernameAndPassword(String username, String password) {
		return agentDao.findByUsernameAndPassword(username, password);
	}

}
