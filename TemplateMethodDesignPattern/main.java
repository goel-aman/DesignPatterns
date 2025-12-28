package TemplateMethodDesignPattern;

public class main {
    public static void main(String[] args) {
        SendMoneyTemplate sendMoneyToFriend = new PayToFriend();
        SendMoneyTemplate sendoneyToVendor = new PayToVendor();

        sendMoneyToFriend.sendMoney();
        System.out.println("---------------");
        sendoneyToVendor.sendMoney();
    }
}
