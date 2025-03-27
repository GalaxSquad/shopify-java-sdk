// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class OptionCreateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<Integer> position = Input.undefined();

    private Input<List<OptionValueCreateInput>> values = Input.undefined();

    private Input<LinkedMetafieldCreateInput> linkedMetafield = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public OptionCreateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public OptionCreateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public Integer getPosition() {
        return position.getValue();
    }

    public Input<Integer> getPositionInput() {
        return position;
    }

    public OptionCreateInput setPosition(Integer position) {
        this.position = Input.optional(position);
        return this;
    }

    public OptionCreateInput setPositionInput(Input<Integer> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    public List<OptionValueCreateInput> getValues() {
        return values.getValue();
    }

    public Input<List<OptionValueCreateInput>> getValuesInput() {
        return values;
    }

    public OptionCreateInput setValues(List<OptionValueCreateInput> values) {
        this.values = Input.optional(values);
        return this;
    }

    public OptionCreateInput setValuesInput(Input<List<OptionValueCreateInput>> values) {
        if (values == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.values = values;
        return this;
    }

    public LinkedMetafieldCreateInput getLinkedMetafield() {
        return linkedMetafield.getValue();
    }

    public Input<LinkedMetafieldCreateInput> getLinkedMetafieldInput() {
        return linkedMetafield;
    }

    public OptionCreateInput setLinkedMetafield(LinkedMetafieldCreateInput linkedMetafield) {
        this.linkedMetafield = Input.optional(linkedMetafield);
        return this;
    }

    public OptionCreateInput setLinkedMetafieldInput(Input<LinkedMetafieldCreateInput> linkedMetafield) {
        if (linkedMetafield == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedMetafield = linkedMetafield;
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

        if (this.position.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("position:");
            if (position.getValue() != null) {
                _queryBuilder.append(position.getValue());
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
                    for (OptionValueCreateInput item1 : values.getValue()) {
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

        if (this.linkedMetafield.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("linkedMetafield:");
            if (linkedMetafield.getValue() != null) {
                linkedMetafield.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
