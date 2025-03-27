// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Return type for `fulfillmentOrderMove` mutation.
*/
public class FulfillmentOrderMovePayloadQuery extends Query<FulfillmentOrderMovePayloadQuery> {
    FulfillmentOrderMovePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment order which now contains the moved line items and is assigned to the destination
    * location.
    * If the original fulfillment order doesn't have any line items which are fully or partially
    * fulfilled, the original fulfillment order will be moved to the new location.
    * However if this isn't the case, the moved fulfillment order will differ from the original one.
    */
    public FulfillmentOrderMovePayloadQuery movedFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("movedFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The final state of the original fulfillment order.
    * As a result of the move operation, the original fulfillment order might be moved to the new location
    * or remain in the original location. The original fulfillment order might have the same status or be
    * closed.
    */
    public FulfillmentOrderMovePayloadQuery originalFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("originalFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * This field is deprecated.
    */
    public FulfillmentOrderMovePayloadQuery remainingFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startField("remainingFulfillmentOrder");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public FulfillmentOrderMovePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
