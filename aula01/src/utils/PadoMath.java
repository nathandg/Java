package src.utils;

public class PadoMath{

  public static int myFirstFunction(int variable){
    return variable * 3;
  }
  
  public static int Somatoria(int variable){
    
    int soma = 0;

    for(int i = 0; i <= variable; i++){
      soma += variable*3;
    }

    return soma;
  }

  public static double Produtoria(int x, int y){
    
    double resultado = 1;

    for(int i = 0; i <= x; i++){
      resultado = resultado * (Somatoria(x)*y*3);
    }

    return resultado;
  }

}
