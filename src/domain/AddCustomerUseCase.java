package domain;

import com.alfsuace.electricidadChispas.Client;
import data.ClientDataStore;
import data.MemClientDataStore;

public class AddCustomerUseCase {

    public void execute(Client client){
        ClientDataStore clientDataStore = new MemClientDataStore();
        clientDataStore.saveClient(client);

    }
}
