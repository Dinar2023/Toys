import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
    ArrayList <Toy> toys = new ArrayList<Toy>();
    ViewCons viewCons = new ViewCons();
void start(){
    while (true) {
        String choise = viewCons.getUserChoise();
        if (choise.equals("1")) {
            Toy newToy = new Toy();
            String name = viewCons.setToyName();

            boolean containsName = false;
            for (Toy toy : toys) { //Игрушка с таким именем существует?
                if (toy.getName().equals(name)) {
                    containsName = true;
                    break;
                }
            }
            if (!containsName) { // Если ее нет, то добавляем ее в список игрушек
                newToy.setName(name);
                newToy.setChance(viewCons.setToyChance());
                newToy.setNumber(viewCons.setToyNumbers());
                toys.add(newToy);
            } else
                viewCons.printMessage("Игрушка с таким именем уже существует"); // Если такая игрушка есть, сообщаем пользователю
        }

        if (choise.equals("2")) {
            String name = viewCons.setToyName();
            boolean containsName = false;
            for (Toy toy : toys) { //Игрушка с таким именем существует?
                if (toy.getName().equals(name)) {
                    containsName = true;
                    toy.setChance(viewCons.setToyChance());
                    break;
                }
            }
            if (!containsName) viewCons.printMessage("Игрушка с таким именем не найдена");
        }

        if (choise.equals("3")) {
            String name = viewCons.setToyName();
            boolean containsName = false;
            for (Toy toy : toys) { //Игрушка с таким именем существует?
                if (toy.getName().equals(name)) {
                    containsName = true;
                    toy.setNumber(viewCons.setToyNumbers());
                    break;
                }
            }
            if (!containsName) viewCons.printMessage("Игрушка с таким именем не найдена");
        }

        if (choise.equals("4")) {
            ArrayList <Toy> setToys = new ArrayList<>();
            double totalChanse = 0; //разброс вероятности (сумма всех вероятностей)

            for (Toy toy : toys) { //Игрушка с таким именем существует?
                if (toy.getNumber()>0) {
                    totalChanse += toy.getChance();
                    setToys.add(toy); // Если игрушка есть, добавляем ее в список на розыгрыш
                }
            }
            for (Toy toy : setToys) {
                Random random = new Random();
                double kubik = random.nextDouble(totalChanse);
                System.out.println(kubik + "()_+_()" + totalChanse);
                if (kubik <= toy.getChance()) {
                    String name = toy.getName();
                    viewCons.printMessage("Вы выйграли "+ toy.getName());
                    toy.setNumber(toy.getNumber()-1);

//                    for (Toy toy1: toys){// Уменьшаем колличество игрушек
//                        if (toy1.getName().equals(name)) toy1.setNumber(toy1.getNumber()-1);
//                    }
//
//                    for (int i = 0; i < toys.size() ; i++) {
//                        if (toys.get(i).getName().equals(name)){
//                            int num = toys.get(i).getNumber()-1;
//                            System.out.println(num);
//                            toys.get(i).setNumber(num);
//                        }
//                    }

                    break;
                } else totalChanse -= toy.getChance();
            }
        }
        if (choise.equals("5")) {
            for (Toy toy : toys) {
                viewCons.printMessage(toy.toString());
            }

        }

        if (choise.equals("0")) break;

    }
}

}
