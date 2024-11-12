package BuyingAndSellingStock;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private UserRepository userRepository;

    public Payment addPayment(Payment payment) {
        payment.setPaymentStatus("PENDING");
        payment.setDate(LocalDate.now());
        return paymentRepository.save(payment);
    }

    public String withdraw(Long userId, Double amount) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setBalance(user.getBalance() - amount);
            userRepository.save(user);
            return "Withdrawal successful!";
        } else {
            return "User not found!";
        }
    }
}
