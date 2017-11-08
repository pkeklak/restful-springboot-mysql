package cz.keklak.restfulapi.repository;

import cz.keklak.restfulapi.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Integer>{
}
