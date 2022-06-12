/*
题目1
将数组{1，2，3}转化为字符串[world1#world2#world3]
* */
public class StringTopic {
    public static void main(String[] args) {
        int[] arrary={1,2,3};
        for (int i = 0; i < arrary.length; i++) {
            System.out.print(arrary[i]);
        }
        System.out.println();
        String str2=ArraryToString(arrary);
        System.out.println(str2);
    }
    public static String ArraryToString(int[] arrary){
        String str="[";
        for (int i = 0; i < arrary.length; i++) {
            if(i==arrary.length-1){
            str+="word"+arrary[i]+"]";

            }else {
                str += "word" + arrary[i] + "#";
            }

        }
            return str;
    }
}
