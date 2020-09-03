package com.github.mateuszwlosek.swagger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {

	private final String firstName;
	private final String lastName;
	private final String username;
}
