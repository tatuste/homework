package com.lseg.homework.homework8;

public class RemoteController {
    private Dimension dimension;
    private String colour;

    public RemoteController(Dimension dimensionRemote, String colour) {
        this.dimension = dimensionRemote;
        this.colour = colour;
    }

    public void pressButton(String button) {
        switch (button) {
            case "Start":
                System.out.println("TV started");
                break;
            case "Volume+":
                System.out.println("Volume Up");
                break;
            case "Volume-":
                System.out.println("Volume Down");
                break;
            case "Channel+":
                System.out.println("Next channel");
                break;
            case "Channel-":
                System.out.println("Previous channel");
                break;
            default:
                System.out.println("BAD command");
        }
    }


    public Dimension getDimension() {
        return dimension;
    }

    public String getColour() {
        return colour;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
