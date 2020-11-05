package com.microServices.client.Controller;

import com.microServices.client.DTO.ClientDTO;
import com.microServices.client.Service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientController {
    static private final String producesType = "application/json";
    @Autowired
    private final ClientService clientService;

    @RequestMapping(value = "/{lines}", method = RequestMethod.GET,produces = producesType)
    public List<ClientDTO> getOrderByClient(@PathVariable Long lines){
        return clientService.getOrder(lines);
    }
}
