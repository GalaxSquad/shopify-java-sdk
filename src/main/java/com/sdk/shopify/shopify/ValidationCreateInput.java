// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class ValidationCreateInput implements Serializable {
    private String functionId;

    private Input<Boolean> enable = Input.undefined();

    private Input<Boolean> blockOnFailure = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<String> title = Input.undefined();

    public ValidationCreateInput(String functionId) {
        this.functionId = functionId;
    }

    public String getFunctionId() {
        return functionId;
    }

    public ValidationCreateInput setFunctionId(String functionId) {
        this.functionId = functionId;
        return this;
    }

    public Boolean getEnable() {
        return enable.getValue();
    }

    public Input<Boolean> getEnableInput() {
        return enable;
    }

    public ValidationCreateInput setEnable(Boolean enable) {
        this.enable = Input.optional(enable);
        return this;
    }

    public ValidationCreateInput setEnableInput(Input<Boolean> enable) {
        if (enable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enable = enable;
        return this;
    }

    public Boolean getBlockOnFailure() {
        return blockOnFailure.getValue();
    }

    public Input<Boolean> getBlockOnFailureInput() {
        return blockOnFailure;
    }

    public ValidationCreateInput setBlockOnFailure(Boolean blockOnFailure) {
        this.blockOnFailure = Input.optional(blockOnFailure);
        return this;
    }

    public ValidationCreateInput setBlockOnFailureInput(Input<Boolean> blockOnFailure) {
        if (blockOnFailure == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.blockOnFailure = blockOnFailure;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public ValidationCreateInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public ValidationCreateInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public ValidationCreateInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public ValidationCreateInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("functionId:");
        Query.appendQuotedString(_queryBuilder, functionId.toString());

        if (this.enable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("enable:");
            if (enable.getValue() != null) {
                _queryBuilder.append(enable.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.blockOnFailure.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("blockOnFailure:");
            if (blockOnFailure.getValue() != null) {
                _queryBuilder.append(blockOnFailure.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
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

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
