// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;




import java.io.Serializable;

public class StoreCreditAccountDebitInput implements Serializable {
    private MoneyInput debitAmount;

    public StoreCreditAccountDebitInput(MoneyInput debitAmount) {
        this.debitAmount = debitAmount;
    }

    public MoneyInput getDebitAmount() {
        return debitAmount;
    }

    public StoreCreditAccountDebitInput setDebitAmount(MoneyInput debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("debitAmount:");
        debitAmount.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
