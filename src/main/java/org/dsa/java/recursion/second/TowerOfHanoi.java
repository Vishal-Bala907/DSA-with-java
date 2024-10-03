package org.dsa.java.recursion.second;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks ,  String src , String helper , String des) {
//        System.out.println("Transfer disk "+ disks + " from " + src + " TO " + helper );
        if(disks ==1) {
            System.out.println("HELLO Transfer disk "+ disks + " from " + src + " TO " + helper );
            return;
        }
        towerOfHanoi(disks -1 ,  src , des , helper ); // 2
        System.out.println("Transfer disk "+ disks + " from " + src + " TO " + helper );
        towerOfHanoi(disks -1 ,  helper , src , des );
    }
    public static void main(String[] args) {
       int n = 3;
       towerOfHanoi(n,"S","H","D");
    }
}
