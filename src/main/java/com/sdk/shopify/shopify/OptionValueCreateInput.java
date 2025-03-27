// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OptionValueCreateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> linkedMetafieldValue = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public OptionValueCreateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public OptionValueCreateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getLinkedMetafieldValue() {
        return linkedMetafieldValue.getValue();
    }

    public Input<String> getLinkedMetafieldValueInput() {
        return linkedMetafieldValue;
    }

    public OptionValueCreateInput setLinkedMetafieldValue(String linkedMetafieldValue) {
        this.linkedMetafieldValue = Input.optional(linkedMetafieldValue);
        return this;
    }

    public OptionValueCreateInput setLinkedMetafieldValueInput(Input<String> linkedMetafieldValue) {
        if (linkedMetafieldValue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedMetafieldValue = linkedMetafieldValue;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.linkedMetafieldValue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("linkedMetafieldValue:");
            if (linkedMetafieldValue.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, linkedMetafieldValue.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
