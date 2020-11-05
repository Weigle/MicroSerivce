package com.microServices.integration.Feign;

import com.microServices.integration.DTO.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("spring-cloud-report")
public interface ReportFeign {
    @RequestMapping(method = RequestMethod.POST, value = "report/")
    void saveClients(List<ClientDTO> clients);
}
