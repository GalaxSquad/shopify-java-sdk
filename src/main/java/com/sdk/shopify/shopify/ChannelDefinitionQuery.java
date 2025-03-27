// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A channel definition represents channels surfaces on the platform.
* A channel definition can be a platform or a subsegment of it such as Facebook Home, Instagram Live,
* Instagram Shops, or WhatsApp chat.
*/
public class ChannelDefinitionQuery extends Query<ChannelDefinitionQuery> {
    ChannelDefinitionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Name of the channel that this sub channel belongs to.
    */
    public ChannelDefinitionQuery channelName() {
        startField("channelName");

        return this;
    }

    /**
    * Unique string used as a public identifier for the channel definition.
    */
    public ChannelDefinitionQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Whether this channel definition represents a marketplace.
    */
    public ChannelDefinitionQuery isMarketplace() {
        startField("isMarketplace");

        return this;
    }

    /**
    * Name of the sub channel (e.g. Online Store, Instagram Shopping, TikTok Live).
    */
    public ChannelDefinitionQuery subChannelName() {
        startField("subChannelName");

        return this;
    }

    /**
    * Icon displayed when showing the channel in admin.
    */
    public ChannelDefinitionQuery svgIcon() {
        startField("svgIcon");

        return this;
    }
}
