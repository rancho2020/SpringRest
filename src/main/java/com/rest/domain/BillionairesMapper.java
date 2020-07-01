package com.rest.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BillionairesMapper implements RowMapper<Billionaires> {
	public Billionaires mapRow(ResultSet resultSet, int i) throws SQLException {

		Billionaires billi = new Billionaires();
		billi.setId(resultSet.getLong("id"));
		billi.setFirstName(resultSet.getString("first_name"));
		billi.setLastName(resultSet.getString("last_name"));
		billi.setCareer(resultSet.getString("career"));
		return billi;
	}
}
