import java.util.Scanner;

public class View {
    Presenter presenter = new Presenter();
    public void mainMenu(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag){
            System.out.println("Введите пункт меню");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Вывести игрушки по вероятности их выпадения");
            System.out.println("3. Запись игрушек в файл");
            // TODO игрушку которую хотят выиграть
            System.out.println("4. Выход из программы");
            String choice = scanner.nextLine();
            switch (choice){
                case ("1"):
                    System.out.println("Введите название игрушки");
                    String nameToy = scanner.nextLine();
                    System.out.println("Введите вес игрушки");
                    // TODO проверка на число
                    String lossRateStr = scanner.nextLine();
                    Double lossRate = Double.parseDouble(lossRateStr);
                    presenter.addToyPr(nameToy,lossRate);
                    break;
                case ("2"):
                    //presenter.printToyPr();
                    System.out.println(presenter.textTopPr());
                    break;
                case ("3"):
                    SaveFile sF = new SaveFile();
                    sF.saveFile(presenter.textTopPr().toString());
                    break;
                case ("4"):
                    flag=false;
                default:
                    if (flag){
                        System.out.println("Выбрали не правильный пункт меню");
                        System.out.println("Выберите правильный пункт меню");
                    } else {
                        System.out.println("Выход из программы");
                    }

            }
        }
    }
}

