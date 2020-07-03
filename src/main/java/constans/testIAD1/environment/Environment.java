package constans.testIAD1.environment;
import constans.testIAD1.coupling.interaction.Interaction;

/**
 * An Environment simulates the enaction of an intended primitive interaction
 * and returns the resulting enacted primitive interaction.
 */
public interface Environment {

    public Interaction enact(Interaction intendedInteraction);

}

