package projekts;

import java.util.Random;

public class random_2 {



    public static void main(String[] args) {
    	
    	
    	Random r_Fgrade = new Random(); 
        int low_Fgrade=1;
        int high_Fgrade=7;
        int first_grade = r_Fgrade.nextInt(high_Fgrade-low_Fgrade)+ low_Fgrade;


        Random r_Sgrade = new Random();
        int low_Sgrade=1;
        int high_Sgrade=4;
        int second_grade = r_Sgrade.nextInt(high_Sgrade-low_Sgrade)+ low_Sgrade;



        switch (second_grade) {
            case 1:
                System.out.println("\"" + first_grade + "+" + "\"");
                break;
            case 2:
                System.out.println("\"" + first_grade + "-" + "\"");
                break;
            case 3:
                System.out.println("\"" + first_grade + "\"");
                break;

    	
        }
    }
}

    	/*
    	 Random r_Fgrade = new Random();
	        int low_Fgrade=1;
	        int high_Fgrade=7;
	        int first_grade = r_Fgrade.nextInt(high_Fgrade-low_Fgrade)+ low_Fgrade;


	        Random r_Sgrade = new Random();
	        int low_Sgrade=1;
	        int high_Sgrade=4;
	        int second_grade = r_Sgrade.nextInt(high_Sgrade-low_Sgrade)+ low_Sgrade;



	        if(second_grade==1)
	            System.out.println("\""  +first_grade+"+"  +"\"");
	        else if (second_grade==2)
	            System.out.println("\""  +first_grade+"-"  +"\"");
	        else if (second_grade==3)
	            System.out.println("\""  +first_grade      +"\"");
    }
}
    */