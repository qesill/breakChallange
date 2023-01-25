public class Main {
    public static void main(String[] args) {

        /*
        Stwórz dowolną pętlę od 0 do 50,
        wyświetl licznik pętli w każdej iteracji,
        ale przerwij działanie pętli na 10 używając
        break.
         */
        for (int x = 0; x <= 50; x++) {
            System.out.println(x);
            if (x == 10) break;
        }
    }
}