package com.dino.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter  @Setter @ToString
public class MemberVO {
	private String username;
	private String userid;
	private String pwd;
	private String email;
	private String phone;
	private int admin;

}
