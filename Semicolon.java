public class Semicolon {

private int numberOfStudent;
private int numberOfCohort;

public Semicolon(int numberOfStudent, int numberOfCohort){
 this.numberOfStudent = numberOfStudent;
 this.numberOfCohort =numberOfCohort;
}
public void setNumberOfStudent (int numberOfStudent){
 this.numberOfStudent = numberOfStudent;
}

public int getnumberOfStudent(){
 return numberOfStudent;
}

public void setnumberOfCohort(int numberOfCohort){
 this.numberOfCohort = numberOfCohort;
}

public int getnumberOfCohort(){
 return numberOfCohort;
}


}