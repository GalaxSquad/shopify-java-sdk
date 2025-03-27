// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DeliveryCarrierServiceCreateInput implements Serializable {
    private String name;

    private String callbackUrl;

    private boolean supportsServiceDiscovery;

    private boolean active;

    public DeliveryCarrierServiceCreateInput(String name, String callbackUrl, boolean supportsServiceDiscovery, boolean active) {
        this.name = name;

        this.callbackUrl = callbackUrl;

        this.supportsServiceDiscovery = supportsServiceDiscovery;

        this.active = active;
    }

    public String getName() {
        return name;
    }

    public DeliveryCarrierServiceCreateInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public DeliveryCarrierServiceCreateInput setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public boolean getSupportsServiceDiscovery() {
        return supportsServiceDiscovery;
    }

    public DeliveryCarrierServiceCreateInput setSupportsServiceDiscovery(boolean supportsServiceDiscovery) {
        this.supportsServiceDiscovery = supportsServiceDiscovery;
        return this;
    }

    public boolean getActive() {
        return active;
    }

    public DeliveryCarrierServiceCreateInput setActive(boolean active) {
        this.active = active;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("callbackUrl:");
        Query.appendQuotedString(_queryBuilder, callbackUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("supportsServiceDiscovery:");
        _queryBuilder.append(supportsServiceDiscovery);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("active:");
        _queryBuilder.append(active);

        _queryBuilder.append('}');
    }
}
