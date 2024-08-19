package com.edgaritzak.catalogue.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edgaritzak.catalogue.service.AlbumService;


@Controller
public class AlbumController {
	
	@Autowired
	private AlbumService service;
	
	public AlbumController(AlbumService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/home")
	public String homePage(Model model ) {
		model.addAttribute("albums",service.getAlbumList());
		model.addAttribute("test","hola");
		return "index";
	}

}
