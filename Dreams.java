import java.util.ArrayList;

public class Dreams{
    private boolean b_status;
    private String s_status;
    private String dream;
    private int identUserForDream; 
    Person pers;
    
    public String get_sStatus(){
        return this.s_status;
    }
    
    public boolean get_bStatus(){
        return this.b_status;
    }
    
    public String get_sDream(){
        return this.dream;
    }
    
    public void displayDreams(Dreams dream){
        
        System.out.println(this.dream + "\t|\t\t\t" + this.s_status);
    }
    
    public static void addToListDream(String dream, String s_status, ArrayList<Dreams> dreams){
        Dreams dream7 = new Dreams(dream, s_status);
        dreams.add(dream7);
    }
    
    public static void createDreamList(ArrayList<Dreams> dreams){
        Dreams dream1 = new Dreams("I want 10 cars", "Never come true");
        dreams.add(dream1);
        Dreams dream2 = new Dreams("I want a Filarmony", "Never come true");
        dreams.add(dream2);
        Dreams dream3 = new Dreams("I want a sixty five million dollars", "Come true");
        dreams.add(dream3);
        Dreams dream4 = new Dreams("I want a laptop", "Come true");
        dreams.add(dream4);
        Dreams dream5 = new Dreams("I want a main Kingdom in Britain", "Come true");
        dreams.add(dream5);
    }
    
    Dreams(String dream, String s_status){
        this.dream = dream;
        this.s_status = s_status;
    }
}
