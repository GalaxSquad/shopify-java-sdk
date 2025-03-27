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
import java.util.List;

public class FulfillmentTrackingInput implements Serializable {
    private Input<String> number = Input.undefined();

    private Input<String> url = Input.undefined();

    private Input<String> company = Input.undefined();

    private Input<List<String>> numbers = Input.undefined();

    private Input<List<String>> urls = Input.undefined();

    public String getNumber() {
        return number.getValue();
    }

    public Input<String> getNumberInput() {
        return number;
    }

    public FulfillmentTrackingInput setNumber(String number) {
        this.number = Input.optional(number);
        return this;
    }

    public FulfillmentTrackingInput setNumberInput(Input<String> number) {
        if (number == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.number = number;
        return this;
    }

    public String getUrl() {
        return url.getValue();
    }

    public Input<String> getUrlInput() {
        return url;
    }

    public FulfillmentTrackingInput setUrl(String url) {
        this.url = Input.optional(url);
        return this;
    }

    public FulfillmentTrackingInput setUrlInput(Input<String> url) {
        if (url == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.url = url;
        return this;
    }

    public String getCompany() {
        return company.getValue();
    }

    public Input<String> getCompanyInput() {
        return company;
    }

    public FulfillmentTrackingInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    public FulfillmentTrackingInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    public List<String> getNumbers() {
        return numbers.getValue();
    }

    public Input<List<String>> getNumbersInput() {
        return numbers;
    }

    public FulfillmentTrackingInput setNumbers(List<String> numbers) {
        this.numbers = Input.optional(numbers);
        return this;
    }

    public FulfillmentTrackingInput setNumbersInput(Input<List<String>> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.numbers = numbers;
        return this;
    }

    public List<String> getUrls() {
        return urls.getValue();
    }

    public Input<List<String>> getUrlsInput() {
        return urls;
    }

    public FulfillmentTrackingInput setUrls(List<String> urls) {
        this.urls = Input.optional(urls);
        return this;
    }

    public FulfillmentTrackingInput setUrlsInput(Input<List<String>> urls) {
        if (urls == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urls = urls;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.number.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("number:");
            if (number.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, number.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.url.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url:");
            if (url.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, url.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.company.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("company:");
            if (company.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, company.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.numbers.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("numbers:");
            if (numbers.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : numbers.getValue()) {
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

        if (this.urls.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("urls:");
            if (urls.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : urls.getValue()) {
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
