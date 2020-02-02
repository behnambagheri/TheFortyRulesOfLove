package tech.akam.thefortyrulesoflove2.objects;

import java.io.Serializable;

public class sumBookObjects implements Serializable {

    String rulesNumber;

    String rulesDescription;



    public sumBookObjects(String rulesNumber , String rulesDescription){

        this.rulesNumber = rulesNumber;
        this.rulesDescription = rulesDescription;

    }

    public sumBookObjects() {
    }

    public void setRulesNumber(String rulesNumber){
        this.rulesNumber = rulesNumber;
    }
    public String getRulesNumber(){
        return this.rulesNumber;
    }


    public String getRulesDescription() {
        return this.rulesDescription;
    }

    public void setRulesDescription(String rulesDescription) {
        this.rulesDescription = rulesDescription;
    }
}
