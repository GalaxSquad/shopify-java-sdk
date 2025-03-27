// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionManualDiscountEntitledLinesInput implements Serializable {
    private Input<Boolean> all = Input.undefined();

    private Input<SubscriptionManualDiscountLinesInput> lines = Input.undefined();

    public Boolean getAll() {
        return all.getValue();
    }

    public Input<Boolean> getAllInput() {
        return all;
    }

    public SubscriptionManualDiscountEntitledLinesInput setAll(Boolean all) {
        this.all = Input.optional(all);
        return this;
    }

    public SubscriptionManualDiscountEntitledLinesInput setAllInput(Input<Boolean> all) {
        if (all == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.all = all;
        return this;
    }

    public SubscriptionManualDiscountLinesInput getLines() {
        return lines.getValue();
    }

    public Input<SubscriptionManualDiscountLinesInput> getLinesInput() {
        return lines;
    }

    public SubscriptionManualDiscountEntitledLinesInput setLines(SubscriptionManualDiscountLinesInput lines) {
        this.lines = Input.optional(lines);
        return this;
    }

    public SubscriptionManualDiscountEntitledLinesInput setLinesInput(Input<SubscriptionManualDiscountLinesInput> lines) {
        if (lines == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lines = lines;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.all.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("all:");
            if (all.getValue() != null) {
                _queryBuilder.append(all.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lines.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lines:");
            if (lines.getValue() != null) {
                lines.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
