// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CollectionPublicationInput implements Serializable {
    private Input<ID> publicationId = Input.undefined();

    public ID getPublicationId() {
        return publicationId.getValue();
    }

    public Input<ID> getPublicationIdInput() {
        return publicationId;
    }

    public CollectionPublicationInput setPublicationId(ID publicationId) {
        this.publicationId = Input.optional(publicationId);
        return this;
    }

    public CollectionPublicationInput setPublicationIdInput(Input<ID> publicationId) {
        if (publicationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.publicationId = publicationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.publicationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("publicationId:");
            if (publicationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, publicationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
