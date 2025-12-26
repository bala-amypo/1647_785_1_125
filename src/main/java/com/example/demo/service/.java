public interface ProfitCalculationService {
    ProfitCalculationRecord calculateProfit(Long id);
    ProfitCalculationRecord getCalculationById(Long id);
}
