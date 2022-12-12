package com.alfsuace.electricidadChispas.domain.usecase;

import com.alfsuace.electricidadChispas.data.ClientDataStore;
import com.alfsuace.electricidadChispas.data.MemClientDataStore;
import com.alfsuace.electricidadChispas.domain.models.Client;

public class DeleteClientUseCase {

    //Propiedad/Atributo
    private ClientDataStore clientDataStore = new MemClientDataStore();

    public void DeleteClientUseCase(ClientDataStore clientDataStore){
        this.clientDataStore = clientDataStore;
    }

    public void execute(Client client){
        clientDataStore.deleteClient(client);
    }
}
