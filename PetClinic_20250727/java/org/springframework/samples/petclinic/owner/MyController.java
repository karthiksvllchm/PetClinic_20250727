package org.springframework.samples.petclinic.owner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private VisitRepository visitRepository;
	
	@GetMapping("/getowners")
	public List<Owner> getListOwners() {
		return ownerRepository.findAll();
	}
	
	@GetMapping("/getvisits")
	public List<Visit> getListVisits() {
		return visitRepository.findAll();
	}
}
