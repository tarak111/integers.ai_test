package BuyingAndSellingStock;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;
    private Long stockId;
    private Integer noOfStocks;
    private Double amount;
    private Double stockPerPrice;
    private LocalDate date;
    private String stockType; // BUY, SELL
}
