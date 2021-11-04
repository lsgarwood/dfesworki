package com.qa.budgies.rest;

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

import com.qa.budgies.domain.Budgie;

@RestController // enables request handling
public class BudgieController {

//	// PURELY FOR DEMO PURPOSES
	private List<Budgie> budgies = new ArrayList<>(); // explain this tomorrow

	@GetMapping("/hello") // listen for a request at /hello
	public String hello() {
		return "Hello, World!"; // sends response
	}

	@PostMapping("/create") // triggered by a POST request to /create
	public ResponseEntity<Budgie> createBudgie(@RequestBody Budgie newBudgie) { // a budgie object in the request + response
																			// body
		this.budgies.add(newBudgie);
		Budgie responseBody = this.budgies.get(this.budgies.size() - 1);
		return new ResponseEntity<Budgie>(responseBody, HttpStatus.CREATED);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Budgie>> getBudgie() {
		return ResponseEntity.ok(this.budgies); // unnecessary due to default being 200 anyway
	}

	@GetMapping("/get/{id}") // getbudgie with id of {id}
	public Budgie getBudgie(@PathVariable Integer id) {
		return this.budgies.get(id);
	}

	@PutMapping("/replace/{id}")
	public ResponseEntity<Budgie> replaceBudgie(@PathVariable Integer id, @RequestBody Budgie newBudgie) {
		System.out.println("Replacing Budgie with id " + id + " with " + newBudgie);
		Budgie body = this.budgies.set(id, newBudgie);
		return new ResponseEntity<Budgie>(body, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeBudgie(@PathVariable Integer id) {
		System.out.println("Removing budgie with id " + id);
		this.budgies.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}