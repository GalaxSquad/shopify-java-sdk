package com.sdk.shopify;

import com.sdk.shopify.shopify.Operations;
import com.sdk.shopify.shopify.Order;
import com.sdk.shopify.shopify.OrderConnection;
import com.sdk.shopify.shopify.QueryResponse;
import com.sdk.shopify.shopify.QueryRootQuery;
import java.io.IOException;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/** Hello world! */
@Slf4j
public class App {
  public static void main(String[] args) throws IOException, InterruptedException {
    ShopifySdk shopifySdk =
        new ShopifySdk("kezlo-test-2", "shpua_fe842081e57b48e28b29595d175964b2");
    QueryRootQuery rootQuery =
        Operations.query(
            q ->
                q.orders(
                    args1 -> args1.first(10),
                    o ->
                        o.nodes(n -> n.createdAt().currencyCode().confirmed())
                            .pageInfo(p -> p.endCursor().hasPreviousPage().hasNextPage().startCursor())));
      QueryResponse queryResponse = shopifySdk.queryShopifyAdmin(rootQuery);
      OrderConnection orderConnection = queryResponse.getData().getOrders();
      List<Order> order = orderConnection.getNodes();
      log.info(queryResponse.toString());
  }
}
