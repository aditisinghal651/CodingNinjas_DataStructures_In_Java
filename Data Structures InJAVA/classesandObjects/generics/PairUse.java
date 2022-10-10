package classesandObjects.generics;

public class PairUse {
    public static void main(String args[]){

        //Chained Generic Pairs
        Pair<String, Integer> pFirst = new Pair<>("Aditi", 25);
        Pair<Integer, String> pSecond = new Pair<>(25, "Aditi");
        Pair<Pair<String, Integer>, Pair<Integer, String>> p = new Pair<>();

        p.setFirst(pFirst);
        p.setSecond(pSecond);
        System.out.println(p.getFirst());
        System.out.println(p.getFirst().getFirst());
        System.out.println(p.getFirst().getSecond());
        System.out.println(p.getSecond());
        System.out.println(p.getSecond().getFirst());
        System.out.println(p.getSecond().getSecond());



//        Pair<String> ps = new Pair<String>("aa" , "bb");
//        System.out.println(ps.getFirst() + " " + ps.getSecond());
//        ps.setFirst("Aditi");
//        ps.setSecond("Singhal");
//        System.out.println(ps.getFirst() + " " + ps.getSecond());
//
//        Pair<Integer> pI = new Pair<Integer>(100, 200);
//        System.out.println(pI.getFirst() + " " + pI.getSecond());
//
//        Pair<Double> pD = new Pair<Double>(100.0, 200.0);
//        System.out.println(pD.getFirst() + " " + pD.getSecond());
    }

}
