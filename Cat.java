
public class Cat
{
    private static final int LEGS_COUNT = 4;
    private static final int EYE_COUNT = 2;
    private static final double MIN_WEIGHT = 1000;
    private static final double MAX_WEIGHT = 9000;



    private String name;
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double foodEated;
    public static int catCount = 0;
    private String color;



    public void setColor (String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }




    private void setWeight(double weight) {
        this.weight = weight;
        if (weight < minWeight || maxWeight < weight) {
            catCount--;
        }
    }

    public static Integer getCount()
    {
        System.out.print("Колличество кошек: ");
        return catCount;

    }

    //копия кошки:
    public static Cat Clon (Cat number2)
    {
        Cat cat = new Cat(number2.weight);
        cat.originWeight  = number2.originWeight;
        cat.minWeight = number2.minWeight;
        cat.foodEated = number2.foodEated;
        cat.maxWeight = number2.maxWeight;
        cat.weight = number2.weight;
        return cat;
    }

    public Cat()
    {
        catCount++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodEated = 0.0;
    }

    public Cat(double weight)
    {
        this.weight = weight;
        catCount++;
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodEated = 0.0;
    }

    public Cat(String name)
    {
        this();
        this.name = name;

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }

    public void setColor(Color type)
    {
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow ");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        foodEated += amount;
        System.out.println("Покушал(а) - " + name);

    }
    public void pee()
    {
        weight -= 300.0 * Math.random();
        System.out.println("Обоссалась");
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        System.out.print("Вес кошки: ");
        return weight;
    }

    public Double getFoodEated()
    {
        System.out.print("Съеденая еда: ");
        return (foodEated);
    }



    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";

        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}