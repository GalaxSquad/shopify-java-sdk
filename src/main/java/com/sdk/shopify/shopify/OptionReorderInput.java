// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class OptionReorderInput implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<List<OptionValueReorderInput>> values = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public OptionReorderInput setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public OptionReorderInput setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public OptionReorderInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public OptionReorderInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<OptionValueReorderInput> getValues() {
        return values.getValue();
    }

    public Input<List<OptionValueReorderInput>> getValuesInput() {
        return values;
    }

    public OptionReorderInput setValues(List<OptionValueReorderInput> values) {
        this.values = Input.optional(values);
        return this;
    }

    public OptionReorderInput setValuesInput(Input<List<OptionValueReorderInput>> values) {
        if (values == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.values = values;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, id.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.values.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("values:");
            if (values.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OptionValueReorderInput item1 : values.getValue()) {
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
