package net.sfahafi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sfahafi.api.entity.Album;
import net.sfahafi.api.interfaces.service.I_AlbumService;


@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private I_AlbumService ias; 
	
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return ias.buscarTodos();
	}
	
	@PostMapping("/albums")
	public Album guardar(@RequestBody Album album) {
		ias.guardar(album);
		return album;
	}
	
}
