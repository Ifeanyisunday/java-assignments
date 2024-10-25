
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Television implements Comparable<Television>{

    private String model;
    private double weight;
    private double size;

    public Television(String model, double weight, double size){
        this.model = model;
        this.weight = weight;
        this.size = size;
    }


    @Override
    public int compareTo(Television television) {
    if(this.weight > television.weight) return -1;
    else if(this.weight < television.weight) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Television{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){

        var tel1 = new Television("samsung", 14.00, 2.00);
        var tel2 = new Television("techno", 10.00, 12.00);
        var tel3 = new Television("LG", 34.00, 6.00);
        var tel4 = new Television("Gate", 11.00, 11.00);

        String text1 = "just";
        String text2 = "eerrjuseww";

        boolean result = text1.regionMatches(true, 0, text2, 4, 3 );

        List<Television> list1 = List.of(tel1, tel2, tel3, tel4);

        Set<Television> tev = new TreeSet<>(list1);

        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("AxxB");

//        System.out.println(tev);
//        System.out.println(result);
    }
}
