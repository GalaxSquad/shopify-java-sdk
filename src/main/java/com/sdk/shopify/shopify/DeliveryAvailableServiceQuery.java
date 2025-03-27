// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping service and a list of countries that the service is available for.
*/
public class DeliveryAvailableServiceQuery extends Query<DeliveryAvailableServiceQuery> {
    DeliveryAvailableServiceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The countries the service provider ships to.
    */
    public DeliveryAvailableServiceQuery countries(DeliveryCountryCodesOrRestOfWorldQueryDefinition queryDef) {
        startField("countries");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCountryCodesOrRestOfWorldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the service.
    */
    public DeliveryAvailableServiceQuery name() {
        startField("name");

        return this;
    }
}
