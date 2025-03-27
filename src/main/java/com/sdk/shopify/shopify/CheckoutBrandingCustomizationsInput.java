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

import java.io.Serializable;

public class CheckoutBrandingCustomizationsInput implements Serializable {
    private Input<CheckoutBrandingGlobalInput> global = Input.undefined();

    private Input<CheckoutBrandingHeaderInput> header = Input.undefined();

    private Input<CheckoutBrandingHeadingLevelInput> headingLevel1 = Input.undefined();

    private Input<CheckoutBrandingHeadingLevelInput> headingLevel2 = Input.undefined();

    private Input<CheckoutBrandingHeadingLevelInput> headingLevel3 = Input.undefined();

    private Input<CheckoutBrandingFooterInput> footer = Input.undefined();

    private Input<CheckoutBrandingMainInput> main = Input.undefined();

    private Input<CheckoutBrandingOrderSummaryInput> orderSummary = Input.undefined();

    private Input<CheckoutBrandingControlInput> control = Input.undefined();

    private Input<CheckoutBrandingTextFieldInput> textField = Input.undefined();

    private Input<CheckoutBrandingCheckboxInput> checkbox = Input.undefined();

    private Input<CheckoutBrandingSelectInput> select = Input.undefined();

    private Input<CheckoutBrandingButtonInput> primaryButton = Input.undefined();

    private Input<CheckoutBrandingButtonInput> secondaryButton = Input.undefined();

    private Input<CheckoutBrandingImageInput> favicon = Input.undefined();

    private Input<CheckoutBrandingChoiceListInput> choiceList = Input.undefined();

    private Input<CheckoutBrandingMerchandiseThumbnailInput> merchandiseThumbnail = Input.undefined();

    private Input<CheckoutBrandingExpressCheckoutInput> expressCheckout = Input.undefined();

    private Input<CheckoutBrandingContentInput> content = Input.undefined();

    private Input<CheckoutBrandingBuyerJourneyInput> buyerJourney = Input.undefined();

    private Input<CheckoutBrandingCartLinkInput> cartLink = Input.undefined();

    private Input<CheckoutBrandingDividerStyleInput> divider = Input.undefined();

    public CheckoutBrandingGlobalInput getGlobal() {
        return global.getValue();
    }

    public Input<CheckoutBrandingGlobalInput> getGlobalInput() {
        return global;
    }

