package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {
    public static void main(String[] args) {
        ClientController ctrl1 = new ClientController();
        Client client =new Client(1,"malak");
        ctrl1.save(client);

    }

}
