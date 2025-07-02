public class Television {
    
    String color;
    String screen;
    Integer size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    
    public void turnTVOn(Television tv){
        String on = "The TV is ON!";
        tv.setScreen(on);
    }
    public void turnTVOff(Television tv){
        String off = "The TV is OFF!";
        tv.setScreen(off);
    }
}
