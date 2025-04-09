// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Representation of 3d vectors and points. It can represent
* either the coordinates of a point in space, a direction, or
* size. Presented as an object with three floating-point values.
*/
public class Vector3Query extends Query<Vector3Query> {
    Vector3Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The x coordinate of Vector3.
    */
    public Vector3Query x() {
        startField("x");

        return this;
    }

    /**
    * The y coordinate of Vector3.
    */
    public Vector3Query y() {
        startField("y");

        return this;
    }

    /**
    * The z coordinate of Vector3.
    */
    public Vector3Query z() {
        startField("z");

        return this;
    }
}
