/**
2
 You can edit, run, and share this code. 
3
 play.kotlinlang.org 
4
 */
5
//Comentário da massa
6
//Principais  tipos de dados:
7
/* 1. Texto (String)
8
 * 2. Numérico (Int/Inteiro,float/double/Decimal)
9
/**
 You can edit, run, and share this code. 
 play.kotlinlang.org 
 */
//Comentário da massa
//Principais  tipos de dados:
/* 1. Texto (String)
 * 2. Numérico (Int/Inteiro,float/double/Decimal)
 * 3. Booleano(verdadeiro ou falso)
 * 4. Coleção (lista)
*/
fun main() {
    //This is my body,bloco de código ou escopo
    println("Hello, Mano!!!!");//String
    println(33); // Int
    println(3.14);//Double
    println(false);//boolean
    /*Variáveis
     São dados com nomes
    */
    var idade = 22;
    var altura = 1.80;
    var peso = 62;
    var casado = true;
    var nomeSobrenome = "Leonardo Cuenca";
    println(nomeSobrenome);
    
    nomeSobrenome = "Jailma Januário";
    var letra = 'l'
    
    println(nomeSobrenome);
    
    //Variável imutáveis
    val tipoSanguineo="B+";
    println(tipoSanguineo);
    
    //Listas
    //Listas de dados ordenados
    var preferencias = arrayListOf("Cinema", "Games", "músicas")
	var listaMercado = arrayListOf("Café","Coador","Leite")
    
    println(listaMercado.size)
    
}
