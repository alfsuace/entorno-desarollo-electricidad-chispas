package com.alfsuace.electricidadChispas.domain.usecase;

import com.alfsuace.electricidadChispas.data.ClientDataStore;
import com.alfsuace.electricidadChispas.data.MemClientDataStore;
import com.alfsuace.electricidadChispas.domain.models.Client;

import java.util.List;

public class GetClientUseCase {

    ClientDataStore clientDataStore = new MemClientDataStore();

    public ClientDataStore AddCustomerUseCase(ClientDataStore clientDataStore){
        return clientDataStore;
    }

     public List<Client> execute(Client client){

         return clientDataStore.getAllClients();
     }
}
