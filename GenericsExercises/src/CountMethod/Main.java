package CountMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
       ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Double el = Double.parseDouble(scan.nextLine());
            arrayList.add(el);
        }
        Double toCheck = Double.parseDouble(scan.nextLine());
        System.out.println(Count.getCount(arrayList,toCheck));
    }
}
