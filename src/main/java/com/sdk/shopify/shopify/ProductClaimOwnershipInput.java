// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class ProductClaimOwnershipInput implements Serializable {
    private Input<Boolean> bundles = Input.undefined();

    public Boolean getBundles() {
        return bundles.getValue();
    }

    public Input<Boolean> getBundlesInput() {
        return bundles;
    }

    public ProductClaimOwnershipInput setBundles(Boolean bundles) {
        this.bundles = Input.optional(bundles);
        return this;
    }

    public ProductClaimOwnershipInput setBundlesInput(Input<Boolean> bundles) {
        if (bundles == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.bundles = bundles;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.bundles.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("bundles:");
            if (bundles.getValue() != null) {
                _queryBuilder.append(bundles.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
