package com.bootcamp.demo.project_stock_data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profiles")
@Getter
@AllArgsConstructor
@Builder

public class ProfileEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String country;
  @Column(nullable = false)
  private String currency;
  @Column(nullable = false)
  private String exchange;
  @Column(nullable = false)
  private Date ipo;
  @Column(nullable = false)
  private String marketCapitalization;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String phone;
  @Column(nullable = false)
  private BigDecimal shareOutstanding;
  @Column(nullable = false)
  private String ticker;
  @Column(nullable = false)
  private String weburl;
  @Column(nullable = false)
  private String logo;
  @Column(nullable = false)
  private String finnhubIndustry;

  @OneToOne
  @JoinColumn(name = "stock_id", nullable = false)
  private StockEntity stockEntity;

}
