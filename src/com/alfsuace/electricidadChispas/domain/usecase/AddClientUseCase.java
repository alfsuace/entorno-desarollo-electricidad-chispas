package com.alfsuace.electricidadChispas.domain.usecase;

import com.alfsuace.electricidadChispas.data.ClientDataStore;
import com.alfsuace.electricidadChispas.data.MemClientDataStore;
import com.alfsuace.electricidadChispas.domain.models.Client;

public class AddClientUseCase {



    public void execute(Client client){
        ClientDataStore clientDataStore = new MemClientDataStore();
        clientDataStore.saveClient(client);

    }
}
