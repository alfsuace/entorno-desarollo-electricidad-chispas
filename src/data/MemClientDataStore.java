package data;

import com.alfsuace.electricidadChispas.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MemClientDataStore implements  ClientDataStore{

    private Map<String, Client> dataStore = new TreeMap<String, Client>();
    @Override
    public void saveClient (Client client) {
        dataStore.put(client.getClientCode(), client);
    }

    @Override
    public void deleteClient (Client client) {
        dataStore.remove(client);
    }

    @Override
    public void updateClient (Client client) {
        dataStore.replace(client.getClientCode(), client);
    }

    @Override
    public List<Client> getAllClients () {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Client findById (String clientId) {
        return dataStore.get(clientId);
    }
}
