// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Provides attributes for visual representation.
*/
public class MetaobjectThumbnailQuery extends Query<MetaobjectThumbnailQuery> {
    MetaobjectThumbnailQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The file to be used for visual representation of this metaobject.
    */
    public MetaobjectThumbnailQuery file(FileQueryDefinition queryDef) {
        startField("file");

        _queryBuilder.append('{');
        queryDef.define(new FileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The hexadecimal color code to be used for respresenting this metaobject.
    */
    public MetaobjectThumbnailQuery hex() {
        startField("hex");

        return this;
    }
}
