// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The delivery method used by a fulfillment order.
*/
public class DeliveryMethodQuery extends Query<DeliveryMethodQuery> {
    DeliveryMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The Additional information to consider when performing the delivery.
    */
    public DeliveryMethodQuery additionalInformation(DeliveryMethodAdditionalInformationQueryDefinition queryDef) {
        startField("additionalInformation");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryMethodAdditionalInformationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The branded promise that was presented to the buyer during checkout.  For example: Shop Promise.
    */
    public DeliveryMethodQuery brandedPromise(DeliveryBrandedPromiseQueryDefinition queryDef) {
        startField("brandedPromise");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryBrandedPromiseQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The latest delivery date and time when the fulfillment is expected to arrive at the buyer's
    * location.
    */
    public DeliveryMethodQuery maxDeliveryDateTime() {
        startField("maxDeliveryDateTime");

        return this;
    }

    /**
    * The type of the delivery method.
    */
    public DeliveryMethodQuery methodType() {
        startField("methodType");

        return this;
    }

    /**
    * The earliest delivery date and time when the fulfillment is expected to arrive at the buyer's
    * location.
    */
    public DeliveryMethodQuery minDeliveryDateTime() {
        startField("minDeliveryDateTime");

        return this;
    }

    /**
    * The name of the delivery option that was presented to the buyer during checkout.
    */
    public DeliveryMethodQuery presentedName() {
        startField("presentedName");

        return this;
    }

    /**
    * A reference to the shipping method.
    */
    public DeliveryMethodQuery serviceCode() {
        startField("serviceCode");

        return this;
    }

    /**
    * Source reference is promise provider specific data associated with delivery promise.
    */
    public DeliveryMethodQuery sourceReference() {
        startField("sourceReference");

        return this;
    }
}
