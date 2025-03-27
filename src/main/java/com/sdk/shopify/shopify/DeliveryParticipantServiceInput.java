// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DeliveryParticipantServiceInput implements Serializable {
    private String name;

    private boolean active;

    public DeliveryParticipantServiceInput(String name, boolean active) {
        this.name = name;

        this.active = active;
    }

    public String getName() {
        return name;
    }

    public DeliveryParticipantServiceInput setName(String name) {
        this.name = name;
        return this;
    }

    public boolean getActive() {
        return active;
    }

    public DeliveryParticipantServiceInput setActive(boolean active) {
        this.active = active;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("active:");
        _queryBuilder.append(active);

        _queryBuilder.append('}');
    }
}
