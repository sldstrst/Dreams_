import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name_fill = "";
        String password_fill = "";
        
        //заполняем БД данными (имена, пароли)
        Person [] persons = new Person[10];
        for (int i = 0; i < 10; i++){
            name_fill = "Man" + i;
            password_fill = "12345" + i;
            persons[i] = new Person(name_fill, password_fill);
            persons[i].displayPerson(name_fill, password_fill);
        }
        
        //Вводим имя и пароль
        System.out.print("Input a Name: ");
        String name = input.next();
		System.out.print("Input a password: ");
        String pass = input.next();
        
        //если вводимый пароль совпадает, то валидация проходит успешно
        //(переходим на следующий этап - отображение данных)
        Validate validate = new Validate(name, pass);
        validate.validateCheck(persons);
        
        input.close();
	}
}

class Validate{
    private String search_password;
    private String search_name;
    private String name_help = "";
    private String password_help = "";
    private boolean flag = true;
    
    public void validateCheck(Person person[]){
        for (int i = 0; i < person.length; i++){
            name_help = person[i].getName();
            password_help = person[i].getPassword();
            
            if (search_name.equals(name_help) && search_password.equals(password_help)){
                System.out.println("Validate is correct");
                flag = true;
                break;
            }
            else{
                flag = false;
            }
        }
        if (flag == false){
            System.out.println("Validate isn't correct");
        }
    }
    
    public boolean equals(String name) {
       return this.search_name == name;
   }
    
    Validate(String name, String password){
        this.search_name = name;
        this.search_password = password;
    }
}


class Person{
    String personal_name;
    int personal_id;
    String user_password;
    
    Person(String name, String password){
        this.personal_name = name;
        this.user_password = password;
    }
    
    public String getName(){
        return this.personal_name;
    }
    
    public String getPassword(){
        return this.user_password;
    }
    
    public static void displayPerson(String name, String password){
        System.out.println(name + " " + password);
    }
}

