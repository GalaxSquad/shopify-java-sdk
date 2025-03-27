// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class DiscountCountriesInput implements Serializable {
    private Input<List<CountryCode>> add = Input.undefined();

    private Input<List<CountryCode>> remove = Input.undefined();

    private Input<Boolean> includeRestOfWorld = Input.undefined();

    public List<CountryCode> getAdd() {
        return add.getValue();
    }

    public Input<List<CountryCode>> getAddInput() {
        return add;
    }

    public DiscountCountriesInput setAdd(List<CountryCode> add) {
        this.add = Input.optional(add);
        return this;
    }

    public DiscountCountriesInput setAddInput(Input<List<CountryCode>> add) {
        if (add == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.add = add;
        return this;
    }

    public List<CountryCode> getRemove() {
        return remove.getValue();
    }

    public Input<List<CountryCode>> getRemoveInput() {
        return remove;
    }

    public DiscountCountriesInput setRemove(List<CountryCode> remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public DiscountCountriesInput setRemoveInput(Input<List<CountryCode>> remove) {
        if (remove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remove = remove;
        return this;
    }

    public Boolean getIncludeRestOfWorld() {
        return includeRestOfWorld.getValue();
    }

    public Input<Boolean> getIncludeRestOfWorldInput() {
        return includeRestOfWorld;
    }

    public DiscountCountriesInput setIncludeRestOfWorld(Boolean includeRestOfWorld) {
        this.includeRestOfWorld = Input.optional(includeRestOfWorld);
        return this;
    }

    public DiscountCountriesInput setIncludeRestOfWorldInput(Input<Boolean> includeRestOfWorld) {
        if (includeRestOfWorld == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.includeRestOfWorld = includeRestOfWorld;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.add.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("add:");
            if (add.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CountryCode item1 : add.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remove:");
            if (remove.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CountryCode item1 : remove.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.includeRestOfWorld.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("includeRestOfWorld:");
            if (includeRestOfWorld.getValue() != null) {
                _queryBuilder.append(includeRestOfWorld.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
