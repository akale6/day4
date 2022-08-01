public class FloatDetail {
    public static void main(String[] args){
        float num1 = 1.1F;//float num1 = 1.1 错
        double num2 = 1.1;
        double num3 = 1.1f;//对，java的浮点型常量默认为double型，声明float型常量，需要后面加f或F
        double num4 = 0.11;//
        double num5 = .123;//等价于0.123，通常情况下使用double类型
        double num6 = 2.7;
        double num7 = 8.1 / 3;//不等于2.7
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
