// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
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
