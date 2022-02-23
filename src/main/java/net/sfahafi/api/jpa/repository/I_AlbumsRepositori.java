package net.sfahafi.api.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sfahafi.api.entity.Album;

public interface I_AlbumsRepositori extends JpaRepository<Album, Integer> {

}
