package com.datastructure;

public class Practice {
    public static void main(String[] args) {
        Aa obj1 = new Aa();
        Bb obj2 = new Bb();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();





//        Student s1 = new Student();
//        s1.name = "Kathi";
//        s1.mark = 95;
//        s1.grade = 'A';
//        Student s2 = new Student();
//        s2.name = "John";
//        s2.mark = 56;
//        s2.grade = 'D';
//        Student s3 = new Student();
//        s3.name = "Max";
//        s3.mark = 60;
//        s3.grade = 'C';
//
//        Student[] students = new Student[3];
//        students[0] = s1;
//        students[1] = s2;
//        students[2] = s3;
//
//        for(Student stud: students){
//            System.out.println(stud.name + ": " + stud.mark );
//        }


//        int[][] numbs = new int[3][4];
//        for(int i=0; i<3;i++){
//            for(int j=0; j<4; j++)
//                numbs[i][j] = (int)(Math.random()*10);
//        }
//        for(int i=0; i<3;i++){
//            for(int j=0;j<4;j++)
//                System.out.print(numbs[i][j] + " ");
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("Using enhanced loop");
//        for(int[] n: numbs){
//            for(int m: n)
//                System.out.print(m + " ");
//            System.out.println();
//        }
    }
}
