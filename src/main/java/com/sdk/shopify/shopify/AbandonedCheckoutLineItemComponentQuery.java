// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The list of line item components that belong to a line item.
*/
public class AbandonedCheckoutLineItemComponentQuery extends Query<AbandonedCheckoutLineItemComponentQuery> {
    AbandonedCheckoutLineItemComponentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A globally-unique ID.
    */
    public AbandonedCheckoutLineItemComponentQuery id() {
        startField("id");

        return this;
    }

    /**
    * The variant image associated with the line item component.
    * NULL if the variant associated doesn't have an image.
    */
    public AbandonedCheckoutLineItemComponentQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the line item component.
    */
    public AbandonedCheckoutLineItemComponentQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Title of the line item component.
    */
    public AbandonedCheckoutLineItemComponentQuery title() {
        startField("title");

        return this;
    }

    /**
    * The name of the variant.
    */
    public AbandonedCheckoutLineItemComponentQuery variantTitle() {
        startField("variantTitle");

        return this;
    }
}
