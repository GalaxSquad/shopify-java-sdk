// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MarketingActivityCreateInput implements Serializable {
    private ID marketingActivityExtensionId;

    private MarketingActivityStatus status;

    public MarketingActivityCreateInput(ID marketingActivityExtensionId, MarketingActivityStatus status) {
        this.marketingActivityExtensionId = marketingActivityExtensionId;

        this.status = status;
    }

    public ID getMarketingActivityExtensionId() {
        return marketingActivityExtensionId;
    }

    public MarketingActivityCreateInput setMarketingActivityExtensionId(ID marketingActivityExtensionId) {
        this.marketingActivityExtensionId = marketingActivityExtensionId;
        return this;
    }

    public MarketingActivityStatus getStatus() {
        return status;
    }

    public MarketingActivityCreateInput setStatus(MarketingActivityStatus status) {
        this.status = status;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("marketingActivityExtensionId:");
        Query.appendQuotedString(_queryBuilder, marketingActivityExtensionId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

        _queryBuilder.append('}');
    }
}
