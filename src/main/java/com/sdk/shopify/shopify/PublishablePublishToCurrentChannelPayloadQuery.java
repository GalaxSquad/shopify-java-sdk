// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `publishablePublishToCurrentChannel` mutation.
*/
public class PublishablePublishToCurrentChannelPayloadQuery extends Query<PublishablePublishToCurrentChannelPayloadQuery> {
    PublishablePublishToCurrentChannelPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Resource that has been published.
    */
    public PublishablePublishToCurrentChannelPayloadQuery publishable(PublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new PublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user's shop.
    */
    public PublishablePublishToCurrentChannelPayloadQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PublishablePublishToCurrentChannelPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
