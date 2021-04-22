public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] myList = new double[4];
        double[] myList2 = {1.3,1.4,1.5,1.5}; //ikiside ayni >> farki yok

        for (int i = 0; i <myList.length;i++){
            System.out.println(i);
        }
        double total = 0;
        for(double mylist : myList2){
            System.out.println(mylist);
            total += mylist;
        }
        System.out.println("total :"+total);

    }
}
