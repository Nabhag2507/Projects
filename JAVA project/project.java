import java.util.Scanner;

class Train{
    int trainNo;
    String trainName;
    String[] stop;
    int[] Distance;
    public Train(int trainNo, String trainName, String[] stop, int[] Distance) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.stop = stop;
        this.Distance = Distance;
    }
}
// class Passenger{
//     String name;
//     int age;
// }


public class project {
    public static void main(String[] args) {
        String[] stopsT1={"RJT","MSH","RANI","JP","ETW","BSBS"};
        int[] DistanceT1={0,246,477,804,1159,1611};
        Train t1 = new Train(22969, "RJT BSBS SPL",stopsT1,DistanceT1);
        
        String[] stopsT2={"okha","dwarka","jamnagar","rajkot","surendranagar","ahmedabad","nadiad","vadodara","surat","navsari","mumbai"};
        int[] DistanceT2={0,29,167,252,268,499,545,599,728,979,990};
        Train t2 = new Train(22946, "SAURASHTRA MAIL",stopsT2,DistanceT2);

        String[] stopsT3={"dwarka","ratlam jn","gangapur","agra","varanasi","patna","barsoi","guwahati"};
        int[] DistanceT3={0,849,1287,1448,2099,2327,2671,3224};
        Train t3 = new Train(15635, "GUWAHATI EXPRESS",stopsT3,DistanceT3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting point :");
        String start = sc.nextLine();

        System.out.print("Enter Destination : ");
        String dest = sc.nextLine();

        for (int i=0;i<3;i++){
            if (stopsT1[i].equals(start) && stopsT1[i].equals(dest)){
                System.out.println("Train No (1): "+t1.trainNo);
            }
            
            if (stopsT2[i].equals(start) && stopsT2[i].equals(dest)){
                System.out.println("Train No (2): "+t2.trainNo);
            }
            
            if (stopsT3[i].equals(start) && stopsT3[i].equals(dest)){
                System.out.println("Train No (3): "+t3.trainNo);
            }
        }
        sc.close();
    }
}