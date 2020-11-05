package com.microServices.reports.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientSumByValueDTO {
    private String name;
    private Long value;
}
