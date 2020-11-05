package com.microServices.client.Service;

import com.microServices.client.DTO.ClientDTO;
import org.springframework.stereotype.Service;
import uk.co.jemos.podam.api.ClassInfoStrategy;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClientService {
    public List<ClientDTO> getOrder(Long lines){
        PodamFactory factory = new PodamFactoryImpl();
        List<ClientDTO> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ClientDTO clientName = factory.manufacturePojo(ClientDTO.class);
            for (int j = 0; j < lines; j++) {
                clientName.setDate(clientName.getDate().plusWeeks(1));
                list.add(ClientDTO.builder()
                        .name(clientName.getName())
                        .date(clientName.getDate())
                        .value(factory.manufacturePojo(ClientDTO.class).getValue())
                        .quantityOfItems(factory.manufacturePojo(ClientDTO.class).getQuantityOfItems())
                        .build());

            }
        }

    return list;

    }
}
