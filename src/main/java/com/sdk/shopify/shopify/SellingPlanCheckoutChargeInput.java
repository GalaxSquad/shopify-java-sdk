// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SellingPlanCheckoutChargeInput implements Serializable {
    private Input<SellingPlanCheckoutChargeType> type = Input.undefined();

    private Input<SellingPlanCheckoutChargeValueInput> value = Input.undefined();

    public SellingPlanCheckoutChargeType getType() {
        return type.getValue();
    }

    public Input<SellingPlanCheckoutChargeType> getTypeInput() {
        return type;
    }

    public SellingPlanCheckoutChargeInput setType(SellingPlanCheckoutChargeType type) {
        this.type = Input.optional(type);
        return this;
    }

    public SellingPlanCheckoutChargeInput setTypeInput(Input<SellingPlanCheckoutChargeType> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public SellingPlanCheckoutChargeValueInput getValue() {
        return value.getValue();
    }

    public Input<SellingPlanCheckoutChargeValueInput> getValueInput() {
        return value;
    }

    public SellingPlanCheckoutChargeInput setValue(SellingPlanCheckoutChargeValueInput value) {
        this.value = Input.optional(value);
        return this;
    }

    public SellingPlanCheckoutChargeInput setValueInput(Input<SellingPlanCheckoutChargeValueInput> value) {
        if (value == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.value = value;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.type.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type:");
            if (type.getValue() != null) {
                _queryBuilder.append(type.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.value.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("value:");
            if (value.getValue() != null) {
                value.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
