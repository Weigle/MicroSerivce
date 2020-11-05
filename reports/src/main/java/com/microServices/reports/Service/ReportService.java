package com.microServices.reports.Service;

import com.microServices.reports.DTO.ClientDTO;
import com.microServices.reports.DTO.ClientSumByQuantityOfItems;
import com.microServices.reports.DTO.ClientSumByValueDTO;
import com.microServices.reports.Model.Client;
import com.microServices.reports.Repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ReportService {

    private final ClientRepository clientRepository;

    public List<ClientSumByValueDTO> getClientByName(){
        return clientRepository.sumValueGroupByName();
    }
    public List<ClientSumByQuantityOfItems> getClientByDate(){
        return clientRepository.sumQuantityOfItemsGroupByDate();
    }

    public void saveClientDto(List<ClientDTO> clientDTO){
        List<Client> clients = new ArrayList<>();
        clientDTO.forEach(dto -> {
            clients.add(clientToDtoClient(dto));
        });
        clientRepository.saveAll(clients);
    }
    private Client clientToDtoClient(@NonNull ClientDTO clientDTO) {
        return Client.builder()
                .name(clientDTO.getName())
                .date(clientDTO.getDate())
                .quantityOfItems(clientDTO.getQuantityOfItems())
                .value(clientDTO.getValue())
                .build();

    }
}
