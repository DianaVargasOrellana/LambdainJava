import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void  main(String[] args) throws FileNotFoundException {
        Exercises ex1 = new Exercises();
        List<String> lista= new ArrayList<>();
        lista.add("abc");
        lista.add("def");
        lista.add("ahi");
        lista.add("daniel");
        lista.add("alejandra");
        lista.add("diana");
        ex1.search(lista).forEach(System.out::println);

        System.out.println("-----------------------------------");
        List<Integer> lista2 = new ArrayList<>();
        lista2.add(44);
        lista2.add(1);
        lista2.add(3);
        lista2.add(52);
        System.out.println(ex1.getString(lista2));

        System.out.println("-----------------------------------");
        System.out.println(ex1.exercise1(lista));

        System.out.println("-----------------------------------");
        ex1.exercise2(lista);

        System.out.println("-----------------------------------");
        ex1.exercise3(lista);

        System.out.println("-----------------------------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1",1);
        map.put("Key2",2);
        map.put("key3",3);
        map.put("key4",4);
        System.out.println(ex1.exercise4(map));

        System.out.println("-----------------------------------");
        FileOutputStream fout=new FileOutputStream("mfile.txt");
        PrintStream output=new PrintStream(fout);
        ex1.exercise5(lista2, output);
    }

}
