// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shop's data sale opt out page.
*/
public class DataSaleOptOutPageQuery extends Query<DataSaleOptOutPageQuery> {
    DataSaleOptOutPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * If the data sale opt out page is auto managed.
    */
    public DataSaleOptOutPageQuery autoManaged() {
        startField("autoManaged");

        return this;
    }
}
