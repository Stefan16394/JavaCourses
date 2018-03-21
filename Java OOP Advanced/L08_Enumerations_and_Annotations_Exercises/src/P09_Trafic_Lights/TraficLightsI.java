package P09_Trafic_Lights;

import java.util.Iterator;

public class TraficLightsI implements Iterator<TraficLights> {
    private TraficLights light;

    public TraficLightsI(TraficLights light) {
        this.light = light;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public TraficLights next() {
        switch (light)
        {
            case RED:
                this.light= TraficLights.GREEN;
                break;
            case GREEN:
                this.light=TraficLights.YELLOW;
                break;
            case YELLOW:
                this.light=TraficLights.RED;
                break;
        }
        return this.light;
    }
}
