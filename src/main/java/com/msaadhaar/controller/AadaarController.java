package com.msaadhaar.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AadaarController {
	@RequestMapping(value ="/validateAadaar", method = RequestMethod.POST)
	public HashMap<String,String> validateAadaar(String aadaarNo)
	{
		HashMap<String,String> hm = new  HashMap<String,String>();
		hm.put("status", aadaarNo);
		return hm;
	}
}
