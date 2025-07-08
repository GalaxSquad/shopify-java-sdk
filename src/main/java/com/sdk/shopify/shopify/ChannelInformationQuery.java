// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Contains the information for a given sales channel.
*/
public class ChannelInformationQuery extends Query<ChannelInformationQuery> {
    ChannelInformationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The app associated with the channel.
    */
    public ChannelInformationQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The channel definition associated with the channel.
    */
    public ChannelInformationQuery channelDefinition(ChannelDefinitionQueryDefinition queryDef) {
        startField("channelDefinition");

        _queryBuilder.append('{');
        queryDef.define(new ChannelDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique ID for the channel.
    */
    public ChannelInformationQuery channelId() {
        startField("channelId");

        return this;
    }

    /**
    * The publishing destination display name or channel name.
    */
    public ChannelInformationQuery displayName() {
        startField("displayName");

        return this;
    }
}
