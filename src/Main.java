import entity.TreeMap;

public class Main{
    public static void main(String[] args){
        TreeMap<Integer> treeMap =new TreeMap<>();
        treeMap.insert(1);
        treeMap.insert(2);
        treeMap.insert(3);
        treeMap.insert(4);
        treeMap.insert(5);
        treeMap.insert(6);
        treeMap.insert(-2);
        treeMap.insert(-3);
        treeMap.insert(-4);
        treeMap.insert(-5);
        treeMap.insert(-6);
        treeMap.delete(4);
        treeMap.show();
    }
}