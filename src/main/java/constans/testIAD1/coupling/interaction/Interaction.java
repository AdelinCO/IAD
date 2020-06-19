package constans.testIAD1.coupling.interaction;

import constans.testIAD1.coupling.Experiment;
import constans.testIAD1.coupling.Result;

public interface Interaction {

    public String getLabel();

    public Experiment getExperience();

    public Result getResult();

    public void setExperience(Experiment experience);

    public void setResult(Result result);
}
