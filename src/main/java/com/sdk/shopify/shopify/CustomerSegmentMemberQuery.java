// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.List;

/**
* The member of a segment.
*/
public class CustomerSegmentMemberQuery extends Query<CustomerSegmentMemberQuery> {
    CustomerSegmentMemberQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The total amount of money that the member has spent on orders.
    */
    public CustomerSegmentMemberQuery amountSpent(MoneyV2QueryDefinition queryDef) {
        startField("amountSpent");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The member's default address.
    */
    public CustomerSegmentMemberQuery defaultAddress(MailingAddressQueryDefinition queryDef) {
        startField("defaultAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The member's default email address.
    */
    public CustomerSegmentMemberQuery defaultEmailAddress(CustomerEmailAddressQueryDefinition queryDef) {
        startField("defaultEmailAddress");

        _queryBuilder.append('{');
        queryDef.define(new CustomerEmailAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The member's default phone number.
    */
    public CustomerSegmentMemberQuery defaultPhoneNumber(CustomerPhoneNumberQueryDefinition queryDef) {
        startField("defaultPhoneNumber");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPhoneNumberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The full name of the member, which is based on the values of the `first_name` and `last_name`
    * fields. If the member's first name and last name aren't available, then the customer's email address
    * is used. If the customer's email address isn't available, then the customer's phone number is used.
    */
    public CustomerSegmentMemberQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * The member's first name.
    */
    public CustomerSegmentMemberQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The member’s ID.
    */
    public CustomerSegmentMemberQuery id() {
        startField("id");

        return this;
    }

    /**
    * The member's last name.
    */
    public CustomerSegmentMemberQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The ID of the member's most recent order.
    */
    public CustomerSegmentMemberQuery lastOrderId() {
        startField("lastOrderId");

        return this;
    }

    /**
    * Whether the customer can be merged with another customer.
    */
    public CustomerSegmentMemberQuery mergeable(CustomerMergeableQueryDefinition queryDef) {
        startField("mergeable");

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeableQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public CustomerSegmentMemberQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public CustomerSegmentMemberQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
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
    public CustomerSegmentMemberQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public CustomerSegmentMemberQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
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
    * A note about the member.
    */
    public CustomerSegmentMemberQuery note() {
        startField("note");

        return this;
    }

    /**
    * The total number of orders that the member has made.
    */
    public CustomerSegmentMemberQuery numberOfOrders() {
        startField("numberOfOrders");

        return this;
    }
}
