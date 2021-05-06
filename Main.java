package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bool = false;
        int count_persons = 3;
        boolean btn_exit = false;
        boolean flag_leave = false;
        String status_s_fill = "";
        String dream_fill = "";
        boolean flag_validate = false;
        ArrayList<Person> arr_person = new ArrayList<Person>();
        //заполняем БД данными (имена, пароли)
        Correct corr_count = new Correct(count_persons);
        bool = corr_count.checkIsCorrectCount();
        Person.createPersonList(bool, arr_person);
        ArrayList<Dreams> arr_dreams_u1 = new ArrayList<Dreams>();
        ArrayList<Dreams> arr_dreams_u2 = new ArrayList<Dreams>();
        while(!flag_validate){
            System.out.print("Input a Name: ");
            String name = input.next();
            System.out.print("Input a password: ");
            String pass = input.next();

            //если вводимый пароль совпадает, то валидация проходит успешно
            //(переходим на следующий этап - отображение данных)
            Validate validate = new Validate(name, pass);
            flag_validate = validate.validateCheck(arr_person);
            if (!flag_validate){
                System.out.print("Input again? 1 - yes | 2 - no: ");
                String cont = input.next();
                if (cont.equals("2")){
                    break;
                }
                else{
                    System.out.println("Input again..");
                }
            }
            flag_leave = flag_validate;

            //Dreams.createDreamList(arr_dreams, name);
            while (flag_leave){
                System.out.println("1. Add to Dream");
                System.out.println("2. Delete from Dream");
                System.out.println("3. Show Dreams");
                System.out.println("4. Relog");
                System.out.println("5. Leave");
                String choice = input.next();
                switch (choice){
                    case "1":
                        Scanner scanner = new Scanner(new InputStreamReader(System.in));
                        System.out.print("Input a dream");
                        String dream_input = scanner.nextLine();
                        System.out.print("Input a status");
                        String s_status_input = scanner.nextLine();
                        Dreams dream_user = new Dreams(dream_input, s_status_input, name);
                        if (name.equals("kate")){
                            dream_user.addToListDream(dream_input, s_status_input, arr_dreams_u1, name);
                        }
                        if (name.equals("bogdan")){
                            dream_user.addToListDream(dream_input, s_status_input, arr_dreams_u2, name);
                        }
                        break;
                    case "2":
                        System.out.println("Del");
                        Scanner scan = new Scanner(new InputStreamReader(System.in));
                        System.out.print("Input a index del");
                        String index_del = scan.nextLine();
                        if (name.equals("bogdan")){
                            Dreams.rmToListDream(arr_dreams_u2, index_del);
                        }
                        if (name.equals("kate")){
                            Dreams.rmToListDream(arr_dreams_u1, index_del);
                        }
                        break;
                    case "3":
                        System.out.println("Show");
                        if (name.equals("kate")) {
                            for (int i = 0; i < arr_dreams_u1.size(); i++) {
                                arr_dreams_u1.get(i).displayDreams(arr_dreams_u1.get(i), i);
                            }
                        }
                        if (name.equals("bogdan")) {
                            for (int i = 0; i < arr_dreams_u2.size(); i++) {
                                arr_dreams_u2.get(i).displayDreams(arr_dreams_u2.get(i), i);
                            }
                        }
                        System.out.println("\n");
                        break;
                    case "4":
                        System.out.println("User change");
                        flag_leave = false;
                        flag_validate = false;
                        break;
                    case "5":
                        System.out.println("Leave");
                        flag_leave = false;
                        flag_validate = true;
                        break;
                }
            }
        }
        input.close();
    }
}
