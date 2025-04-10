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

/**
 * Mapper interface for mapping between DTO objects and GraphQL query arguments.
 * MapStruct generates thread-safe implementation at compile time.
 */
@Mapper
public interface ArgumentMapper {

  ArgumentMapper INSTANCE = Mappers.getMapper(ArgumentMapper.class);

  /**
   * Maps generic Argument to specific OrdersArguments for GraphQL queries.
   * Uses a defaultValue for 'first' to ensure sensible defaults.
   *
   * @param arg the source argument object
   * @param ordersArguments the target arguments object
   */
  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(source = "first", target = "first", defaultValue = "50")
  void updateToOrderArguments(Argument arg, @MappingTarget OrdersArguments ordersArguments);

  /**
   * Converts string sort key to OrderSortKeys enum.
   *
   * @param sortKey the sort key string
   * @return the corresponding OrderSortKeys enum value
   * @throws ShopifySdkException if the sort key is invalid
   */
  default OrderSortKeys toOrderSortKeys(String sortKey) {
    if (sortKey == null || sortKey.trim().isEmpty()) {
      throw new ShopifySdkException("Sort key cannot be null or empty");
    }

    try {
      OrderSortKeys orderSortKeys = OrderSortKeys.fromGraphQl(sortKey);
      if (orderSortKeys == OrderSortKeys.UNKNOWN_VALUE) {
        throw new ShopifySdkException("Unknown sort key: " + sortKey);
      }
      return orderSortKeys;
    } catch (IllegalArgumentException e) {
      throw new ShopifySdkException("Invalid sort key: " + sortKey, e);
    }
  }
}
