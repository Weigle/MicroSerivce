package com.microServices.integration.Feign;


import com.microServices.integration.DTO.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient("spring-cloud-client")
public interface ClientFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/client/10")
    List<ClientDTO> getAllOrder();
}

