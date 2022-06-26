package com.sathwik.spring.springcore.databaseproperties.assignment;

public class WSclient {
	private String dbServer;
	private String userName;
	private String password;

	WSclient(String dbServer, String userName, String password) {
		this.dbServer = dbServer;
		this.userName = userName;
		this.password = password;
	}

	public String getDbServer() {
		return dbServer;
	}

	public void setDbServer(String dbServer) {
		this.dbServer = dbServer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "WSclient [dbServer=" + dbServer + ", userName=" + userName + ", password=" + password + "]";
	}
}
