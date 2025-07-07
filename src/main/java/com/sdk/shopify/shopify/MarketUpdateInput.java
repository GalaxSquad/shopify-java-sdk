// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MarketUpdateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> handle = Input.undefined();

    private Input<MarketConditionsUpdateInput> conditions = Input.undefined();

    private Input<List<ID>> catalogsToAdd = Input.undefined();

    private Input<List<ID>> catalogsToDelete = Input.undefined();

    private Input<List<ID>> webPresencesToAdd = Input.undefined();

    private Input<List<ID>> webPresencesToDelete = Input.undefined();

    private Input<Boolean> makeDuplicateUniqueMarketsDraft = Input.undefined();

    private Input<MarketStatus> status = Input.undefined();

    private Input<MarketCurrencySettingsUpdateInput> currencySettings = Input.undefined();

    private Input<Boolean> removeCurrencySettings = Input.undefined();

    private Input<Boolean> removePriceInclusions = Input.undefined();

    private Input<MarketPriceInclusionsInput> priceInclusions = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public MarketUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MarketUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public MarketUpdateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public MarketUpdateInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public MarketConditionsUpdateInput getConditions() {
        return conditions.getValue();
    }

    public Input<MarketConditionsUpdateInput> getConditionsInput() {
        return conditions;
    }

    public MarketUpdateInput setConditions(MarketConditionsUpdateInput conditions) {
        this.conditions = Input.optional(conditions);
        return this;
    }

    public MarketUpdateInput setConditionsInput(Input<MarketConditionsUpdateInput> conditions) {
        if (conditions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditions = conditions;
        return this;
    }

    public List<ID> getCatalogsToAdd() {
        return catalogsToAdd.getValue();
    }

    public Input<List<ID>> getCatalogsToAddInput() {
        return catalogsToAdd;
    }

    public MarketUpdateInput setCatalogsToAdd(List<ID> catalogsToAdd) {
        this.catalogsToAdd = Input.optional(catalogsToAdd);
        return this;
    }

    public MarketUpdateInput setCatalogsToAddInput(Input<List<ID>> catalogsToAdd) {
        if (catalogsToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.catalogsToAdd = catalogsToAdd;
        return this;
    }

    public List<ID> getCatalogsToDelete() {
        return catalogsToDelete.getValue();
    }

    public Input<List<ID>> getCatalogsToDeleteInput() {
        return catalogsToDelete;
    }

    public MarketUpdateInput setCatalogsToDelete(List<ID> catalogsToDelete) {
        this.catalogsToDelete = Input.optional(catalogsToDelete);
        return this;
    }

    public MarketUpdateInput setCatalogsToDeleteInput(Input<List<ID>> catalogsToDelete) {
        if (catalogsToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.catalogsToDelete = catalogsToDelete;
        return this;
    }

    public List<ID> getWebPresencesToAdd() {
        return webPresencesToAdd.getValue();
    }

    public Input<List<ID>> getWebPresencesToAddInput() {
        return webPresencesToAdd;
    }

    public MarketUpdateInput setWebPresencesToAdd(List<ID> webPresencesToAdd) {
        this.webPresencesToAdd = Input.optional(webPresencesToAdd);
        return this;
    }

    public MarketUpdateInput setWebPresencesToAddInput(Input<List<ID>> webPresencesToAdd) {
        if (webPresencesToAdd == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.webPresencesToAdd = webPresencesToAdd;
        return this;
    }

    public List<ID> getWebPresencesToDelete() {
        return webPresencesToDelete.getValue();
    }

    public Input<List<ID>> getWebPresencesToDeleteInput() {
        return webPresencesToDelete;
    }

    public MarketUpdateInput setWebPresencesToDelete(List<ID> webPresencesToDelete) {
        this.webPresencesToDelete = Input.optional(webPresencesToDelete);
        return this;
    }

    public MarketUpdateInput setWebPresencesToDeleteInput(Input<List<ID>> webPresencesToDelete) {
        if (webPresencesToDelete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.webPresencesToDelete = webPresencesToDelete;
        return this;
    }

    public Boolean getMakeDuplicateUniqueMarketsDraft() {
        return makeDuplicateUniqueMarketsDraft.getValue();
    }

    public Input<Boolean> getMakeDuplicateUniqueMarketsDraftInput() {
        return makeDuplicateUniqueMarketsDraft;
    }

    public MarketUpdateInput setMakeDuplicateUniqueMarketsDraft(Boolean makeDuplicateUniqueMarketsDraft) {
        this.makeDuplicateUniqueMarketsDraft = Input.optional(makeDuplicateUniqueMarketsDraft);
        return this;
    }

    public MarketUpdateInput setMakeDuplicateUniqueMarketsDraftInput(Input<Boolean> makeDuplicateUniqueMarketsDraft) {
        if (makeDuplicateUniqueMarketsDraft == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.makeDuplicateUniqueMarketsDraft = makeDuplicateUniqueMarketsDraft;
        return this;
    }

    public MarketStatus getStatus() {
        return status.getValue();
    }

    public Input<MarketStatus> getStatusInput() {
        return status;
    }

    public MarketUpdateInput setStatus(MarketStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public MarketUpdateInput setStatusInput(Input<MarketStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public MarketCurrencySettingsUpdateInput getCurrencySettings() {
        return currencySettings.getValue();
    }

    public Input<MarketCurrencySettingsUpdateInput> getCurrencySettingsInput() {
        return currencySettings;
    }

    public MarketUpdateInput setCurrencySettings(MarketCurrencySettingsUpdateInput currencySettings) {
        this.currencySettings = Input.optional(currencySettings);
        return this;
    }

    public MarketUpdateInput setCurrencySettingsInput(Input<MarketCurrencySettingsUpdateInput> currencySettings) {
        if (currencySettings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currencySettings = currencySettings;
        return this;
    }

    public Boolean getRemoveCurrencySettings() {
        return removeCurrencySettings.getValue();
    }

    public Input<Boolean> getRemoveCurrencySettingsInput() {
        return removeCurrencySettings;
    }

    public MarketUpdateInput setRemoveCurrencySettings(Boolean removeCurrencySettings) {
        this.removeCurrencySettings = Input.optional(removeCurrencySettings);
        return this;
    }

    public MarketUpdateInput setRemoveCurrencySettingsInput(Input<Boolean> removeCurrencySettings) {
        if (removeCurrencySettings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.removeCurrencySettings = removeCurrencySettings;
        return this;
    }

    public Boolean getRemovePriceInclusions() {
        return removePriceInclusions.getValue();
    }

    public Input<Boolean> getRemovePriceInclusionsInput() {
        return removePriceInclusions;
    }

    public MarketUpdateInput setRemovePriceInclusions(Boolean removePriceInclusions) {
        this.removePriceInclusions = Input.optional(removePriceInclusions);
        return this;
    }

    public MarketUpdateInput setRemovePriceInclusionsInput(Input<Boolean> removePriceInclusions) {
        if (removePriceInclusions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.removePriceInclusions = removePriceInclusions;
        return this;
    }

    public MarketPriceInclusionsInput getPriceInclusions() {
        return priceInclusions.getValue();
    }

    public Input<MarketPriceInclusionsInput> getPriceInclusionsInput() {
        return priceInclusions;
    }

    public MarketUpdateInput setPriceInclusions(MarketPriceInclusionsInput priceInclusions) {
        this.priceInclusions = Input.optional(priceInclusions);
        return this;
    }

    public MarketUpdateInput setPriceInclusionsInput(Input<MarketPriceInclusionsInput> priceInclusions) {
        if (priceInclusions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceInclusions = priceInclusions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.handle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("handle:");
            if (handle.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, handle.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.conditions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("conditions:");
            if (conditions.getValue() != null) {
                conditions.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.catalogsToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("catalogsToAdd:");
            if (catalogsToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : catalogsToAdd.getValue()) {
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

        if (this.catalogsToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("catalogsToDelete:");
            if (catalogsToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : catalogsToDelete.getValue()) {
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

        if (this.webPresencesToAdd.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("webPresencesToAdd:");
            if (webPresencesToAdd.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : webPresencesToAdd.getValue()) {
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

        if (this.webPresencesToDelete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("webPresencesToDelete:");
            if (webPresencesToDelete.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : webPresencesToDelete.getValue()) {
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

        if (this.makeDuplicateUniqueMarketsDraft.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("makeDuplicateUniqueMarketsDraft:");
            if (makeDuplicateUniqueMarketsDraft.getValue() != null) {
                _queryBuilder.append(makeDuplicateUniqueMarketsDraft.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.currencySettings.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currencySettings:");
            if (currencySettings.getValue() != null) {
                currencySettings.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.removeCurrencySettings.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("removeCurrencySettings:");
            if (removeCurrencySettings.getValue() != null) {
                _queryBuilder.append(removeCurrencySettings.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.removePriceInclusions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("removePriceInclusions:");
            if (removePriceInclusions.getValue() != null) {
                _queryBuilder.append(removePriceInclusions.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.priceInclusions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceInclusions:");
            if (priceInclusions.getValue() != null) {
                priceInclusions.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
