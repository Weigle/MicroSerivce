package com.microServices.client.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClientDTO {
    private String name;
    private Long value;
    private LocalDate date;
    private Long quantityOfItems;
}
