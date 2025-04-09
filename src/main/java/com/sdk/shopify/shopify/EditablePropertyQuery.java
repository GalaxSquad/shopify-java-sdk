// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The attribute editable information.
*/
public class EditablePropertyQuery extends Query<EditablePropertyQuery> {
    EditablePropertyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the attribute is locked for editing.
    */
    public EditablePropertyQuery locked() {
        startField("locked");

        return this;
    }

    /**
    * The reason the attribute is locked for editing.
    */
    public EditablePropertyQuery reason() {
        startField("reason");

        return this;
    }
}
