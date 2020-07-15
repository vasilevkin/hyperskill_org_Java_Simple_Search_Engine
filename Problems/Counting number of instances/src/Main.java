class ClassCountingInstances {

    private static volatile long numberOfInstances;

    public ClassCountingInstances() {

        synchronized (ClassCountingInstances.class) {
            numberOfInstances++;
        }
        // write the increment here
    }

    public static synchronized long getNumberOfInstances() {
        return numberOfInstances;
    }
}
