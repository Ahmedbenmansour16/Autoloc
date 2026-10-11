package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IClientServiceInterface implements IClientService{

private final ClientRepository clientRepository;


    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return null;
    }

    @Override
    public Client afficherClientById(Long id) {
        return null;
    }

    @Override
    public List<Client> afficherAllClients() {
        return List.of();
    }

    @Override
    public void supprimerClient(long id) {

    }
}
