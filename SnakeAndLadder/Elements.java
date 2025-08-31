package SnakeAndLadder;

public class Elements {
    int jump;
    ElementType elementType;
    int elementId;

    public Elements(int jump, ElementType elementType, int elementId) {
        this.jump = jump;
        this.elementType = elementType;
        this.elementId = elementId;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    
}
