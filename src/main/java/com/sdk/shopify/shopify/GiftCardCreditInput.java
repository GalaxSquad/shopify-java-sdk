// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class GiftCardCreditInput implements Serializable {
    private MoneyInput creditAmount;

    private Input<String> note = Input.undefined();

    private Input<String> processedAt = Input.undefined();

    public GiftCardCreditInput(MoneyInput creditAmount) {
        this.creditAmount = creditAmount;
    }

    public MoneyInput getCreditAmount() {
        return creditAmount;
    }

    public GiftCardCreditInput setCreditAmount(MoneyInput creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public GiftCardCreditInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public GiftCardCreditInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public String getProcessedAt() {
        return processedAt.getValue();
    }

    public Input<String> getProcessedAtInput() {
        return processedAt;
    }

    public GiftCardCreditInput setProcessedAt(String processedAt) {
        this.processedAt = Input.optional(processedAt);
        return this;
    }

    public GiftCardCreditInput setProcessedAtInput(Input<String> processedAt) {
        if (processedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.processedAt = processedAt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("creditAmount:");
        creditAmount.appendTo(_queryBuilder);

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.processedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("processedAt:");
            if (processedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, processedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
