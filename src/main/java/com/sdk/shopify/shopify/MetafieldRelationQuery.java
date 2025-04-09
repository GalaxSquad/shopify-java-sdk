// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Defines a relation between two resources via a reference metafield.
* The referencer owns the joining field with a given namespace and key,
* while the target is referenced by the field.
*/
public class MetafieldRelationQuery extends Query<MetafieldRelationQuery> {
    MetafieldRelationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The key of the field making the reference.
    */
    public MetafieldRelationQuery key() {
        startField("key");

        return this;
    }

    /**
    * The name of the field making the reference.
    */
    public MetafieldRelationQuery name() {
        startField("name");

        return this;
    }

    /**
    * The namespace of the metafield making the reference, or type of the metaobject.
    */
    public MetafieldRelationQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    * The resource making the reference.
    */
    public MetafieldRelationQuery referencer(MetafieldReferencerQueryDefinition queryDef) {
        startField("referencer");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldReferencerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The referenced resource.
    */
    public MetafieldRelationQuery target(MetafieldReferenceQueryDefinition queryDef) {
        startField("target");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldReferenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
