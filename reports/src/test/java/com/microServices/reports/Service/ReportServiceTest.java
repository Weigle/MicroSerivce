package com.microServices.reports.Service;

import com.microServices.reports.DTO.ClientDTO;
import com.microServices.reports.Model.Client;
import com.microServices.reports.Repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest

public class ReportServiceTest {
    static final private Integer ONE = 1;
    static final private Integer TWO = 2;
    static final private Integer THREE = 3;
    static final private Integer YEAR = 2020;
    static final private String NAME = "name";

    @InjectMocks
    private ReportService reportService;
    @Mock
    private ClientRepository clientRepository;

    @Test
    public void verifySaveDTOinDB_thenSuccess(){
        reportService.saveClientDto(getClientDTO());

        Mockito.verify(clientRepository,Mockito.times(ONE)).saveAll(getClient());
    }
    @Test
    public void verifyValueGroupByName_thenSuccess(){
        reportService.getClientByName();

        Mockito.verify(clientRepository,Mockito.times(ONE)).sumValueGroupByName();
    }
    @Test
    public void verifyValueGroupByDate_thenSuccess(){
        reportService.getClientByDate();

        Mockito.verify(clientRepository,Mockito.times(ONE)).sumQuantityOfItemsGroupByDate();
    }

    private List<ClientDTO> getClientDTO(){
        List<ClientDTO> list = new ArrayList<>();
        list.add(ClientDTO.builder()
                .date(LocalDate.of(YEAR,ONE,ONE))
                .name(NAME)
                .value(1L)
                .quantityOfItems(2L)
                .build());
        list.add(ClientDTO.builder()
                .date(LocalDate.of(YEAR,TWO,ONE))
                .name(NAME)
                .value(1L)
                .quantityOfItems(2L)
                .build());
        list.add(ClientDTO.builder()
                .date(LocalDate.of(YEAR,THREE,ONE))
                .name(NAME)
                .value(1L)
                .quantityOfItems(2L)
                .build());
        return list;
    }
    private List<Client> getClient(){
        List<Client> list = new ArrayList<>();
        list.add(Client.builder()
                .date(LocalDate.of(YEAR,ONE,ONE))
                .name(NAME)
                .value(1L)
                .quantityOfItems(2L)
                .build());
        list.add(Client.builder()
                .date(LocalDate.of(YEAR,TWO,ONE))
                .name(NAME)
                .value(1L)
                .quantityOfItems(2L)
                .build());
        list.add(Client.builder()
                .date(LocalDate.of(YEAR,THREE,ONE))
                .name(NAME)
                .value(1L)
                .quantityOfItems(2L)
                .build());
        return list;
    }
}
