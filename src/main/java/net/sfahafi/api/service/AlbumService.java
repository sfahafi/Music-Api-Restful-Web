package net.sfahafi.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sfahafi.api.entity.Album;
import net.sfahafi.api.interfaces.service.I_AlbumService;
import net.sfahafi.api.jpa.repository.I_AlbumsRepositori;

@Service
public class AlbumService implements I_AlbumService {

	@Autowired
	private I_AlbumsRepositori repoAlbum;
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbum.findAll();
	}

	@Override
	public void guardar(Album album) {
		repoAlbum.save(album);
	}

	@Override
	public void eliminar(int idAlbum) {
		repoAlbum.deleteById(idAlbum);
	}

}
