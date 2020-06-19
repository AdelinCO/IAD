package constans.testIAD1.coupling.interaction;

import constans.testIAD1.coupling.Experiment;
import constans.testIAD1.coupling.Result;

public class Interaction010 implements Interaction{

    private String label;
    protected Experiment experience;
    protected Result result;

    public Interaction010(String label){
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public Experiment getExperience() {
        return experience;
    }

    @Override
    public void setExperience(Experiment experience) {
        this.experience = experience;
    }

    @Override
    public Result getResult() {
        return result;
    }

    @Override
    public void setResult(Result result) {
        this.result = result;
    }

    public String toString(){
        return this.experience.getLabel() + this.result.getLabel();
    }
}
