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

import lombok.AllArgsConstructor;

import com.ApplicationApiregion.Apiregion.entite.region;
import com.ApplicationApiregion.Apiregion.services.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/region")
@Api(value = "hello", description = "Sample hello world application")
@AllArgsConstructor
public class RegionController {
 
	
	private final RegionService RegionService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
	@PostMapping("/create")
	
	public region create(@RequestBody region Region) {
		return RegionService.creer(Region);
	}

    @ApiOperation(value = "Just to test the sample test api of My App Service")
	@GetMapping("/read")
	public List<region> read(){
		return RegionService.lire();
		
	}

    @ApiOperation(value = "Just to test the sample test api of My App Service")
	@GetMapping("/sansPays")
	 public Iterable<Object[]> Afficher(){
	   return RegionService.getRegionsP();
		
	}

     @ApiOperation(value = "Just to test the sample test api of My App Service")
	@PutMapping("/update/{Id}")
	public region update(@PathVariable Long Id,@RequestBody region Region) {
		return RegionService.modifier( Id, Region);
	}

     @ApiOperation(value = "Just to test the sample test api of My App Service")
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable Long Id) {
		return RegionService.supprimer(Id);
	}
}
	
