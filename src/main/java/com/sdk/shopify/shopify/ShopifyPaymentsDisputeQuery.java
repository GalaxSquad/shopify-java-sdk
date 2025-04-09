// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A dispute occurs when a buyer questions the legitimacy of a charge with their financial institution.
*/
public class ShopifyPaymentsDisputeQuery extends Query<ShopifyPaymentsDisputeQuery> {
    ShopifyPaymentsDisputeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The total amount disputed by the cardholder.
    */
    public ShopifyPaymentsDisputeQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The deadline for evidence submission.
    */
    public ShopifyPaymentsDisputeQuery evidenceDueBy() {
        startField("evidenceDueBy");

        return this;
    }

    /**
    * The date when evidence was sent. Returns null if evidence hasn't yet been sent.
    */
    public ShopifyPaymentsDisputeQuery evidenceSentOn() {
        startField("evidenceSentOn");

        return this;
    }

    /**
    * The date when this dispute was resolved. Returns null if the dispute isn't yet resolved.
    */
    public ShopifyPaymentsDisputeQuery finalizedOn() {
        startField("finalizedOn");

        return this;
    }

    /**
    * The date when this dispute was initiated.
    */
    public ShopifyPaymentsDisputeQuery initiatedAt() {
        startField("initiatedAt");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public ShopifyPaymentsDisputeQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The order that contains the charge that's under dispute.
    */
    public ShopifyPaymentsDisputeQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The reason of the dispute.
    */
    public ShopifyPaymentsDisputeQuery reasonDetails(ShopifyPaymentsDisputeReasonDetailsQueryDefinition queryDef) {
        startField("reasonDetails");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeReasonDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The current state of the dispute.
    */
    public ShopifyPaymentsDisputeQuery status() {
        startField("status");

        return this;
    }

    /**
    * Indicates if this dispute is still in the inquiry phase or has turned into a chargeback.
    */
    public ShopifyPaymentsDisputeQuery type() {
        startField("type");

        return this;
    }
}
