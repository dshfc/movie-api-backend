package com.allstate.compozed.repository;
import com.allstate.compozed.model.Movie_API_Model;
import org.springframework.data.repository.CrudRepository;

public interface Movie_API_Repository extends CrudRepository<Movie_API_Model, Long> {
}
