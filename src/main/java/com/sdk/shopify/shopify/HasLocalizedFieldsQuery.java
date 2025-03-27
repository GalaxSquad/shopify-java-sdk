// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Localized fields associated with the specified resource.
*/
public class HasLocalizedFieldsQuery extends Query<HasLocalizedFieldsQuery> {
    HasLocalizedFieldsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class LocalizedFieldsArguments extends Arguments {
        LocalizedFieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The country codes of the extensions.
        */
        public LocalizedFieldsArguments countryCodes(List<CountryCode> value) {
            if (value != null) {
                startArgument("countryCodes");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CountryCode item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The purpose of the extensions.
        */
        public LocalizedFieldsArguments purposes(List<LocalizedFieldPurpose> value) {
            if (value != null) {
                startArgument("purposes");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocalizedFieldPurpose item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocalizedFieldsArguments first(Integer value) {
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
        public LocalizedFieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocalizedFieldsArguments last(Integer value) {
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
        public LocalizedFieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LocalizedFieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocalizedFieldsArgumentsDefinition {
        void define(LocalizedFieldsArguments args);
    }

    /**
    * List of localized fields for the resource.
    */
    public HasLocalizedFieldsQuery localizedFields(LocalizedFieldConnectionQueryDefinition queryDef) {
        return localizedFields(args -> {}, queryDef);
    }

    /**
    * List of localized fields for the resource.
    */
    public HasLocalizedFieldsQuery localizedFields(LocalizedFieldsArgumentsDefinition argsDef, LocalizedFieldConnectionQueryDefinition queryDef) {
        startField("localizedFields");

        LocalizedFieldsArguments args = new LocalizedFieldsArguments(_queryBuilder);
        argsDef.define(args);
        LocalizedFieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocalizedFieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public HasLocalizedFieldsQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasLocalizedFieldsQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
