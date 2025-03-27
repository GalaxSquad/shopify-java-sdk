// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `disputeEvidenceUpdate` mutation.
*/
public class DisputeEvidenceUpdatePayloadQuery extends Query<DisputeEvidenceUpdatePayloadQuery> {
    DisputeEvidenceUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated dispute evidence.
    */
    public DisputeEvidenceUpdatePayloadQuery disputeEvidence(ShopifyPaymentsDisputeEvidenceQueryDefinition queryDef) {
        startField("disputeEvidence");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeEvidenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DisputeEvidenceUpdatePayloadQuery userErrors(DisputeEvidenceUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new DisputeEvidenceUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
