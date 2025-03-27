// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class CheckoutBrandingColorSchemesInput implements Serializable {
    private Input<CheckoutBrandingColorSchemeInput> scheme1 = Input.undefined();

    private Input<CheckoutBrandingColorSchemeInput> scheme2 = Input.undefined();

    private Input<CheckoutBrandingColorSchemeInput> scheme3 = Input.undefined();

    private Input<CheckoutBrandingColorSchemeInput> scheme4 = Input.undefined();

    public CheckoutBrandingColorSchemeInput getScheme1() {
        return scheme1.getValue();
    }

    public Input<CheckoutBrandingColorSchemeInput> getScheme1Input() {
        return scheme1;
    }

    public CheckoutBrandingColorSchemesInput setScheme1(CheckoutBrandingColorSchemeInput scheme1) {
        this.scheme1 = Input.optional(scheme1);
        return this;
    }

    public CheckoutBrandingColorSchemesInput setScheme1Input(Input<CheckoutBrandingColorSchemeInput> scheme1) {
        if (scheme1 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scheme1 = scheme1;
        return this;
    }

    public CheckoutBrandingColorSchemeInput getScheme2() {
        return scheme2.getValue();
    }

    public Input<CheckoutBrandingColorSchemeInput> getScheme2Input() {
        return scheme2;
    }

    public CheckoutBrandingColorSchemesInput setScheme2(CheckoutBrandingColorSchemeInput scheme2) {
        this.scheme2 = Input.optional(scheme2);
        return this;
    }

    public CheckoutBrandingColorSchemesInput setScheme2Input(Input<CheckoutBrandingColorSchemeInput> scheme2) {
        if (scheme2 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scheme2 = scheme2;
        return this;
    }

    public CheckoutBrandingColorSchemeInput getScheme3() {
        return scheme3.getValue();
    }

    public Input<CheckoutBrandingColorSchemeInput> getScheme3Input() {
        return scheme3;
    }

    public CheckoutBrandingColorSchemesInput setScheme3(CheckoutBrandingColorSchemeInput scheme3) {
        this.scheme3 = Input.optional(scheme3);
        return this;
    }

    public CheckoutBrandingColorSchemesInput setScheme3Input(Input<CheckoutBrandingColorSchemeInput> scheme3) {
        if (scheme3 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scheme3 = scheme3;
        return this;
    }

    public CheckoutBrandingColorSchemeInput getScheme4() {
        return scheme4.getValue();
    }

    public Input<CheckoutBrandingColorSchemeInput> getScheme4Input() {
        return scheme4;
    }

    public CheckoutBrandingColorSchemesInput setScheme4(CheckoutBrandingColorSchemeInput scheme4) {
        this.scheme4 = Input.optional(scheme4);
        return this;
    }

    public CheckoutBrandingColorSchemesInput setScheme4Input(Input<CheckoutBrandingColorSchemeInput> scheme4) {
        if (scheme4 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.scheme4 = scheme4;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.scheme1.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scheme1:");
            if (scheme1.getValue() != null) {
                scheme1.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.scheme2.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scheme2:");
            if (scheme2.getValue() != null) {
                scheme2.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.scheme3.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scheme3:");
            if (scheme3.getValue() != null) {
                scheme3.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.scheme4.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("scheme4:");
            if (scheme4.getValue() != null) {
                scheme4.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
