package com.microServices.reports.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

import static javax.persistence.GenerationType.*;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy= AUTO)
    private Long Id;
    private String name;
    private Long value;
    private LocalDate date;
    private Long quantityOfItems;


}
