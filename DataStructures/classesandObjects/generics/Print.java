package classesandObjects.generics;

public class Print {

    //Generic Method
    public static<T extends PrintInterface> void printArray(T arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i].print();
            //System.out.println(arr[i]);
        }
    }
    //Main
    public static void main(String rags[]){
//        Integer arr[] = new Integer[5];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = i + 1;
//        }
//        printArray(arr);
//
//        String arrS[] = new String[5];
//        for(int i = 0; i < arrS.length; i++){
//            arrS[i] = "Aditi";
//        }
//        printArray(arrS);

        Vehicle v[] = new Vehicle[5];
        for(int i = 0; i < v.length; i++){
            v[i] = new Vehicle(10*i, "Aditi");
        }
        printArray(v);

        Student s[] = new Student[5];
        for(int i = 0; i < s.length; i++){
            s[i] = new Student(10*i + 1);
        }
        printArray(s);
    }
}
