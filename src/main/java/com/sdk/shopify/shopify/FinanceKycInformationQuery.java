// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Shopify Payments account information shared with embedded finance applications.
*/
public class FinanceKycInformationQuery extends Query<FinanceKycInformationQuery> {
    FinanceKycInformationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The legal entity business address.
    */
    public FinanceKycInformationQuery businessAddress(ShopifyPaymentsAddressBasicQueryDefinition queryDef) {
        startField("businessAddress");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsAddressBasicQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The legal entity business type.
    */
    public FinanceKycInformationQuery businessType() {
        startField("businessType");

        return this;
    }

    /**
    * Business industry.
    */
    public FinanceKycInformationQuery industry(ShopifyPaymentsMerchantCategoryCodeQueryDefinition queryDef) {
        startField("industry");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsMerchantCategoryCodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the business legal name.
    */
    public FinanceKycInformationQuery legalName() {
        startField("legalName");

        return this;
    }

    /**
    * The shop owner information for financial KYC purposes.
    */
    public FinanceKycInformationQuery shopOwner(FinancialKycShopOwnerQueryDefinition queryDef) {
        startField("shopOwner");

        _queryBuilder.append('{');
        queryDef.define(new FinancialKycShopOwnerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Tax identification information.
    */
    public FinanceKycInformationQuery taxIdentification(ShopifyPaymentsTaxIdentificationQueryDefinition queryDef) {
        startField("taxIdentification");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsTaxIdentificationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
