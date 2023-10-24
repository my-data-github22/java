package com.candidate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.sunbeam.Candidate;
import com.mysql.cj.protocol.Resultset;

public class CandidateDao implements AutoCloseable {

	private Connection con;

	public CandidateDao() throws SQLException {
		con=DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		try {
			if (con != null) // if there's a connection
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Candidate> findAll() throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "select  * from candidates";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			}
		}
		return list;
	}
}
