
package schober_individualproject;


public class Units {
    
    private String[] heroes = {"Lord-Celestant","Knight-Relictor","Lord-Ordinator","Lord-Veritant  ","Neave Blacktalon"};
    private int[] heroesP = {130,140,130,155,120};
    private String[] battleline = {"Liberators    ","Judicators    ","Sequitors     ","Vanquishers    ","Vindictors    ","Annihilators    "};
    private int[] battlelineP = {115,190,145,125,130,200};
    private String[] other = {"Retributors    ","Protectors    ","Vigilors      ","Decimators    ","Castigators    ","Praetors    ","Prosecutors    "};
    private int[] otherP = {235,225,195,215,105,165,110};
    
    private String[] armyOne={"","","","","","","","","","","","","","","",};
    private String[] armyTwo={"","","","","","","","","","","","","","","",};
    private String[] armyThree={"","","","","","","","","","","","","","","",};
    private String[] armyFour={"","","","","","","","","","","","","","","",};
    private int[] armyOneP={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    private int[] armyTwoP={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    private int[] armyThreeP={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    private int[] armyFourP={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,};
    
    private int total;
    
    public String getHeroes(int i){
        return heroes[i];
    }
    public String getBattleline(int i){
        return battleline[i];
    }
    public String getOther(int i){
        return other[i];
    }
    public int getHeroesP(int i){
        return heroesP[i];
    }
    public int getBattlelineP(int i){
        return battlelineP[i];
    }
    public int getOtherP(int i){
        return otherP[i];
    }
    
    public String getArmyOne(int i){
        return armyOne[i];
    }
    public String getArmyTwo(int i){
        return armyTwo[i];
    }
    public String getArmyThree(int i){
        return armyThree[i];
    }
    public String getArmyFour(int i){
        return armyFour[i];
    }
    public int getArmyOneP(int i){
        return armyOneP[i];
    }
    public int getArmyTwoP(int i){
        return armyTwoP[i];
    }
    public int getArmyThreeP(int i){
        return armyThreeP[i];
    }
    public int getArmyFourP(int i){
        return armyFourP[i];
    }
    
    public int getTotal(){
        return total;
    }
    
    public void setArmyList(int list, int i,String name){
        if (list == 1){
            armyOne[i] = name;
        }
        if(list == 2){
            armyTwo[i] = name;
        }
        if(list == 3){
            armyThree[i] = name;
        }
        if(list == 4){
            armyFour[i] = name;
        }
    }
    
    public void setArmyListP(int list,int i,int cost){
        if (list == 1){
            armyOneP[i] = cost;
        }
        if(list == 2){
            armyTwoP[i] = cost;
        }
        if(list == 3){
            armyThreeP[i] = cost;
        }
        if(list == 4){
            armyFourP[i] = cost;
        }
    }
    
    public void totalSet(int list){
        total = 0;
        if(list == 1){
            for(int i =0;i<15;i++){
                total = total + armyOneP[i];
            }
        }
        if(list == 2){
            for(int i =0;i<15;i++){
                total = total + armyTwoP[i];
            }
        }
        if(list == 3){
            for(int i =0;i<15;i++){
                total = total + armyThreeP[i];
            }
        }
        if(list == 4){
            for(int i =0;i<15;i++){
                total = total + armyFourP[i];
            }
        }
    }
}
