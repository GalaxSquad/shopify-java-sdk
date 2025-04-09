// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The customizations that apply to specific components or areas of the user interface.
*/
public class CheckoutBrandingCustomizations extends AbstractResponse<CheckoutBrandingCustomizations> {
    public CheckoutBrandingCustomizations() {
    }

    public CheckoutBrandingCustomizations(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "buyerJourney": {
                    CheckoutBrandingBuyerJourney optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingBuyerJourney(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cartLink": {
                    CheckoutBrandingCartLink optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingCartLink(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkbox": {
                    CheckoutBrandingCheckbox optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingCheckbox(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "choiceList": {
                    CheckoutBrandingChoiceList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingChoiceList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "content": {
                    CheckoutBrandingContent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingContent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "control": {
                    CheckoutBrandingControl optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingControl(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "divider": {
                    CheckoutBrandingDividerStyle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingDividerStyle(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expressCheckout": {
                    CheckoutBrandingExpressCheckout optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingExpressCheckout(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "favicon": {
                    CheckoutBrandingImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "footer": {
                    CheckoutBrandingFooter optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingFooter(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "global": {
                    CheckoutBrandingGlobal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingGlobal(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "header": {
                    CheckoutBrandingHeader optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingHeader(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "headingLevel1": {
                    CheckoutBrandingHeadingLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingHeadingLevel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "headingLevel2": {
                    CheckoutBrandingHeadingLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingHeadingLevel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "headingLevel3": {
                    CheckoutBrandingHeadingLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingHeadingLevel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "main": {
                    CheckoutBrandingMain optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingMain(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "merchandiseThumbnail": {
                    CheckoutBrandingMerchandiseThumbnail optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingMerchandiseThumbnail(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderSummary": {
                    CheckoutBrandingOrderSummary optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingOrderSummary(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "primaryButton": {
                    CheckoutBrandingButton optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingButton(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secondaryButton": {
                    CheckoutBrandingButton optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingButton(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "select": {
                    CheckoutBrandingSelect optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingSelect(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "textField": {
                    CheckoutBrandingTextField optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingTextField(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CheckoutBrandingCustomizations";
    }

    /**
    * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
    */

    public CheckoutBrandingBuyerJourney getBuyerJourney() {
        return (CheckoutBrandingBuyerJourney) get("buyerJourney");
    }

    public CheckoutBrandingCustomizations setBuyerJourney(CheckoutBrandingBuyerJourney arg) {
        optimisticData.put(getKey("buyerJourney"), arg);
        return this;
    }

    /**
    * The checkout cart link customizations. For example, by setting the visibility field to `HIDDEN`, you
    * can hide the cart icon in the header for one-page checkout, and the cart link in breadcrumbs in
    * three-page checkout.
    */

    public CheckoutBrandingCartLink getCartLink() {
        return (CheckoutBrandingCartLink) get("cartLink");
    }

    public CheckoutBrandingCustomizations setCartLink(CheckoutBrandingCartLink arg) {
        optimisticData.put(getKey("cartLink"), arg);
        return this;
    }

    /**
    * The checkboxes customizations.
    */

    public CheckoutBrandingCheckbox getCheckbox() {
        return (CheckoutBrandingCheckbox) get("checkbox");
    }

    public CheckoutBrandingCustomizations setCheckbox(CheckoutBrandingCheckbox arg) {
        optimisticData.put(getKey("checkbox"), arg);
        return this;
    }

    /**
    * The choice list customizations.
    */

    public CheckoutBrandingChoiceList getChoiceList() {
        return (CheckoutBrandingChoiceList) get("choiceList");
    }

    public CheckoutBrandingCustomizations setChoiceList(CheckoutBrandingChoiceList arg) {
        optimisticData.put(getKey("choiceList"), arg);
        return this;
    }

    /**
    * The content container customizations.
    */

    public CheckoutBrandingContent getContent() {
        return (CheckoutBrandingContent) get("content");
    }

    public CheckoutBrandingCustomizations setContent(CheckoutBrandingContent arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
    * The form controls customizations.
    */

    public CheckoutBrandingControl getControl() {
        return (CheckoutBrandingControl) get("control");
    }

    public CheckoutBrandingCustomizations setControl(CheckoutBrandingControl arg) {
        optimisticData.put(getKey("control"), arg);
        return this;
    }

    /**
    * The customizations for the page, content, main, and order summary dividers. For example, by setting
    * the borderStyle to `DOTTED`, you can make these dividers render as dotted lines.
    */

    public CheckoutBrandingDividerStyle getDivider() {
        return (CheckoutBrandingDividerStyle) get("divider");
    }

    public CheckoutBrandingCustomizations setDivider(CheckoutBrandingDividerStyle arg) {
        optimisticData.put(getKey("divider"), arg);
        return this;
    }

    /**
    * The express checkout customizations.
    */

    public CheckoutBrandingExpressCheckout getExpressCheckout() {
        return (CheckoutBrandingExpressCheckout) get("expressCheckout");
    }

    public CheckoutBrandingCustomizations setExpressCheckout(CheckoutBrandingExpressCheckout arg) {
        optimisticData.put(getKey("expressCheckout"), arg);
        return this;
    }

    /**
    * The favicon image.
    */

    public CheckoutBrandingImage getFavicon() {
        return (CheckoutBrandingImage) get("favicon");
    }

    public CheckoutBrandingCustomizations setFavicon(CheckoutBrandingImage arg) {
        optimisticData.put(getKey("favicon"), arg);
        return this;
    }

    /**
    * The footer customizations.
    */

    public CheckoutBrandingFooter getFooter() {
        return (CheckoutBrandingFooter) get("footer");
    }

    public CheckoutBrandingCustomizations setFooter(CheckoutBrandingFooter arg) {
        optimisticData.put(getKey("footer"), arg);
        return this;
    }

    /**
    * The global customizations.
    */

    public CheckoutBrandingGlobal getGlobal() {
        return (CheckoutBrandingGlobal) get("global");
    }

    public CheckoutBrandingCustomizations setGlobal(CheckoutBrandingGlobal arg) {
        optimisticData.put(getKey("global"), arg);
        return this;
    }

    /**
    * The header customizations.
    */

    public CheckoutBrandingHeader getHeader() {
        return (CheckoutBrandingHeader) get("header");
    }

    public CheckoutBrandingCustomizations setHeader(CheckoutBrandingHeader arg) {
        optimisticData.put(getKey("header"), arg);
        return this;
    }

    /**
    * The Heading Level 1 customizations.
    */

    public CheckoutBrandingHeadingLevel getHeadingLevel1() {
        return (CheckoutBrandingHeadingLevel) get("headingLevel1");
    }

    public CheckoutBrandingCustomizations setHeadingLevel1(CheckoutBrandingHeadingLevel arg) {
        optimisticData.put(getKey("headingLevel1"), arg);
        return this;
    }

    /**
    * The Heading Level 2 customizations.
    */

    public CheckoutBrandingHeadingLevel getHeadingLevel2() {
        return (CheckoutBrandingHeadingLevel) get("headingLevel2");
    }

    public CheckoutBrandingCustomizations setHeadingLevel2(CheckoutBrandingHeadingLevel arg) {
        optimisticData.put(getKey("headingLevel2"), arg);
        return this;
    }

    /**
    * The Heading Level 3 customizations.
    */

    public CheckoutBrandingHeadingLevel getHeadingLevel3() {
        return (CheckoutBrandingHeadingLevel) get("headingLevel3");
    }

    public CheckoutBrandingCustomizations setHeadingLevel3(CheckoutBrandingHeadingLevel arg) {
        optimisticData.put(getKey("headingLevel3"), arg);
        return this;
    }

    /**
    * The main area customizations.
    */

    public CheckoutBrandingMain getMain() {
        return (CheckoutBrandingMain) get("main");
    }

    public CheckoutBrandingCustomizations setMain(CheckoutBrandingMain arg) {
        optimisticData.put(getKey("main"), arg);
        return this;
    }

    /**
    * The merchandise thumbnails customizations.
    */

    public CheckoutBrandingMerchandiseThumbnail getMerchandiseThumbnail() {
        return (CheckoutBrandingMerchandiseThumbnail) get("merchandiseThumbnail");
    }

    public CheckoutBrandingCustomizations setMerchandiseThumbnail(CheckoutBrandingMerchandiseThumbnail arg) {
        optimisticData.put(getKey("merchandiseThumbnail"), arg);
        return this;
    }

    /**
    * The order summary customizations.
    */

    public CheckoutBrandingOrderSummary getOrderSummary() {
        return (CheckoutBrandingOrderSummary) get("orderSummary");
    }

    public CheckoutBrandingCustomizations setOrderSummary(CheckoutBrandingOrderSummary arg) {
        optimisticData.put(getKey("orderSummary"), arg);
        return this;
    }

    /**
    * The primary buttons customizations.
    */

    public CheckoutBrandingButton getPrimaryButton() {
        return (CheckoutBrandingButton) get("primaryButton");
    }

    public CheckoutBrandingCustomizations setPrimaryButton(CheckoutBrandingButton arg) {
        optimisticData.put(getKey("primaryButton"), arg);
        return this;
    }

    /**
    * The secondary buttons customizations.
    */

    public CheckoutBrandingButton getSecondaryButton() {
        return (CheckoutBrandingButton) get("secondaryButton");
    }

    public CheckoutBrandingCustomizations setSecondaryButton(CheckoutBrandingButton arg) {
        optimisticData.put(getKey("secondaryButton"), arg);
        return this;
    }

    /**
    * The selects customizations.
    */

    public CheckoutBrandingSelect getSelect() {
        return (CheckoutBrandingSelect) get("select");
    }

    public CheckoutBrandingCustomizations setSelect(CheckoutBrandingSelect arg) {
        optimisticData.put(getKey("select"), arg);
        return this;
    }

    /**
    * The text fields customizations.
    */

    public CheckoutBrandingTextField getTextField() {
        return (CheckoutBrandingTextField) get("textField");
    }

    public CheckoutBrandingCustomizations setTextField(CheckoutBrandingTextField arg) {
        optimisticData.put(getKey("textField"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "buyerJourney": return true;

            case "cartLink": return true;

            case "checkbox": return true;

            case "choiceList": return true;

            case "content": return true;

            case "control": return true;

            case "divider": return true;

            case "expressCheckout": return true;

            case "favicon": return true;

            case "footer": return true;

            case "global": return true;

            case "header": return true;

            case "headingLevel1": return true;

            case "headingLevel2": return true;

            case "headingLevel3": return true;

            case "main": return true;

            case "merchandiseThumbnail": return true;

            case "orderSummary": return true;

            case "primaryButton": return true;

            case "secondaryButton": return true;

            case "select": return true;

            case "textField": return true;

            default: return false;
        }
    }
}

