
package schober_individualproject;

import java.util.Scanner;


public class View {
    
    private Scanner input = new Scanner(System.in);
    private int answer;
    private int unitSelect;
    private int unitList;
    private int armyList;
    
    private String armyNameOne="no saved list";
    private String armyNameTwo="no saved list";
    private String armyNameThree="no saved list";
    private String armyNameFour="no saved list";
    
    //introduction
    public void intro(){
        System.out.println("Welcome to my Stormcast Eternals army builder.");
        System.out.println("With this application you can build an army list and save them for future reference.");
    }
    //select saved list or new list
    public void option(){
        System.out.println("");
        System.out.println("Would you like to make a new list or load a saved list?");
        System.out.println("1) New List 2) Saved lists 3) Exit application");
        answer = input.nextInt();
        if(answer==3){
            System.exit(0);}
    }
    //return answer to dictate next part of program in the controller
    public int getAnswer(){
        return answer;
    }
    //return selection of unit to add
    public int getUnitSelection(){
        return unitSelect;
    }
    //return unit list selection
    public int getUnitList(){
        return unitList;
    }
    //Selection of which type of units to add to the army list
    public void unitTypeSelection(){
        System.out.println("");
        System.out.println("Which type of unit would you like to add to your army?");
        System.out.println("1) Heroes");
        System.out.println("2) Battleline");
        System.out.println("3) Other");
        System.out.println("4) Save current list and return to main menu");
        System.out.println("5) Exit Application");
        unitList = input.nextInt();
        if(unitList == 5){
            System.exit(0);}
    }
    //prints heading for hero type lists
    public void printHeaderHeroes(){
         System.out.println("");
         System.out.println("Unit Name\t\tCost");
    }
    //prints heading for battleline and other lists
    public void printHeader(){
         System.out.println("");
         System.out.println("Unit Name\t\tCost");
    }
    //prints unit name and cost
    public void printUnit(int i,String unit, int cost){
        int printNumber= 1+i;
        if(cost!=0){
            System.out.println(printNumber+")"+unit + "\t" + cost);
        }
    }
    //prints unit list for heroes for similar format
    //prints unit name and cost
    public void printUnitHeroes(int i,String unit, int cost){
        int printNumber= 1+i;
            System.out.println(printNumber+")"+unit + "\t" + cost);
    }
    //selecting a unit from the list
    public void unitSelection(){
        System.out.println("");
        System.out.println("Which unit would you like to add?");
        unitSelect = input.nextInt()-1;
    }
    //selecting army list to edit
    public void selectArmyEdit(){
        System.out.println("Which army list would you like to make?");
        System.out.println("1) "+armyNameOne+" 2) "+armyNameTwo+ " 3) "+armyNameThree+ " 4) "+armyNameFour);
        armyList = input.nextInt();
        System.out.println("What would you like to name this army?");
        input.nextLine();
        if(armyList == 1){
            armyNameOne = input.nextLine();
        }if(armyList == 2){
            armyNameTwo = input.nextLine();
        }if(armyList == 3){
            armyNameThree = input.nextLine();
        }if(armyList == 4){
            armyNameFour = input.nextLine();
        }
    }
    //selecting army list to load
    public void selectArmyLoad(){
        System.out.println("Which army list would you like to load?");
        System.out.println("1) "+armyNameOne+" 2) "+armyNameTwo+ " 3) "+armyNameThree+ " 4) "+armyNameFour);
        armyList = input.nextInt();
    }
    public int getArmyList(){
        return armyList;
    }
    
    public void totalPrint(int total){
        System.out.println("");
        System.out.println("Total Points\t\t"+total);
    }
    
    public void currentTotal(int total){
        System.out.println("");
        System.out.println("Current point total:"+total);
    }
}
