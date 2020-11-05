package com.microServices.reports.Repository;


import com.microServices.reports.DTO.ClientSumByQuantityOfItems;
import com.microServices.reports.DTO.ClientSumByValueDTO;
import com.microServices.reports.Model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository  extends CrudRepository<Client, Long> {
    @Query("SELECT NEW com.microServices.reports.DTO.ClientSumByValueDTO(c.name,SUM(c.value))  FROM Client c  GROUP BY c.name")
    List<ClientSumByValueDTO> sumValueGroupByName();

    @Query("select NEW com.microServices.reports.DTO.ClientSumByQuantityOfItems(c.date,sum(c.quantityOfItems)) FROM Client c GROUP BY c.date")
    List<ClientSumByQuantityOfItems> sumQuantityOfItemsGroupByDate();
}
