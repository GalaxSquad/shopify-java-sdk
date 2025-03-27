// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SellingPlanAnchorInput implements Serializable {
    private Input<SellingPlanAnchorType> type = Input.undefined();

    private Input<Integer> day = Input.undefined();

    private Input<Integer> month = Input.undefined();

    private Input<Integer> cutoffDay = Input.undefined();

    public SellingPlanAnchorType getType() {
        return type.getValue();
    }

    public Input<SellingPlanAnchorType> getTypeInput() {
        return type;
    }

    public SellingPlanAnchorInput setType(SellingPlanAnchorType type) {
        this.type = Input.optional(type);
        return this;
    }

    public SellingPlanAnchorInput setTypeInput(Input<SellingPlanAnchorType> type) {
        if (type == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.type = type;
        return this;
    }

    public Integer getDay() {
        return day.getValue();
    }

    public Input<Integer> getDayInput() {
        return day;
    }

    public SellingPlanAnchorInput setDay(Integer day) {
        this.day = Input.optional(day);
        return this;
    }

    public SellingPlanAnchorInput setDayInput(Input<Integer> day) {
        if (day == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.day = day;
        return this;
    }

    public Integer getMonth() {
        return month.getValue();
    }

    public Input<Integer> getMonthInput() {
        return month;
    }

    public SellingPlanAnchorInput setMonth(Integer month) {
        this.month = Input.optional(month);
        return this;
    }

    public SellingPlanAnchorInput setMonthInput(Input<Integer> month) {
        if (month == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.month = month;
        return this;
    }

    public Integer getCutoffDay() {
        return cutoffDay.getValue();
    }

    public Input<Integer> getCutoffDayInput() {
        return cutoffDay;
    }

    public SellingPlanAnchorInput setCutoffDay(Integer cutoffDay) {
        this.cutoffDay = Input.optional(cutoffDay);
        return this;
    }

    public SellingPlanAnchorInput setCutoffDayInput(Input<Integer> cutoffDay) {
        if (cutoffDay == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cutoffDay = cutoffDay;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.type.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("type:");
            if (type.getValue() != null) {
                _queryBuilder.append(type.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.day.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("day:");
            if (day.getValue() != null) {
                _queryBuilder.append(day.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.month.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("month:");
            if (month.getValue() != null) {
                _queryBuilder.append(month.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cutoffDay.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cutoffDay:");
            if (cutoffDay.getValue() != null) {
                _queryBuilder.append(cutoffDay.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
