package com.microServices.integration.Components;

import com.microServices.integration.Service.IntegrationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableScheduling
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ScheduledClient {
    private final IntegrationService integrationService;
    @Scheduled(fixedDelay = 100000)
    public void run() {
        integrationService.integration();
    }
}
