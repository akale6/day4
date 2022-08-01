public class Var01 {
    public static void main(String[] args){
        //记录人的信息
        int age = 18;
        double score = 90;
        char gender = '男';
        String name = "akali";
        char c = 97;//字符型可以直接数字 char的本质是一个整数，在输出时，是unicode码对应的字符,此时输出为a
        char d = 'a';//此时输出为97，且char字符可以参加运算
        char n9 = 'c' + 1;
        System.out.println("人的信息如下");
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);
        System.out.println(name);
        System.out.println(c);
        System.out.println(d);
        System.out.println('a' + 97);
        System.out.println(n9);//d
        System.out.println((int)n9);//100


    }
}
