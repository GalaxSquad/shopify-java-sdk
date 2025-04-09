// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class EmailInput implements Serializable {
    private Input<String> subject = Input.undefined();

    private Input<String> to = Input.undefined();

    private Input<String> from = Input.undefined();

    private Input<String> body = Input.undefined();

    private Input<List<String>> bcc = Input.undefined();

    private Input<String> customMessage = Input.undefined();

    public String getSubject() {
        return subject.getValue();
    }

    public Input<String> getSubjectInput() {
        return subject;
    }

    public EmailInput setSubject(String subject) {
        this.subject = Input.optional(subject);
        return this;
    }

    public EmailInput setSubjectInput(Input<String> subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subject = subject;
        return this;
    }

    public String getTo() {
        return to.getValue();
    }

    public Input<String> getToInput() {
        return to;
    }

    public EmailInput setTo(String to) {
        this.to = Input.optional(to);
        return this;
    }

    public EmailInput setToInput(Input<String> to) {
        if (to == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.to = to;
        return this;
    }

    public String getFrom() {
        return from.getValue();
    }

    public Input<String> getFromInput() {
        return from;
    }

    public EmailInput setFrom(String from) {
        this.from = Input.optional(from);
        return this;
    }

    public EmailInput setFromInput(Input<String> from) {
        if (from == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.from = from;
        return this;
    }

    public String getBody() {
        return body.getValue();
    }

    public Input<String> getBodyInput() {
        return body;
    }

    public EmailInput setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public EmailInput setBodyInput(Input<String> body) {
        if (body == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.body = body;
        return this;
    }

    public List<String> getBcc() {
        return bcc.getValue();
    }

    public Input<List<String>> getBccInput() {
        return bcc;
    }

    public EmailInput setBcc(List<String> bcc) {
        this.bcc = Input.optional(bcc);
        return this;
    }

    public EmailInput setBccInput(Input<List<String>> bcc) {
        if (bcc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.bcc = bcc;
        return this;
    }

    public String getCustomMessage() {
        return customMessage.getValue();
    }

    public Input<String> getCustomMessageInput() {
        return customMessage;
    }

    public EmailInput setCustomMessage(String customMessage) {
        this.customMessage = Input.optional(customMessage);
        return this;
    }

    public EmailInput setCustomMessageInput(Input<String> customMessage) {
        if (customMessage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customMessage = customMessage;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.subject.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("subject:");
            if (subject.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, subject.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.to.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("to:");
            if (to.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, to.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.from.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("from:");
            if (from.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, from.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.body.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("body:");
            if (body.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, body.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.bcc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("bcc:");
            if (bcc.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : bcc.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customMessage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customMessage:");
            if (customMessage.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, customMessage.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
