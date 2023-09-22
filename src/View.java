import java.util.Scanner;

public class View {
    Presenter presenter = new Presenter();
    Scanner scanner = new Scanner(System.in);
    SaveFile sF = new SaveFile();
    IsNumeric isNumeric = new IsNumeric();
    TextView textView = new TextView();
    public void mainMenu(){
        boolean flag = true;
        while (flag){
            System.out.println(textView.enterMenuItem);
            System.out.println(textView.menu1);
            System.out.println(textView.menu2);
            System.out.println(textView.menu3);
            System.out.println(textView.menu4);
            String choice = scanner.nextLine();
            switch (choice){
                case ("1"):
                    System.out.println(textView.enterNameToy);
                    String nameToy = scanner.nextLine();
                    Double lossRate = null;
                    boolean flag1 = true;
                    while (flag1){
                        System.out.println(textView.enterLossRate);
                        String lossRateStr = scanner.nextLine();
                        if(isNumeric.isNumeric(lossRateStr)){
                            lossRate = Double.parseDouble(lossRateStr);
                            if(lossRate>=0 && lossRate<=100){
                                flag1=false;
                            }
                        }else {
                            System.out.println(textView.errorLossRate);
                        }
                    }

                    presenter.addToyPr(nameToy,lossRate);
                    break;
                case ("2"):
                    String textToy = presenter.textTopPr().toString();
                    if (textToy.isEmpty()){
                        System.out.println(textView.noToys);
                    }else {
                        System.out.println(textToy);
                    }
                    break;
                case ("3"):
                    try {
                        String raffleToy = presenter.raffleToysPr().toString();
                        System.out.println(textView.youWon + " ( " + raffleToy + " )");
                        sF.saveFile(textView.path,raffleToy + "\n");
                    } catch (NullPointerException e) {
                        System.out.println(textView.nothingPlay);
                }
                    break;
                case ("4"):
                    flag=false;
                default:
                    if (flag){
                        System.out.println(textView.errorMenuItem);
                        System.out.println(textView.selectCorrectMenu);
                    } else {
                        System.out.println(textView.exitProgram);
                    }
            }
        }
    }
}

