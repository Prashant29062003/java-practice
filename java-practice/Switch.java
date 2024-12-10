
public class Switch {
    public static void main(String args[]) {
        int n = 9;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("check the number.");
        }

        // this is after java version grater than 8 (java>8.0)
        // String day = "Monday";

        // switch(day) {
        //     case "Saturday", "Sunday":
        //         System.out.println("6am");
        //         break;
        //     case "Monday":
        //         System.out.println("5:30am");
        //         break;
        //     default:
        //         System.out.println("5:45am");
        // }

        String book = "The book";

        switch(book){
            case "The book", "rich dad poor dad" -> System.out.println("hay let's read "+ book + "!");
            case "blah", "blah blah" -> System.out.println("read loud!!");
            default -> System.out.println("OK no problem let's learn constructed things for life.");
        }


        String day = "Tuseday";
        String result = "";

        // either we can use his "arrow ->" OR "colon :" syntax at once.
        switch(day) {
            case "Saturday", "Sunday" -> result = "6am";
            case "Monday" -> result = "5:30am";
            default -> result =  "5:45am";
        }
        System.out.println(result);

        // we can use this return statement also 
        String day2 = "Thursday";
        String result2 = "";

        result2 = switch(day2) {
            case "Saturday", "Sunday" -> "7am";
            case "Monday" -> "5:30am";
            default ->  "5:45am";
        };
        System.out.println(result2);

        
        // we can use this return statement also 
        String day3 = "Saturday";
        String result3 = "";

        // with "colon :" we use yield keyword along it
        result3 = switch(day3) {
            case "Saturday", "Sunday" : yield "7am";
            case "Monday" : yield "5:30am";
            default : yield  "5:45am";
        };
        System.out.println(result3);
    }
}
