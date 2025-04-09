// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Additional information included on a delivery method that will help during the delivery process.
*/
public class DeliveryMethodAdditionalInformationQuery extends Query<DeliveryMethodAdditionalInformationQuery> {
    DeliveryMethodAdditionalInformationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The delivery instructions to follow when performing the delivery.
    */
    public DeliveryMethodAdditionalInformationQuery instructions() {
        startField("instructions");

        return this;
    }

    /**
    * The phone number to contact when performing the delivery.
    */
    public DeliveryMethodAdditionalInformationQuery phone() {
        startField("phone");

        return this;
    }
}
