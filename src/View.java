import java.util.Scanner;

public class View {
    Presenter presenter = new Presenter();
    Scanner scanner = new Scanner(System.in);
    SaveFile sF = new SaveFile();
    public void mainMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("Введите пункт меню");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Вывести список разыгрываемых игрушек");
            System.out.println("3. Разыграть игрушку");
            System.out.println("4. Выход из программы");
            String choice = scanner.nextLine();
            switch (choice){
                case ("1"):
                    System.out.println("Введите название игрушки");
                    String nameToy = scanner.nextLine();
                    // TODO проверка на число
                    System.out.println("Введите вес игрушки от 0 до 100");
                    String lossRateStr = scanner.nextLine();
                    Double lossRate = Double.parseDouble(lossRateStr);
                    while (lossRate<0 || lossRate>100){
                        System.out.println("Вы ввели неправильный вес игрушки");
                        System.out.println("Введите вес игрушки от 0 до 100");
                        lossRateStr = scanner.nextLine();
                        lossRate = Double.parseDouble(lossRateStr);
                    }
                    presenter.addToyPr(nameToy,lossRate);
                    break;
                case ("2"):
                    String textToy = presenter.textTopPr().toString();
                    if (textToy.isEmpty()){
                        System.out.println("Игрушек нет");
                    }else {
                        System.out.println(textToy);
                    }
                    break;
                case ("3"):
                    try {
                        String raffleToy = presenter.raffleToysPr().toString();
                        System.out.println("Вы выиграли (" + raffleToy + ")");
                        sF.saveFile(raffleToy + "\n");
                    } catch (NullPointerException e) {
                        System.out.println("Разыгрывать нечего");
                }
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

