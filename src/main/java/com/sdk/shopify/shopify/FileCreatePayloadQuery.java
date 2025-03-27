// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fileCreate` mutation.
*/
public class FileCreatePayloadQuery extends Query<FileCreatePayloadQuery> {
    FileCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created files.
    */
    public FileCreatePayloadQuery files(FileQueryDefinition queryDef) {
        startField("files");

        _queryBuilder.append('{');
        queryDef.define(new FileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FileCreatePayloadQuery userErrors(FilesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FilesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
