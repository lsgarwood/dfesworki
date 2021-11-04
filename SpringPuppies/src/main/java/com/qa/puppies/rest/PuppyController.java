package com.qa.puppies.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.puppies;

@RestController // enables request handling
public class PuppyController {

	// PURELY FOR DEMO PURPOSES
	private List<Puppy> puppies = new ArrayList<>(); // explain this tomorrow

	@GetMapping("/hello") // listen for a request at /hello
	public String hello() {
		return "Hello, World!"; // sends response
	}

	@PostMapping("/create") // triggered by a POST request to /create
	public ResponseEntity<Puppy> createPuppy(@RequestBody Puppy newPuppy) { // a puppy object in the request + response
																			// body
		this.puppies.add(newPuppy);
		Puppy responseBody = this.puppies.get(this.puppies.size() - 1);
		return new ResponseEntity<Puppy>(responseBody, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Puppy>> getPuppies() {
		return ResponseEntity.ok(this.puppies); // unnecessary due to default being 200 anyway
	}

	@GetMapping("/get/{id}") // getpuppy with id of {id}
	public Puppy getPuppy(@PathVariable Integer id) {
		return this.puppies.get(id);
	}

	@PutMapping("/replace/{id}")
	public ResponseEntity<Puppy> replacePuppy(@PathVariable Integer id, @RequestBody Puppy newPuppy) {

		System.out.println("Replacing puppy with id " + id + " with " + newPuppy);
		return null;
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removePuppy(@PathVariable Integer id) {
		System.out.println("Removing puppy with id " + id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}