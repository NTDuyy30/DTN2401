package com.vti.backend.businesslayer.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.ICandidateService;
import com.vti.backend.datalayer.ICandidateRepository;
import com.vti.backend.datalayer.impl.CandidateRepository;
import com.vti.entiy.ExperienceCandidate;
import com.vti.entiy.FresherCandidate;

public class CandidateService implements ICandidateService {
	private ICandidateRepository canRepo;
	public static boolean ISLOGIN = false;

	public CandidateService() throws FileNotFoundException, IOException {
		canRepo = new CandidateRepository();
	}

	@Override
	public boolean login(String email, String password) throws SQLException, ClassNotFoundException {
		if (canRepo.login(email, password)) {
			ISLOGIN = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean registerExpCan(ExperienceCandidate exCan) throws SQLException, ClassNotFoundException {
		return canRepo.registerExpCan(exCan);
	}

	@Override
	public boolean registerFreCan(FresherCandidate freCan) throws ClassNotFoundException, SQLException {
		return canRepo.registerFreCan(freCan);
	}

	@Override
	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		return canRepo.isEmailExists(email);
	}

	@Override
	public void logout() {
		ISLOGIN = false;
	}

}
