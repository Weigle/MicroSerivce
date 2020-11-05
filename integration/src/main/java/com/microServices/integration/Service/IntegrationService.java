package com.microServices.integration.Service;

import com.microServices.integration.DTO.ClientDTO;
import com.microServices.integration.Feign.ClientFeign;
import com.microServices.integration.Feign.ReportFeign;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class IntegrationService {
    private final ClientFeign clientFeign;
    private final ReportFeign reportFeign;

    public void integration(){
        List<ClientDTO> clients = clientFeign.getAllOrder();
        reportFeign.saveClients(clients);
    }
}
