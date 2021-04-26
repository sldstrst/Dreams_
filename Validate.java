import java.util.ArrayList;

public class Validate{
    private String search_password;
    private String search_name;
    private String name_help = "";
    private String password_help = "";
    private boolean flag = true;
    
    public boolean validateCheck(ArrayList<Person> person){
        for (int i = 0; i < person.size(); i++){
            name_help = person.get(i).getName();
            password_help = person.get(i).getPassword();
            
            if (search_name.equals(name_help) && search_password.equals(password_help)){
                System.out.println("Validate is correct");
                flag = true;
                return flag;
            }
            else{
                flag = false;
            }
        }
        if (flag == false){
            System.out.println("Validate isn't correct");
        }
        return flag;
    }
    
    public boolean equals(String name) {
       return this.search_name == name;
   }
    
    Validate(String name, String password){
        this.search_name = name;
        this.search_password = password;
    }
}
