package com.candidate;

import java.util.ArrayList;
import java.util.List;

import com.app.sunbeam.Candidate;
import com.app.sunbeam.CandidateDao;


public class TestCandidate {
	public static void main(String[] args) {
		try(CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
