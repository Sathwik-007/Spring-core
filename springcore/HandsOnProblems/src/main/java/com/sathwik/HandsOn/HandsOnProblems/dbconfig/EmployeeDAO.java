package com.sathwik.HandsOn.HandsOnProblems.dbconfig;

public class EmployeeDAO {
	private DBConfig dbconfig;

	public DBConfig getDbconfig() {
		return dbconfig;
	}

	public void setDbconfig(DBConfig dbconfig) {
		this.dbconfig = dbconfig;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [dbconfig=" + dbconfig + "]";
	}
}
