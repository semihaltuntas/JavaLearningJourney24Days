package be.vdab.hello.TakenGastenBoek21;

import java.io.Serializable;
import java.util.*;

public class Gastenboek implements Serializable {
    private static final long serialVersionUID = 1L;
    private final List<GastenboekEntry> gastenBoeken = new ArrayList<>();

    public void toevoegen(GastenboekEntry gastenboekEntry) {
        gastenBoeken.add(gastenboekEntry);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Collections.reverse(gastenBoeken);

        for (var entry : gastenBoeken) {

            stringBuilder.append(entry.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
