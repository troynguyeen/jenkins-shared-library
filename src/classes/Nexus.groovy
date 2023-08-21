class Nexus {
    String URL
    String PROTOCOL
    String VERSION
    String REPOSITORY
    String CREDENTIAL_ID
    String ARTIFACT_VERSION

    public Nexus(String URL, String PROTOCOL, String VERSION, 
    String REPOSITORY, String CREDENTIAL_ID, String ARTIFACT_VERSION) {
        this.URL = URL;
        this.PROTOCOL = PROTOCOL;
        this.VERSION = VERSION;
        this.REPOSITORY = REPOSITORY;
        this.CREDENTIAL_ID = CREDENTIAL_ID;
        this.ARTIFACT_VERSION = ARTIFACT_VERSION;
    }
}