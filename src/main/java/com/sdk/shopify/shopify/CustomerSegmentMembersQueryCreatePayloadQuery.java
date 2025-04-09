// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `customerSegmentMembersQueryCreate` mutation.
*/
public class CustomerSegmentMembersQueryCreatePayloadQuery extends Query<CustomerSegmentMembersQueryCreatePayloadQuery> {
    CustomerSegmentMembersQueryCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created customer segment members query.
    */
    public CustomerSegmentMembersQueryCreatePayloadQuery customerSegmentMembersQuery(CustomerSegmentMembersQueryQueryDefinition queryDef) {
        startField("customerSegmentMembersQuery");

        _queryBuilder.append('{');
        queryDef.define(new CustomerSegmentMembersQueryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CustomerSegmentMembersQueryCreatePayloadQuery userErrors(CustomerSegmentMembersQueryUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CustomerSegmentMembersQueryUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
