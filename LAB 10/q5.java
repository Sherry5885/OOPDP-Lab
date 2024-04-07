/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author acer
 */
public class q5 {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[]={1,2,3,4};
                    System.out.println(arr[4]);
                }
                catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                }
            } 
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array size prblm ");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
