package com.projet.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projet.repository.Adminrepo;
import com.projet.Model.Admin;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {

	@Autowired
	private Adminrepo adminRepository;

	@GetMapping("/admins")
	public List<Admin> getAlladmins() {
		return adminRepository.findAll();
	}

	@GetMapping("/admins/{id}")
	public ResponseEntity<Admin> getadminById(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
		Admin admin = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No admin with a such id" + id));
		return ResponseEntity.ok().body(admin);
	}

	@PostMapping("/admins")
	public Admin createadmin(@RequestBody Admin admin) {
		return adminRepository.save(admin);
	}

	@PutMapping("/admins/{id}")
	public ResponseEntity<Admin> updateadmin(@PathVariable(value = "id") Integer id,
			@Valid @RequestBody Admin adminDetails) throws ResourceNotFoundException {
		Admin admin = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No admin for this id" + id));

		admin.setName(adminDetails.getName());
		admin.setJob(adminDetails.getJob());
		admin.setLastname(adminDetails.getLastname());
		final Admin updatedadmin = adminRepository.save(admin);
		return ResponseEntity.ok(updatedadmin);
	}

	@DeleteMapping("/admins/{id}")
	public Map<String, Boolean> deleteadmin(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
		Admin admin = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No admin for this id" + id));

		adminRepository.delete(admin);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}