package company;

public class a {


String a = new String("Hello");
String b = new String("Hello");
String c = a;

System.out.println(a == b);// false, a と b は異なるオブジェクトを参照
System.out.println(a == c); // true, a と c は同じオブジェクトを参照
}