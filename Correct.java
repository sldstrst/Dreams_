package com.company;

public class Correct{
    boolean b_check_count = false;
    int count;
    Correct(int count){
        this.count = count;
    }

    public boolean checkIsCorrectCount(){
        if (this.count > 1 && this.count < 100000){
            return b_check_count = true;
        }
        else{
            return b_check_count = false;
        }
    }
}
