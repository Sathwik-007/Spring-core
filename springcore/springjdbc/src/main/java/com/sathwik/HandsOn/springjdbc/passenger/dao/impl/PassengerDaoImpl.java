package com.sathwik.HandsOn.springjdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sathwik.HandsOn.springjdbc.passenger.dao.PassengerDao;
import com.sathwik.HandsOn.springjdbc.passenger.dto.Passenger;
import com.sathwik.HandsOn.springjdbc.passenger.rowMapper.PasssengerRowMapper;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Passenger passenger) {
		String query = "insert into passenger values(?,?,?)";
		int result = jdbcTemplate.update(query, passenger.getId(), passenger.getFirstname(), passenger.getLastname());
		return result;
	}

	@Override
	public Passenger read(int id) {
		String query = "select * from passenger where id=?";
		PasssengerRowMapper rowmapper = new PasssengerRowMapper();
		Passenger passenger = jdbcTemplate.queryForObject(query, rowmapper, id);
		return passenger;
	}
	
	@Override
	public List<Passenger> fetchAll() {
		String query = "select * from passenger";
		PasssengerRowMapper rowmapper = new PasssengerRowMapper();
		List<Passenger> passengers = jdbcTemplate.query(query, rowmapper);
		return passengers;
	}

	@Override
	public int update(Passenger passenger) {
		String query = "update passenger set firstname=?, lastname=? where id = ?";
		int result = jdbcTemplate.update(query, passenger.getFirstname(), passenger.getLastname(), passenger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String query = "delete from passenger where id = ?";
		int result = jdbcTemplate.update(query, id);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
