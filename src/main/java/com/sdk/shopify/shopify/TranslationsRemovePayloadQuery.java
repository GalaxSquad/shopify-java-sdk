// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `translationsRemove` mutation.
*/
public class TranslationsRemovePayloadQuery extends Query<TranslationsRemovePayloadQuery> {
    TranslationsRemovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The translations that were deleted.
    */
    public TranslationsRemovePayloadQuery translations(TranslationQueryDefinition queryDef) {
        startField("translations");

        _queryBuilder.append('{');
        queryDef.define(new TranslationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public TranslationsRemovePayloadQuery userErrors(TranslationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new TranslationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
