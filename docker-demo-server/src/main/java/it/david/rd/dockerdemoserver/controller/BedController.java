package it.david.rd.dockerdemoserver.controller;

import it.david.rd.dockerdemoserver.Bed;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin("*")
public class BedController {

    @GetMapping("/beds")
    public ResponseEntity<?> list() {
        Bed bedA = new Bed(1l, "Letto 1");
        Bed bedB = new Bed(2l, "Letto 2");
        Bed bedC = new Bed(3l, "Letto 54");
        Bed bedD = new Bed(4l, "Letto 912");

        ArrayList<Bed> beds = new ArrayList<Bed>();
        beds.add(bedA);
        beds.add(bedB);
        beds.add(bedC);
        beds.add(bedD);

        return new ResponseEntity<>(beds, HttpStatus.OK);
    }
}
