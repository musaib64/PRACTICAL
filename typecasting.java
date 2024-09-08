/**
 * type casting
 */
public class typecasting {
    public static void main(String[] args) {

        /*int a=2;
        int b=6;
        int c=(float) (a/b);*/

        // expersion always returns int
         // this gives error showing float 
        // cannot be converted into int as float is 4 bytes and int is 2 bytes 
        //********************************************************************************* */

        //int/int gives int
        /*double a=6.0;
        double b=6.0;
        double c= (double)(a/b);
        //double/double gives double
        
        System.out.println("this is double" + c);*/
        /*int a=4;
        float b=2.0f;
        float c=a/b;
        //int/flotat always gives float
        System.out.println("this is float" + c);*/
//***************************************************************** */

        /*double a=4.00;
        float b=2.0f;
        float c=a/b;*/
        //double/float gives the  double
        //cannot convert from double to float

//*********************************************************************************************** */
        /*int a=4;
        byte b=2;
        byte c=a/b;
        //int / byte always give int
        //cannot convert from int to byte as int is 4 byte and byte is 1 byte 
        System.out.println("thhis is byte" + c);*/

        //************************************************* */


        /*int a=4;
        byte b=2;
        byte c=(byte)(a/b);//int is converted into byte and byte ==byte hence no error
        //this will not give error 
        System.out.println("thhis is byte" + c);*/


         //*************************************************** */

        /*int a=4;
        int b=2;
        long c=a/b;
        System.out.println("thhis is long" + c);
        //no error as int can be promoted to long as long take larger memory 16 bytes*/

        //**************************************************************** */
        /*int a=4;
        int b=2;
        int  c=(char)(a/b);
        //no error char is promoted to int
        System.out.println("thhis is long" + c);*/
        
        //********************************************************************* */
        








        
    }

    
}