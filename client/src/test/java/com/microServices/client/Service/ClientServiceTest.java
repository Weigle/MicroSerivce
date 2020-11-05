package com.microServices.client.Service;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClientServiceTest {
    @InjectMocks
    private ClientService clientService;
    private static final Long ONE = 1L;
    private static final Long TEN = 10L;
    @Test
    void countList_ThenSuccess() {
        val result = clientService.getOrder(ONE);

        assertEquals(TEN,result.size());
    }

}
