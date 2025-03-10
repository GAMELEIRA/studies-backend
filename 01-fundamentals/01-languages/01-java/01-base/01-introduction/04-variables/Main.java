public class Main {
  public static void main(String[] args) {
    //VARIAVEIS SAO CONTAINERS PARA ARMAZENAR VALORES DE DADOS
    //JAVA É case-sensitive, ou seja, VARIAVEIS COM MAIUSCULAS E MINUSCULAS SÃO DIFERENTES
    //EXEMPLO: nome e NOME sÃO VARIAVEIS DIFERENTES
    //TODOS OS IDENTIFICADORES DE VARIAVEIS DEVEM SER EXCLUSIVOS
    //EXISTEM TIPOS DIFERENTES DE VARIAVEIS EXEMPLO: String, char, int, float, double, boolean

    //REGRAS
    //NAO USAR NUMEROS
    //NAO USAR CARACTERES ESPECIAIS
    //NAO USAR ESPACOS EM NOMES DE VARIAVEIS
    //NAO USAR PALAVRAS RESERVADAS (ex: int, double, boolean, etc.)
    //NAO USAR ESPACOS
    //SEMPRE INICIAR O NOME DE UMA VARIAVEL COM LETRAS, $ OU _. MAS NUNCA COM NUMEROS
    //IDENTIFICADORES DEVEM SER SEMPRE NO SINGULAR A MENOS QUE SEJAM ARRAYS

    //COMO PADRAO USE O CAMELCASE
    //PARA CRIAR UMA VARIAVEL VOCE DEVE ESPECIFICAR O TIPO E/OU ATRIBUIR UM VALOR A ELA
    //tipo nomeDaVariavel = value
    //EXEMPLO
    String name = "John";
    System.out.println(name);

    int myNum = 25;
    System.out.println(myNum);
    
    int otherNum;
    otherNum = 30;
    System.out.println(otherNum);

    //PARA DEFINIR UMA VARIAVEL CONSTANTE USO A PALAVRA-CHAVE final ANTES DO TIPO DA VARIAVEL
    //O IDENTIFICADOR DE VARIAVEIS CONSTANTES DEVEM SER ESCRITAS EM LETRAS MAISCULAS
    //EXEMPLO
    final double PI = 3.14;
    System.out.println(PI);

    //PARA DECLARAR MULTIPLAS VARIAVEIS EM UM UNICA LINHA
    //SEPARE CADA IDENTIFICADOR POR VIRGULA
    int a, b, c;
    a = 10;
    b = 20;
    c = 30;
    System.out.println(a + " " + b + " " + c);

    //ATRIBUICAO MULTIPLA
    int d, e, f;
    d = e = f = 20;
    System.out.println(d + " " + e + " " + f);

  }
}