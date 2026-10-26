public class Main {

   public static void printDetails (Vehicle vehicle){
     vehicle.displayInfo();
   }

   public static void main(String[] args) { 
      Vehicle vehicle = new Car ("Ford", "Mustang", 2019, 4);
         vehicle.displayInfo();
         System.out.println();
      
      vehicle = new Motorcycle ("Yamaha", "Aerox", 2025, "Automatic");
         vehicle.displayInfo();
         System.out.println();
      
      vehicle = new Truck ("Isuzu", "D-MAX", 2024, 4);
         vehicle.displayInfo();
         System.out.println();
      
      System.out.println("\n=== Method Parameter===");
         Car car = new Car("Honda", "Civic", 2023, 4);
         Motorcycle motor = new Motorcycle("Yamaha", "Nmax", 2025, "Automatic");
         Truck truck = new Truck("Suzuki", "Carry MT", 2026, 6); 
      
      printDetails(car);
      System.out.println();
      printDetails(motor);
      System.out.println();
      printDetails(truck);
      System.out.println();
      
      System.out.println("\n=====Polymorphic Array=====");
      Vehicle[] vehicles = {
         new Car("Toyota", "Vios", 2025, 4),
         new Motorcycle("Honda", "Wave", 2011, "Manual"),
         new Truck("Foton", "Auman GTL", 2026, 12) 
      };
      
         for(Vehicle currentVehicle : vehicles){
            printDetails(currentVehicle);
            System.out.println();
         }
      }
}