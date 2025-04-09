// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingChoiceListInput implements Serializable {
    private Input<CheckoutBrandingChoiceListGroupInput> group = Input.undefined();

    public CheckoutBrandingChoiceListGroupInput getGroup() {
        return group.getValue();
    }

    public Input<CheckoutBrandingChoiceListGroupInput> getGroupInput() {
        return group;
    }

    public CheckoutBrandingChoiceListInput setGroup(CheckoutBrandingChoiceListGroupInput group) {
        this.group = Input.optional(group);
        return this;
    }

    public CheckoutBrandingChoiceListInput setGroupInput(Input<CheckoutBrandingChoiceListGroupInput> group) {
        if (group == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.group = group;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.group.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("group:");
            if (group.getValue() != null) {
                group.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
