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
class MyException extend Exception
{
   MyExceptiom
}
public class q7 {
    static void Validate(int age)
    {
        if(age<0)
            throw new MyException("Age cannot be 0");
        else
            System.out.println("age is valid");
    } 
    public static void main(String[] args) {
        try
        {
            Validate(-15);
        } 
        catch(MyException e){
            System.out.println("Validation in progress");
        }
    }
}
