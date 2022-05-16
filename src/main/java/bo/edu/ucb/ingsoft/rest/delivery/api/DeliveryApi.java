package bo.edu.ucb.ingsoft.rest.delivery.api;

import bo.edu.ucb.ingsoft.rest.delivery.bl.ClientBl;
import bo.edu.ucb.ingsoft.rest.delivery.dto.api.ClientApiDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/client")
public class DeliveryApi {
    private ClientBl clientBl;

    public DeliveryApi(ClientBl clientBl){
        this.clientBl = clientBl;
    }

    @GetMapping(path ="/{clientId}",produces = APPLICATION_JSON_VALUE)
    public ClientApiDto findPersonById(@PathVariable("clientId") Integer clientId){
        return clientBl.findClientById(clientId);
    }
}
