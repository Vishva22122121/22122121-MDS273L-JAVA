import java.util.Scanner;

public class Lab2 {
    public static void main(String[] arg){
        
        Scanner scan = new Scanner(System.in);
        String[] Name = new String[1024];
        boolean flag = false;
        int i = 0;
        do{
            flag = true;
            System.out.println("*******************Menu********************");
            System.out.println("***1. Enter a Name***");
            System.out.println("***2. Search for a Name***");
            System.out.println("***3. Remove a Name***");
            System.out.println("***4. Show all Names***");
            System.out.println("***5. Quit***");
            System.out.println("***Enter your choice***");
            int inp = Integer.parseInt(scan.nextLine());

            switch(inp) {
                case 1:{
                    int j ;
                    System.out.println(" Enter your Name ");
                    String xxx = scan.nextLine();
                    for(j=0; j<Name.length; j++ ){
                        if (xxx.equals(Name[j])){
                            System.out.println("Name already exist ");
                            break;
                        }
                        else{
                            Name[i] = xxx;
                            i++;
                            break;
                        }
                    }
                    break;

    
                }


                case 2:{
                    int j;
                    System.out.println("Which name you want to find out");
                    String sss = scan.nextLine();
                    for ( j=0; j < Name.length; j++) {
                        if (sss.equals(Name[j])){
                            System.out.println("Name is found at position "+(j+1));
                            break;

                        }
                    }
                    break;

                }


                case 3:{
                    int j;
                    System.out.println("Which name you want to delete:");
                    String nnn = scan.nextLine();
                    for ( j=0; j < Name.length; j++) {
                        if (nnn.equals(Name[j])){
                            for (; j < Name.length-1; j++) {
                                Name[j]=Name[j+1];
                                
                            }

                        }
                        
                    }
                    break;
                }


                case 4:{
                    System.out.println("Your list are: ");
                    for (String a:Name){
                        if(a!=null){
                            System.out.print(a+",");
                        }
                       
                    }
                    System.out.println();
                    break;
                }



                case 5:{
                    System.out.println("Program will now exit ");
                    flag=false;
                    break;
                }

            }


        }while (flag);



    }
} 