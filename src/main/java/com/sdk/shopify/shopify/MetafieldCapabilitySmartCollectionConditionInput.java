// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;

public class MetafieldCapabilitySmartCollectionConditionInput implements Serializable {
    private boolean enabled;

    public MetafieldCapabilitySmartCollectionConditionInput(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public MetafieldCapabilitySmartCollectionConditionInput setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("enabled:");
        _queryBuilder.append(enabled);

        _queryBuilder.append('}');
    }
}
