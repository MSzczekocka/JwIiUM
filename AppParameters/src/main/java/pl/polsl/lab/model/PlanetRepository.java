package pl.polsl.lab.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Martyna Szczekocka
 * @version 1.0
 */
@Repository
public interface PlanetRepository extends JpaRepository<Planet, Integer>{
}
