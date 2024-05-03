package store;


public class ProductShopApplication {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.take(new IceTea());
        customer.take(new Oppo());
        wahhh wahhh = new wahhh(2);
        System.out.println(wahhh.count);
        customer.take(new bingxiang());
        customer.cost();
    }
}

//识别有哪些类别的对象
/**
 * 饮料
 */
class Product{
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuffer description = new StringBuffer(name);
        description.append("   ,   ");
        description.append(price);
        return description.toString();
    }
}

class RunTian extends Product{
    public RunTian() {
        super("润田矿泉水", 2);
    }
}

/**
 * 哇哈哈
 */
class yl extends Product{
    int count;

    public yl(String name, double price,int count) {
        super(name, price);
        this.count=count;
    }
}
class wahhh extends yl{

    public wahhh(int count) {
        super("哇哈哈", 3, count);
    }
}

/**
 * 冰红茶
 */
class IceTea extends Product{
    public IceTea() {
        super("冰红茶", 2.5);
    }
}


/**
 * Iphone
 */
class Iphone extends Product{

    public Iphone() {
        super("Iphone", 5000);
    }
}

/**
 * Xiaomi
 */
class Xiaomi extends Product{

    public Xiaomi() {
        super("Xiaomi", 1500);
    }
}

/**
 * Oppo
 */
class Oppo extends Product{

    public Oppo() {
        super("Oppo", 2000);
    }
}

/**
 * 回力
 */
class Huili extends Product {
    public Huili() {
        super("回力", 156);
    }
}

/**
 * 耐克
 */
class Nick extends Product {
    public Nick() {
        super("耐克", 156);
    }
}

/**
 * 电视
 */
class dianshi extends Product {
    public dianshi() {
        super("电视", 1256);
    }
}

/**
 * 冰箱
 */
class bingxiang extends Product {
    public bingxiang() {
        super("冰箱", 156);
    }
}

/**
 * 顾客
 */
class Customer{
    Product[] cart = new Product[10];     //存放选购的饮料

    int quantity = 0;                       //存放选购的饮料瓶数

    /**
     * 将一瓶饮料放入购物车
     * @param Product
     */
    public void take(Product Product){
        if(quantity < cart.length) {
            cart[quantity] = Product;
            quantity++;
        }
    }

    /**
     * 选购完后到收银台计费
     * @return
     */
    public void cost(){
        double fee = 0;
        System.out.println("饮料名称 , 价格");
        for(int i = 0 ; i < quantity ; i++){
            System.out.println(cart[i]);//toString()
            fee = fee + cart[i].getPrice();
        }
        System.out.printf("您应付金额为：%.1f\n" , fee);
    }
}
