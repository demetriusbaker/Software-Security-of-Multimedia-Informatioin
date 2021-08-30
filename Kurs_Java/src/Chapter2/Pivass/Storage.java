package Chapter2.Pivass;

/*
Разработать  класс  Склад.  Два  поля:  количество  единиц  товара
и стоимость  1  единицы.  Конструктор  пустой  и  конструктор  с
двумя параметрами.  Написать метод  позволяющий  изменять  количество
товара. Написать  метод  позволяющий  изменять  стоимость  товара.
Написать  метод позволяющий    рассчитывать  стоимость  товара.
Написать  метод  для сравнения  стоимости  товаров. Написать  метод  с
переменным числом параметров определяющий общее количество товаров.
 */

public class Storage {
    private int countProduct;
    private float price;

    public Storage(){
        countProduct = 20;
        price = 10.5f;
    }

    public Storage(int countProduct, float price){
        this.countProduct = countProduct;
        this.price = price;
    }

    public void changeCountProduct(int countProduct){
        this.countProduct = countProduct;
    }

    public void changePrice(float price){
        this.price = price;
    }

    public float calculateTotalCost(){
        return price * countProduct;
    }

    public String comparePrice(float priceCompare){
        return price == priceCompare ?
                "Equals" : price > priceCompare ?
                "Default price is more" :
                "Default price is less";
    }

    public String getInfo(){
        return "Price: " + price + "$\n" +
                "Count of product: " + countProduct + "\n" +
                "Total cost: " + calculateTotalCost() + "\n";
    }

    /*
    Написать  метод  с  переменным
    числом параметров определяющий общее количество товаров.

    public int GetCount(int... arr){
        return arr.length;
    }

    некорректно поставлено условие!
    Имелось ввиду написать метод, выводящий полную
    информацию о складе: количесто товара,
    цена каждого товара и полная стоимость товаров.

    Хотя, вышеописанный метод вполне корректно работает.
     */
}
