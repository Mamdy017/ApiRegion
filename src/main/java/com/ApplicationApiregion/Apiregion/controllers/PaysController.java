package com.ApplicationApiregion.Apiregion.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationApiregion.Apiregion.entite.Pays;
import com.ApplicationApiregion.Apiregion.services.PaysService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/pays")
@Api(value = "hello", description = "Sample hello world application")
@AllArgsConstructor
public class PaysController {
	
  private final PaysService PaysService;

  @ApiOperation(value = "Just to test the sample test api of My App Service")
	@PostMapping("/create")
	public Pays create(@RequestBody Pays pays) {
		return PaysService.creer(pays);
	}

  @ApiOperation(value = "Just to test the sample test api of My App Service")
	@GetMapping("/read")
	public List<Pays> read(){
		return PaysService.lire();
		
	}

  @ApiOperation(value = "Just to test the sample test api of My App Service")
	@PutMapping("/update/{Id}")
	public Pays update(@PathVariable Long Id,@RequestBody Pays pays) {
		return PaysService.modifier( Id, pays);
	}

  @ApiOperation(value = "Just to test the sample test api of My App Service")
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable Long Id) {
		return PaysService.supprimer(Id);
	}


}
