import java.util.ArrayList;
import java.util.List;

public class Quene {
    Integer length;
    List list=null;

    public Quene(Integer length) {
        this.length = length;
        list=new ArrayList<Integer>(length);
    }
    void put(Integer number){
        if (list.size()<length){
            list.add(number);
        }
    }
    Integer get(){
        if (!list.isEmpty()){
            Integer o = (Integer) list.get(0);
            list.remove(o);
            return o;
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf(list.get(i)+" ");
        }
    }
}
