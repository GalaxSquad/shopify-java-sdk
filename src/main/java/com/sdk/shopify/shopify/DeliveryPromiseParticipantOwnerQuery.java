// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The object that the participant references.
*/
public class DeliveryPromiseParticipantOwnerQuery extends Query<DeliveryPromiseParticipantOwnerQuery> {
    DeliveryPromiseParticipantOwnerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public DeliveryPromiseParticipantOwnerQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
