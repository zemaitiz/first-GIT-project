package sdacademy.fundamentalscoding.practicalexcercises.triangles;

public enum TriangleType {
    EQUILATERIAL("Lygiakrastis"),
    EQUAL_SIDE("Lygiasonis"),
    OBTUSE("Bukas");

    private String triangleDescription;
//konstruktorius
    TriangleType(String triangleDescription) {
        this.triangleDescription = triangleDescription;
    }


    public String getTriangleDescription() {
        return triangleDescription;
    }
}

