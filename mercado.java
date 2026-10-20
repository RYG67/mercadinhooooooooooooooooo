import java.util.HashMap;
public class mercado {
public static void main(String[] args) {
HashMap<Integer, String> produtos = new HashMap<>();
produtos.put(78910, "Preço R$ 4.50");
produtos.put(78920, "Preço R$ 8.90");
produtos.put(78930, "Preço R$ 12.00");


java.util.Scanner teclado = new java.util.Scanner(System.in);
System.out.println("Digite o código do produto: ");
int codigo = teclado.nextInt();
System.out.println("Produto selecionado: " + produtos.get(codigo));
}
}
