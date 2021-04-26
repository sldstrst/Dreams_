import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        boolean bool = false;
        int count_persons = 3; 
        boolean btn_exit = false;
        boolean flag_validate = false;
        String status_s_fill = "";
        String dream_fill = "";
        ArrayList<Dreams> arr_dreams = new ArrayList<Dreams>();
        ArrayList<Person> arr_person = new ArrayList<Person>();
      	Dreams.createDreamList(arr_dreams);
        
        Correct corr_count = new Correct(count_persons);
        bool = corr_count.checkIsCorrectCount();
        
        Person.createPersonList(bool, arr_person);
        
        while(!flag_validate){
            System.out.print("Input a Name: ");
            String name = input.next();
    		System.out.print("Input a password: ");
            String pass = input.next();
            
            Validate validate = new Validate(name, pass);
            flag_validate = validate.validateCheck(arr_person);
            if (flag_validate == false){
                System.out.print("Input again? 1 - yes | 2 - no: ");
                String cont = input.next();
                if (cont.equals("2")){
                    break;
                }
                else{
                    System.out.println("Input again..");
                } 
            }
        }
        
        while (flag_validate){
           System.out.println("1. Add to Dream");
           System.out.println("2. Delete from Dream");
           System.out.println("3. Modify Dream");
           System.out.println("4. Show Dreams");
           System.out.println("5. Leave?");
           String choice = input.next();
           switch (choice){
                case "1": 
                    System.out.println("Add");
               		System.out.print("Input a Dream: ");
            		String dream_input = input.next();
               		System.out.print("Input a Status: ");
            		String s_status_input = input.next();
                    Dreams.addToListDream(dream_input, s_status_input, arr_dreams);
                    break;
                case "2": 
                    System.out.println("Del");
                    break;
                case "3": 
                    System.out.println("Mod");
                    break;
                case "4": 
                    System.out.println("Show");
                    for (int i = 0; i < arr_dreams.size(); i++){
                        arr_dreams.get(i).displayDreams(arr_dreams.get(i));
                    }
                    System.out.println("\n");
                    break;
                case "5": 
                    System.out.println("Leave");
                    flag_validate = false;
                    break;
           }
        }
        
        
        input.close();
	}
}
