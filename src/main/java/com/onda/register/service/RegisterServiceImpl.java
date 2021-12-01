package com.onda.register.service;

import java.util.List;

import com.onda.register.bean.Register;
import com.onda.register.dao.RegisterDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private CongeServiceImpl congeServiceImpl;
	@Autowired
	private RegisterDao registerDao;

	@Override
	@Transactional
	public int deleteByMatricule(String matricule) {
		int resultConge = congeServiceImpl.deleteByRegisterMatricule(matricule);
		int resultRegister = registerDao.deleteByMatricule(matricule);
		return resultConge + resultRegister;
	}

	@Override
	public int save(Register register) {

		if (findByMatricule(register.getMatricule()) != null) {
			return -1;
		} else {
			registerDao.save(register);
			congeServiceImpl.saveAll(register, register.getConges());
			return 1;
		}
	}

	@Override
	public List<Register> findAll() {
		return registerDao.findAll();
	}

	@Override
	public Register findByMatricule(String matricule) {
		return registerDao.findByMatricule(matricule);
	}

	@Override
	public void update(Register register) {
		registerDao.save(register);

	}

	@Override
	public int add(Register register) {
		if (findByMatricule(register.getMatricule()) != null) {
			return -1;
		} else {
			registerDao.save(register);
			return 1;
		}

	}

}
