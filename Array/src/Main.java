public class ex17 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int tripMiles=1;
        int tripGallons;
        System.out.printf("Enter the miles driven and gallons used to obtain miles per gallon.%n Or enter 0 to stop running program.%n");
        while(tripMiles!=0) {
            tripMiles=input.nextInt();
            if(tripMiles!=0) {
                tripGallons=input.nextInt();
                System.out.printf("Miles per gallon: %.2f %nEnter new values or 0 to stop!%n",(double)tripMiles/tripGallons);
            }
            else {
                break;
            }
        }
    }