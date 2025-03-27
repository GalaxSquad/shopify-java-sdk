// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CollectionRuleInput implements Serializable {
    private CollectionRuleColumn column;

    private CollectionRuleRelation relation;

    private String condition;

    private Input<ID> conditionObjectId = Input.undefined();

    public CollectionRuleInput(CollectionRuleColumn column, CollectionRuleRelation relation, String condition) {
        this.column = column;

        this.relation = relation;

        this.condition = condition;
    }

    public CollectionRuleColumn getColumn() {
        return column;
    }

    public CollectionRuleInput setColumn(CollectionRuleColumn column) {
        this.column = column;
        return this;
    }

    public CollectionRuleRelation getRelation() {
        return relation;
    }

    public CollectionRuleInput setRelation(CollectionRuleRelation relation) {
        this.relation = relation;
        return this;
    }

    public String getCondition() {
        return condition;
    }

    public CollectionRuleInput setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public ID getConditionObjectId() {
        return conditionObjectId.getValue();
    }

    public Input<ID> getConditionObjectIdInput() {
        return conditionObjectId;
    }

    public CollectionRuleInput setConditionObjectId(ID conditionObjectId) {
        this.conditionObjectId = Input.optional(conditionObjectId);
        return this;
    }

    public CollectionRuleInput setConditionObjectIdInput(Input<ID> conditionObjectId) {
        if (conditionObjectId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditionObjectId = conditionObjectId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("column:");
        _queryBuilder.append(column.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("relation:");
        _queryBuilder.append(relation.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("condition:");
        Query.appendQuotedString(_queryBuilder, condition.toString());

        if (this.conditionObjectId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("conditionObjectId:");
            if (conditionObjectId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, conditionObjectId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
