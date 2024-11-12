package BuyingAndSellingStock;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public Stock buyStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock sellStock(Long stockId) {
        Optional<Stock> stock = stockRepository.findById(stockId);
        if(stock.isPresent() && stock.get().getTotalNoOfStocks() > 0) {
            stock.get().setTotalNoOfStocks(stock.get().getTotalNoOfStocks() - 1);
            return stockRepository.save(stock.get());
        }
        return null;
    }
}
