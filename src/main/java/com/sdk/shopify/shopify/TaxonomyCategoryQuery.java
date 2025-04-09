// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The details of a specific product category within the [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
*/
public class TaxonomyCategoryQuery extends Query<TaxonomyCategoryQuery> {
    TaxonomyCategoryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The IDs of the category's ancestor categories.
    */
    public TaxonomyCategoryQuery ancestorIds() {
        startField("ancestorIds");

        return this;
    }

    public class AttributesArguments extends Arguments {
        AttributesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AttributesArguments first(Integer value) {
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
        public AttributesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AttributesArguments last(Integer value) {
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
        public AttributesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AttributesArgumentsDefinition {
        void define(AttributesArguments args);
    }

    /**
    * The attributes of the taxonomy category.
    */
    public TaxonomyCategoryQuery attributes(TaxonomyCategoryAttributeConnectionQueryDefinition queryDef) {
        return attributes(args -> {}, queryDef);
    }

    /**
    * The attributes of the taxonomy category.
    */
    public TaxonomyCategoryQuery attributes(AttributesArgumentsDefinition argsDef, TaxonomyCategoryAttributeConnectionQueryDefinition queryDef) {
        startField("attributes");

        AttributesArguments args = new AttributesArguments(_queryBuilder);
        argsDef.define(args);
        AttributesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyCategoryAttributeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The IDs of the category's child categories.
    */
    public TaxonomyCategoryQuery childrenIds() {
        startField("childrenIds");

        return this;
    }

    /**
    * The full name of the taxonomy category. For example, Animals & Pet Supplies > Pet Supplies > Dog
    * Supplies > Dog Beds.
    */
    public TaxonomyCategoryQuery fullName() {
        startField("fullName");

        return this;
    }

    /**
    * Whether the category is archived. The default value is `false`.
    */
    public TaxonomyCategoryQuery isArchived() {
        startField("isArchived");

        return this;
    }

    /**
    * Whether the category is a leaf category. A leaf category doesn't have any subcategories beneath it.
    * For example, in Animals & Pet Supplies > Pet Supplies > Dog Supplies > Dog Treadmills, Dog
    * Treadmills is a leaf category. The value is `true` when there are no `childrenIds` specified.
    */
    public TaxonomyCategoryQuery isLeaf() {
        startField("isLeaf");

        return this;
    }

    /**
    * Whether the category is a root category. A root category is at the top level of the category
    * hierarchy and doesn't have a parent category. For example, Animals & Pet Supplies. The value is
    * `true` when there's no `parentId` specified.
    */
    public TaxonomyCategoryQuery isRoot() {
        startField("isRoot");

        return this;
    }

    /**
    * The level of the category in the taxonomy tree. Levels indicate the depth of the category from the
    * root. For example, in Animals & Pet Supplies > Pet Supplies > Dog Supplies, Animals & Pet Supplies
    * is at level 1, Animals & Pet Supplies > Pet Supplies is at level 2, and Animals & Pet Supplies > Pet
    * Supplies > Dog Supplies is at level 3.
    */
    public TaxonomyCategoryQuery level() {
        startField("level");

        return this;
    }

    /**
    * The name of the taxonomy category. For example, Dog Beds.
    */
    public TaxonomyCategoryQuery name() {
        startField("name");

        return this;
    }

    /**
    * The ID of the category's parent category.
    */
    public TaxonomyCategoryQuery parentId() {
        startField("parentId");

        return this;
    }
}
