package org.example;

public interface Drawable {
    public void draw();
    default void applyTheme(){
        throw new UnsupportedOperationException("Operation Apply Theme not implemented");
    }
}
