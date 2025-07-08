// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class ReturnProcessFinancialTransferInput implements Serializable {
    private Input<ReturnProcessRefundInput> issueRefund = Input.undefined();

    public ReturnProcessRefundInput getIssueRefund() {
        return issueRefund.getValue();
    }

    public Input<ReturnProcessRefundInput> getIssueRefundInput() {
        return issueRefund;
    }

    public ReturnProcessFinancialTransferInput setIssueRefund(ReturnProcessRefundInput issueRefund) {
        this.issueRefund = Input.optional(issueRefund);
        return this;
    }

    public ReturnProcessFinancialTransferInput setIssueRefundInput(Input<ReturnProcessRefundInput> issueRefund) {
        if (issueRefund == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.issueRefund = issueRefund;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.issueRefund.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("issueRefund:");
            if (issueRefund.getValue() != null) {
                issueRefund.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
