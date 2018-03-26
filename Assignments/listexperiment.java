import java.util.*;
class listexperiment{
    public static int s = 0;
    public static int x = 0;
    public static int p = 0;
    public static String f = "f";
    public static ArrayList<String> hey = new ArrayList<String>();
    public static void main(String[] args){
        while(true){
            x = 1;
            for(int i = 0; i < hey.size();i ++){
                System.out.println("("+i+") "+ hey.get(i));
            }
                System.out.println("Would you like to remove or add to the list(R=0 or A=1): ");
                Scanner sca = new Scanner(System.in);
                s = sca.nextInt();
                if(s == 0 || s == 1){
                    while(x==1){
                    if(s == 0){
                        while(true){
                            System.out.println("Which item would you like to remove: ");
                            for(int i = 0; i < hey.size(); i++){
                                if (i == hey.size()-1){
                                    System.out.print("("+i+")");
                                }else{  
                                    System.out.print("("+i+"), ");
                                }
                            }
                            Scanner sc = new Scanner(System.in);
                            p = sc.nextInt();
                            if(p <= hey.size()){
                                hey.remove(p);
                                x = 0;
                                break;    
                            }
                        }
                    }
                        else{
                            System.out.println("What would you like to add to the list: ");
                            Scanner s = new Scanner(System.in);
                            f = s.nextLine();
                            hey.add(f);
                            x = 0;
                            break;
                        }                        
                    }
                }
            }
        }
}