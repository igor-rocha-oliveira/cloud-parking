package one.digitalinovation.parking.repository;

import one.digitalinovation.parking.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository <Parking, String>{

}