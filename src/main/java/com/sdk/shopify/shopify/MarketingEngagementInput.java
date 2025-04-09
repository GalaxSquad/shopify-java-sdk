// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class MarketingEngagementInput implements Serializable {
    private String occurredOn;

    private boolean isCumulative;

    private String utcOffset;

    private Input<Integer> impressionsCount = Input.undefined();

    private Input<Integer> viewsCount = Input.undefined();

    private Input<Integer> clicksCount = Input.undefined();

    private Input<Integer> sharesCount = Input.undefined();

    private Input<Integer> favoritesCount = Input.undefined();

    private Input<Integer> commentsCount = Input.undefined();

    private Input<Integer> unsubscribesCount = Input.undefined();

    private Input<Integer> complaintsCount = Input.undefined();

    private Input<Integer> failsCount = Input.undefined();

    private Input<Integer> sendsCount = Input.undefined();

    private Input<Integer> uniqueViewsCount = Input.undefined();

    private Input<Integer> uniqueClicksCount = Input.undefined();

    private Input<MoneyInput> adSpend = Input.undefined();

    private Input<MoneyInput> sales = Input.undefined();

    private Input<Integer> sessionsCount = Input.undefined();

    private Input<BigDecimal> orders = Input.undefined();

    private Input<BigDecimal> firstTimeCustomers = Input.undefined();

    private Input<BigDecimal> returningCustomers = Input.undefined();

    public MarketingEngagementInput(String occurredOn, boolean isCumulative, String utcOffset) {
        this.occurredOn = occurredOn;

        this.isCumulative = isCumulative;

        this.utcOffset = utcOffset;
    }

    public String getOccurredOn() {
        return occurredOn;
    }

    public MarketingEngagementInput setOccurredOn(String occurredOn) {
        this.occurredOn = occurredOn;
        return this;
    }

    public boolean getIsCumulative() {
        return isCumulative;
    }

    public MarketingEngagementInput setIsCumulative(boolean isCumulative) {
        this.isCumulative = isCumulative;
        return this;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public MarketingEngagementInput setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    public Integer getImpressionsCount() {
        return impressionsCount.getValue();
    }

    public Input<Integer> getImpressionsCountInput() {
        return impressionsCount;
    }

    public MarketingEngagementInput setImpressionsCount(Integer impressionsCount) {
        this.impressionsCount = Input.optional(impressionsCount);
        return this;
    }

    public MarketingEngagementInput setImpressionsCountInput(Input<Integer> impressionsCount) {
        if (impressionsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.impressionsCount = impressionsCount;
        return this;
    }

    public Integer getViewsCount() {
        return viewsCount.getValue();
    }

    public Input<Integer> getViewsCountInput() {
        return viewsCount;
    }

    public MarketingEngagementInput setViewsCount(Integer viewsCount) {
        this.viewsCount = Input.optional(viewsCount);
        return this;
    }

    public MarketingEngagementInput setViewsCountInput(Input<Integer> viewsCount) {
        if (viewsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.viewsCount = viewsCount;
        return this;
    }

    public Integer getClicksCount() {
        return clicksCount.getValue();
    }

    public Input<Integer> getClicksCountInput() {
        return clicksCount;
    }

    public MarketingEngagementInput setClicksCount(Integer clicksCount) {
        this.clicksCount = Input.optional(clicksCount);
        return this;
    }

    public MarketingEngagementInput setClicksCountInput(Input<Integer> clicksCount) {
        if (clicksCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clicksCount = clicksCount;
        return this;
    }

    public Integer getSharesCount() {
        return sharesCount.getValue();
    }

    public Input<Integer> getSharesCountInput() {
        return sharesCount;
    }

    public MarketingEngagementInput setSharesCount(Integer sharesCount) {
        this.sharesCount = Input.optional(sharesCount);
        return this;
    }

    public MarketingEngagementInput setSharesCountInput(Input<Integer> sharesCount) {
        if (sharesCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sharesCount = sharesCount;
        return this;
    }

    public Integer getFavoritesCount() {
        return favoritesCount.getValue();
    }

    public Input<Integer> getFavoritesCountInput() {
        return favoritesCount;
    }

    public MarketingEngagementInput setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = Input.optional(favoritesCount);
        return this;
    }

    public MarketingEngagementInput setFavoritesCountInput(Input<Integer> favoritesCount) {
        if (favoritesCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.favoritesCount = favoritesCount;
        return this;
    }

    public Integer getCommentsCount() {
        return commentsCount.getValue();
    }

    public Input<Integer> getCommentsCountInput() {
        return commentsCount;
    }

    public MarketingEngagementInput setCommentsCount(Integer commentsCount) {
        this.commentsCount = Input.optional(commentsCount);
        return this;
    }

    public MarketingEngagementInput setCommentsCountInput(Input<Integer> commentsCount) {
        if (commentsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.commentsCount = commentsCount;
        return this;
    }

    public Integer getUnsubscribesCount() {
        return unsubscribesCount.getValue();
    }

    public Input<Integer> getUnsubscribesCountInput() {
        return unsubscribesCount;
    }

    public MarketingEngagementInput setUnsubscribesCount(Integer unsubscribesCount) {
        this.unsubscribesCount = Input.optional(unsubscribesCount);
        return this;
    }

    public MarketingEngagementInput setUnsubscribesCountInput(Input<Integer> unsubscribesCount) {
        if (unsubscribesCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.unsubscribesCount = unsubscribesCount;
        return this;
    }

    public Integer getComplaintsCount() {
        return complaintsCount.getValue();
    }

    public Input<Integer> getComplaintsCountInput() {
        return complaintsCount;
    }

    public MarketingEngagementInput setComplaintsCount(Integer complaintsCount) {
        this.complaintsCount = Input.optional(complaintsCount);
        return this;
    }

    public MarketingEngagementInput setComplaintsCountInput(Input<Integer> complaintsCount) {
        if (complaintsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.complaintsCount = complaintsCount;
        return this;
    }

    public Integer getFailsCount() {
        return failsCount.getValue();
    }

    public Input<Integer> getFailsCountInput() {
        return failsCount;
    }

    public MarketingEngagementInput setFailsCount(Integer failsCount) {
        this.failsCount = Input.optional(failsCount);
        return this;
    }

    public MarketingEngagementInput setFailsCountInput(Input<Integer> failsCount) {
        if (failsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.failsCount = failsCount;
        return this;
    }

    public Integer getSendsCount() {
        return sendsCount.getValue();
    }

    public Input<Integer> getSendsCountInput() {
        return sendsCount;
    }

    public MarketingEngagementInput setSendsCount(Integer sendsCount) {
        this.sendsCount = Input.optional(sendsCount);
        return this;
    }

    public MarketingEngagementInput setSendsCountInput(Input<Integer> sendsCount) {
        if (sendsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sendsCount = sendsCount;
        return this;
    }

    public Integer getUniqueViewsCount() {
        return uniqueViewsCount.getValue();
    }

    public Input<Integer> getUniqueViewsCountInput() {
        return uniqueViewsCount;
    }

    public MarketingEngagementInput setUniqueViewsCount(Integer uniqueViewsCount) {
        this.uniqueViewsCount = Input.optional(uniqueViewsCount);
        return this;
    }

    public MarketingEngagementInput setUniqueViewsCountInput(Input<Integer> uniqueViewsCount) {
        if (uniqueViewsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uniqueViewsCount = uniqueViewsCount;
        return this;
    }

    public Integer getUniqueClicksCount() {
        return uniqueClicksCount.getValue();
    }

    public Input<Integer> getUniqueClicksCountInput() {
        return uniqueClicksCount;
    }

    public MarketingEngagementInput setUniqueClicksCount(Integer uniqueClicksCount) {
        this.uniqueClicksCount = Input.optional(uniqueClicksCount);
        return this;
    }

    public MarketingEngagementInput setUniqueClicksCountInput(Input<Integer> uniqueClicksCount) {
        if (uniqueClicksCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uniqueClicksCount = uniqueClicksCount;
        return this;
    }

    public MoneyInput getAdSpend() {
        return adSpend.getValue();
    }

    public Input<MoneyInput> getAdSpendInput() {
        return adSpend;
    }

    public MarketingEngagementInput setAdSpend(MoneyInput adSpend) {
        this.adSpend = Input.optional(adSpend);
        return this;
    }

    public MarketingEngagementInput setAdSpendInput(Input<MoneyInput> adSpend) {
        if (adSpend == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.adSpend = adSpend;
        return this;
    }

    public MoneyInput getSales() {
        return sales.getValue();
    }

    public Input<MoneyInput> getSalesInput() {
        return sales;
    }

    public MarketingEngagementInput setSales(MoneyInput sales) {
        this.sales = Input.optional(sales);
        return this;
    }

    public MarketingEngagementInput setSalesInput(Input<MoneyInput> sales) {
        if (sales == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sales = sales;
        return this;
    }

    public Integer getSessionsCount() {
        return sessionsCount.getValue();
    }

    public Input<Integer> getSessionsCountInput() {
        return sessionsCount;
    }

    public MarketingEngagementInput setSessionsCount(Integer sessionsCount) {
        this.sessionsCount = Input.optional(sessionsCount);
        return this;
    }

    public MarketingEngagementInput setSessionsCountInput(Input<Integer> sessionsCount) {
        if (sessionsCount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sessionsCount = sessionsCount;
        return this;
    }

    public BigDecimal getOrders() {
        return orders.getValue();
    }

    public Input<BigDecimal> getOrdersInput() {
        return orders;
    }

    public MarketingEngagementInput setOrders(BigDecimal orders) {
        this.orders = Input.optional(orders);
        return this;
    }

    public MarketingEngagementInput setOrdersInput(Input<BigDecimal> orders) {
        if (orders == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.orders = orders;
        return this;
    }

    public BigDecimal getFirstTimeCustomers() {
        return firstTimeCustomers.getValue();
    }

    public Input<BigDecimal> getFirstTimeCustomersInput() {
        return firstTimeCustomers;
    }

    public MarketingEngagementInput setFirstTimeCustomers(BigDecimal firstTimeCustomers) {
        this.firstTimeCustomers = Input.optional(firstTimeCustomers);
        return this;
    }

    public MarketingEngagementInput setFirstTimeCustomersInput(Input<BigDecimal> firstTimeCustomers) {
        if (firstTimeCustomers == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstTimeCustomers = firstTimeCustomers;
        return this;
    }

    public BigDecimal getReturningCustomers() {
        return returningCustomers.getValue();
    }

    public Input<BigDecimal> getReturningCustomersInput() {
        return returningCustomers;
    }

    public MarketingEngagementInput setReturningCustomers(BigDecimal returningCustomers) {
        this.returningCustomers = Input.optional(returningCustomers);
        return this;
    }

    public MarketingEngagementInput setReturningCustomersInput(Input<BigDecimal> returningCustomers) {
        if (returningCustomers == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.returningCustomers = returningCustomers;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("occurredOn:");
        Query.appendQuotedString(_queryBuilder, occurredOn.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("isCumulative:");
        _queryBuilder.append(isCumulative);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("utcOffset:");
        Query.appendQuotedString(_queryBuilder, utcOffset.toString());

        if (this.impressionsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("impressionsCount:");
            if (impressionsCount.getValue() != null) {
                _queryBuilder.append(impressionsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.viewsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("viewsCount:");
            if (viewsCount.getValue() != null) {
                _queryBuilder.append(viewsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.clicksCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("clicksCount:");
            if (clicksCount.getValue() != null) {
                _queryBuilder.append(clicksCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sharesCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sharesCount:");
            if (sharesCount.getValue() != null) {
                _queryBuilder.append(sharesCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.favoritesCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("favoritesCount:");
            if (favoritesCount.getValue() != null) {
                _queryBuilder.append(favoritesCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.commentsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("commentsCount:");
            if (commentsCount.getValue() != null) {
                _queryBuilder.append(commentsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.unsubscribesCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("unsubscribesCount:");
            if (unsubscribesCount.getValue() != null) {
                _queryBuilder.append(unsubscribesCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.complaintsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("complaintsCount:");
            if (complaintsCount.getValue() != null) {
                _queryBuilder.append(complaintsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.failsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("failsCount:");
            if (failsCount.getValue() != null) {
                _queryBuilder.append(failsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sendsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sendsCount:");
            if (sendsCount.getValue() != null) {
                _queryBuilder.append(sendsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uniqueViewsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uniqueViewsCount:");
            if (uniqueViewsCount.getValue() != null) {
                _queryBuilder.append(uniqueViewsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uniqueClicksCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uniqueClicksCount:");
            if (uniqueClicksCount.getValue() != null) {
                _queryBuilder.append(uniqueClicksCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.adSpend.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("adSpend:");
            if (adSpend.getValue() != null) {
                adSpend.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sales.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sales:");
            if (sales.getValue() != null) {
                sales.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sessionsCount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sessionsCount:");
            if (sessionsCount.getValue() != null) {
                _queryBuilder.append(sessionsCount.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.orders.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("orders:");
            if (orders.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, orders.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.firstTimeCustomers.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("firstTimeCustomers:");
            if (firstTimeCustomers.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, firstTimeCustomers.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.returningCustomers.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("returningCustomers:");
            if (returningCustomers.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, returningCustomers.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
