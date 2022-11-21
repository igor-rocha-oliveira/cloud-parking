package one.digitalinovation.parking.service;

import one.digitalinovation.parking.model.Parking;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap();

    static {
        var id= getUUID();
        Parking parking = new Parking((String) id, "DMS-1111", "SC", "CELTA", "Preto");
        parkingMap.put((String) id, parking);
    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());
    }


    private static Object getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
