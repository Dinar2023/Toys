import java.util.Scanner;

public class ViewCons {
    Scanner scanner = new Scanner(System.in);
    String getUserChoise (){

        System.out.println("""
                Введите что вы хотите сделать:
                1: Добавить игрушку
                2: Установить вероятность выпадения (от 0 до 100 включительно, Внимание:
                устанавливается не абсолютный шанс выпадения, а приоритет, относительно других игрушек)
                3: Добавить существующих игрушек (установить новое колличество)
                4: Устроить розыгрыш
                5: Посмотреть шансы выпадения каждой игрушки и их колличество
                0: Выход""");
        return scanner.nextLine();

    }

    String setToyName(){
        System.out.println("Введите имя игрушки");
        return scanner.nextLine();
    }

    int setToyNumbers(){
        System.out.println("Введите колличество игрушек");
        int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }

    double setToyChance(){
        while (true) {
            System.out.println("Введите шанс выпадения игрушки (от 0 до 100)");
            double res = scanner.nextDouble();
            scanner.nextLine();
            if (res>=0 && res <= 100) return res;
            else System.out.println("Не корректное число. Вероятност выпадения должна быть от 0 до 100");
        }
    }

    void printMessage(String text){
        System.out.println(text);
    }



}
