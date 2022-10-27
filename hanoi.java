
/**
 * Escreva uma descrição da classe hanoi aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class hanoi
{
    private int n;
    private String a, b, c;
    
    public hanoi()
    {
    }
    
    public void trocar(String a, String b)
    {
        String aux = a;
        a = b;
        b = aux;
    }


    public void hanoiplay(int n, String a, String b, String c)
    {    
        if (n > 0){
            hanoiplay (n - 1, a, c, b);
            System.out.println(""+a+"->"+c);
            trocar(a, c);
            hanoiplay (n - 1, b, a, c);
        }
    }
    
    public static void main (String Args []){
        hanoi hanoi = new hanoi ();
        hanoi.hanoiplay(3, "a", "b", "c");
    }
}
