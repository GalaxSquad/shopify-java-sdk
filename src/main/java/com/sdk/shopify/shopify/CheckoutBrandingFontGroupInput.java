// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingFontGroupInput implements Serializable {
    private Input<CheckoutBrandingShopifyFontGroupInput> shopifyFontGroup = Input.undefined();

    private Input<CheckoutBrandingCustomFontGroupInput> customFontGroup = Input.undefined();

    public CheckoutBrandingShopifyFontGroupInput getShopifyFontGroup() {
        return shopifyFontGroup.getValue();
    }

    public Input<CheckoutBrandingShopifyFontGroupInput> getShopifyFontGroupInput() {
        return shopifyFontGroup;
    }

    public CheckoutBrandingFontGroupInput setShopifyFontGroup(CheckoutBrandingShopifyFontGroupInput shopifyFontGroup) {
        this.shopifyFontGroup = Input.optional(shopifyFontGroup);
        return this;
    }

    public CheckoutBrandingFontGroupInput setShopifyFontGroupInput(Input<CheckoutBrandingShopifyFontGroupInput> shopifyFontGroup) {
        if (shopifyFontGroup == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shopifyFontGroup = shopifyFontGroup;
        return this;
    }

    public CheckoutBrandingCustomFontGroupInput getCustomFontGroup() {
        return customFontGroup.getValue();
    }

    public Input<CheckoutBrandingCustomFontGroupInput> getCustomFontGroupInput() {
        return customFontGroup;
    }

    public CheckoutBrandingFontGroupInput setCustomFontGroup(CheckoutBrandingCustomFontGroupInput customFontGroup) {
        this.customFontGroup = Input.optional(customFontGroup);
        return this;
    }

    public CheckoutBrandingFontGroupInput setCustomFontGroupInput(Input<CheckoutBrandingCustomFontGroupInput> customFontGroup) {
        if (customFontGroup == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customFontGroup = customFontGroup;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.shopifyFontGroup.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shopifyFontGroup:");
            if (shopifyFontGroup.getValue() != null) {
                shopifyFontGroup.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customFontGroup.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customFontGroup:");
            if (customFontGroup.getValue() != null) {
                customFontGroup.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
