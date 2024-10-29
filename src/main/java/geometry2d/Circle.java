package geometry2d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;

public class Circle implements Figure {
    private float radius;
    public Circle(float radius){
        if(radius<0){
            throw new VariablesLesThanZeroException("radius",this.radius);
        }
        this.radius = radius;
    }
    public void setRadius(float radius){
        if(radius<0){
            throw new VariablesLesThanZeroException("radius",this.radius);
        }
        if(radius==0){
            throw new VariablesNotSetException("radius");
        }
        this.radius=radius;
    }
    public float area()  {
        return (float) (radius*radius*Math.PI);
    }

    public float perimeter() {
        return (float) (2*radius*Math.PI);
    }
    public String toString(){
            return "radius = "+radius+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
