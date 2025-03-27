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
import java.util.List;

public class OrderRiskAssessmentCreateInput implements Serializable {
    private ID orderId;

    private RiskAssessmentResult riskLevel;

    private List<OrderRiskAssessmentFactInput> facts;

    public OrderRiskAssessmentCreateInput(ID orderId, RiskAssessmentResult riskLevel, List<OrderRiskAssessmentFactInput> facts) {
        this.orderId = orderId;

        this.riskLevel = riskLevel;

        this.facts = facts;
    }

    public ID getOrderId() {
        return orderId;
    }

    public OrderRiskAssessmentCreateInput setOrderId(ID orderId) {
        this.orderId = orderId;
        return this;
    }

    public RiskAssessmentResult getRiskLevel() {
        return riskLevel;
    }

    public OrderRiskAssessmentCreateInput setRiskLevel(RiskAssessmentResult riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    public List<OrderRiskAssessmentFactInput> getFacts() {
        return facts;
    }

    public OrderRiskAssessmentCreateInput setFacts(List<OrderRiskAssessmentFactInput> facts) {
        this.facts = facts;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("riskLevel:");
        _queryBuilder.append(riskLevel.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("facts:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (OrderRiskAssessmentFactInput item1 : facts) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
