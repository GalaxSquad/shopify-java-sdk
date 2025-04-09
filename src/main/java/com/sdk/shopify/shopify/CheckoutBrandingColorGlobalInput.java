// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CheckoutBrandingColorGlobalInput implements Serializable {
    private Input<String> info = Input.undefined();

    private Input<String> success = Input.undefined();

    private Input<String> warning = Input.undefined();

    private Input<String> critical = Input.undefined();

    private Input<String> brand = Input.undefined();

    private Input<String> accent = Input.undefined();

    private Input<String> decorative = Input.undefined();

    public String getInfo() {
        return info.getValue();
    }

    public Input<String> getInfoInput() {
        return info;
    }

    public CheckoutBrandingColorGlobalInput setInfo(String info) {
        this.info = Input.optional(info);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setInfoInput(Input<String> info) {
        if (info == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.info = info;
        return this;
    }

    public String getSuccess() {
        return success.getValue();
    }

    public Input<String> getSuccessInput() {
        return success;
    }

    public CheckoutBrandingColorGlobalInput setSuccess(String success) {
        this.success = Input.optional(success);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setSuccessInput(Input<String> success) {
        if (success == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.success = success;
        return this;
    }

    public String getWarning() {
        return warning.getValue();
    }

    public Input<String> getWarningInput() {
        return warning;
    }

    public CheckoutBrandingColorGlobalInput setWarning(String warning) {
        this.warning = Input.optional(warning);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setWarningInput(Input<String> warning) {
        if (warning == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.warning = warning;
        return this;
    }

    public String getCritical() {
        return critical.getValue();
    }

    public Input<String> getCriticalInput() {
        return critical;
    }

    public CheckoutBrandingColorGlobalInput setCritical(String critical) {
        this.critical = Input.optional(critical);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setCriticalInput(Input<String> critical) {
        if (critical == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.critical = critical;
        return this;
    }

    public String getBrand() {
        return brand.getValue();
    }

    public Input<String> getBrandInput() {
        return brand;
    }

    public CheckoutBrandingColorGlobalInput setBrand(String brand) {
        this.brand = Input.optional(brand);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setBrandInput(Input<String> brand) {
        if (brand == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.brand = brand;
        return this;
    }

    public String getAccent() {
        return accent.getValue();
    }

    public Input<String> getAccentInput() {
        return accent;
    }

    public CheckoutBrandingColorGlobalInput setAccent(String accent) {
        this.accent = Input.optional(accent);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setAccentInput(Input<String> accent) {
        if (accent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.accent = accent;
        return this;
    }

    public String getDecorative() {
        return decorative.getValue();
    }

    public Input<String> getDecorativeInput() {
        return decorative;
    }

    public CheckoutBrandingColorGlobalInput setDecorative(String decorative) {
        this.decorative = Input.optional(decorative);
        return this;
    }

    public CheckoutBrandingColorGlobalInput setDecorativeInput(Input<String> decorative) {
        if (decorative == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.decorative = decorative;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.info.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("info:");
            if (info.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, info.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.success.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("success:");
            if (success.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, success.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.warning.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("warning:");
            if (warning.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, warning.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.critical.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("critical:");
            if (critical.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, critical.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.brand.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("brand:");
            if (brand.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, brand.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.accent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("accent:");
            if (accent.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, accent.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.decorative.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("decorative:");
            if (decorative.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, decorative.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
