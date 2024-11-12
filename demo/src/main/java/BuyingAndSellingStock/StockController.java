package BuyingAndSellingStock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("/buy")
    public Stock buyStock(@RequestBody Stock stock) {
        return stockService.buyStock(stock);
    }

    @PostMapping("/sell/{stockId}")
    public Stock sellStock(@PathVariable Long stockId) {
        return stockService.sellStock(stockId);
    }
}
