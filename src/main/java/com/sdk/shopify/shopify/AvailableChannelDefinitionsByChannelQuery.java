// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an object containing all information for channels available to a shop.
*/
public class AvailableChannelDefinitionsByChannelQuery extends Query<AvailableChannelDefinitionsByChannelQuery> {
    AvailableChannelDefinitionsByChannelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The channel definitions for channels installed on a shop.
    */
    public AvailableChannelDefinitionsByChannelQuery channelDefinitions(ChannelDefinitionQueryDefinition queryDef) {
        startField("channelDefinitions");

        _queryBuilder.append('{');
        queryDef.define(new ChannelDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the channel.
    */
    public AvailableChannelDefinitionsByChannelQuery channelName() {
        startField("channelName");

        return this;
    }
}
