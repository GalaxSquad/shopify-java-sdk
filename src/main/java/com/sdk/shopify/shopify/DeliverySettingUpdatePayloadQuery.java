// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `deliverySettingUpdate` mutation.
*/
public class DeliverySettingUpdatePayloadQuery extends Query<DeliverySettingUpdatePayloadQuery> {
    DeliverySettingUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated delivery shop level settings.
    */
    public DeliverySettingUpdatePayloadQuery setting(DeliverySettingQueryDefinition queryDef) {
        startField("setting");

        _queryBuilder.append('{');
        queryDef.define(new DeliverySettingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DeliverySettingUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
