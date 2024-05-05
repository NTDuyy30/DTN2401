package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.ICandidateService;
import com.vti.backend.businesslayer.impl.CandidateService;
import com.vti.entiy.ExperienceCandidate;
import com.vti.entiy.FresherCandidate;

public class CandidateController {
	private ICandidateService canSer;

	public CandidateController() throws FileNotFoundException, IOException {
		canSer = new CandidateService();
	}

	public boolean registerExpCan(ExperienceCandidate exCan) throws SQLException, ClassNotFoundException {
		return canSer.registerExpCan(exCan);
	}

	public boolean registerFreCan(FresherCandidate freCan) throws SQLException, ClassNotFoundException {
		return canSer.registerFreCan(freCan);
	}

	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		return canSer.isEmailExists(email);
	}

	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		return canSer.login(username, password);
	}

	public void logout() {
		canSer.logout();
	}
}
