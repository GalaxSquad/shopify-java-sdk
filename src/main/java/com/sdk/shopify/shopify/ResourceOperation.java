// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* Represents a merchandising background operation interface.
*/

public interface ResourceOperation {
    String getGraphQlTypeName();

    ID getId();

    Integer getProcessedRowCount();

    RowCount getRowCount();

    ResourceOperationStatus getStatus();
}

