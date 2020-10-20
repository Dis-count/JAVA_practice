public class SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world ,Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if(lastIndex == - 1){
            System.out.println("字符串Runoob ");
        }
        else{
            System.out.println("中文Runoob last "+ lastIndex);
        }
    }
}
