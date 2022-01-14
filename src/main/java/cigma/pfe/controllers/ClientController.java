package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {

    ClientService clientService = new ClientServiceImpl();
    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }


}
