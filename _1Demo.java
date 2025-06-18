// import tools._2Calculator;
// import tools._3AdvCalculator;

import tools.*; // imports everything in the folder tools



public class _1Demo{
    public static void main (String[] args){
        
        _2Calculator cal=new _2Calculator();
        _3AdvCalculator advcal=new _3AdvCalculator();
//        cal.add(10,20);
        System.out.println(advcal.add(10,20));
        System.out.println(advcal.div(10,2));


    }
}

// Here the class should be public as we learned in access modifier according to that public modifer can acces everywhere.
