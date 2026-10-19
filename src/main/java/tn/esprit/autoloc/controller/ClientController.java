package tn.esprit.autoloc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    private final IClientService clientService;

    // http://localhost:8080/clients/afficherTousClients
    @GetMapping("/afficherTousClients")
    public List<Client> listClients() {
        return clientService.afficherAllClients();
    }

    // http://localhost:8080/clients/ajouterClient
    @PostMapping("/ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    // http://localhost:8080/clients/modifierClient
    @PutMapping({"", "/modifierClient"})
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    // http://localhost:8080/clients/afficherClient/{id}
    @GetMapping("/afficherClient/{id}")
    public Client afficherClient(@PathVariable Long id) {
        return clientService.afficherClientById(id);
    }

    // http://localhost:8080/clients/supprimerClient/{id}
    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }
}
