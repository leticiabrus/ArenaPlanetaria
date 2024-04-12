package br.com.unicuritiba.ArenaPlanetaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unicuritiba.ArenaPlanetaria.models.Planeta;

public interface PlanetaRepository extends
	JpaRepository<Planeta, Long> {

}
