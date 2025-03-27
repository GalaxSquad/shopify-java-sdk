// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A method definition contains the delivery rate and the conditions that must be met for the method to
* be
* applied.
*/
public class DeliveryMethodDefinitionQuery extends Query<DeliveryMethodDefinitionQuery> {
    DeliveryMethodDefinitionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether this method definition is active.
    */
    public DeliveryMethodDefinitionQuery active() {
        startField("active");

        return this;
    }

    /**
    * The description of the method definition. Only available on shipping rates that are custom.
    */
    public DeliveryMethodDefinitionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The method conditions that must pass for this method definition to be applied to an order.
    */
    public DeliveryMethodDefinitionQuery methodConditions(DeliveryConditionQueryDefinition queryDef) {
        startField("methodConditions");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryConditionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the method definition.
    */
    public DeliveryMethodDefinitionQuery name() {
        startField("name");

        return this;
    }

    /**
    * The provided rate for this method definition, from a rate definition or participant.
    */
    public DeliveryMethodDefinitionQuery rateProvider(DeliveryRateProviderQueryDefinition queryDef) {
        startField("rateProvider");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryRateProviderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
