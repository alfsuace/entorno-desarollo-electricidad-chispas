package com.alfsuace.electricidadChispas.domain;

import com.alfsuace.electricidadChispas.Client;
import com.alfsuace.electricidadChispas.data.ClientDataStore;
import com.alfsuace.electricidadChispas.data.MemClientDataStore;

public class AddCustomerUseCase {

    public void execute(Client client){
        ClientDataStore clientDataStore = new MemClientDataStore();
        clientDataStore.saveClient(client);

    }
}
