package testing.dataclasses.enums;

public enum Status {
    PROGRESS("In progress"),
    QUEUE("In queue"),
    COMPLETE("Complete");

    private String data;

    private Status(String d) {this.data = d;}
}
