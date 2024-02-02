package dev.marcelomarinho.petapi.domain.repository;

import dev.marcelomarinho.petapi.domain.model.PetSpecies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetSpeciesRepository extends JpaRepository<PetSpecies, Long> {
}
