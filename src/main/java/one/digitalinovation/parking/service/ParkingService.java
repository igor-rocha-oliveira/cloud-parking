package one.digitalinovation.parking.service;

import one.digitalinovation.parking.model.Parking;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ParkingService {

    private static Map<String, Parking> parkingMap = new HashMap();

    static {
        var id= getUUID();
        var id1= getUUID();
        Parking parking = new Parking((String) id, "DMS-1111", "SC", "CELTA", "Preto");
        Parking parking1 = new Parking((String) id1, "WAS-1234", "SP", "VW GOL", "VERMELHO");

        parkingMap.put((String) id, parking);
        parkingMap.put((String) id1, parking1);
    }

    public List<Parking> findAll(){
        return parkingMap.values().stream().collect(Collectors.toList());
    }


    private static Object getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

    public Parking findById(String id) {
        return parkingMap.get(id);
    }

    public Parking create(Parking parkingCreate) {
        String uuid = (String) getUUID();
        parkingCreate.setId(uuid);
        parkingCreate.setEntryDate(LocalDateTime.now());
        parkingMap.put(uuid, parkingCreate);
        return  parkingCreate;
    }
}
