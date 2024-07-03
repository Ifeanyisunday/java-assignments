public class StateArea {

    public static GeographicalState getRegion(String state){
        for(GeographicalState zone : GeographicalState.values()){
            for(String element : zone.getLocation()) {
                if(state.equalsIgnoreCase(element)){
//                    System.out.println("You are from the " + zone + " region");
                    return zone;
                }
            }
        }
        return null;
    }
}
