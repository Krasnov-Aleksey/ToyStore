import java.util.Scanner;

public class View {
    Presenter presenter = new Presenter();
    Scanner scanner = new Scanner(System.in);
    SaveFile sF = new SaveFile();
    IsNumeric isNumeric = new IsNumeric();
    // TODO text to class
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
                    Double lossRate = null;
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println("Введите вес игрушки от 0 до 100");
                        String lossRateStr = scanner.nextLine();
                        if(isNumeric.isNumeric(lossRateStr)){
                            lossRate = Double.parseDouble(lossRateStr);
                            if(lossRate>=0 && lossRate<=100){
                                flag1=false;
                            }
                        }else {
                            System.out.println("Вы ввели неправильный вес игрушки");
                        }
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

