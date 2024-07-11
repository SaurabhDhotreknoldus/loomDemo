package cloudcode.loom.web.bookservice;

import java.util.List;

public record BestDealResult(RestCallStatistics timeStatistics, Book bestPriceDeal, List<Book> allDeals) {
}
