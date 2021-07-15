/*
interface Testable {
    // Implement your code here
    public boolean testCompatibility();

}

class Mobile {
    // Implement your code here
    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    // Getter and Setter method for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter method for brand
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter method for operatingSystemName
    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    // Getter and Setter method for operatingSystemVersion
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }
}

class SmartPhone extends Mobile implements Testable {
    // Implement your code here
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion,
            String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    // Getter and Setter method for networkGeneration
    public String getNetworkGeneration() {
        return this.networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    public boolean testCompatibility() {

        if (getOperatingSystemName().equals("Saturn")) {
            String ng = getNetworkGeneration();
            String ov = getOperatingSystemVersion();

            if (ng.equals("3G")) {
                if (ov.equals("1.2") || ov.equals("1.3") || ov.equals("1.1"))
                    return true;
            } else if (ng.equals("4G")) {
                if (ov.equals("1.2") || ov.equals("1.3"))
                    return true;
            } else if (ng.equals("5G")) {
                if (ov.equals("1.3"))
                    return true;
            }

            return false;

        } else if (getOperatingSystemName().equals("Gara")) {
            String ng = getNetworkGeneration();
            String ov = getOperatingSystemVersion();

            if (ng.equals("3G")) {
                if (ov.equals("EXRT.1") || ov.equals("EXRT.2") || ov.equals("EXRU.1"))
                    return true;
            } else if (ng.equals("4G")) {
                if (ov.equals("EXRU.1") || ov.equals("EXRT.2"))
                    return true;
            } else if (ng.equals("5G")) {
                if (ov.equals("EXRU.1"))
                    return true;
            }

            return false;
        }

        return false;
    }

}

class InterfaceAssignment1 {
    public static void main(String args[]) {
        SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        if (smartPhone.testCompatibility())
            System.out.println("The mobile OS is compatible with the network generation!");
        else
            System.out.println("The mobile OS is not compatible with the network generation!");

        // Create more objects for testing your code
    }
}
*/