package CoreJavaFour;

import java.util.TreeSet;
public class HighLowTree {
   public static void main(String[] args) {
      TreeSet<Integer> treeSet = new TreeSet<Integer>();
      treeSet.add(234560);
      treeSet.add(100);
      treeSet.add(150);
      treeSet.add(200);
      treeSet.add(250);
      treeSet.add(300);
      treeSet.add(400);
      treeSet.add(500);
      treeSet.add(800);
      treeSet.add(1000);
      System.out.println("TreeSet Lowest value = " + treeSet.first());
      System.out.println("TreeSet Highest value = " + treeSet.last());
   }
}