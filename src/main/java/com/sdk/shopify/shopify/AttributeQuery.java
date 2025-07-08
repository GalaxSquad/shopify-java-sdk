// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A custom property. Attributes are used to store additional information about a Shopify resource,
* such as
* products, customers, or orders. Attributes are stored as key-value pairs.
* For example, a list of attributes might include whether a customer is a first-time buyer
* (`"customer_first_order": "true"`),
* whether an order is gift-wrapped (`"gift_wrapped": "true"`), a preferred delivery date
* (`"preferred_delivery_date": "2025-10-01"`), the discount applied (`"loyalty_discount_applied":
* "10%"`), and any
* notes provided by the customer (`"customer_notes": "Please leave at the front door"`).
*/
public class AttributeQuery extends Query<AttributeQuery> {
    AttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The key or name of the attribute. For example, `"customer_first_order"`.
    */
    public AttributeQuery key() {
        startField("key");

        return this;
    }

    /**
    * The value of the attribute. For example, `"true"`.
    */
    public AttributeQuery value() {
        startField("value");

        return this;
    }
}
