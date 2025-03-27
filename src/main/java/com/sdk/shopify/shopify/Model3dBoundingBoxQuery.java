// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Bounding box information of a 3d model.
*/
public class Model3dBoundingBoxQuery extends Query<Model3dBoundingBoxQuery> {
    Model3dBoundingBoxQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Size in meters of the smallest volume which contains the 3d model.
    */
    public Model3dBoundingBoxQuery size(Vector3QueryDefinition queryDef) {
        startField("size");

        _queryBuilder.append('{');
        queryDef.define(new Vector3Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
