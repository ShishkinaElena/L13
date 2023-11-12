package dz12;


    /*Д/з Расширим предыдущую задачу.
    Замерить время добавления, поиска и удаления объектов из коллекции в
    LinkedList, ArrayList, TreeSet, HashSet.
    Сравнить время и сделать вывод о том, в каких условиях какая коллекция работает быстрее.*/

import java.util.*;

    public class Main {
        public static void main(String[] args) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            HashSet<Integer> hashSet = new HashSet<>();
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Object> linkedList = new LinkedList<>();
            System.out.println(addSet(treeSet));
            System.out.println(addSet(hashSet));
            System.out.println(addElemArrayList(arrayList));
            System.out.println(addElementLinkedList(linkedList));
            System.out.println("---------contain------");
            System.out.println(containCollection(treeSet));
            System.out.println(containCollection(hashSet));
            //System.out.println(containCollection(arrayList));
            // System.out.println(containCollection(linkedList));
            System.out.println(getElemList(arrayList));
            //System.out.println(getElemList(linkedList));
            System.out.println(getElemLinkedList(linkedList));

        }

        public static long addSet(Set<Integer> set){
            long time = System.currentTimeMillis();
            for (int i = 0; i < 500_000; i++) {
                set.add(i);
            }
            time = System.currentTimeMillis() - time;
            return time;
        }

        public static long addElemArrayList(ArrayList<Integer> arrayList){
            long time = System.currentTimeMillis();
            for (int i=0; i<500_000; i++){
                arrayList.add(i);
            }
            long time1 = System.currentTimeMillis();
            time = time1 - time;
            return time;
        }

        public static long addElementLinkedList(LinkedList<Object> linkedList){
            long time = System.currentTimeMillis();
            for (int i=0; i<500_000; i++){
                linkedList.addLast(new Object());
            }
            long time1 = System.currentTimeMillis();
            time = time1 - time;
            return time;
        }

        public static long containCollection(Collection<Integer> collection){
            long time = System.currentTimeMillis();
            for (int i = 0; i<10000; i++){
                Random random = new Random();
                collection.contains(random.nextInt(500_000));
            }
            time = System.currentTimeMillis() - time;
            return time;
        }

        public static long getElemList(List<Integer> list){
            long time = System.currentTimeMillis();
            for (int i = 0; i<10000; i++){
                Random random = new Random();
                list.get(random.nextInt(500_000));
            }
            time = System.currentTimeMillis() - time;
            return time;
        }

        public static long getElemLinkedList(LinkedList<Object> list){
            long time = System.currentTimeMillis();
            for (int i = 0; i<10000; i++){
                Random random = new Random();
                list.get(random.nextInt(500_000));
            }
            time = System.currentTimeMillis() - time;
            return time;
        }






    }
