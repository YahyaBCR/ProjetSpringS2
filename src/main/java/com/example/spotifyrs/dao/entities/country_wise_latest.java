package com.example.spotifyrs.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigInteger;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class country_wise_latest {
    @Id
    private String country_region;
    private String continent;
    private BigInteger population ;
    private BigInteger total_cases ;
    private String new_cases;
    private BigInteger total_deaths;
    private String new_deaths;
    private BigInteger total_recovered;
    private String new_recovered;
    private BigInteger active_cases;
    private BigInteger serious_critical;
    private BigInteger tot_cases_per_1m_pop;
    private Float deaths_per_1m_pop ;
    private BigInteger total_tests;
    private Integer tests_per_1m_pop ;
    private String who_region;
}
