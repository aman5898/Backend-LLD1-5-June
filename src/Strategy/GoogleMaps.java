package Strategy;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode) {
        PathCalcStrategy p = PathCalculatorStrategyFactory.createPathCalculator(travelMode);
        p.findPath();
    }

}
