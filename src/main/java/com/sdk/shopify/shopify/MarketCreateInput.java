// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class MarketCreateInput implements Serializable {
    private String name;

    private Input<String> handle = Input.undefined();

    private Input<MarketConditionsInput> conditions = Input.undefined();

    private Input<List<ID>> catalogs = Input.undefined();

    private Input<Boolean> makeDuplicateUniqueMarketsDraft = Input.undefined();

    private Input<MarketStatus> status = Input.undefined();

    private Input<List<ID>> webPresences = Input.undefined();

    private Input<MarketCurrencySettingsUpdateInput> currencySettings = Input.undefined();

    private Input<MarketPriceInclusionsInput> priceInclusions = Input.undefined();

    public MarketCreateInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MarketCreateInput setName(String name) {
        this.name = name;
        return this;
    }

    public String getHandle() {
        return handle.getValue();
    }

    public Input<String> getHandleInput() {
        return handle;
    }

    public MarketCreateInput setHandle(String handle) {
        this.handle = Input.optional(handle);
        return this;
    }

    public MarketCreateInput setHandleInput(Input<String> handle) {
        if (handle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.handle = handle;
        return this;
    }

    public MarketConditionsInput getConditions() {
        return conditions.getValue();
    }

    public Input<MarketConditionsInput> getConditionsInput() {
        return conditions;
    }

    public MarketCreateInput setConditions(MarketConditionsInput conditions) {
        this.conditions = Input.optional(conditions);
        return this;
    }

    public MarketCreateInput setConditionsInput(Input<MarketConditionsInput> conditions) {
        if (conditions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.conditions = conditions;
        return this;
    }

    public List<ID> getCatalogs() {
        return catalogs.getValue();
    }

    public Input<List<ID>> getCatalogsInput() {
        return catalogs;
    }

    public MarketCreateInput setCatalogs(List<ID> catalogs) {
        this.catalogs = Input.optional(catalogs);
        return this;
    }

    public MarketCreateInput setCatalogsInput(Input<List<ID>> catalogs) {
        if (catalogs == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.catalogs = catalogs;
        return this;
    }

    public Boolean getMakeDuplicateUniqueMarketsDraft() {
        return makeDuplicateUniqueMarketsDraft.getValue();
    }

    public Input<Boolean> getMakeDuplicateUniqueMarketsDraftInput() {
        return makeDuplicateUniqueMarketsDraft;
    }

    public MarketCreateInput setMakeDuplicateUniqueMarketsDraft(Boolean makeDuplicateUniqueMarketsDraft) {
        this.makeDuplicateUniqueMarketsDraft = Input.optional(makeDuplicateUniqueMarketsDraft);
        return this;
    }

    public MarketCreateInput setMakeDuplicateUniqueMarketsDraftInput(Input<Boolean> makeDuplicateUniqueMarketsDraft) {
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

    public MarketCreateInput setStatus(MarketStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public MarketCreateInput setStatusInput(Input<MarketStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public List<ID> getWebPresences() {
        return webPresences.getValue();
    }

    public Input<List<ID>> getWebPresencesInput() {
        return webPresences;
    }

    public MarketCreateInput setWebPresences(List<ID> webPresences) {
        this.webPresences = Input.optional(webPresences);
        return this;
    }

    public MarketCreateInput setWebPresencesInput(Input<List<ID>> webPresences) {
        if (webPresences == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.webPresences = webPresences;
        return this;
    }

    public MarketCurrencySettingsUpdateInput getCurrencySettings() {
        return currencySettings.getValue();
    }

    public Input<MarketCurrencySettingsUpdateInput> getCurrencySettingsInput() {
        return currencySettings;
    }

    public MarketCreateInput setCurrencySettings(MarketCurrencySettingsUpdateInput currencySettings) {
        this.currencySettings = Input.optional(currencySettings);
        return this;
    }

    public MarketCreateInput setCurrencySettingsInput(Input<MarketCurrencySettingsUpdateInput> currencySettings) {
        if (currencySettings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currencySettings = currencySettings;
        return this;
    }

    public MarketPriceInclusionsInput getPriceInclusions() {
        return priceInclusions.getValue();
    }

    public Input<MarketPriceInclusionsInput> getPriceInclusionsInput() {
        return priceInclusions;
    }

    public MarketCreateInput setPriceInclusions(MarketPriceInclusionsInput priceInclusions) {
        this.priceInclusions = Input.optional(priceInclusions);
        return this;
    }

    public MarketCreateInput setPriceInclusionsInput(Input<MarketPriceInclusionsInput> priceInclusions) {
        if (priceInclusions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceInclusions = priceInclusions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

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

        if (this.catalogs.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("catalogs:");
            if (catalogs.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : catalogs.getValue()) {
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

        if (this.webPresences.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("webPresences:");
            if (webPresences.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : webPresences.getValue()) {
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
