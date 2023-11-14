package com.example.Track;

public class User {
	String user;
	int id;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(String user, int id) {
		super();
		this.user = user;
		this.id = id;
	}
}
