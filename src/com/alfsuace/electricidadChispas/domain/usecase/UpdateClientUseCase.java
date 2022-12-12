package com.alfsuace.electricidadChispas.domain.usecase;

import com.alfsuace.electricidadChispas.data.ClientDataStore;
import com.alfsuace.electricidadChispas.domain.models.Client;

public class UpdateClientUseCase {
    private ClientDataStore clientDataStore;
    public UpdateClientUseCase (ClientDataStore clientDataStore){
        this.clientDataStore = clientDataStore;
    }

    public void execute(Client client){
        clientDataStore.updateClient(client);
    }

}

