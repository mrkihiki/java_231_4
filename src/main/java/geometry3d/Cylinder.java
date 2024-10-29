package geometry3d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;
import geometry2d.Figure;

public class Cylinder {
    private Figure figure;
    private float h;
    public Cylinder(float h, Figure figure) {
        if(h<0){
            throw new VariablesLesThanZeroException("h",this.h);
        } else if (h==0) {
            throw new VariablesNotSetException("h");
        }
        if(figure ==null){
            throw new VariablesNotSetException("Figure");
        }
        this.h=h;
        this.figure =figure;
    }
    public void setH(float h){
        if(h<0){
            throw new VariablesLesThanZeroException("h",this.h);
        } else if (h==0) {
            throw new VariablesNotSetException("h");
        }
        this.h=h;
    }
    public void setFigure(Figure figure){
        if(figure ==null){
            throw new VariablesNotSetException("Figure");
        }
        this.figure=figure;
    }
    public double volume() {
        return h* figure.area();
    }
}
