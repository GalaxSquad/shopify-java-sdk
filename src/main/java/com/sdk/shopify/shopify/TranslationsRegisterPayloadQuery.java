// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `translationsRegister` mutation.
*/
public class TranslationsRegisterPayloadQuery extends Query<TranslationsRegisterPayloadQuery> {
    TranslationsRegisterPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The translations that were created or updated.
    */
    public TranslationsRegisterPayloadQuery translations(TranslationQueryDefinition queryDef) {
        startField("translations");

        _queryBuilder.append('{');
        queryDef.define(new TranslationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public TranslationsRegisterPayloadQuery userErrors(TranslationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new TranslationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
