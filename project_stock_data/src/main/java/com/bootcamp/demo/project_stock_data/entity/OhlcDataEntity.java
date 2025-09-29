package com.bootcamp.demo.project_stock_data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ohlcData")
@Getter
@AllArgsConstructor
@Builder

public class OhlcDataEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "stock_id", nullable = false)
  private StockEntity stockEntity;

  @Column(name = "open_price", nullable = false)
  private BigDecimal openPrice;

  @Column(name = "high_price", nullable = false)
  private BigDecimal highPrice;

  @Column(name = "low_price", nullable = false)
  private BigDecimal lowPrice;

  @Column(name = "close_price", nullable = false)
  private BigDecimal closePrice;

  @Column(name = "timestamp", nullable = false)
  private LocalDateTime timestamp;

  @Column(name = "volume", nullable = false)
  private BigDecimal volume;

}
