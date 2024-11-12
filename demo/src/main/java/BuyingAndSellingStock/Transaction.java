package BuyingAndSellingStock;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long stockId;
    private LocalDate date;
    private String stockType; // BUY, SELL
    private Integer noOfStocks;
    private Double amount;
    private Double stockPerPrice;
}
