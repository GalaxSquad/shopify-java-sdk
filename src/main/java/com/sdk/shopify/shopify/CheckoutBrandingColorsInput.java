// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingColorsInput implements Serializable {
    private Input<CheckoutBrandingColorGlobalInput> global = Input.undefined();

    private Input<CheckoutBrandingColorSchemesInput> schemes = Input.undefined();

    public CheckoutBrandingColorGlobalInput getGlobal() {
        return global.getValue();
    }

    public Input<CheckoutBrandingColorGlobalInput> getGlobalInput() {
        return global;
    }

    public CheckoutBrandingColorsInput setGlobal(CheckoutBrandingColorGlobalInput global) {
        this.global = Input.optional(global);
        return this;
    }

    public CheckoutBrandingColorsInput setGlobalInput(Input<CheckoutBrandingColorGlobalInput> global) {
        if (global == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.global = global;
        return this;
    }

    public CheckoutBrandingColorSchemesInput getSchemes() {
        return schemes.getValue();
    }

    public Input<CheckoutBrandingColorSchemesInput> getSchemesInput() {
        return schemes;
    }

    public CheckoutBrandingColorsInput setSchemes(CheckoutBrandingColorSchemesInput schemes) {
        this.schemes = Input.optional(schemes);
        return this;
    }

    public CheckoutBrandingColorsInput setSchemesInput(Input<CheckoutBrandingColorSchemesInput> schemes) {
        if (schemes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.schemes = schemes;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.global.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("global:");
            if (global.getValue() != null) {
                global.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.schemes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("schemes:");
            if (schemes.getValue() != null) {
                schemes.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
