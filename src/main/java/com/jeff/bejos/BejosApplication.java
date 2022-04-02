package com.jeff.bejos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BejosApplication implements CommandLineRunner {
    @Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(BejosApplication.class, args);
		System.out.println("Hello World");
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO students (name, email) VALUES ("
				+ "'Nam Ha Minh', 'nam@codejava.net')";

		int rows = jdbcTemplate.update(sql);
		if (rows > 0) {
			System.out.println("A new row has been inserted.");
		}
	}

}
