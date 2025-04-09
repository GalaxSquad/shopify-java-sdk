// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OptionUpdateInput implements Serializable {
    private ID id;

    private Input<String> name = Input.undefined();

    private Input<Integer> position = Input.undefined();

    private Input<LinkedMetafieldUpdateInput> linkedMetafield = Input.undefined();

    public OptionUpdateInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public OptionUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public OptionUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public OptionUpdateInput setNameInput(Input<String> name) {
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

    public OptionUpdateInput setPosition(Integer position) {
        this.position = Input.optional(position);
        return this;
    }

    public OptionUpdateInput setPositionInput(Input<Integer> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    public LinkedMetafieldUpdateInput getLinkedMetafield() {
        return linkedMetafield.getValue();
    }

    public Input<LinkedMetafieldUpdateInput> getLinkedMetafieldInput() {
        return linkedMetafield;
    }

    public OptionUpdateInput setLinkedMetafield(LinkedMetafieldUpdateInput linkedMetafield) {
        this.linkedMetafield = Input.optional(linkedMetafield);
        return this;
    }

    public OptionUpdateInput setLinkedMetafieldInput(Input<LinkedMetafieldUpdateInput> linkedMetafield) {
        if (linkedMetafield == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedMetafield = linkedMetafield;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

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
