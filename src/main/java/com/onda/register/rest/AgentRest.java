package com.onda.register.rest;

import java.util.List;

import com.onda.register.bean.Agent;
import com.onda.register.service.AgentService;

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
@RequestMapping("/onda/agent")
public class AgentRest {

    @Autowired
    private AgentService agentService;

    @GetMapping("/username/{username}/password/{password}")
    public Agent findByUsernameAndPassword(@PathVariable String username,@PathVariable String password) {
		return agentService.findByUsernameAndPassword(username, password);
	}

	@DeleteMapping("/username/{username}")
    public int deleteByUsername(@PathVariable String username) {
        return agentService.deleteByUsername(username);
    }

    @PutMapping("/")
    public void update(@RequestBody Agent agent) {
        agentService.update(agent);
    }

    @PostMapping("/")
    public int save(@RequestBody Agent agent) {
        return agentService.save(agent);
    }

    @GetMapping("/username/{username}")
    public Agent findByUsername(@PathVariable String username) {
        return agentService.findByUsername(username);
    }

    @GetMapping("/")
    public List<Agent> findAll() {
        return agentService.findAll();
    }

}
