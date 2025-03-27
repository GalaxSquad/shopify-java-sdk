// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `dataSaleOptOut` mutation.
*/
public class DataSaleOptOutPayloadQuery extends Query<DataSaleOptOutPayloadQuery> {
    DataSaleOptOutPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the customer whose email address has been opted out of data sale.
    */
    public DataSaleOptOutPayloadQuery customerId() {
        startField("customerId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DataSaleOptOutPayloadQuery userErrors(DataSaleOptOutUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DataSaleOptOutUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
