package com.microServices.reports.Controller;

import com.microServices.reports.DTO.ClientDTO;
import com.microServices.reports.DTO.ClientSumByQuantityOfItems;
import com.microServices.reports.DTO.ClientSumByValueDTO;
import com.microServices.reports.Service.ReportService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("report")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ReportController {
    static private final String producesType = "application/json";
    private final ReportService reportService;


    @RequestMapping(value = "/reportByValue", method = RequestMethod.GET,produces = producesType)
    public List<ClientSumByValueDTO> getOrderByClient(){
        return reportService.getClientByName();
    }
    @RequestMapping(value = "/reportByDate", method = RequestMethod.GET,produces = producesType)
    public List<ClientSumByQuantityOfItems> getOrderByDate(){
        return reportService.getClientByDate();

    }
    @RequestMapping(value = "/", method = RequestMethod.POST,produces = producesType)
    private void saveClient(@RequestBody List<ClientDTO> client){
        reportService.saveClientDto(client);
    }

}
