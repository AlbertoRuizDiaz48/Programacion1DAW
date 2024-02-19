package POO2.HashCodeEquals;

import java.util.Objects;

public class Man {

    private String noseSize;
    private String eyesColor;
    private String haircut;
    private boolean scars;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return this.dnaCode == man.dnaCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnaCode);
    }

    private int dnaCode;

    public String getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(String noseSize) {
        this.noseSize = noseSize;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHaircut() {
        return haircut;
    }

    public void setHaircut(String haircut) {
        this.haircut = haircut;
    }

    public boolean isScars() {
        return scars;
    }

    public void setScars(boolean scars) {
        this.scars = scars;
    }

    public int getDnaCode() {
        return dnaCode;
    }

    public void setDnaCode(int dnaCode) {
        this.dnaCode = dnaCode;
    }

    public Man(String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode) {
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.scars = scars;
        this.dnaCode = dnaCode;
    }

}