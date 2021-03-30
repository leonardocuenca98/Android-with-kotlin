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
    
    println(nomeSobrenome.toUpperCase())
    
    var pi =3.1416;
    println(pi.toInt())
    println(idade.toDouble())
    var resultado = 0;
    resultado = pi.toInt() * idade;
    println(resultado)
    
    //Template String 
    println("Olá, me chamo ${nomeSobrenome.toUpperCase()} "+ resultado + " "+ nomeSobrenome.toUpperCase())
	println("Tenho ${2021-1998} anos, gosto de ${preferencias[1]}")

    val imc = peso /(altura*altura)
    println("Seu IMC é $imc")
}
