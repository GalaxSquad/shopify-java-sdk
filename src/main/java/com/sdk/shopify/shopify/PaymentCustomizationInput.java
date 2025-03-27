// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class PaymentCustomizationInput implements Serializable {
    private Input<String> functionId = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<Boolean> enabled = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    public String getFunctionId() {
        return functionId.getValue();
    }

    public Input<String> getFunctionIdInput() {
        return functionId;
    }

    public PaymentCustomizationInput setFunctionId(String functionId) {
        this.functionId = Input.optional(functionId);
        return this;
    }

    public PaymentCustomizationInput setFunctionIdInput(Input<String> functionId) {
        if (functionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.functionId = functionId;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public PaymentCustomizationInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public PaymentCustomizationInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public Boolean getEnabled() {
        return enabled.getValue();
    }

    public Input<Boolean> getEnabledInput() {
        return enabled;
    }

    public PaymentCustomizationInput setEnabled(Boolean enabled) {
        this.enabled = Input.optional(enabled);
        return this;
    }

    public PaymentCustomizationInput setEnabledInput(Input<Boolean> enabled) {
        if (enabled == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enabled = enabled;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public PaymentCustomizationInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public PaymentCustomizationInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.functionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("functionId:");
            if (functionId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, functionId.getValue().toString());
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

        if (this.enabled.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("enabled:");
            if (enabled.getValue() != null) {
                _queryBuilder.append(enabled.getValue());
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

        _queryBuilder.append('}');
    }
}
