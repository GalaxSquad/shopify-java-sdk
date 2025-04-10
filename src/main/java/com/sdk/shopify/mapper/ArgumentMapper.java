package com.sdk.shopify.mapper;

import com.sdk.shopify.ShopifySdkException;
import com.sdk.shopify.dto.Argument;
import com.sdk.shopify.shopify.OrderSortKeys;
import com.sdk.shopify.shopify.QueryRootQuery.OrdersArguments;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArgumentMapper {

  ArgumentMapper INSTANCE = Mappers.getMapper(ArgumentMapper.class);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(source = "first", target = "first", defaultValue = "50")
  void updateToOrderArguments(Argument arg, @MappingTarget OrdersArguments ordersArguments);

  default OrderSortKeys toOrderSortKeys(String sortKey) {
    OrderSortKeys orderSortKeys = OrderSortKeys.fromGraphQl(sortKey);
    if(orderSortKeys == OrderSortKeys.UNKNOWN_VALUE){
      throw new ShopifySdkException("Unknown sort key: " + sortKey);
    }
    return orderSortKeys;
  }

}
