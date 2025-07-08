// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents an image resource.
*/
public class ImageQuery extends Query<ImageQuery> {
    ImageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A word or phrase to share the nature or contents of an image.
    */
    public ImageQuery altText() {
        startField("altText");

        return this;
    }

    /**
    * The original height of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
    */
    public ImageQuery height() {
        startField("height");

        return this;
    }

    /**
    * A unique ID for the image.
    */
    public ImageQuery id() {
        startField("id");

        return this;
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public ImageQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public ImageQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public ImageQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public ImageQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ThumbHash of the image.
    * Useful to display placeholder images while the original image is loading.
    */
    public ImageQuery thumbhash() {
        startField("thumbhash");

        return this;
    }

    public class UrlArguments extends Arguments {
        UrlArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A set of options to transform the original image.
        */
        public UrlArguments transform(ImageTransformInput value) {
            if (value != null) {
                startArgument("transform");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UrlArgumentsDefinition {
        void define(UrlArguments args);
    }

    /**
    * The location of the image as a URL.
    * If no transform options are specified, then the original image will be preserved including any
    * pre-applied transforms.
    * All transformation options are considered "best-effort". Any transformation that the original image
    * type doesn't support will be ignored.
    * If you need multiple variations of the same image, then you can use [GraphQL
    * aliases](https://graphql.org/learn/queries/#aliases).
    */
    public ImageQuery url() {
        return url(args -> {});
    }

    /**
    * The location of the image as a URL.
    * If no transform options are specified, then the original image will be preserved including any
    * pre-applied transforms.
    * All transformation options are considered "best-effort". Any transformation that the original image
    * type doesn't support will be ignored.
    * If you need multiple variations of the same image, then you can use [GraphQL
    * aliases](https://graphql.org/learn/queries/#aliases).
    */
    public ImageQuery url(UrlArgumentsDefinition argsDef) {
        startField("url");

        UrlArguments args = new UrlArguments(_queryBuilder);
        argsDef.define(args);
        UrlArguments.end(args);

        return this;
    }

    /**
    * The original width of the image in pixels. Returns `null` if the image isn't hosted by Shopify.
    */
    public ImageQuery width() {
        startField("width");

        return this;
    }
}
