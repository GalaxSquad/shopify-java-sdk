// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliveryPromiseProviderUpsert` mutation.
*/
public class DeliveryPromiseProviderUpsertPayloadQuery extends Query<DeliveryPromiseProviderUpsertPayloadQuery> {
    DeliveryPromiseProviderUpsertPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created or updated delivery promise provider.
    */
    public DeliveryPromiseProviderUpsertPayloadQuery deliveryPromiseProvider(DeliveryPromiseProviderQueryDefinition queryDef) {
        startField("deliveryPromiseProvider");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseProviderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliveryPromiseProviderUpsertPayloadQuery userErrors(DeliveryPromiseProviderUpsertUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseProviderUpsertUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
