// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The properties and status of a bulk discount redeem code creation operation.
*/
public class DiscountRedeemCodeBulkCreationQuery extends Query<DiscountRedeemCodeBulkCreationQuery> {
    DiscountRedeemCodeBulkCreationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class CodesArguments extends Arguments {
        CodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodesArguments first(Integer value) {
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
        public CodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodesArguments last(Integer value) {
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
        public CodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CodesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CodesArgumentsDefinition {
        void define(CodesArguments args);
    }

    /**
    * The result of each code creation operation associated with the bulk creation operation including any
    * errors that might have occurred during the operation.
    */
    public DiscountRedeemCodeBulkCreationQuery codes(DiscountRedeemCodeBulkCreationCodeConnectionQueryDefinition queryDef) {
        return codes(args -> {}, queryDef);
    }

    /**
    * The result of each code creation operation associated with the bulk creation operation including any
    * errors that might have occurred during the operation.
    */
    public DiscountRedeemCodeBulkCreationQuery codes(CodesArgumentsDefinition argsDef, DiscountRedeemCodeBulkCreationCodeConnectionQueryDefinition queryDef) {
        startField("codes");

        CodesArguments args = new CodesArguments(_queryBuilder);
        argsDef.define(args);
        CodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountRedeemCodeBulkCreationCodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of codes to create.
    */
    public DiscountRedeemCodeBulkCreationQuery codesCount() {
        startField("codesCount");

        return this;
    }

    /**
    * The date and time when the bulk creation was created.
    */
    public DiscountRedeemCodeBulkCreationQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The code discount associated with the created codes.
    */
    public DiscountRedeemCodeBulkCreationQuery discountCode(DiscountCodeNodeQueryDefinition queryDef) {
        startField("discountCode");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the bulk creation is still queued (`false`) or has been run (`true`).
    */
    public DiscountRedeemCodeBulkCreationQuery done() {
        startField("done");

        return this;
    }

    /**
    * The number of codes that weren't created successfully.
    */
    public DiscountRedeemCodeBulkCreationQuery failedCount() {
        startField("failedCount");

        return this;
    }

    /**
    * The number of codes created successfully.
    */
    public DiscountRedeemCodeBulkCreationQuery importedCount() {
        startField("importedCount");

        return this;
    }
}
