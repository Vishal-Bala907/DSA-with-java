package org.dsa.java.hash;

import java.util.ArrayList;
import java.util.LinkedList;

/*
* HashMap internally implemented by an Array of LinkedList, in java
* */
public class HashMapImplementation {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; // node
        private int N; // buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key, int bi) {
            LinkedList<Node> list = buckets[bi];
            for(int i =0; i<list.size(); i++) {
                if(list.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); //data index

            if(di == -1) {
                // key doesn't exists
                buckets[bi].add(new Node(key,value));
                n++;
            } else {
                // key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0) {
                reHash();
            }
        }

        private void reHash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            N = N * 2;
            for(int i =0; i<N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i =0 ; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public V getValue(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) {
                return null;
            } else {
                return buckets[bi].get(di).value;
            }

        }

        public Boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                buckets[bi].remove(node);
                n--;
                return  node.value;
            }
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i < N; i++ ) {
                LinkedList<Node> list =  buckets[i];
                for(int j=0; j<list.size(); j++) {
                    Node node = list.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

    }

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",142);
        map.put("China",141);
        map.put("Pakistan",33);
        map.put("Bangladesh",30);
        map.put("Nepal",20);

        ArrayList<String> strings = map.keySet();
        for(String k : strings) {
            Integer value = map.getValue(k);
            System.out.println(k +" : "+value);

            map.remove(k);
        }

        System.out.println(map.isEmpty());
    }
}
