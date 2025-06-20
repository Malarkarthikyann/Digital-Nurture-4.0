package DSA;
import java.util.Arrays;
import java.util.Scanner;
class Product{         //instead defining every single time for more data
    int productid;
    String productname;
    String category;
    double prize;
    public Product(int productid, String productname , String category , double prize)//constructor to create new item and store the data in particular
    {
        this.productid= productid;
        this.productname=productname;
        this.category=category;
        this.prize=prize;
    }
}
public class Ecommerce{
    public static Product linearsearch(Product[] products , String target)//unsorted array,slow,no big data
    {
      for(Product p : products)
      {
        if(p.productname.equalsIgnoreCase(target))//equalignorecase->ignores upper &lower case
        {
            return p;//if found
        }
      }
      return null;//if not found
    }
    public static Product binarysearch(Product[] products , String target)//sorted array,fast,bigdata
    {
          int left =0;//Starts with frst
          int right=products.length-1;//as from 0 end has to be -1
          while(left<=right)
          {
            int mid=(left+right)/2; // mid value
            int comparision = products[mid].productname.compareToIgnoreCase(target);//checks mid value to the target
            if(comparision==0)//matches mid value of  string
            {
                return products[mid];
            }
            else if (comparision <0)
            {
                left = mid+1;//target value is in right
            }
            else
            {
                right=mid-1;//target value is in left
            }
          }
        return null;//no value
    }
    public static void main(String[] args)
    {
        Product[]products ={//add products
            new Product(01,"Bella Jean","Clothing", 1280.00),
            new Product(02,"High Waist Jean","Clothing",2400),
            new Product(03, "Panda Teddy", "Toys", 800),
            new Product(04, "Fan", "Appliances", 3200)

        };
        Arrays.sort(products, (a, b) -> a.productname.compareToIgnoreCase(b.productname));//sorted for binarysearch
         Scanner sc = new Scanner(System.in);

        String searchname = sc.nextLine();//target value

        System.out.println("LINEAR SEARCH");
        Product result1 = linearsearch(products, searchname);
        if (result1 != null) {
            System.out.println("Found: " + result1.productname + " in " + result1.category+" at price "+result1.prize);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("BINARY SEARCH");
        Product result2 = binarysearch(products, searchname);
        if (result2 != null) {
            System.out.println("Found: " + result2.productname + " in " + result2.category+" at price "+result2.prize);
        } else {
            System.out.println("Product not found.");
        }
    }
}