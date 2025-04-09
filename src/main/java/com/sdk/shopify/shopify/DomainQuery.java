// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A unique string that represents the address of a Shopify store on the Internet.
*/
public class DomainQuery extends Query<DomainQuery> {
    DomainQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The host name of the domain. For example, `example.com`.
    */
    public DomainQuery host() {
        startField("host");

        return this;
    }

    /**
    * The localization of the domain, if the domain doesn't redirect.
    */
    public DomainQuery localization(DomainLocalizationQueryDefinition queryDef) {
        startField("localization");

        _queryBuilder.append('{');
        queryDef.define(new DomainLocalizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The web presence of the domain.
    */
    public DomainQuery marketWebPresence(MarketWebPresenceQueryDefinition queryDef) {
        startField("marketWebPresence");

        _queryBuilder.append('{');
        queryDef.define(new MarketWebPresenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether SSL is enabled.
    */
    public DomainQuery sslEnabled() {
        startField("sslEnabled");

        return this;
    }

    /**
    * The URL of the domain (for example, `https://example.com`).
    */
    public DomainQuery url() {
        startField("url");

        return this;
    }
}
