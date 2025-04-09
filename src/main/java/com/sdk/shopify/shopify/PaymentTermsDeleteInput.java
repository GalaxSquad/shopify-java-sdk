// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PaymentTermsDeleteInput implements Serializable {
    private ID paymentTermsId;

    public PaymentTermsDeleteInput(ID paymentTermsId) {
        this.paymentTermsId = paymentTermsId;
    }

    public ID getPaymentTermsId() {
        return paymentTermsId;
    }

    public PaymentTermsDeleteInput setPaymentTermsId(ID paymentTermsId) {
        this.paymentTermsId = paymentTermsId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("paymentTermsId:");
        Query.appendQuotedString(_queryBuilder, paymentTermsId.toString());

        _queryBuilder.append('}');
    }
}
