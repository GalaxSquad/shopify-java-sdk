// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* Represents a resource that can be published to a channel.
* A publishable resource can be either a Product or Collection.
*/
public class PublishableQuery extends Query<PublishableQuery> {
    PublishableQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public PublishableQuery availablePublicationsCount(CountQueryDefinition queryDef) {
        startField("availablePublicationsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the resource is published to the app's
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    * For example, the resource might be published to the app's online store channel.
    */
    public PublishableQuery publishedOnCurrentPublication() {
        startField("publishedOnCurrentPublication");

        return this;
    }

    /**
    * Whether the resource is published to a specified
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public PublishableQuery publishedOnPublication(ID publicationId) {
        startField("publishedOnPublication");

        _queryBuilder.append("(publicationId:");
        Query.appendQuotedString(_queryBuilder, publicationId.toString());

        _queryBuilder.append(')');

        return this;
    }

    public class ResourcePublicationsArguments extends Arguments {
        ResourcePublicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to return only the resources that are currently published. If false, then also returns the
        * resources that are scheduled to be published.
        */
        public ResourcePublicationsArguments onlyPublished(Boolean value) {
            if (value != null) {
                startArgument("onlyPublished");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsArguments first(Integer value) {
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
        public ResourcePublicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsArguments last(Integer value) {
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
        public ResourcePublicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ResourcePublicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ResourcePublicationsArgumentsDefinition {
        void define(ResourcePublicationsArguments args);
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public PublishableQuery resourcePublications(ResourcePublicationConnectionQueryDefinition queryDef) {
        return resourcePublications(args -> {}, queryDef);
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public PublishableQuery resourcePublications(ResourcePublicationsArgumentsDefinition argsDef, ResourcePublicationConnectionQueryDefinition queryDef) {
        startField("resourcePublications");

        ResourcePublicationsArguments args = new ResourcePublicationsArguments(_queryBuilder);
        argsDef.define(args);
        ResourcePublicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ResourcePublicationsCountArguments extends Arguments {
        ResourcePublicationsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Include only the resource's publications that are published. If false, then return all the
        * resource's publications including future publications.
        */
        public ResourcePublicationsCountArguments onlyPublished(Boolean value) {
            if (value != null) {
                startArgument("onlyPublished");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ResourcePublicationsCountArgumentsDefinition {
        void define(ResourcePublicationsCountArguments args);
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public PublishableQuery resourcePublicationsCount(CountQueryDefinition queryDef) {
        return resourcePublicationsCount(args -> {}, queryDef);
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public PublishableQuery resourcePublicationsCount(ResourcePublicationsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("resourcePublicationsCount");

        ResourcePublicationsCountArguments args = new ResourcePublicationsCountArguments(_queryBuilder);
        argsDef.define(args);
        ResourcePublicationsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ResourcePublicationsV2Arguments extends Arguments {
        ResourcePublicationsV2Arguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to return only the resources that are currently published. If false, then also returns the
        * resources that are scheduled or staged to be published.
        */
        public ResourcePublicationsV2Arguments onlyPublished(Boolean value) {
            if (value != null) {
                startArgument("onlyPublished");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Filter publications by catalog type.
        */
        public ResourcePublicationsV2Arguments catalogType(CatalogType value) {
            if (value != null) {
                startArgument("catalogType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsV2Arguments first(Integer value) {
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
        public ResourcePublicationsV2Arguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsV2Arguments last(Integer value) {
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
        public ResourcePublicationsV2Arguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ResourcePublicationsV2Arguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ResourcePublicationsV2ArgumentsDefinition {
        void define(ResourcePublicationsV2Arguments args);
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public PublishableQuery resourcePublicationsV2(ResourcePublicationV2ConnectionQueryDefinition queryDef) {
        return resourcePublicationsV2(args -> {}, queryDef);
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public PublishableQuery resourcePublicationsV2(ResourcePublicationsV2ArgumentsDefinition argsDef, ResourcePublicationV2ConnectionQueryDefinition queryDef) {
        startField("resourcePublicationsV2");

        ResourcePublicationsV2Arguments args = new ResourcePublicationsV2Arguments(_queryBuilder);
        argsDef.define(args);
        ResourcePublicationsV2Arguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationV2ConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UnpublishedPublicationsArguments extends Arguments {
        UnpublishedPublicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnpublishedPublicationsArguments first(Integer value) {
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
        public UnpublishedPublicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnpublishedPublicationsArguments last(Integer value) {
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
        public UnpublishedPublicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UnpublishedPublicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UnpublishedPublicationsArgumentsDefinition {
        void define(UnpublishedPublicationsArguments args);
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */
    public PublishableQuery unpublishedPublications(PublicationConnectionQueryDefinition queryDef) {
        return unpublishedPublications(args -> {}, queryDef);
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */
    public PublishableQuery unpublishedPublications(UnpublishedPublicationsArgumentsDefinition argsDef, PublicationConnectionQueryDefinition queryDef) {
        startField("unpublishedPublications");

        UnpublishedPublicationsArguments args = new UnpublishedPublicationsArguments(_queryBuilder);
        argsDef.define(args);
        UnpublishedPublicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PublicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public PublishableQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PublishableQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
