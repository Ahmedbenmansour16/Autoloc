package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Reservation;
import tn.esprit.autoloc.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    private final IReservationService reservationService;

    // http://localhost:8080/reservations/afficherToutesReservations
    @GetMapping("/afficherToutesReservations")
    public List<Reservation> listReservations() {
        return reservationService.getAllReservations();
    }

    // http://localhost:8080/reservations/ajouterReservation
    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    // http://localhost:8080/reservations/modifierReservation
    @PutMapping({"", "/modifierReservation"})
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    // http://localhost:8080/reservations/afficherReservation/{id}
    @GetMapping("/afficherReservation/{id}")
    public Reservation afficherReservation(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    // http://localhost:8080/reservations/supprimerReservation/{id}
    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
