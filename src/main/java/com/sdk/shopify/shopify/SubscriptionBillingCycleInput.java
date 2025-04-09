// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SubscriptionBillingCycleInput implements Serializable {
    private ID contractId;

    private SubscriptionBillingCycleSelector selector;

    public SubscriptionBillingCycleInput(ID contractId, SubscriptionBillingCycleSelector selector) {
        this.contractId = contractId;

        this.selector = selector;
    }

    public ID getContractId() {
        return contractId;
    }

    public SubscriptionBillingCycleInput setContractId(ID contractId) {
        this.contractId = contractId;
        return this;
    }

    public SubscriptionBillingCycleSelector getSelector() {
        return selector;
    }

    public SubscriptionBillingCycleInput setSelector(SubscriptionBillingCycleSelector selector) {
        this.selector = selector;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("contractId:");
        Query.appendQuotedString(_queryBuilder, contractId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("selector:");
        selector.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
