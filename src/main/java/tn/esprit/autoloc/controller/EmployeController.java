package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employes")
public class EmployeController {
    private final IEmployeService employeService;

    // http://localhost:8080/employes/afficherTousEmployes
    @GetMapping("/afficherTousEmployes")
    public List<Employe> listEmployes() {
        return employeService.getEmployes();
    }

    // http://localhost:8080/employes/ajouterEmploye
    @PostMapping("/ajouterEmploye")
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    // http://localhost:8080/employes/modifierEmploye
    @PutMapping({"", "/modifierEmploye"})
    public Employe modifierEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    // http://localhost:8080/employes/afficherEmploye/{id}
    @GetMapping("/afficherEmploye/{id}")
    public Employe afficherEmploye(@PathVariable Long id) {
        return employeService.getEmpById(id);
    }

    // http://localhost:8080/employes/supprimerEmploye/{id}
    @DeleteMapping("/supprimerEmploye/{id}")
    public void supprimerEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}
