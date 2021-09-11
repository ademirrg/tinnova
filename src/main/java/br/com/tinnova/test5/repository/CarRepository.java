package br.com.tinnova.test5.repository;

import br.com.tinnova.test5.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
