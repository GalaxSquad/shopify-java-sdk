// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `fileAcknowledgeUpdateFailed` mutation.
*/
public class FileAcknowledgeUpdateFailedPayloadQuery extends Query<FileAcknowledgeUpdateFailedPayloadQuery> {
    FileAcknowledgeUpdateFailedPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated file(s).
    */
    public FileAcknowledgeUpdateFailedPayloadQuery files(FileQueryDefinition queryDef) {
        startField("files");

        _queryBuilder.append('{');
        queryDef.define(new FileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FileAcknowledgeUpdateFailedPayloadQuery userErrors(FilesUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new FilesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
