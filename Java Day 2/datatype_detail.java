public class datatype_detail {
    public static void main(String args[]){
        System.out.println("Data Type Overview \n \n");

        // Primitive data type
        System.out.println("Primitive Data Type\n ");
        
        // initializing a character data type
        char x = 'c';
        System.out.println("Character data type : \n"+x);

        // initializing the integer data type as X coz its case sensitive
        int X = 52;
        System.out.println("Integer Data type : \n"+X);

        // initialzing byte data type
        byte y = 4;
        System.out.println("Byte data type : \n"+y);

        // initialzing short data type
        short Y = 45;   // it gives error coz it larger than its range
        System.out.println("Short data type : \n"+Y);

        // initializing double data type
        double z = 4.2435;
        System.out.println("Double data type : \n"+z);

        // initialzing float data type, use f at suffix
        float Z = 4.2435f;
        System.out.println("Float data type : \n"+Z);

        // long data type
        long l = 123456;
        System.out.println("Long data type : \n"+l);

        // Non-primitive data type
        System.out.println("\nNon-Primitve Data Types\n");

        // initializing string data type
        String name = "pankaj";
        System.out.println("Name : "+name);


    }
}
