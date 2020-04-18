package CreationalPatterns.GoF.Builder.NoDirectorExample;

import CreationalPatterns.GoF.Builder.Model.*;

public interface ChainedBuilder {

    ChainedBuilder start(String message);
    ChainedBuilder buildBase(String type);
    ChainedBuilder addWidget(String widget);
    ChainedBuilder insertDoohickeys(int numberOfDoohickeys);
    ChainedBuilder end(String message);

    ComplexObjectClass assembleObject();
    ComplexObjectClass getAssembledObject();

}
