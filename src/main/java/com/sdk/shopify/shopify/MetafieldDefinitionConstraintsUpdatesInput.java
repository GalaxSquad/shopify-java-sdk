// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MetafieldDefinitionConstraintsUpdatesInput implements Serializable {
    private Input<String> key = Input.undefined();

    private Input<List<MetafieldDefinitionConstraintValueUpdateInput>> values = Input.undefined();

    public String getKey() {
        return key.getValue();
    }

    public Input<String> getKeyInput() {
        return key;
    }

    public MetafieldDefinitionConstraintsUpdatesInput setKey(String key) {
        this.key = Input.optional(key);
        return this;
    }

    public MetafieldDefinitionConstraintsUpdatesInput setKeyInput(Input<String> key) {
        if (key == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.key = key;
        return this;
    }

    public List<MetafieldDefinitionConstraintValueUpdateInput> getValues() {
        return values.getValue();
    }

    public Input<List<MetafieldDefinitionConstraintValueUpdateInput>> getValuesInput() {
        return values;
    }

    public MetafieldDefinitionConstraintsUpdatesInput setValues(List<MetafieldDefinitionConstraintValueUpdateInput> values) {
        this.values = Input.optional(values);
        return this;
    }

    public MetafieldDefinitionConstraintsUpdatesInput setValuesInput(Input<List<MetafieldDefinitionConstraintValueUpdateInput>> values) {
        if (values == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.values = values;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.key.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("key:");
            if (key.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, key.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.values.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("values:");
            if (values.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldDefinitionConstraintValueUpdateInput item1 : values.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
