class ClassRoom {
double length;
double breadth;
double height ;
double airSpace;
}
class Main {
  public static void main(String[] args) {

    ClassRoom measuredRooms = new ClassRoom();

    measuredRooms = getDimensions();
    int noPeople = getLegalPeople(measuredRooms);
     DisplayLegalPeople(noPeople);

  }

  public static ClassRoom getDimensions (){
    ClassRoom theSpace = new ClassRoom();

    theSpace.length =  getValidReal(2, 20, "Enter the length");
 theSpace.breadth =  getValidReal(2, 20, "Enter the breadth");
  theSpace.height =  getValidReal(2, 10, "Enter the height");
   theSpace.airSpace =  getValidReal(5, 15, "Enter the airSpace");
    
    return theSpace;
    
  }

  public static double getValidReal (double min, double max, String msg){
   double Double;
   Double = Keyboard.getReal(msg);
   while (Double < min || Double > max){
     System.out.println("that is an invalid entry");
     Double = Keyboard.getReal(msg);
   }
return Double;
  }
  
  public static int getLegalPeople (ClassRoom theSpace){
    int noOfPeople;

    double volume = theSpace.length*theSpace.breadth*theSpace.height;
    //roomVol = length x breadth x height\
    noOfPeople = (int) Math.floor(volume/theSpace.airSpace);
  

  return noOfPeople;
  }
public static void DisplayLegalPeople (int noOfPeople) {

   System.out.println("this amount of people can fit " + noOfPeople);
}  
 
  
}