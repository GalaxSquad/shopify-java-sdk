// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A source for a Shopify-hosted 3d model.
* Types of sources include GLB and USDZ formatted 3d models, where the former
* is an original 3d model and the latter has been converted from the original.
* If the original source is in GLB format and over 15 MBs in size, then both the
* original and the USDZ formatted source are optimized to reduce the file size.
*/
public class Model3dSourceQuery extends Query<Model3dSourceQuery> {
    Model3dSourceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The 3d model source's filesize.
    */
    public Model3dSourceQuery filesize() {
        startField("filesize");

        return this;
    }

    /**
    * The 3d model source's format.
    */
    public Model3dSourceQuery format() {
        startField("format");

        return this;
    }

    /**
    * The 3d model source's MIME type.
    */
    public Model3dSourceQuery mimeType() {
        startField("mimeType");

        return this;
    }

    /**
    * The 3d model source's URL.
    */
    public Model3dSourceQuery url() {
        startField("url");

        return this;
    }
}
