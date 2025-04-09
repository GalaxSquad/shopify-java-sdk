// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SellingPlanInventoryPolicyInput implements Serializable {
    private Input<SellingPlanReserve> reserve = Input.undefined();

    public SellingPlanReserve getReserve() {
        return reserve.getValue();
    }

    public Input<SellingPlanReserve> getReserveInput() {
        return reserve;
    }

    public SellingPlanInventoryPolicyInput setReserve(SellingPlanReserve reserve) {
        this.reserve = Input.optional(reserve);
        return this;
    }

    public SellingPlanInventoryPolicyInput setReserveInput(Input<SellingPlanReserve> reserve) {
        if (reserve == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reserve = reserve;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.reserve.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reserve:");
            if (reserve.getValue() != null) {
                _queryBuilder.append(reserve.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
