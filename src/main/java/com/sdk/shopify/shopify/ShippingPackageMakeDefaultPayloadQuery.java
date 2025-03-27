// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `shippingPackageMakeDefault` mutation.
*/
public class ShippingPackageMakeDefaultPayloadQuery extends Query<ShippingPackageMakeDefaultPayloadQuery> {
    ShippingPackageMakeDefaultPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ShippingPackageMakeDefaultPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
