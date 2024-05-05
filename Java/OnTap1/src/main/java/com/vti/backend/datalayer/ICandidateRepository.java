package com.vti.backend.datalayer;

import java.sql.SQLException;

import com.vti.entiy.ExperienceCandidate;
import com.vti.entiy.FresherCandidate;

public interface ICandidateRepository {
	boolean login(String email, String password) throws ClassNotFoundException, SQLException;

	boolean registerExpCan(ExperienceCandidate exCan) throws ClassNotFoundException, SQLException;

	boolean registerFreCan(FresherCandidate freCan) throws ClassNotFoundException, SQLException;

	boolean isEmailExists(String email) throws ClassNotFoundException, SQLException;
}
