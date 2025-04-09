// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fileDelete` mutation.
*/
public class FileDeletePayloadQuery extends Query<FileDeletePayloadQuery> {
    FileDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The IDs of the deleted files.
    */
    public FileDeletePayloadQuery deletedFileIds() {
        startField("deletedFileIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FileDeletePayloadQuery userErrors(FilesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FilesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
