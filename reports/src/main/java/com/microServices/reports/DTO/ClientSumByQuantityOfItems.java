package com.microServices.reports.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientSumByQuantityOfItems {
    private LocalDate date;
    private Long sumQuantityOfItems;
}
