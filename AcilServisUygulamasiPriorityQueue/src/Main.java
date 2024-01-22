import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*
        ACİL SERVİS UYGULAMASI ÖNCELİK SIRALAMASINA GÖRE

        Apandisit ----->En yüksek öncelik
        Yanık---------->orta derece öncelik
        Başağrısı----------->en düşük öncelik


        */
        Queue<Hasta> acilservis=new PriorityQueue<Hasta>();

        acilservis.offer(new Hasta("AHMET", "Apandisit"));
        acilservis.offer(new Hasta("BURAK", "Basağrısı"));
        acilservis.offer(new Hasta("MELİSA", "Yanık"));
        acilservis.offer(new Hasta("BUSE", "Apandisit"));
        acilservis.offer(new Hasta("RABİA", "Yanık"));

        int i=1;
        while(acilservis.isEmpty() !=true){
            System.out.println(i+" .sıradaki...");
            System.out.println(acilservis.poll());
            i++;
        }
    }
}