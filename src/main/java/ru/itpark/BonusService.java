package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int historyTotalAmount) {
        int result = 0;
        int blueLevelBonus = 50;
        int silverLevelBonus = 70;
        int goldLevelBonus = 100;
        int minPurchaseAmountForBonus = 1000;
        int maxHistoryTotalAmountForBlue = 15_000;
        int minPurchaseAmountForSilverBonus = 15_001;
        int maxHistoryTotalAmountForSilver = 150_000;
        int minPurchaseAmountForGold = 150_001;
        int purchaseSum = purchaseAmount + historyTotalAmount;
        int bonusIndex = purchaseAmount / minPurchaseAmountForBonus;

        if (purchaseSum >= minPurchaseAmountForBonus && purchaseSum <= maxHistoryTotalAmountForBlue) {
            System.out.println("Blue card");
            return bonusIndex * blueLevelBonus;
        }
        if (purchaseSum >= minPurchaseAmountForSilverBonus && purchaseSum <= maxHistoryTotalAmountForSilver) {
            System.out.println("Silver card");
            return bonusIndex * silverLevelBonus;
        }
        if (purchaseSum >= minPurchaseAmountForGold) {
            System.out.println("Gold card");
            return bonusIndex * goldLevelBonus;
        }
        return result;
    }
}
