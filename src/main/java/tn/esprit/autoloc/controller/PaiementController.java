package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiements")
public class PaiementController {
    private final IPaiementService paiementService;

    // http://localhost:8080/paiements/afficherTousPaiements
    @GetMapping("/afficherTousPaiements")
    public List<Paiement> listPaiements() {
        return paiementService.getAllPaiements();
    }

    // http://localhost:8080/paiements/ajouterPaiement
    @PostMapping("/ajouterPaiement")
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    // http://localhost:8080/paiements/modifierPaiement
    @PutMapping({"", "/modifierPaiement"})
    public Paiement modifierPaiement(@RequestBody Paiement paiement) {
        return paiementService.updatePaiement(paiement);
    }

    // http://localhost:8080/paiements/afficherPaiement/{id}
    @GetMapping("/afficherPaiement/{id}")
    public Paiement afficherPaiement(@PathVariable Long id) {
        return paiementService.getPaiementById(id);
    }

    // http://localhost:8080/paiements/supprimerPaiement/{id}
    @DeleteMapping("/supprimerPaiement/{id}")
    public void supprimerPaiement(@PathVariable Long id) {
        paiementService.deletePaiement(id);
    }
}
