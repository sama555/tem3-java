package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(precioIva(120));

    }
   static float iva=21;
    public static float precioIva (float pc)
    {
        float precio=pc+pc* iva /100;
        return precio;
    }
}
