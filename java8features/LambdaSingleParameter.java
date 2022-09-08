package bct.java8features;
@FunctionalInterface
interface LambdaSingleParameter {
    
    //A method with single parameter
    public int incrementByFive(int number);
}
@FunctionalInterface
interface addition{



   // A METHOD WITH MULTIPLE PARAMETER
     public int addition(int num,int numb);
}
class SingleParameter{
    



   public static void main(String[] args) {
        
        //lambda expression with single parameter number
        LambdaSingleParameter f=(number)->number+5;
        System.out.println(f.incrementByFive(23));
        
        addition addition=(num, numb)-> num+numb;
        
        System.out.println(addition.addition(2,2));



   }



}
