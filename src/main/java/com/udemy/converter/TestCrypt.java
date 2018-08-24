package com.udemy.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestCrypt {

	public static void main(String[] args) {
		BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
		System.out.println(pass.encode("user"));

	}

}
