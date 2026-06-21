package Deepskilling.EngineeringConcepts.DataStructuresAndAlgorithm.Exercise2_SearchFunction;

public class SearchDemo {

    static int linearSearch(Product[] products,
                            String target){

        for(int i=0;i<products.length;i++){

            if(products[i].productName.equals(target))
                return i;
        }

        return -1;
    }

    static int binarySearch(Product[] products,
                            String target){

        int low=0;
        int high=products.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            int result=
                    products[mid]
                            .productName
                            .compareTo(target);

            if(result==0)
                return mid;

            if(result<0)
                low=mid+1;

            else
                high=mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products={

                new Product(1,"Camera","Electronics"),
                new Product(2,"Laptop","Electronics"),
                new Product(3,"Mobile","Electronics"),
                new Product(4,"Watch","Accessories")
        };

        System.out.println(
                linearSearch(products,"Mobile"));

        System.out.println(
                binarySearch(products,"Mobile"));
    }
}
