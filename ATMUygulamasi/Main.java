package ATMUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price = 0;

        while (right>0){
            System.out.print("Kullanıcı adınız : ");
            userName = scan.nextLine();
            System.out.print("Parolanız : ");
            password = scan.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yapma");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = scan.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = scan.nextInt();
                            if (price > balance){
                                System.out.println("Yetersiz bakiye");
                            }else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }
        }
    }
}
