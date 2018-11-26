package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	
	RestTemplate res = new RestTemplate();
	
	@GetMapping("test/{zipcode}")
	public Tempature Hello(@PathVariable(value= "zipcode")String zipcode)
	
		{
		
		System.out.println("1111111111111");
		Tempature  tempature =res.getForObject("https://samples.openweathermap.org/data/2.5/forecast?zip=zipcode&appid=b6907d289e10d714a6e88b30761fae22", Tempature.class);
	
		
		
		return tempature;
	}

}
