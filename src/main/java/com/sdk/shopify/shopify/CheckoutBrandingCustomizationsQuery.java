// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The customizations that apply to specific components or areas of the user interface.
*/
public class CheckoutBrandingCustomizationsQuery extends Query<CheckoutBrandingCustomizationsQuery> {
    CheckoutBrandingCustomizationsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
    */
    public CheckoutBrandingCustomizationsQuery buyerJourney(CheckoutBrandingBuyerJourneyQueryDefinition queryDef) {
        startField("buyerJourney");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingBuyerJourneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The checkout cart link customizations. For example, by setting the visibility field to `HIDDEN`, you
    * can hide the cart icon in the header for one-page checkout, and the cart link in breadcrumbs in
    * three-page checkout.
    */
    public CheckoutBrandingCustomizationsQuery cartLink(CheckoutBrandingCartLinkQueryDefinition queryDef) {
        startField("cartLink");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingCartLinkQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The checkboxes customizations.
    */
    public CheckoutBrandingCustomizationsQuery checkbox(CheckoutBrandingCheckboxQueryDefinition queryDef) {
        startField("checkbox");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingCheckboxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The choice list customizations.
    */
    public CheckoutBrandingCustomizationsQuery choiceList(CheckoutBrandingChoiceListQueryDefinition queryDef) {
        startField("choiceList");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingChoiceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The content container customizations.
    */
    public CheckoutBrandingCustomizationsQuery content(CheckoutBrandingContentQueryDefinition queryDef) {
        startField("content");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The form controls customizations.
    */
    public CheckoutBrandingCustomizationsQuery control(CheckoutBrandingControlQueryDefinition queryDef) {
        startField("control");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingControlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customizations for the page, content, main, and order summary dividers. For example, by setting
    * the borderStyle to `DOTTED`, you can make these dividers render as dotted lines.
    */
    public CheckoutBrandingCustomizationsQuery divider(CheckoutBrandingDividerStyleQueryDefinition queryDef) {
        startField("divider");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingDividerStyleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The express checkout customizations.
    */
    public CheckoutBrandingCustomizationsQuery expressCheckout(CheckoutBrandingExpressCheckoutQueryDefinition queryDef) {
        startField("expressCheckout");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingExpressCheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The favicon image.
    */
    public CheckoutBrandingCustomizationsQuery favicon(CheckoutBrandingImageQueryDefinition queryDef) {
        startField("favicon");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The footer customizations.
    */
    public CheckoutBrandingCustomizationsQuery footer(CheckoutBrandingFooterQueryDefinition queryDef) {
        startField("footer");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingFooterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The global customizations.
    */
    public CheckoutBrandingCustomizationsQuery global(CheckoutBrandingGlobalQueryDefinition queryDef) {
        startField("global");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingGlobalQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The header customizations.
    */
    public CheckoutBrandingCustomizationsQuery header(CheckoutBrandingHeaderQueryDefinition queryDef) {
        startField("header");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingHeaderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Heading Level 1 customizations.
    */
    public CheckoutBrandingCustomizationsQuery headingLevel1(CheckoutBrandingHeadingLevelQueryDefinition queryDef) {
        startField("headingLevel1");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingHeadingLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Heading Level 2 customizations.
    */
    public CheckoutBrandingCustomizationsQuery headingLevel2(CheckoutBrandingHeadingLevelQueryDefinition queryDef) {
        startField("headingLevel2");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingHeadingLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Heading Level 3 customizations.
    */
    public CheckoutBrandingCustomizationsQuery headingLevel3(CheckoutBrandingHeadingLevelQueryDefinition queryDef) {
        startField("headingLevel3");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingHeadingLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The main area customizations.
    */
    public CheckoutBrandingCustomizationsQuery main(CheckoutBrandingMainQueryDefinition queryDef) {
        startField("main");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingMainQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The merchandise thumbnails customizations.
    */
    public CheckoutBrandingCustomizationsQuery merchandiseThumbnail(CheckoutBrandingMerchandiseThumbnailQueryDefinition queryDef) {
        startField("merchandiseThumbnail");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingMerchandiseThumbnailQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order summary customizations.
    */
    public CheckoutBrandingCustomizationsQuery orderSummary(CheckoutBrandingOrderSummaryQueryDefinition queryDef) {
        startField("orderSummary");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingOrderSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The primary buttons customizations.
    */
    public CheckoutBrandingCustomizationsQuery primaryButton(CheckoutBrandingButtonQueryDefinition queryDef) {
        startField("primaryButton");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingButtonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The secondary buttons customizations.
    */
    public CheckoutBrandingCustomizationsQuery secondaryButton(CheckoutBrandingButtonQueryDefinition queryDef) {
        startField("secondaryButton");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingButtonQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The selects customizations.
    */
    public CheckoutBrandingCustomizationsQuery select(CheckoutBrandingSelectQueryDefinition queryDef) {
        startField("select");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingSelectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The text fields customizations.
    */
    public CheckoutBrandingCustomizationsQuery textField(CheckoutBrandingTextFieldQueryDefinition queryDef) {
        startField("textField");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingTextFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
