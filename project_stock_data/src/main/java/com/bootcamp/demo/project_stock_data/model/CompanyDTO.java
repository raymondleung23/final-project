package com.bootcamp.demo.project_stock_data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDTO {
  private String country;
  private String currency;
  private String exchange;
  private String ipo;
  private Float marketCapitalization;
  private String name;
  private String phone;
  private Float shareOutstanding;
  private String ticker;
  private String weburl;
  private String logo;
  private String finnhubIndustry;
}
