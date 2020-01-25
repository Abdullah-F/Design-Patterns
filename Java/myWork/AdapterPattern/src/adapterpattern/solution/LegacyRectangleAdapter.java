package adapterpattern.solution;

public class LegacyRectangleAdapter extends Rectangle{

    private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public Integer determineSize() {// this method makes as an interface to a legacy code logic
        return legacyRectangle.calculateSize();
    }
}
