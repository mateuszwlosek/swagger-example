package com.github.mateuszwlosek.swagger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

	@GetMapping("/{userId}")
	public User getUser(@PathVariable final long userId) {
		final User user = User.builder()
			.firstName("test-first-name")
			.lastName("test-last-name")
			.username("test-username")
			.build();

		log.info("Returning user: {} with id: {}", user, userId);
		return user;
	}

	@PostMapping
	public void createUser(@RequestBody final User user) {
		log.info("Creating user: {}", user);
	}

	@PutMapping("{userId}")
	public void updateUser(@PathVariable final long userId, @RequestBody final User user) {
		log.info("Updating user: {} with id: {}", user, userId);
	}

	@DeleteMapping("{userId}")
	public void deleteUser(@PathVariable final String userId) {
		log.info("Deleting user with id: {}", userId);
	}
}
