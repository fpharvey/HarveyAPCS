
import java.util.*;


class plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;
    public static int position = 0;
    public static int rowposition = 0;
    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};
    public static int numdiscs = 0;
    public static int[] positions ={0,0,0,0,0,0,0,0,0};
    public static int realtotalpoints;

    public static int mode = -1;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    singledisk();
                }
                else if(mode == MULTI_DISC) {
                    multidisc();
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                }
            }
        }
    }
    public static void singledisk(){
         while(true){
            System.out.print("choose a position (0-8):");
            Scanner scan;
            scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                    position = scan.nextInt();
                    if(position>=0 && position<=8){
                    break; 
                    }//asks what position they want to drop is
            }
        }    
             position = position*2;
        for(int rowposition=0;rowposition<12;rowposition++){
            if(position == 0){
                printevenrow(position);
                try {
                    Thread.sleep(850);
                } catch (InterruptedException e){}
                position++;
            }
            else if (position == 16){
                printevenrow(position);
                try {
                    Thread.sleep(850);
                } catch (InterruptedException e){}
                position--;
            }
            else if (isEven(rowposition)){
                 printevenrow(position);
                 try {
                    Thread.sleep(850);
                } catch (InterruptedException e){}
                if(Math.random()>.5){
                    position ++;
                }   
                    else{
                        position --;
                    }
            }
            else if(!isEven(rowposition)){
                printoddrow(position);
                try {
                    Thread.sleep(850);
                } catch (InterruptedException e){}
                if(Math.random()>.5){
                    position ++;
                }   
                    else{
                        position --;
                    }
            }
        }
        System.out.println("you landed in position "+position/2 +" and scored "+VALUES[position/2]+" point(s)"); 
    }       
    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
    public static void printevenrow(int position){
        System.out.print ("|");
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.println("|");       
    }
    public static void printoddrow(int position){
        System.out.print ("|");    
        for(int i = 0; i <= 16; i++) {
            if(position == i) {
                System.out.print("O");
            }
            else if(!isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.println("|");
    }
    public static void multidisc(){
        while(true){
            System.out.print("choose a position (0-8):");
            Scanner scan;
            scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                    position = scan.nextInt();
                    if(position>=0 && position<=8){
                    break; 
                    }
            }
        }
        while(true){
            System.out.print("choose the number of discs you would like to drop:");
            Scanner scan;
            scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                    numdiscs = scan.nextInt();
                    if(numdiscs>=0){
                    break; 
                    }
            }
        }
        int userposition = position*2;
        for(int i = numdiscs; i >0 ;i --){
            position = userposition;
            for(int rowposition=0;rowposition<12;rowposition++){
                if(position == 0){
                    position++;
                }
                else if (position == 16){
                    position--;
                }
                else if (isEven(rowposition)){
                    if(Math.random()>.5){
                        position ++;
                    }   
                        else{
                            position --;
                        }
                }
                else if(!isEven(rowposition)){
                    if(Math.random()>.5){
                        position ++;
                    }   
                        else{
                            position --;
                        }
                }        
            }
            positions[position/2] ++;
        }
        for( int x =0; x<= 8; x++){
            int pointsperslot = VALUES[x]*positions[x];
            realtotalpoints = pointsperslot + realtotalpoints;
        }
        System.out.println("discs landing in position 0: "+positions[0]);
        System.out.println("discs landing in position 1: "+positions[1]);
        System.out.println("discs landing in position 2: "+positions[2]);
        System.out.println("discs landing in position 3: "+positions[3]);
        System.out.println("discs landing in position 4: "+positions[4]);
        System.out.println("discs landing in position 5: "+positions[5]);
        System.out.println("discs landing in position 6: "+positions[6]);
        System.out.println("discs landing in position 7: "+positions[7]);
        System.out.println("discs landing in position 8: "+positions[8]);
        System.out.println("you scored "+ realtotalpoints);
        positions[0]=0;
        positions[1]=0;
        positions[2]=0;
        positions[3]=0;
        positions[4]=0;
        positions[5]=0;
        positions[6]=0;
        positions[7]=0;
        positions[8]=0;
        realtotalpoints=0;
    }
}
