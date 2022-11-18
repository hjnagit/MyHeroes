package com.myproject.heroes.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class UserVO {
	private String user_id;
	private String pw;
	private String email;
	private Integer point;
	private Timestamp joindate;
}
