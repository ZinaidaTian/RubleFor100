public class Main {
    public static void main(String[] args) {
        int AccountOfCostumer = 100;
        int BonusSum = 100;
        int FinalAmount = 1400;
        int bonus;

        if (FinalAmount >= 1000) {
            bonus = FinalAmount / BonusSum;
        } else {
            bonus = 0;
        }

        int totalAccount = AccountOfCostumer + FinalAmount + bonus;

        System.out.println("�� ��������� ���� �� " + FinalAmount + " ���.");
        System.out.println("��� ����� �������� " + bonus + " ���.");
        System.out.println("��� ������ " + totalAccount + " ���.");
    }
}