// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class QuantityPricingByVariantUpdateInput implements Serializable {
    private List<QuantityPriceBreakInput> quantityPriceBreaksToAdd;

    private List<ID> quantityPriceBreaksToDelete;

    private List<QuantityRuleInput> quantityRulesToAdd;

    private List<ID> quantityRulesToDeleteByVariantId;

    private List<PriceListPriceInput> pricesToAdd;

    private List<ID> pricesToDeleteByVariantId;

    private Input<List<ID>> quantityPriceBreaksToDeleteByVariantId = Input.undefined();

    public QuantityPricingByVariantUpdateInput(List<QuantityPriceBreakInput> quantityPriceBreaksToAdd, List<ID> quantityPriceBreaksToDelete, List<QuantityRuleInput> quantityRulesToAdd, List<ID> quantityRulesToDeleteByVariantId, List<PriceListPriceInput> pricesToAdd, List<ID> pricesToDeleteByVariantId) {
        this.quantityPriceBreaksToAdd = quantityPriceBreaksToAdd;

        this.quantityPriceBreaksToDelete = quantityPriceBreaksToDelete;

        this.quantityRulesToAdd = quantityRulesToAdd;

        this.quantityRulesToDeleteByVariantId = quantityRulesToDeleteByVariantId;

        this.pricesToAdd = pricesToAdd;

        this.pricesToDeleteByVariantId = pricesToDeleteByVariantId;
    }

    public List<QuantityPriceBreakInput> getQuantityPriceBreaksToAdd() {
        return quantityPriceBreaksToAdd;
    }

    public QuantityPricingByVariantUpdateInput setQuantityPriceBreaksToAdd(List<QuantityPriceBreakInput> quantityPriceBreaksToAdd) {
        this.quantityPriceBreaksToAdd = quantityPriceBreaksToAdd;
        return this;
    }

    public List<ID> getQuantityPriceBreaksToDelete() {
        return quantityPriceBreaksToDelete;
    }

    public QuantityPricingByVariantUpdateInput setQuantityPriceBreaksToDelete(List<ID> quantityPriceBreaksToDelete) {
        this.quantityPriceBreaksToDelete = quantityPriceBreaksToDelete;
        return this;
    }

    public List<QuantityRuleInput> getQuantityRulesToAdd() {
        return quantityRulesToAdd;
    }

    public QuantityPricingByVariantUpdateInput setQuantityRulesToAdd(List<QuantityRuleInput> quantityRulesToAdd) {
        this.quantityRulesToAdd = quantityRulesToAdd;
        return this;
    }

    public List<ID> getQuantityRulesToDeleteByVariantId() {
        return quantityRulesToDeleteByVariantId;
    }

    public QuantityPricingByVariantUpdateInput setQuantityRulesToDeleteByVariantId(List<ID> quantityRulesToDeleteByVariantId) {
        this.quantityRulesToDeleteByVariantId = quantityRulesToDeleteByVariantId;
        return this;
    }

    public List<PriceListPriceInput> getPricesToAdd() {
        return pricesToAdd;
    }

    public QuantityPricingByVariantUpdateInput setPricesToAdd(List<PriceListPriceInput> pricesToAdd) {
        this.pricesToAdd = pricesToAdd;
        return this;
    }

    public List<ID> getPricesToDeleteByVariantId() {
        return pricesToDeleteByVariantId;
    }

    public QuantityPricingByVariantUpdateInput setPricesToDeleteByVariantId(List<ID> pricesToDeleteByVariantId) {
        this.pricesToDeleteByVariantId = pricesToDeleteByVariantId;
        return this;
    }

    public List<ID> getQuantityPriceBreaksToDeleteByVariantId() {
        return quantityPriceBreaksToDeleteByVariantId.getValue();
    }

    public Input<List<ID>> getQuantityPriceBreaksToDeleteByVariantIdInput() {
        return quantityPriceBreaksToDeleteByVariantId;
    }

    public QuantityPricingByVariantUpdateInput setQuantityPriceBreaksToDeleteByVariantId(List<ID> quantityPriceBreaksToDeleteByVariantId) {
        this.quantityPriceBreaksToDeleteByVariantId = Input.optional(quantityPriceBreaksToDeleteByVariantId);
        return this;
    }

    public QuantityPricingByVariantUpdateInput setQuantityPriceBreaksToDeleteByVariantIdInput(Input<List<ID>> quantityPriceBreaksToDeleteByVariantId) {
        if (quantityPriceBreaksToDeleteByVariantId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantityPriceBreaksToDeleteByVariantId = quantityPriceBreaksToDeleteByVariantId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantityPriceBreaksToAdd:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (QuantityPriceBreakInput item1 : quantityPriceBreaksToAdd) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantityPriceBreaksToDelete:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : quantityPriceBreaksToDelete) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantityRulesToAdd:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (QuantityRuleInput item1 : quantityRulesToAdd) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantityRulesToDeleteByVariantId:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : quantityRulesToDeleteByVariantId) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("pricesToAdd:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PriceListPriceInput item1 : pricesToAdd) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("pricesToDeleteByVariantId:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : pricesToDeleteByVariantId) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        if (this.quantityPriceBreaksToDeleteByVariantId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantityPriceBreaksToDeleteByVariantId:");
            if (quantityPriceBreaksToDeleteByVariantId.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : quantityPriceBreaksToDeleteByVariantId.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
