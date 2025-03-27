// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class CollectionPublishInput implements Serializable {
    private ID id;

    private List<CollectionPublicationInput> collectionPublications;

    public CollectionPublishInput(ID id, List<CollectionPublicationInput> collectionPublications) {
        this.id = id;

        this.collectionPublications = collectionPublications;
    }

    public ID getId() {
        return id;
    }

    public CollectionPublishInput setId(ID id) {
        this.id = id;
        return this;
    }

    public List<CollectionPublicationInput> getCollectionPublications() {
        return collectionPublications;
    }

    public CollectionPublishInput setCollectionPublications(List<CollectionPublicationInput> collectionPublications) {
        this.collectionPublications = collectionPublications;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("collectionPublications:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (CollectionPublicationInput item1 : collectionPublications) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
