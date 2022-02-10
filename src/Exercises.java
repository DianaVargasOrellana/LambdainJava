import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercises{

    public List<String> search (List<String> list){
        List<String> res = list.stream()
                            .filter((c) -> c.charAt(0) == 'a' && c.length() ==3)
                            .collect(Collectors.toList());
                            //.forEach(System.out::println);
        return  res;
    }

    public String getString(List<Integer> list){
        String res  = list.stream()
                .map(e -> (e%2)==0 ? "e" + e.toString() +"," : "o" + e.toString()+ ",")
                .reduce("", String::concat);
        return res;
    }

    public String exercise1(List<String> list){
        String res = list.stream()
                .map(e -> String.valueOf(e.charAt(0)))
                .reduce("", String::concat);
        return  res;
    }

    public  void exercise2(List<String> list){
        list.stream()
                .filter(e -> e.length()%2 ==0)
                .forEach(System.out::println);
    }

    public  void exercise3(List<String> list){
        list.stream()
                .map(e -> e.toUpperCase())
                .forEach(System.out::println);
    }

    public  String exercise4(Map<String, Integer> map){
        String res = "";
        List<Object> list = new ArrayList<Object>();
        map.forEach((key, value) -> list.add(key + "-" + value));
        res = list.stream()
                .map(e -> e.toString() + ",")
                .reduce("", String::concat);
        return res;
    }

    public void exercise5(List<Integer> list, PrintStream out){
        new Thread(() -> {
            list.forEach(e -> out.println(e));
            out.close();
        },"Hilo 1").start();

    }
}
