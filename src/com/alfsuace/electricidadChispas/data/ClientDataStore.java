package com.alfsuace.electricidadChispas.data;

import com.alfsuace.electricidadChispas.domain.models.Client;

import java.util.List;

public interface ClientDataStore {
    void saveClient(Client client);
    void deleteClient(Client client);
    void updateClient(Client client);
    List<Client> getAllClients();
    Client findById(String clientId);
}
