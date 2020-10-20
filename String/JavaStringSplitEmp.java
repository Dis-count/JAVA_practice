public class JavaStringSplitEmp {
   public static void main(String args[]){

      String str = "www-runoob-com";
      String[] temp;
      String delimeter = "-";  // Specify split character
      temp = str.split(delimeter); // split strings
      // common for loop
      for(int i =0; i < temp.length ; i++){
         System.out.println(temp[i]);
         System.out.println("");
      }

      System.out.println("------java for each 循环输出-----");
      String str1 = "www.runoob.com";
      String[] temp1;
      String delimeter1 = "\\.";  // Specify split character, . Need to escaped
      temp1 = str1.split(delimeter1); // split strings
      for(String x :  temp1){
         System.out.println(x);
         System.out.println("");
      }
   }
}
