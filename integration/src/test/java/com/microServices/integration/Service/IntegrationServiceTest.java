package com.microServices.integration.Service;

import com.microServices.integration.DTO.ClientDTO;
import com.microServices.integration.Feign.ClientFeign;
import com.microServices.integration.Feign.ReportFeign;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class IntegrationServiceTest {
    static final private Integer ONE = 1;
    static final private Integer TWO = 2;
    static final private Integer THREE = 3;
    static final private Integer YEAR = 2020;
    @InjectMocks
    private IntegrationService integrationService;
    @Mock
    private ClientFeign clientFeign;
    @Mock
    private ReportFeign reportFeign;

    @Test
    public void sendIntegrationToReport_ThenSuccess(){
        Mockito.when(clientFeign.getAllOrder()).thenReturn(getClientDTO());

        integrationService.integration();

        Mockito.verify(reportFeign,Mockito.times(ONE)).saveClients(clientFeign.getAllOrder());
    }
    private List<ClientDTO> getClientDTO(){
        List<ClientDTO> list = new ArrayList<>();
        list.add(ClientDTO.builder()
                .date(LocalDate.of(YEAR,ONE,ONE))
                .name("Name")
                .value(1L)
                .quantityOfItems(2L)
                .build());
        list.add(ClientDTO.builder()
                .date(LocalDate.of(YEAR,TWO,ONE))
                .name("Name 2")
                .value(1L)
                .quantityOfItems(2L)
                .build());
        list.add(ClientDTO.builder()
                .date(LocalDate.of(YEAR,THREE,ONE))
                .name("Name")
                .value(1L)
                .quantityOfItems(2L)
                .build());
        return list;
    }
}
