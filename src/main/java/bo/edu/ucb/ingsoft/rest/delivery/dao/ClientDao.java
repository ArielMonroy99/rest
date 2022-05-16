package bo.edu.ucb.ingsoft.rest.delivery.dao;

import bo.edu.ucb.ingsoft.rest.delivery.dto.db.ClientDbDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface ClientDao {
    @Select("Select cliente_id , nombre,telefono,status,tx_id," +
            "tx_host,tx_date from cliente where cliente_id = #{clientId}")
    ClientDbDto findClientById(@Param("clientId")Integer clientId);


}
