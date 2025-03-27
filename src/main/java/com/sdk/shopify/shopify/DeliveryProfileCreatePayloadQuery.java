// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryProfileCreate` mutation.
*/
public class DeliveryProfileCreatePayloadQuery extends Query<DeliveryProfileCreatePayloadQuery> {
    DeliveryProfileCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The delivery profile that was created.
    */
    public DeliveryProfileCreatePayloadQuery profile(DeliveryProfileQueryDefinition queryDef) {
        startField("profile");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryProfileCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
