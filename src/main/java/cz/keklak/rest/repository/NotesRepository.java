package cz.keklak.rest.repository;

import cz.keklak.rest.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Notes, Integer>{
}
