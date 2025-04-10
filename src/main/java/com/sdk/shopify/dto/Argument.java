package com.sdk.shopify.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Argument {

  private String id;

  private Integer first;

  private String after;

  private Integer last;

  private String before;

  private Boolean reverse;

  private String query;

  private String sortKey;

}
