// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The fields that can be used to override the default fields.
*/
public class CustomerMergePreviewAlternateFieldsQuery extends Query<CustomerMergePreviewAlternateFieldsQuery> {
    CustomerMergePreviewAlternateFieldsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The default address of a customer.
    */
    public CustomerMergePreviewAlternateFieldsQuery defaultAddress(MailingAddressQueryDefinition queryDef) {
        startField("defaultAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The email state of a customer.
    */
    public CustomerMergePreviewAlternateFieldsQuery email(CustomerEmailAddressQueryDefinition queryDef) {
        startField("email");

        _queryBuilder.append('{');
        queryDef.define(new CustomerEmailAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The first name of a customer.
    */
    public CustomerMergePreviewAlternateFieldsQuery firstName() {
        startField("firstName");

        return this;
    }

    /**
    * The last name of a customer.
    */
    public CustomerMergePreviewAlternateFieldsQuery lastName() {
        startField("lastName");

        return this;
    }

    /**
    * The phone number state of a customer.
    */
    public CustomerMergePreviewAlternateFieldsQuery phoneNumber(CustomerPhoneNumberQueryDefinition queryDef) {
        startField("phoneNumber");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPhoneNumberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
