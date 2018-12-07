package reflectionw5;

import exercise6.Furniture;
import exercise6.Step;

public class AddLeg implements Step {
    @Override
    public void perform(Furniture furniture, Integer numberOfTimes) {
        Integer times = 1;
        while (times<=numberOfTimes){
            times = times+1;
            furniture.add("leg");

    }
}
}
