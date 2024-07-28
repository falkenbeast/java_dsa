//chapter 3 memory managment, garbage collection introduction and complete string and string builders..


class ch3_p1 {                 //program shows that if two refrences point same values then changing one will change others also 

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Create two variables referencing the same array
        int[] firstReference = array;
        int[] secondReference = array;

        // Print the original array
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Change an element in the array using the first reference
        firstReference[2] = 99;

        // Print the array after modification through the first reference
        System.out.println("Array after modification through firstReference:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Change an element in the array using the second reference
        secondReference[4] = 100;

        // Print the array after modification through the second reference
        System.out.println("Array after modification through secondReference:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}