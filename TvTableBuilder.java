package reflectionw5;

import exercise6.AddShelf;
import exercise6.AddTop;

import java.util.List;

public class TvTableBuilder {

    public static void main(String[] args) {
        TvTableBuilder tvTableBuilder = new TvTableBuilder();
        System.out.println("TvTable parts are: " + tvTableBuilder.build());
    }

    public List build(){
        TvTable tvTable = new TvTable();
        AddLeg addLeg = new AddLeg();
        AddShelf addShelf = new AddShelf();
        AddTop addTop = new AddTop();
        addLeg.perform(tvTable,4);
        addShelf.perform(tvTable,1);
        addTop.perform(tvTable,1);
        return tvTable.parts;



    }
}
