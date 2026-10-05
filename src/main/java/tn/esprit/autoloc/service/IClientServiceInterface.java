package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Client;

import java.util.List;

public class IClientServiceInterface implements IClientService{

    @Override
    public Client ajouterClient(Client client) {
        return null;
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