    public CheckoutBrandingCustomizationsInput setGlobal(CheckoutBrandingGlobalInput global) {
        this.global = Input.optional(global);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setGlobalInput(Input<CheckoutBrandingGlobalInput> global) {
        if (global == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.global = global;
        return this;
    }

    public CheckoutBrandingHeaderInput getHeader() {
        return header.getValue();
    }

    public Input<CheckoutBrandingHeaderInput> getHeaderInput() {
        return header;
    }

    public CheckoutBrandingCustomizationsInput setHeader(CheckoutBrandingHeaderInput header) {
        this.header = Input.optional(header);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setHeaderInput(Input<CheckoutBrandingHeaderInput> header) {
        if (header == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.header = header;
        return this;
    }

    public CheckoutBrandingHeadingLevelInput getHeadingLevel1() {
        return headingLevel1.getValue();
    }

    public Input<CheckoutBrandingHeadingLevelInput> getHeadingLevel1Input() {
        return headingLevel1;
    }

    public CheckoutBrandingCustomizationsInput setHeadingLevel1(CheckoutBrandingHeadingLevelInput headingLevel1) {
        this.headingLevel1 = Input.optional(headingLevel1);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setHeadingLevel1Input(Input<CheckoutBrandingHeadingLevelInput> headingLevel1) {
        if (headingLevel1 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.headingLevel1 = headingLevel1;
        return this;
    }

    public CheckoutBrandingHeadingLevelInput getHeadingLevel2() {
        return headingLevel2.getValue();
    }

    public Input<CheckoutBrandingHeadingLevelInput> getHeadingLevel2Input() {
        return headingLevel2;
    }

    public CheckoutBrandingCustomizationsInput setHeadingLevel2(CheckoutBrandingHeadingLevelInput headingLevel2) {
        this.headingLevel2 = Input.optional(headingLevel2);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setHeadingLevel2Input(Input<CheckoutBrandingHeadingLevelInput> headingLevel2) {
        if (headingLevel2 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.headingLevel2 = headingLevel2;
        return this;
    }

    public CheckoutBrandingHeadingLevelInput getHeadingLevel3() {
        return headingLevel3.getValue();
    }

    public Input<CheckoutBrandingHeadingLevelInput> getHeadingLevel3Input() {
        return headingLevel3;
    }

    public CheckoutBrandingCustomizationsInput setHeadingLevel3(CheckoutBrandingHeadingLevelInput headingLevel3) {
        this.headingLevel3 = Input.optional(headingLevel3);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setHeadingLevel3Input(Input<CheckoutBrandingHeadingLevelInput> headingLevel3) {
        if (headingLevel3 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.headingLevel3 = headingLevel3;
        return this;
    }

    public CheckoutBrandingFooterInput getFooter() {
        return footer.getValue();
    }

    public Input<CheckoutBrandingFooterInput> getFooterInput() {
        return footer;
    }

    public CheckoutBrandingCustomizationsInput setFooter(CheckoutBrandingFooterInput footer) {
        this.footer = Input.optional(footer);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setFooterInput(Input<CheckoutBrandingFooterInput> footer) {
        if (footer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.footer = footer;
        return this;
    }

    public CheckoutBrandingMainInput getMain() {
        return main.getValue();
    }

    public Input<CheckoutBrandingMainInput> getMainInput() {
        return main;
    }

    public CheckoutBrandingCustomizationsInput setMain(CheckoutBrandingMainInput main) {
        this.main = Input.optional(main);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setMainInput(Input<CheckoutBrandingMainInput> main) {
        if (main == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.main = main;
        return this;
    }

    public CheckoutBrandingOrderSummaryInput getOrderSummary() {
        return orderSummary.getValue();
    }

    public Input<CheckoutBrandingOrderSummaryInput> getOrderSummaryInput() {
        return orderSummary;
    }

    public CheckoutBrandingCustomizationsInput setOrderSummary(CheckoutBrandingOrderSummaryInput orderSummary) {
        this.orderSummary = Input.optional(orderSummary);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setOrderSummaryInput(Input<CheckoutBrandingOrderSummaryInput> orderSummary) {
        if (orderSummary == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.orderSummary = orderSummary;
        return this;
    }

    public CheckoutBrandingControlInput getControl() {
        return control.getValue();
    }

    public Input<CheckoutBrandingControlInput> getControlInput() {
        return control;
    }

    public CheckoutBrandingCustomizationsInput setControl(CheckoutBrandingControlInput control) {
        this.control = Input.optional(control);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setControlInput(Input<CheckoutBrandingControlInput> control) {
        if (control == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.control = control;
        return this;
    }

    public CheckoutBrandingTextFieldInput getTextField() {
        return textField.getValue();
    }

    public Input<CheckoutBrandingTextFieldInput> getTextFieldInput() {
        return textField;
    }

    public CheckoutBrandingCustomizationsInput setTextField(CheckoutBrandingTextFieldInput textField) {
        this.textField = Input.optional(textField);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setTextFieldInput(Input<CheckoutBrandingTextFieldInput> textField) {
        if (textField == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.textField = textField;
        return this;
    }

    public CheckoutBrandingCheckboxInput getCheckbox() {
        return checkbox.getValue();
    }

    public Input<CheckoutBrandingCheckboxInput> getCheckboxInput() {
        return checkbox;
    }

    public CheckoutBrandingCustomizationsInput setCheckbox(CheckoutBrandingCheckboxInput checkbox) {
        this.checkbox = Input.optional(checkbox);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setCheckboxInput(Input<CheckoutBrandingCheckboxInput> checkbox) {
        if (checkbox == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.checkbox = checkbox;
        return this;
    }

    public CheckoutBrandingSelectInput getSelect() {
        return select.getValue();
    }

    public Input<CheckoutBrandingSelectInput> getSelectInput() {
        return select;
    }

    public CheckoutBrandingCustomizationsInput setSelect(CheckoutBrandingSelectInput select) {
        this.select = Input.optional(select);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setSelectInput(Input<CheckoutBrandingSelectInput> select) {
        if (select == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.select = select;
        return this;
    }

    public CheckoutBrandingButtonInput getPrimaryButton() {
        return primaryButton.getValue();
    }

    public Input<CheckoutBrandingButtonInput> getPrimaryButtonInput() {
        return primaryButton;
    }

    public CheckoutBrandingCustomizationsInput setPrimaryButton(CheckoutBrandingButtonInput primaryButton) {
        this.primaryButton = Input.optional(primaryButton);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setPrimaryButtonInput(Input<CheckoutBrandingButtonInput> primaryButton) {
        if (primaryButton == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.primaryButton = primaryButton;
        return this;
    }

    public CheckoutBrandingButtonInput getSecondaryButton() {
        return secondaryButton.getValue();
    }

    public Input<CheckoutBrandingButtonInput> getSecondaryButtonInput() {
        return secondaryButton;
    }

    public CheckoutBrandingCustomizationsInput setSecondaryButton(CheckoutBrandingButtonInput secondaryButton) {
        this.secondaryButton = Input.optional(secondaryButton);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setSecondaryButtonInput(Input<CheckoutBrandingButtonInput> secondaryButton) {
        if (secondaryButton == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.secondaryButton = secondaryButton;
        return this;
    }

    public CheckoutBrandingImageInput getFavicon() {
        return favicon.getValue();
    }

    public Input<CheckoutBrandingImageInput> getFaviconInput() {
        return favicon;
    }

    public CheckoutBrandingCustomizationsInput setFavicon(CheckoutBrandingImageInput favicon) {
        this.favicon = Input.optional(favicon);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setFaviconInput(Input<CheckoutBrandingImageInput> favicon) {
        if (favicon == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.favicon = favicon;
        return this;
    }

    public CheckoutBrandingChoiceListInput getChoiceList() {
        return choiceList.getValue();
    }

    public Input<CheckoutBrandingChoiceListInput> getChoiceListInput() {
        return choiceList;
    }

    public CheckoutBrandingCustomizationsInput setChoiceList(CheckoutBrandingChoiceListInput choiceList) {
        this.choiceList = Input.optional(choiceList);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setChoiceListInput(Input<CheckoutBrandingChoiceListInput> choiceList) {
        if (choiceList == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.choiceList = choiceList;
        return this;
    }

    public CheckoutBrandingMerchandiseThumbnailInput getMerchandiseThumbnail() {
        return merchandiseThumbnail.getValue();
    }

    public Input<CheckoutBrandingMerchandiseThumbnailInput> getMerchandiseThumbnailInput() {
        return merchandiseThumbnail;
    }

    public CheckoutBrandingCustomizationsInput setMerchandiseThumbnail(CheckoutBrandingMerchandiseThumbnailInput merchandiseThumbnail) {
        this.merchandiseThumbnail = Input.optional(merchandiseThumbnail);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setMerchandiseThumbnailInput(Input<CheckoutBrandingMerchandiseThumbnailInput> merchandiseThumbnail) {
        if (merchandiseThumbnail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.merchandiseThumbnail = merchandiseThumbnail;
        return this;
    }

    public CheckoutBrandingExpressCheckoutInput getExpressCheckout() {
        return expressCheckout.getValue();
    }

    public Input<CheckoutBrandingExpressCheckoutInput> getExpressCheckoutInput() {
        return expressCheckout;
    }

    public CheckoutBrandingCustomizationsInput setExpressCheckout(CheckoutBrandingExpressCheckoutInput expressCheckout) {
        this.expressCheckout = Input.optional(expressCheckout);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setExpressCheckoutInput(Input<CheckoutBrandingExpressCheckoutInput> expressCheckout) {
        if (expressCheckout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expressCheckout = expressCheckout;
        return this;
    }

    public CheckoutBrandingContentInput getContent() {
        return content.getValue();
    }

    public Input<CheckoutBrandingContentInput> getContentInput() {
        return content;
    }

    public CheckoutBrandingCustomizationsInput setContent(CheckoutBrandingContentInput content) {
        this.content = Input.optional(content);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setContentInput(Input<CheckoutBrandingContentInput> content) {
        if (content == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.content = content;
        return this;
    }

    public CheckoutBrandingBuyerJourneyInput getBuyerJourney() {
        return buyerJourney.getValue();
    }

    public Input<CheckoutBrandingBuyerJourneyInput> getBuyerJourneyInput() {
        return buyerJourney;
    }

    public CheckoutBrandingCustomizationsInput setBuyerJourney(CheckoutBrandingBuyerJourneyInput buyerJourney) {
        this.buyerJourney = Input.optional(buyerJourney);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setBuyerJourneyInput(Input<CheckoutBrandingBuyerJourneyInput> buyerJourney) {
        if (buyerJourney == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.buyerJourney = buyerJourney;
        return this;
    }

    public CheckoutBrandingCartLinkInput getCartLink() {
        return cartLink.getValue();
    }

    public Input<CheckoutBrandingCartLinkInput> getCartLinkInput() {
        return cartLink;
    }

    public CheckoutBrandingCustomizationsInput setCartLink(CheckoutBrandingCartLinkInput cartLink) {
        this.cartLink = Input.optional(cartLink);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setCartLinkInput(Input<CheckoutBrandingCartLinkInput> cartLink) {
        if (cartLink == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cartLink = cartLink;
        return this;
    }

    public CheckoutBrandingDividerStyleInput getDivider() {
        return divider.getValue();
    }

    public Input<CheckoutBrandingDividerStyleInput> getDividerInput() {
        return divider;
    }

    public CheckoutBrandingCustomizationsInput setDivider(CheckoutBrandingDividerStyleInput divider) {
        this.divider = Input.optional(divider);
        return this;
    }

    public CheckoutBrandingCustomizationsInput setDividerInput(Input<CheckoutBrandingDividerStyleInput> divider) {
        if (divider == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.divider = divider;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.global.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("global:");
            if (global.getValue() != null) {
                global.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.header.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("header:");
            if (header.getValue() != null) {
                header.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.headingLevel1.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("headingLevel1:");
            if (headingLevel1.getValue() != null) {
                headingLevel1.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.headingLevel2.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("headingLevel2:");
            if (headingLevel2.getValue() != null) {
                headingLevel2.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.headingLevel3.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("headingLevel3:");
            if (headingLevel3.getValue() != null) {
                headingLevel3.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.footer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("footer:");
            if (footer.getValue() != null) {
                footer.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.main.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("main:");
            if (main.getValue() != null) {
                main.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.orderSummary.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("orderSummary:");
            if (orderSummary.getValue() != null) {
                orderSummary.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.control.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("control:");
            if (control.getValue() != null) {
                control.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.textField.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("textField:");
            if (textField.getValue() != null) {
                textField.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.checkbox.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("checkbox:");
            if (checkbox.getValue() != null) {
                checkbox.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.select.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("select:");
            if (select.getValue() != null) {
                select.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.primaryButton.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("primaryButton:");
            if (primaryButton.getValue() != null) {
                primaryButton.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.secondaryButton.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("secondaryButton:");
            if (secondaryButton.getValue() != null) {
                secondaryButton.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.favicon.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("favicon:");
            if (favicon.getValue() != null) {
                favicon.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.choiceList.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("choiceList:");
            if (choiceList.getValue() != null) {
                choiceList.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.merchandiseThumbnail.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("merchandiseThumbnail:");
            if (merchandiseThumbnail.getValue() != null) {
                merchandiseThumbnail.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.expressCheckout.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("expressCheckout:");
            if (expressCheckout.getValue() != null) {
                expressCheckout.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.content.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("content:");
            if (content.getValue() != null) {
                content.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.buyerJourney.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("buyerJourney:");
            if (buyerJourney.getValue() != null) {
                buyerJourney.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cartLink.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cartLink:");
            if (cartLink.getValue() != null) {
                cartLink.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.divider.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("divider:");
            if (divider.getValue() != null) {
                divider.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
