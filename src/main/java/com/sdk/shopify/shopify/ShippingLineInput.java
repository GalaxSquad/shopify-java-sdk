// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ShippingLineInput implements Serializable {
    private Input<MoneyInput> priceWithCurrency = Input.undefined();

    private Input<String> shippingRateHandle = Input.undefined();

    private Input<String> title = Input.undefined();

    public MoneyInput getPriceWithCurrency() {
        return priceWithCurrency.getValue();
    }

    public Input<MoneyInput> getPriceWithCurrencyInput() {
        return priceWithCurrency;
    }

    public ShippingLineInput setPriceWithCurrency(MoneyInput priceWithCurrency) {
        this.priceWithCurrency = Input.optional(priceWithCurrency);
        return this;
    }

    public ShippingLineInput setPriceWithCurrencyInput(Input<MoneyInput> priceWithCurrency) {
        if (priceWithCurrency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceWithCurrency = priceWithCurrency;
        return this;
    }

    public String getShippingRateHandle() {
        return shippingRateHandle.getValue();
    }

    public Input<String> getShippingRateHandleInput() {
        return shippingRateHandle;
    }

    public ShippingLineInput setShippingRateHandle(String shippingRateHandle) {
        this.shippingRateHandle = Input.optional(shippingRateHandle);
        return this;
    }

    public ShippingLineInput setShippingRateHandleInput(Input<String> shippingRateHandle) {
        if (shippingRateHandle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingRateHandle = shippingRateHandle;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public ShippingLineInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public ShippingLineInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.priceWithCurrency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceWithCurrency:");
            if (priceWithCurrency.getValue() != null) {
                priceWithCurrency.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingRateHandle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingRateHandle:");
            if (shippingRateHandle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, shippingRateHandle.getValue().toString());
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
