// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MarketConditionsUpdateInput implements Serializable {
    private Input<MarketConditionsInput> conditionsToAdd = Input.undefined();

    private Input<MarketConditionsInput> conditionsToDelete = Input.undefined();

    public MarketConditionsInput getConditionsToAdd() {
        return conditionsToAdd.getValue();
    }

    public Input<MarketConditionsInput> getConditionsToAddInput() {
        return conditionsToAdd;
    }

    public MarketConditionsUpdateInput setConditionsToAdd(MarketConditionsInput conditionsToAdd) {
        this.conditionsToAdd = Input.optional(conditionsToAdd);
        return this;
    }

    public MarketConditionsUpdateInput setConditionsToAddInput(Input<MarketConditionsInput> conditionsToAdd) {
        if (conditionsToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditionsToAdd = conditionsToAdd;
        return this;
    }

    public MarketConditionsInput getConditionsToDelete() {
        return conditionsToDelete.getValue();
    }

    public Input<MarketConditionsInput> getConditionsToDeleteInput() {
        return conditionsToDelete;
    }

    public MarketConditionsUpdateInput setConditionsToDelete(MarketConditionsInput conditionsToDelete) {
        this.conditionsToDelete = Input.optional(conditionsToDelete);
        return this;
    }

    public MarketConditionsUpdateInput setConditionsToDeleteInput(Input<MarketConditionsInput> conditionsToDelete) {
        if (conditionsToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditionsToDelete = conditionsToDelete;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.conditionsToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("conditionsToAdd:");
            if (conditionsToAdd.getValue() != null) {
                conditionsToAdd.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.conditionsToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("conditionsToDelete:");
            if (conditionsToDelete.getValue() != null) {
                conditionsToDelete.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
