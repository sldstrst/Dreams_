package com.company;

import java.util.ArrayList;

public class Dreams{
    private boolean b_status;
    private String s_status;
    private String dream;
    private int identUserForDream;
    private String name;
    private int length_dream = 0;

    public String get_sStatus(){
        return this.s_status;
    }

    public boolean get_bStatus(){
        return this.b_status;
    }

    public String get_sDream(){
        return this.dream;
    }

    public void displayDreams(Dreams dream, int index){
        String column1Format = "%-3.3s";
        String column2Format = "%-40.40s";
        String column3Format = "%30.30s";
        String formatInfo = column1Format + "\t|\t" + column2Format + "\t|\t" + column3Format;

        System.out.format(formatInfo, index+1, this.dream, this.s_status);
        System.out.println();
    }

    public void addToListDream(String dream, String s_status, ArrayList<Dreams> dreams, String name){
        Dreams add_new_dream = new Dreams(dream, s_status, name);
        dreams.add(add_new_dream);
    }

    public static void rmToListDream(ArrayList<Dreams> dreams, String index){
        int i = Integer.parseInt(index) - 1;
        dreams.remove(i);
    }

    Dreams(String dream, String s_status,String name){
        this.dream = dream;
        this.s_status = s_status;
        this.name = name;
    }
}
