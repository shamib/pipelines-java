package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }

    public void DoSomething2(boolean flag){
    	String testString = new String();
        if(flag){
            System.out.println("I am covered");
            return;
        }
        if (flag) {
        	testString = "True String";
        }
        int i =0;
        i=+4;
        System.out.println("Test String is : "+testString.toString());
        System.out.println("I am not covered2");
    }
    
    
}