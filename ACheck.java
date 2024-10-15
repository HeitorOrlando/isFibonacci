import java.util.Scanner;

public class ACheck {
    public static void main(String[] args) {
        Scanner rdL = new Scanner(System.in);
        System.out.print("Escreva uma palavra para verificar se contém a letra A -> ");
        var str = rdL.nextLine();

        if (isNumeric(str) || str.isEmpty()) {
            System.out.println("Formato de entrada inválido!");
            System.exit(0);
        }

        try
        {
            var strLength = str.length();
        var aCounter = 0;

        for(int index = 0;index < strLength; index++){
            if (str.charAt(index) == 'a' || str.charAt(index) == 'A') {
                aCounter++;
            }
        }
        if (aCounter == 0) {
            System.out.printf("A palavra %s não tem nenhuma letra A!",str);
        }
        else if (aCounter > 0) {
            System.out.printf("A palavra %s contém %d letras A!", str,aCounter);
        }

        }
        catch(Exception e){
            System.out.printf("Ocorreu um erro ao analisar a palavra ", e);
        }
    }

    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
}

