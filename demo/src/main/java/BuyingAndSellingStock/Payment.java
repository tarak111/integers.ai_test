package BuyingAndSellingStock;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentMode; // UPI, NFT
    private Long userId;
    private String paymentStatus; // ENUM (PENDING, COMPLETED)
    private Long stockId;
    private Double paymentAmount;
    private LocalDate date;
}
