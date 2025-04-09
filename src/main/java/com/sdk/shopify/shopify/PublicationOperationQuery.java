// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The possible types of publication operations.
*/
public class PublicationOperationQuery extends Query<PublicationOperationQuery> {
    PublicationOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PublicationOperationQuery onAddAllProductsOperation(AddAllProductsOperationQueryDefinition queryDef) {
        startInlineFragment("AddAllProductsOperation");
        queryDef.define(new AddAllProductsOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PublicationOperationQuery onCatalogCsvOperation(CatalogCsvOperationQueryDefinition queryDef) {
        startInlineFragment("CatalogCsvOperation");
        queryDef.define(new CatalogCsvOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PublicationOperationQuery onPublicationResourceOperation(PublicationResourceOperationQueryDefinition queryDef) {
        startInlineFragment("PublicationResourceOperation");
        queryDef.define(new PublicationResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
