// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DiscountOnQuantityInput implements Serializable {
    private Input<String> quantity = Input.undefined();

    private Input<DiscountEffectInput> effect = Input.undefined();

    public String getQuantity() {
        return quantity.getValue();
    }

    public Input<String> getQuantityInput() {
        return quantity;
    }

    public DiscountOnQuantityInput setQuantity(String quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    public DiscountOnQuantityInput setQuantityInput(Input<String> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public DiscountEffectInput getEffect() {
        return effect.getValue();
    }

    public Input<DiscountEffectInput> getEffectInput() {
        return effect;
    }

    public DiscountOnQuantityInput setEffect(DiscountEffectInput effect) {
        this.effect = Input.optional(effect);
        return this;
    }

    public DiscountOnQuantityInput setEffectInput(Input<DiscountEffectInput> effect) {
        if (effect == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.effect = effect;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.quantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantity:");
            if (quantity.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, quantity.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.effect.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("effect:");
            if (effect.getValue() != null) {
                effect.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
