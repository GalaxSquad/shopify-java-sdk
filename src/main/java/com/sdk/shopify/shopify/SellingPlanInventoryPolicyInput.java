// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

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
