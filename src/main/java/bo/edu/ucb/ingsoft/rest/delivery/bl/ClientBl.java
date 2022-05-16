package bo.edu.ucb.ingsoft.rest.delivery.bl;

import bo.edu.ucb.ingsoft.rest.delivery.dao.ClientDao;
import bo.edu.ucb.ingsoft.rest.delivery.dto.api.ClientApiDto;
import bo.edu.ucb.ingsoft.rest.delivery.dto.db.ClientDbDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientBl {
    private ClientDao clientDao;
    public Logger logger = LoggerFactory.getLogger(ClientBl.class);
    @Autowired
    public ClientBl(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public ClientApiDto findClientById(Integer clientId){
        ClientDbDto clientDbDto = clientDao.findClientById(clientId);
        logger.debug(clientDbDto.toString());
        ClientApiDto clientApiDto = new ClientApiDto();
        clientApiDto.setClienteId(clientId);
        clientApiDto.setNombre(clientDbDto.getNombre());
        clientApiDto.setNit(clientDbDto.getNit());
        clientApiDto.setTelefono(clientApiDto.getTelefono());
        return clientApiDto;
    }

}
