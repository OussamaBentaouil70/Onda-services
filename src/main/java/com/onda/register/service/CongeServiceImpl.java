package com.onda.register.service;

import java.util.List;

import com.onda.register.bean.Conge;
import com.onda.register.bean.Register;
import com.onda.register.dao.CongeDao;
import com.onda.register.vo.CongeVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CongeServiceImpl implements CongeService {

    @Autowired
    private RegisterServiceImpl registerServiceImpl;
    @Autowired
    private CongeDao congeDao;
    
    private CongeVo congeVo;

    @Override
    public int save(Conge conge) {
        Register register = registerServiceImpl.findByMatricule(conge.getRegister().getMatricule());
        conge.setRegister(register);
        if (register == null) {
            return -2;
        } else {
            registerServiceImpl.update(register);
            congeDao.save(conge);
            return 1;
        }

    }
    
    

    @Override
    public List<Conge> findByRegisterMatricule(String matricule) {
        return congeDao.findByRegisterMatricule(matricule);
    }

    @Override
    @Transactional
    public int deleteByRegisterMatricule(String matricule) {
        return congeDao.deleteByRegisterMatricule(matricule);
    }

    @Override
    public List<Conge> findAll() {
        return congeDao.findAll();
    }

    @Override
    public void update(Conge conge) {
        congeDao.save(conge);

    }

    public void saveAll(Register register, List<Conge> conges) {
        for (Conge conge : conges) {
            conge.setRegister(register);
            congeDao.save(conge);
        }
    }



	@Override
	public int add(CongeVo congeVo) {
		  Register register = registerServiceImpl.findByMatricule(congeVo.getMatricule());
	        congeVo.getConge().setRegister(register);
	        if (register == null) {
	            return -2;
	        } else {
	            registerServiceImpl.update(register);
	            congeDao.save(congeVo.getConge());
	            return 1;
	        }
	}



	@Override
	public void deleteById(Long id) {
	    congeDao.deleteById(id);
	}



	
 
}
