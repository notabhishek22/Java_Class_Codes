import java.util.*;

class TestGeneric1{
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add("rahul");
        list.add("jai");
        list.add(32);

        String s=(String)list.get(1);
        System.out.println("element is: "+s);

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
} 