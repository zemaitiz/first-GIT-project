package sdacademy.advancedfeatures.annotations.depricated;

public class Worker {
    @Deprecated // reiskia stenkites sios funkcijos nenaudoti
    // kadangi veliau ji gali neveikt (pvz. su sekancia
    // versija jos nebebus)
    public int sum(int a, int b) {
        return a + b;
    }
}
