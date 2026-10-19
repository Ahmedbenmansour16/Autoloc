package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrats")
public class ContratController {
    private final IContratService contratService;

    // http://localhost:8080/contrats/afficherTousContrats
    @GetMapping("/afficherTousContrats")
    public List<Contrat> listContrats() {
        return contratService.afficherAllContrats();
    }

    // http://localhost:8080/contrats/ajouterContrat
    @PostMapping("/ajouterContrat")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.ajouterContrat(contrat);
    }

    // http://localhost:8080/contrats/modifierContrat
    @PutMapping({"", "/modifierContrat"})
    public Contrat modifierContrat(@RequestBody Contrat contrat) {
        return contratService.modifierContrat(contrat);
    }

    // http://localhost:8080/contrats/afficherContrat/{id}
    @GetMapping("/afficherContrat/{id}")
    public Contrat afficherContrat(@PathVariable Long id) {
        return contratService.afficherContratById(id);
    }

    // http://localhost:8080/contrats/supprimerContrat/{id}
    @DeleteMapping("/supprimerContrat/{id}")
    public void supprimerContrat(@PathVariable Long id) {
        contratService.supprimerContrat(id);
    }
}
