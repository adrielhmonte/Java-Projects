import java.util.Scanner;

public class mainstreet {
    public static void main(String[] args){
        String cria;
        Scanner input = new Scanner(System.in);

        System.out.println("voce eh um cria da mainstreet?");
        cria = input.nextLine();

        if(cria.contains("sim")){
            System.out.println("ela quer dar a buteta");
        }
        else{
            System.out.println("nao dar a buteta");
        }

        input.close();
        
    }
}
