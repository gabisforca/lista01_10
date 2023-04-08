import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double Fahrenheit;
    double Celsius;
    
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o valor em Celsius");
    Celsius = teclado.nextDouble();
    
    // passo 3: calcular
    Fahrenheit = ((9 * Celsius) + 160) / 5;
    
    // passo 4: exibir
   System.out.println("O valor em Fahrenheit é:" + Fahrenheit); 
   
  }
}
