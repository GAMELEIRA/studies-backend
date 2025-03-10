
//PACOTES PARA TRABALHAR COM EXPRESSOES REGULARES
import java.util.regex.*;
import java.util.regex.Pattern; //DEFINE UM PADRAO A SER USADO EM UMA PESQUISA
import java.util.regex.Matcher; //USADO PARA PROCURAR UM PADRAO
import java.util.regex.PatternSyntaxException; //INDICA ERRO DE SINTAXE EM UM PADRAO DE EXPRESSAO REGULAR  

public class Main {
  public static void main(String[] args) {
    // UMA EXPRESSAO REGULAR É UMA SEQUENCIA DE CARACTERES QUE FORMA UM PADRAO DE
    // PESQUISA
    // DESSA FORMA VOCE CONSEGUE CRIAR FILTROS/CONDICOES/VALIDACOES PARA O CONTEUDO
    // REGEX PODEM SER UTLIZADOS PARA OPERACOES DE PESQUISA E SUBSTUICAO DE TEXTO

    // O PRIMEIRO ARGUMENTO INDICA QUAL O PADRAO ESTA SENDO PESQUISA
    // O SEGUNDO ARGUMENTO INDICA AS OPCOES DE PESQUISA (nesse caso, IGNORECASE)
    // OBS: EM JAVA, PADRAO EM MINUSCULAS E MAIUSCULAS SÃO TRATADOS COMO DIFERENTES,
    // PORTANTO SE O PADRAO FOR "gameleira", O MATCHER NÃO VAI ENCONTRAR "Gameleira"
    // CASO QUEIRA TRATAR COMO IGUAL, BASTA USAR Pattern.CASE_INSENSITIVE
    // OS VALORES PERMITIDOS PARA O SEGUNDO PARAMETRO:
    // Pattern.CASE_INSENSITIVE: NAO DIFERENCIA MAISCULAS DE MINUSCULAS
    // Pattern.DOTALL: ACEITA CARACTERES DE NOVO LINHA (\\n) COMO PADRAO
    // Pattern.MULTILINE: ACEITA O PADRAO EM VARIOS LINHAS (\\n) COMO PADRAO
    // Pattern.UNICODE_CASE: ACEITA CARACTERES UNICODE COMO PADRAO
    // Pattern.UNIX_LINES: ACEITA O PADRAO EM LINHAS UNIX (\\n) COMO PADRAO
    Pattern pattern = Pattern.compile("gameleira", Pattern.CASE_INSENSITIVE);

    // O MATCHER É UM OBJETO QUE PERMITE A UTILIZACAO DO PADRAO
    Matcher matcher = pattern.matcher("Gameleira, gameleira, Gameleira!");

    // O METODO FIND() RETORNA TRUE QUANDO O PADRAO É ENCONTRADO NO TEXTO
    boolean found = matcher.find();

    // IMPRIME O RESULTADO
    System.out.println("Padrao encontrado: " + found);

    // O METODO REPLACEALL() SUBSTITUI TODOS OS OCORRENCIAS DO PADRAO POR OUTRO
    // TEXTO
    String substituido = matcher.replaceAll("Camarão");

    // IMPRIME O TEXTO COM O PADRAO SUBSTITUIDO
    System.out.println("Texto substituido: " + substituido);
    
    // PADRÕES DE EXPRESSÃO REGULAR
    // EXPRESSÃO | DESCRIÇÃO
    // \d | UM DÍGITO
    // \D | NENHUM DÍGITO
    // \w | UM CARACTERE ALFANUMÉRICO (LETRA, NÚMERO OU UNDERLINE)
    // \W | NENHUM CARACTERE ALFANUMÉRICO
    // \s | UM ESPAÇO EM BRANCO (ESPACO, TABULAÇÃO, NOVA LINHA)
    // \S | NENHUM ESPAÇO EM BRANCO
    // \b | UM LIMITE ENTRE UM CARACTERE DE PALAVRA E UM NÃO PALAVRA
    // \B | QUALQUER POSIÇÃO QUE NÃO SEJA UM LIMITE DE PALAVRA
    // [abc] | UM CARACTERE QUE SE ENCONTRA EM "abc"
    // [^abc] | UM CARACTERE QUE NÃO SE ENCONTRA EM "abc"
    // [a-z] | UM CARACTERE QUE ESTÁ EM UMA LETRA MINÚSCULA (a-z)
    // [A-Z] | UM CARACTERE QUE ESTÁ EM UMA LETRA MAIÚSCULA (A-Z)
    // [a-zA-Z] | UM CARACTERE QUE ESTÁ EM UMA LETRA (a-z ou A-Z)
    // [0-9] | UM CARACTERE QUE ESTÁ EM UM NÚMERO (0-9)
    // \t | UMA TABULAÇÃO
    // \n | UMA NOVA LINHA
    // \r | UM CARACTERE DE RETORNO AO INÍCIO DA LINHA

    // METACARACTERES | DESCRIÇÃO
    // \ | CARACTERE DE ESCAPE (USADO PARA ESCAPAR METACARACTERES)
    // . | UM CARACTERE QUALQUER (EXCETO QUEBRA DE LINHA)
    // + | UMA OCORRÊNCIA OU MAIS DO CARACTERE ANTERIOR
    // * | UMA OCORRÊNCIA OU ZERO OU MAIS DO CARACTERE ANTERIOR
    // ? | UMA OCORRÊNCIA OU ZERO OU UMA OCORRÊNCIA DO CARACTERE ANTERIOR
    // {n} | UMA OCORRÊNCIA EXATA DE n DO CARACTERE ANTERIOR
    // {n,} | UMA OCORRÊNCIA DE n OU MAIS DO CARACTERE ANTERIOR
    // {n,m} | UMA OCORRÊNCIA DE MAIS DE n E MENOS DE m DO CARACTERE ANTERIOR
    // ^ | INÍCIO DE UMA LINHA
    // $ | FIM DE UMA LINHA
    // () | GRUPO DE CARACTERES PARA AGRUPAMENTO (USADO EM PESQUISAS MAIS COMPLEXAS)
    // | | OPERADOR DE ALTERNÂNCIA (OU)
    // \A | INÍCIO DA STRING
    // \Z | FIM DA STRING
    // \b | LIMITE DE PALAVRA
    // \B | NÃO É UM LIMITE DE PALAVRA
    // \G | INÍCIO DE UMA NOVA "BUSCA" (PONTO DE CONTROLE)

    // QUANTIFICADORES | DESCRIÇÃO
    // ? | ZERO OU UMA OCORRÊNCIA DO CARACTERE ANTERIOR
    // + | MAIS DE UMA OCORRÊNCIA DO CARACTERE ANTERIOR
    // * | ZERO OU MAIS OCORRÊNCIAS DO CARACTERE ANTERIOR
    // {n} | UMA OCORRÊNCIA EXATA DE n DO CARACTERE ANTERIOR
    // {n,} | UMA OCORRÊNCIA DE n OU MAIS DO CARACTERE ANTERIOR
    // {n,m} | UMA OCORRÊNCIA DE MAIS DE n E MENOS DE m DO CARACTERE ANTERIOR

  }
}
