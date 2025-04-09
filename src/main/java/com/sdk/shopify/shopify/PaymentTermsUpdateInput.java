// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PaymentTermsUpdateInput implements Serializable {
    private ID paymentTermsId;

    private PaymentTermsInput paymentTermsAttributes;

    public PaymentTermsUpdateInput(ID paymentTermsId, PaymentTermsInput paymentTermsAttributes) {
        this.paymentTermsId = paymentTermsId;

        this.paymentTermsAttributes = paymentTermsAttributes;
    }

    public ID getPaymentTermsId() {
        return paymentTermsId;
    }

    public PaymentTermsUpdateInput setPaymentTermsId(ID paymentTermsId) {
        this.paymentTermsId = paymentTermsId;
        return this;
    }

    public PaymentTermsInput getPaymentTermsAttributes() {
        return paymentTermsAttributes;
    }

    public PaymentTermsUpdateInput setPaymentTermsAttributes(PaymentTermsInput paymentTermsAttributes) {
        this.paymentTermsAttributes = paymentTermsAttributes;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("paymentTermsId:");
        Query.appendQuotedString(_queryBuilder, paymentTermsId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("paymentTermsAttributes:");
        paymentTermsAttributes.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
