package emums;

public class TestWeeks {
    public static void main(String[] args) {
//        Weeks friday = Weeks.FRIDAY;
//        System.out.println(friday.name());// 默认返回的是常量名（对象名）
//        System.out.println(friday.toString());//返回的是常量名（对象名）,Enum类重写了toString方法
//        System.out.println(friday.ordinal());//返回枚举对象的下标，默认初始下标从0开始
//        Weeks[] weeks = Weeks.values();//返回当前枚举类的所有对象，返回类型时枚举的数组类型，是静态方法
//        for (Weeks week : weeks) {
//            System.out.println(111);
//        }
        System.out.println(Weeks.valueOf("MONDAY").eat());
       // System.out.println(Weeks.valueOf("MONDAY").name());//根据输入的参数返回对应的枚举对象常量。
    }
}

