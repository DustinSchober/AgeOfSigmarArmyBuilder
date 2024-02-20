
package schober_individualproject;


public class Controller {

    View view = new View();
    Units units = new Units();
    
    private int selection;
    private int unitList;
    private int unitChoice;
    private int armyList;
    
    public void introduction(){
        view.intro();
    }
    
    public void run(){
        view.option();
        selection = view.getAnswer();
        
        //if condition to go to build new list
        if(selection == 1){
            newList();
        }
        //if condition to go to load previous list
        if(selection == 2){
            loadList();
        }
    }
    
    public void newList(){
        view.selectArmyEdit();
        armyList = view.getArmyList();
        for(int x=0;x<15;x++){
            view.unitTypeSelection();
            unitList = view.getUnitList();    
            if (unitList == 1){
                //loop printing heroes
                view.printHeaderHeroes();
                for(int i=0;i<5;i++){
                    view.printUnitHeroes(i, units.getHeroes(i), units.getHeroesP(i));
                }
                view.unitSelection();
                unitChoice = view.getUnitSelection();
                units.setArmyList(armyList, x, units.getHeroes(unitChoice));
                units.setArmyListP(armyList, x, units.getHeroesP(unitChoice));
                units.totalSet(armyList);
                view.currentTotal(units.getTotal());
            }if (unitList == 2){
                //loop printing battleline
                view.printHeader();
                for(int i=0;i<5;i++){
                    view.printUnit(i, units.getBattleline(i), units.getBattlelineP(i));
                }
                view.unitSelection();
                unitChoice = view.getUnitSelection();
                units.setArmyList(armyList, x, units.getBattleline(unitChoice));
                units.setArmyListP(armyList, x, units.getBattlelineP(unitChoice));
                units.totalSet(armyList);
                view.currentTotal(units.getTotal());
            }if (unitList == 3){
                //loop printing others
                view.printHeader();
                for(int i=0;i<5;i++){
                    view.printUnit(i, units.getOther(i), units.getOtherP(i));
                }
                view.unitSelection();
                unitChoice = view.getUnitSelection();
                units.setArmyList(armyList, x, units.getOther(unitChoice));
                units.setArmyListP(armyList, x, units.getOtherP(unitChoice));
                units.totalSet(armyList);
                view.currentTotal(units.getTotal());
            }if (unitList==4){
                run();
            }
        }
    }
    
    public void loadList(){
        view.selectArmyLoad();
        armyList=view.getArmyList();
        if(armyList==1){
            view.printHeader();
            for(int i=0;i<15;i++){
                view.printUnit(i, units.getArmyOne(i), units.getArmyOneP(i));
            }
            units.totalSet(armyList);
            view.totalPrint(units.getTotal());
        }
        if(armyList==2){
            view.printHeader();
            for(int i=0;i<15;i++){
                view.printUnit(i, units.getArmyTwo(i), units.getArmyTwoP(i));
            }
            units.totalSet(armyList);
            view.totalPrint(units.getTotal());
        }if(armyList==3){
            view.printHeader();
            for(int i=0;i<15;i++){
                view.printUnit(i, units.getArmyThree(i), units.getArmyThreeP(i));
            }
            units.totalSet(armyList);
            view.totalPrint(units.getTotal());
        }if(armyList==4){
            view.printHeader();
            for(int i=0;i<15;i++){
                view.printUnit(i, units.getArmyFour(i), units.getArmyFourP(i));
            }
            units.totalSet(armyList);
            view.totalPrint(units.getTotal());
        }
        run();
    }
    
}
